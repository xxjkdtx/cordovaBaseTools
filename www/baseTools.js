var exec = require('cordova/exec');

var ToolsFunc = function() {};

ToolsFunc.prototype.exit = function() {
    exec(null, null, "baseTools", "exit", []);
}

ToolsFunc.prototype.wakeUp = function(arg0, success, error) {
    exec(success, error, "baseTools", "wakeup", arg0);
}

var TOOLFUNC = new ToolsFunc();
module.exports = TOOLFUNC;