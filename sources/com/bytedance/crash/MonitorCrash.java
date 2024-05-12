package com.bytedance.crash;

import X.C16880lQ;
import X.C64241PJd;
import X.C64257PJt;
import X.C64258PJu;
import X.C64264PKa;
import X.PJU;
import X.PJW;
import X.PJX;
import X.PK0;
import X.PKZ;
import X.V1M;
import android.app.Application;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class MonitorCrash {
    public static volatile boolean sAppMonitorCrashInit;
    public Config mConfig;
    public AttachUserData mCustomData;
    public AttachUserData mCustomLongData;
    public HeaderParams mParams;
    public HashMap<String, String> mTagMap = new HashMap<>();

    /* loaded from: classes11.dex */
    public interface HeaderParams {
        Map<String, Object> getCommonParams();
    }

    public Config config() {
        return this.mConfig;
    }

    /* loaded from: classes12.dex */
    public class Config {
        public String mAid;
        public String mChannel;
        public String mDeviceId;
        public String mPackageName;
        public String[] mSoList;
        public long mUID;
        public long mVersionInt = -1;
        public String mVersionStr;
        public boolean test;

        public Config() {
        }

        public Config setChannel(String str) {
            this.mChannel = str;
            C64258PJu.LIZ();
            return this;
        }

        public Config setDeviceId(String str) {
            this.mDeviceId = str;
            C64258PJu.LIZ();
            return this;
        }

        public Config setPackageName(String str) {
            this.mPackageName = str;
            C64258PJu.LIZ();
            return this;
        }

        public Config setSoList(String[] strArr) {
            this.mSoList = strArr;
            C64258PJu.LIZ();
            return this;
        }

        public Config setUID(long j) {
            this.mUID = j;
            C64258PJu.LIZ();
            return this;
        }
    }

    public MonitorCrash setCustomDataCallback(AttachUserData attachUserData) {
        this.mCustomData = attachUserData;
        return this;
    }

    public MonitorCrash withOtherHeaders(HeaderParams headerParams) {
        this.mParams = headerParams;
        return this;
    }

    public MonitorCrash addTags(String str, String str2) {
        this.mTagMap.put(str, str2);
        return this;
    }

    public void reportCustomErr(String str, String str2, Throwable th) {
        try {
            V1M.LJJJJ(this, th, null, 0, str, true, null, C16880lQ.LLLLIIIILLL(), str2, "core_exception_monitor");
        } catch (Throwable unused) {
        }
    }

    public MonitorCrash(Context context, String str, long j, String str2) {
        Config config = new Config();
        this.mConfig = config;
        config.mAid = str;
        config.mVersionInt = j;
        config.mVersionStr = str2;
        PJU pju = new PJU(this);
        PJU.LIZIZ = this;
        Application application = (Application) C16880lQ.LLLLL(context);
        PJW pjw = new PJW(pju, this);
        if (PK0.LJIJI) {
            return;
        }
        PK0.LJI(application, context);
        PK0.LJII = new C64257PJt(PK0.LIZ, pjw, PK0.LIZIZ());
        PK0.LJIJI = true;
    }

    public static MonitorCrash init(Context context, String str, long j, String str2) {
        if (!sAppMonitorCrashInit) {
            synchronized (MonitorCrash.class) {
                if (!sAppMonitorCrashInit) {
                    sAppMonitorCrashInit = true;
                    PKZ.LJFF(context);
                    return new MonitorCrash(context, str, j, str2);
                }
                return null;
            }
        }
        return null;
    }

    public MonitorCrash(String str, long j, String str2, String str3) {
        Config config = new Config();
        this.mConfig = config;
        config.mAid = str;
        config.mVersionInt = j;
        config.mVersionStr = str2;
        config.mPackageName = str3;
        new PJU(this);
    }

    public static MonitorCrash initSDK(Context context, String str, long j, String str2, String str3) {
        PKZ.LJFF(context);
        MonitorCrash monitorCrash = new MonitorCrash(str, j, str2, str3);
        monitorCrash.config().setPackageName(str3);
        return monitorCrash;
    }

    public void reportEvent(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        PJX pjx = new PJX();
        pjx.LJIIJJI("event_type", "exception");
        pjx.LJIIJJI("log_type", "service_monitor");
        pjx.LJIIJJI("timestamp", Long.valueOf(System.currentTimeMillis()));
        pjx.LJIIJJI("crash_time", Long.valueOf(System.currentTimeMillis()));
        pjx.LJIIJJI("process_name", C64264PKa.LIZJ(PK0.LIZ));
        pjx.LJIIJJI("crash_thread_name", C16880lQ.LLLLIIIILLL().getName());
        pjx.LJIIJJI("service", str);
        pjx.LJIIJJI("status", Integer.valueOf(i));
        if (jSONObject != null) {
            pjx.LJIIJJI("category", jSONObject);
        }
        if (jSONObject2 != null) {
            pjx.LJIIJJI("metric", jSONObject2);
        }
        pjx.LJIIJJI("sid", Long.valueOf(PK0.LIZJ));
        C64241PJd.LIZJ(pjx, this);
    }

    public static MonitorCrash initSDK(Context context, String str, long j, String str2, String str3, String[] strArr) {
        PKZ.LJFF(context);
        MonitorCrash monitorCrash = new MonitorCrash(str, j, str2, str3);
        Config config = monitorCrash.config();
        config.setPackageName(str3);
        config.setSoList(strArr);
        return monitorCrash;
    }
}
