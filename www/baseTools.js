var exec = require('cordova/exec');

var ToolsFunc = function() {};

ToolsFunc.prototype.exit = function() {
    exec(null, null, "baseTools", "exit", []);
}

ToolsFunc.prototype.wakeUp = function(arg0, success, error) {
    if (arg0 > 300000 || arg0 < 500) {
        error("Invalid Values");
    }
    exec(success, error, "baseTools", "wakeup", [arg0]);
}

var TOOLFUNC = new ToolsFunc();
module.exports = TOOLFUNC;