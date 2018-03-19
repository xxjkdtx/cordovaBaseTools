package cn.sict.cordova;

import android.content.Context;
import android.os.PowerManager;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class baseTools extends CordovaPlugin {

    private PowerManager pm;
    private PowerManager.WakeLock wl;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("exit")) {
            System.exit(0);
            return true;
        }
        if(action.equals("wakeup")){
            int wakeTime = args.getInt(0);
            Context appCtx = cordova.getActivity().getApplicationContext();
            pm=(PowerManager) appCtx.getSystemService(Context.POWER_SERVICE);
            wl = pm.newWakeLock(PowerManager.ACQUIRE_CAUSES_WAKEUP | PowerManager.SCREEN_BRIGHT_WAKE_LOCK, "bright");
            wl.acquire((long) wakeTime);
            return true;
        }
        return false;
    }
}
