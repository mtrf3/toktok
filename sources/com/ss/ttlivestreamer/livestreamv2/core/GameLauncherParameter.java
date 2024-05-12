package com.ss.ttlivestreamer.livestreamv2.core;

import X.X1D;
import android.app.Activity;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class GameLauncherParameter extends TEBundle {
    public WeakReference<Activity> mActivityWeakReference;
    public JSONObject mLaunchOpt;
    public final String mSchemaKey;

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.mActivityWeakReference;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public String getSchema() {
        if (contains("schema")) {
            return getString("schema");
        }
        return null;
    }

    public boolean isTest() {
        if (contains("game-test") && getBool("game-test")) {
            return true;
        }
        return false;
    }

    public GameLauncherParameter() {
        this.mSchemaKey = "schema";
    }

    @Override // com.ss.ttlivestreamer.core.utils.TEBundle
    public String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(super.toString());
        LIZ.append(",activity(");
        LIZ.append(this.mActivityWeakReference);
        LIZ.append("),launchOpt:");
        JSONObject jSONObject = this.mLaunchOpt;
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = "";
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public JSONObject getLaunchOpt() {
        return this.mLaunchOpt;
    }

    public GameLauncherParameter(TEBundle tEBundle) {
        super(tEBundle);
        this.mSchemaKey = "schema";
    }

    public GameLauncherParameter setActivity(Activity activity) {
        this.mActivityWeakReference = new WeakReference<>(activity);
        return this;
    }

    public GameLauncherParameter setLaunchOpt(JSONObject jSONObject) {
        this.mLaunchOpt = jSONObject;
        return this;
    }

    public GameLauncherParameter setSchema(String str) {
        if (str != null) {
            setString("schema", str);
        }
        return this;
    }

    public GameLauncherParameter setTest(boolean z) {
        setBool("game-test", z);
        return this;
    }
}
