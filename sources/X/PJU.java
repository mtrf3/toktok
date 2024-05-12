package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.MonitorCrash;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PJU {
    public static MonitorCrash LIZIZ;
    public final MonitorCrash LIZ;

    public final String LIZ() {
        return this.LIZ.mConfig.mAid;
    }

    public final JSONObject LIZJ() {
        return new JSONObject(this.LIZ.mTagMap);
    }

    public final JSONObject LIZLLL() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.LIZ.mConfig.mPackageName == null) {
                Context context = PK0.LIZ;
                PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 128);
                if (LLLLLLZ != null) {
                    MonitorCrash.Config config = this.LIZ.mConfig;
                    if (config.mVersionInt == -1) {
                        config.mVersionInt = LLLLLLZ.versionCode;
                    }
                    if (config.mVersionStr == null) {
                        config.mVersionStr = LLLLLLZ.versionName;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(this.LIZ.mConfig.mDeviceId)) {
            this.LIZ.mConfig.mDeviceId = PK0.LIZLLL().LIZ();
        }
        try {
            jSONObject.put("aid", String.valueOf(this.LIZ.mConfig.mAid));
            jSONObject.put("update_version_code", this.LIZ.mConfig.mVersionInt);
            jSONObject.put("version_code", this.LIZ.mConfig.mVersionInt);
            jSONObject.put("app_version", this.LIZ.mConfig.mVersionStr);
            jSONObject.put("channel", this.LIZ.mConfig.mChannel);
            jSONObject.put("package", this.LIZ.mConfig.mPackageName);
            jSONObject.put("device_id", this.LIZ.mConfig.mDeviceId);
            jSONObject.put("user_id", this.LIZ.mConfig.mUID);
            jSONObject.put("os", "Android");
            if (this.LIZ.mConfig.mSoList != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.LIZ.mConfig.mSoList) {
                    jSONArray.put(str);
                }
                jSONObject.put("so_list", jSONArray);
            }
            jSONObject.put("single_upload", 0);
        } catch (JSONException unused2) {
            C78685UuP.LJJ();
        }
        return jSONObject;
    }

    public PJU(MonitorCrash monitorCrash) {
        this.LIZ = monitorCrash;
        PJV.LIZ.add(this);
        C64258PJu.LIZ();
        C64214PIc.LIZ().LIZJ(PJ7.LIZLLL, 0L);
    }

    public final JSONObject LIZIZ(CrashType crashType) {
        java.util.Map<? extends String, ? extends String> userData;
        AttachUserData attachUserData = this.LIZ.mCustomData;
        if (attachUserData == null || (userData = attachUserData.getUserData(crashType)) == null) {
            return null;
        }
        return new JSONObject(userData);
    }
}
