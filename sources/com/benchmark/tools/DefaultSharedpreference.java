package com.benchmark.tools;

import X.C09590Zf;
import X.C47261Igj;
import X.F9J;
import X.X1D;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class DefaultSharedpreference {
    public static DefaultSharedpreference sInstance;
    public String sFileName;

    private boolean checkFileName() {
        return !TextUtils.isEmpty(this.sFileName);
    }

    public static DefaultSharedpreference getInstance() {
        if (sInstance == null) {
            synchronized (DefaultSharedpreference.class) {
                if (sInstance == null) {
                    sInstance = new DefaultSharedpreference();
                }
            }
        }
        return sInstance;
    }

    public DefaultSharedpreference() {
        setFileName("default_config");
    }

    private boolean checkFileName(String str) {
        return !TextUtils.isEmpty(str);
    }

    public void setFileName(String str) {
        this.sFileName = str;
    }

    public static boolean Contains(String str, String str2) {
        boolean contains = getInstance().contains(C09590Zf.LJIILLIIL.LIZ, str, str2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getString key: ");
        LIZ.append(str2);
        LIZ.append(",value: ");
        LIZ.append(contains);
        X1D.LIZIZ(LIZ);
        C47261Igj.LJIILJJIL("DefaultSharedpreference");
        return contains;
    }

    private SharedPreferences getSp(Context context, String str) {
        if (context == null || !checkFileName(str)) {
            return null;
        }
        return F9J.LIZIZ(context, 0, str);
    }

    public boolean getBoolean(Context context, String str) {
        return getBoolean(context, this.sFileName, str, false);
    }

    public float getFloat(Context context, String str) {
        return getFloat(context, this.sFileName, str, 0.0f);
    }

    public int getInt(Context context, String str) {
        SharedPreferences sp = getSp(context, this.sFileName);
        if (sp == null) {
            return 0;
        }
        return sp.getInt(str, 0);
    }

    public long getLong(Context context, String str) {
        return getLong(context, this.sFileName, str, 0L);
    }

    public String getString(Context context, String str) {
        return getString(context, this.sFileName, str, "");
    }

    public static boolean getBoolean(String str, String str2, boolean z) {
        boolean z2 = getInstance().getBoolean(C09590Zf.LJIILLIIL.LIZ, str, str2, z);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getFloat key: ");
        LIZ.append(str2);
        LIZ.append(",value: ");
        LIZ.append(z2);
        X1D.LIZIZ(LIZ);
        C47261Igj.LJIILJJIL("DefaultSharedpreference");
        return z2;
    }

    public static float getFloat(String str, String str2, float f) {
        float f2 = getInstance().getFloat(C09590Zf.LJIILLIIL.LIZ, str, str2, f);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getFloat key: ");
        LIZ.append(str2);
        LIZ.append(",value: ");
        LIZ.append(f2);
        X1D.LIZIZ(LIZ);
        C47261Igj.LJIILJJIL("DefaultSharedpreference");
        return f2;
    }

    public static long getLong(String str, String str2, long j) {
        long j2 = getInstance().getLong(C09590Zf.LJIILLIIL.LIZ, str, str2, j);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getFloat key: ");
        LIZ.append(str2);
        LIZ.append(",value: ");
        LIZ.append(j2);
        X1D.LIZIZ(LIZ);
        C47261Igj.LJIILJJIL("DefaultSharedpreference");
        return j2;
    }

    public static String getString(String str, String str2, String str3) {
        String string = getInstance().getString(C09590Zf.LJIILLIIL.LIZ, str, str2, str3);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getString key: ");
        LIZ.append(str2);
        LIZ.append(",value: ");
        LIZ.append(string);
        X1D.LIZIZ(LIZ);
        C47261Igj.LJIILJJIL("DefaultSharedpreference");
        return string;
    }

    public static void storeBoolean(String str, String str2, boolean z) {
        Context context = C09590Zf.LJIILLIIL.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("storeFloat key: ");
        LIZ.append(str2);
        LIZ.append(",value: ");
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        C47261Igj.LJIILJJIL("DefaultSharedpreference");
        getInstance().setBoolean(context, str, str2, z);
    }

    public static void storeFloat(String str, String str2, float f) {
        Context context = C09590Zf.LJIILLIIL.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("storeFloat key: ");
        LIZ.append(str2);
        LIZ.append(",value: ");
        LIZ.append(f);
        X1D.LIZIZ(LIZ);
        C47261Igj.LJIILJJIL("DefaultSharedpreference");
        getInstance().setFloat(context, str, str2, f);
    }

    public static void storeLong(String str, String str2, long j) {
        Context context = C09590Zf.LJIILLIIL.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("storeFloat key: ");
        LIZ.append(str2);
        LIZ.append(",value: ");
        LIZ.append(j);
        X1D.LIZIZ(LIZ);
        C47261Igj.LJIILJJIL("DefaultSharedpreference");
        getInstance().setLong(context, str, str2, j);
    }

    public static void storeString(String str, String str2, String str3) {
        Context context = C09590Zf.LJIILLIIL.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("storeString key: ");
        LIZ.append(str2);
        LIZ.append(",value: ");
        LIZ.append(str3);
        X1D.LIZIZ(LIZ);
        C47261Igj.LJIILJJIL("DefaultSharedpreference");
        getInstance().setString(context, str, str2, str3);
    }

    public boolean contains(Context context, String str, String str2) {
        SharedPreferences sp = getSp(context, str);
        if (sp == null) {
            return false;
        }
        return sp.contains(str2);
    }

    public int getInt(Context context, String str, int i) {
        SharedPreferences sp = getSp(context, this.sFileName);
        if (sp == null) {
            return 0;
        }
        return sp.getInt(str, i);
    }

    public void setBoolean(Context context, String str, boolean z) {
        SharedPreferences sp = getSp(context, this.sFileName);
        if (sp == null) {
            return;
        }
        SharedPreferences.Editor edit = sp.edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public void setFloat(Context context, String str, float f) {
        setFloat(context, this.sFileName, str, f);
    }

    public void setInt(Context context, String str, int i) {
        SharedPreferences.Editor edit = F9J.LIZIZ(context, 0, this.sFileName).edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public void setLong(Context context, String str, long j) {
        setLong(context, this.sFileName, str, j);
    }

    public void setString(Context context, String str, String str2) {
        setString(context, this.sFileName, str, str2);
    }

    public boolean getBoolean(Context context, String str, boolean z) {
        return getBoolean(context, this.sFileName, str, z);
    }

    public float getFloat(Context context, String str, float f) {
        return getFloat(context, this.sFileName, str, f);
    }

    public long getLong(Context context, String str, long j) {
        return getLong(context, this.sFileName, str, j);
    }

    public String getString(Context context, String str, String str2) {
        return getString(context, this.sFileName, str, str2);
    }

    public boolean getBoolean(Context context, String str, String str2, boolean z) {
        SharedPreferences sp = getSp(context, str);
        if (sp == null) {
            return z;
        }
        return sp.getBoolean(str2, z);
    }

    public float getFloat(Context context, String str, String str2, float f) {
        SharedPreferences sp = getSp(context, str);
        if (sp == null) {
            return f;
        }
        return sp.getFloat(str2, f);
    }

    public long getLong(Context context, String str, String str2, long j) {
        SharedPreferences sp = getSp(context, str);
        if (sp == null) {
            return j;
        }
        return sp.getLong(str2, j);
    }

    public String getString(Context context, String str, String str2, String str3) {
        SharedPreferences sp = getSp(context, str);
        if (sp == null) {
            return str3;
        }
        return sp.getString(str2, str3);
    }

    public void setBoolean(Context context, String str, String str2, boolean z) {
        SharedPreferences sp = getSp(context, str);
        if (sp == null) {
            return;
        }
        SharedPreferences.Editor edit = sp.edit();
        edit.putBoolean(str2, z);
        edit.apply();
    }

    public void setFloat(Context context, String str, String str2, float f) {
        SharedPreferences sp = getSp(context, str);
        if (sp == null) {
            return;
        }
        SharedPreferences.Editor edit = sp.edit();
        edit.putFloat(str2, f);
        edit.apply();
    }

    public void setLong(Context context, String str, String str2, long j) {
        SharedPreferences sp = getSp(context, str);
        if (sp == null) {
            return;
        }
        SharedPreferences.Editor edit = sp.edit();
        edit.putLong(str2, j);
        edit.apply();
    }

    public void setString(Context context, String str, String str2, String str3) {
        SharedPreferences sp = getSp(context, str);
        if (sp == null) {
            return;
        }
        SharedPreferences.Editor edit = sp.edit();
        edit.putString(str2, str3);
        edit.apply();
    }
}
