package com.bytedance.android.live_settings.repo;

import X.C132805Jc;
import X.X1D;
import com.bytedance.android.live_settings.Monitor;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.keva.Keva;
import com.google.gson.Gson;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class BaseRepo {
    public Keva dataRepo;

    public abstract Keva getDataRepo();

    public abstract String getTag();

    private Keva realGetDataRepo() {
        if (this.dataRepo == null) {
            synchronized (BaseRepo.class) {
                this.dataRepo = getDataRepo();
            }
        }
        return this.dataRepo;
    }

    public Gson getGson() {
        if (SettingsManager.INSTANCE.enableCustomTypeOpt()) {
            return NormalGson.singletonOpt();
        }
        return NormalGson.singleton();
    }

    public void clear() {
        realGetDataRepo().clear();
    }

    public Map<String, ?> getAll() {
        return realGetDataRepo().getAll();
    }

    public void load() {
        realGetDataRepo();
    }

    public boolean contains(String str) {
        return realGetDataRepo().contains(str);
    }

    public void erase(String str) {
        realGetDataRepo().erase(str);
    }

    public boolean getBooleanValue(String str, boolean z) {
        return realGetDataRepo().getBoolean(str, z);
    }

    public double getDoubleValue(String str, double d) {
        return realGetDataRepo().getDouble(str, d);
    }

    public float getFloatValue(String str, float f) {
        return realGetDataRepo().getFloat(str, f);
    }

    public int getIntValue(String str, int i) {
        return realGetDataRepo().getInt(str, i);
    }

    public long getLongValue(String str, long j) {
        return realGetDataRepo().getLong(str, j);
    }

    public String[] getStringArrayValue(String str, String[] strArr) {
        String[] stringArray = realGetDataRepo().getStringArray(str, strArr);
        if (stringArray != null) {
            return stringArray;
        }
        return strArr;
    }

    public String getStringValue(String str, String str2) {
        return realGetDataRepo().getString(str, str2);
    }

    public Object getValue(String str, Class cls) {
        try {
            return getGson().LJI(realGetDataRepo().getString(str, null), cls);
        } catch (Throwable th) {
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder LIZ = X1D.LIZ();
            C132805Jc.LJ(LIZ, "exception: ", th, "  , key = ", str);
            monitor.reportException("BaseRepo#getValue", X1D.LIZIZ(LIZ));
            return null;
        }
    }

    public void storeBooleanValue(String str, boolean z) {
        realGetDataRepo().storeBoolean(str, z);
    }

    public void storeDoubleValue(String str, double d) {
        realGetDataRepo().storeDouble(str, d);
    }

    public void storeFloatValue(String str, float f) {
        realGetDataRepo().storeFloat(str, f);
    }

    public void storeIntValue(String str, int i) {
        realGetDataRepo().storeInt(str, i);
    }

    public void storeLongValue(String str, long j) {
        realGetDataRepo().storeLong(str, j);
    }

    public void storeStringArrayValue(String str, String[] strArr) {
        realGetDataRepo().storeStringArray(str, strArr);
    }

    public void storeStringValue(String str, String str2) {
        realGetDataRepo().storeString(str, str2);
    }
}
