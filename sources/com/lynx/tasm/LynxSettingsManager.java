package com.lynx.tasm;

import X.C36903Ee3;
import X.C39942Fly;
import X.F9J;
import X.X1D;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import com.lynx.tasm.base.LLog;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class LynxSettingsManager {
    public static final Gson sGson = new Gson();
    public static volatile LynxSettingsManager sInstance;
    public Context mContext;
    public SharedPreferences mSP;
    public long mSettingsTime;

    public String getLynxVersion() {
        return "2.10.16-rc.10";
    }

    public static LynxSettingsManager inst() {
        if (sInstance == null) {
            synchronized (LynxSettingsManager.class) {
                if (sInstance == null) {
                    sInstance = new LynxSettingsManager();
                }
            }
        }
        return sInstance;
    }

    private String tryToLoadLocalCachedSettings() {
        SharedPreferences sharedPreferences = this.mSP;
        if (sharedPreferences == null) {
            LLog.LIZLLL(4, "LynxSettingsManager", "please call initialize first");
            return null;
        }
        if (!sharedPreferences.contains("settings")) {
            LLog.LIZLLL(2, "LynxSettingsManager", "Lynx load local cached settings: no cached.");
            return null;
        }
        try {
            this.mSettingsTime = this.mSP.getLong("settings_time", 0L);
        } catch (Throwable th) {
            this.mSettingsTime = 0L;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Lynx load local cached settings time exception ");
            LIZ.append(th.toString());
            LLog.LIZLLL(4, "LynxSettingsManager", X1D.LIZIZ(LIZ));
        }
        try {
            return this.mSP.getString("settings", "");
        } catch (Throwable th2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Lynx load local cached settings exception ");
            LIZ2.append(th2.toString());
            LLog.LIZLLL(4, "LynxSettingsManager", X1D.LIZIZ(LIZ2));
            return null;
        }
    }

    public long getSettingsTime() {
        return this.mSettingsTime;
    }

    public HashMap<String, Object> initSettings(Context context) {
        String tryToLoadLocalCachedSettings;
        this.mContext = context;
        synchronized (this) {
            if (this.mSP == null && context != null) {
                this.mSP = F9J.LIZIZ(context, 0, "lynx_settings_manager_sp");
            }
            tryToLoadLocalCachedSettings = tryToLoadLocalCachedSettings();
        }
        try {
            Gson gson = sGson;
            j jVar = (j) gson.LJI(tryToLoadLocalCachedSettings, j.class);
            if (jVar != null) {
                LLog.LIZLLL(2, "LynxSettingsManager", "Lynx load local cached settings success");
                return (HashMap) gson.LIZJ(jVar.LJIIZILJ(), HashMap.class);
            }
            return null;
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Lynx load local cached settings exception ");
            LIZ.append(th.toString());
            LLog.LIZLLL(2, "LynxSettingsManager", X1D.LIZIZ(LIZ));
            return null;
        }
    }

    public void initialize(Context context) {
        if (this.mSP == null) {
            synchronized (this) {
                if (this.mSP == null && context != null) {
                    this.mContext = context;
                    this.mSP = F9J.LIZIZ(context, 0, "lynx_settings_manager_sp");
                    String tryToLoadLocalCachedSettings = tryToLoadLocalCachedSettings();
                    try {
                        Gson gson = sGson;
                        j jVar = (j) gson.LJI(tryToLoadLocalCachedSettings, j.class);
                        if (jVar != null) {
                            m LJIIZILJ = jVar.LJIIZILJ();
                            LLog.LIZLLL(2, "LynxSettingsManager", "Lynx load local cached settings success");
                            LynxEnv.LJIIIZ().LJIILLIIL((HashMap) gson.LIZJ(LJIIZILJ, HashMap.class));
                        }
                    } catch (Throwable th) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Lynx load local cached settings exception ");
                        LIZ.append(th.toString());
                        LLog.LIZLLL(2, "LynxSettingsManager", X1D.LIZIZ(LIZ));
                    }
                }
            }
        }
    }

    public void setSettingsWithContent(String str) {
        j LJJIJ;
        j LJJIJ2;
        long currentTimeMillis;
        try {
            j jVar = (j) sGson.LJI(str, j.class);
            if (jVar != null && (LJJIJ = jVar.LJIIZILJ().LJJIJ("data")) != null && (LJJIJ2 = LJJIJ.LJIIZILJ().LJJIJ("settings")) != null) {
                p LJJIJL = LJJIJ.LJIIZILJ().LJJIJL("settings_time");
                if (LJJIJL != null && (LJJIJL.LJLIL instanceof String) && !LJJIJL.LJJIFFI().isEmpty()) {
                    currentTimeMillis = CastLongProtector.parseLong(LJJIJL.LJJIFFI());
                } else {
                    currentTimeMillis = System.currentTimeMillis() / 1000;
                }
                setSettingsJsonObjectWithTime(LJJIJ2.LJIIZILJ(), currentTimeMillis);
            }
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Lynx set settings with content exception ");
            LIZ.append(th);
            LLog.LIZLLL(2, "LynxSettingsManager", X1D.LIZIZ(LIZ));
        }
    }

    private void setSettingsJsonObjectWithTime(m mVar, long j) {
        String jVar = mVar.toString();
        if (!C39942Fly.LIZIZ.booleanValue()) {
            C36903Ee3.LIZJ().LIZLLL(this.mContext, Integer.valueOf((int) j), jVar);
        }
        LynxEnv.LJIIIZ().LJIILLIIL((HashMap) GsonProtectorUtils.fromJson(sGson, (j) mVar, HashMap.class));
        synchronized (this) {
            this.mSettingsTime = j;
            SharedPreferences sharedPreferences = this.mSP;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("settings", jVar).apply();
                this.mSP.edit().putLong("settings_time", this.mSettingsTime).apply();
            }
        }
    }

    public void setSettingsWithTime(String str, long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Lynx setSettings ");
        LIZ.append(str);
        LLog.LIZLLL(2, "LynxSettingsManager", X1D.LIZIZ(LIZ));
        try {
            m mVar = (m) sGson.LJI(str, m.class);
            if (mVar != null) {
                setSettingsJsonObjectWithTime(mVar, j);
            }
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Lynx set settings exception ");
            LIZ2.append(th);
            LLog.LIZLLL(2, "LynxSettingsManager", X1D.LIZIZ(LIZ2));
        }
    }

    public void setSettingsWithTime(String str, Integer num) {
        setSettingsWithTime(str, num.intValue());
    }
}
