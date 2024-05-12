package X;

import Y.ARunnableS10S0000100_11;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import m43.u;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Q3b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66371Q3b {
    public static final C66371Q3b LIZ = new C66371Q3b();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final C66372Q3c LIZLLL = new C66372Q3c(true, "com.facebook.sdk.AutoInitEnabled");
    public static final C66372Q3c LJ = new C66372Q3c(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
    public static final C66372Q3c LJFF = new C66372Q3c(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
    public static final C66372Q3c LJI = new C66372Q3c(false, "auto_event_setup_enabled");
    public static final C66372Q3c LJII = new C66372Q3c(true, "com.facebook.sdk.MonitorEnabled");
    public static SharedPreferences LJIIIIZZ;

    public static final boolean LIZ() {
        if (C40700FyC.LIZ(C66371Q3b.class)) {
            return false;
        }
        try {
            LIZ.LIZLLL();
            return LJFF.LIZ();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final boolean LIZIZ() {
        if (C40700FyC.LIZ(C66371Q3b.class)) {
            return false;
        }
        try {
            LIZ.LIZLLL();
            return LJ.LIZ();
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void LJFF() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ApplicationInfo LLLLLLLLL;
        int i7;
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            if (!LIZIZ.get() || !u.LJII()) {
                return;
            }
            Context LIZJ2 = u.LIZJ();
            int i8 = 0;
            if (LIZLLL.LIZ()) {
                i = 1;
            } else {
                i = 0;
            }
            int i9 = i << 0;
            if (LJ.LIZ()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            int i10 = i9 | (i2 << 1);
            if (LJFF.LIZ()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i11 = i10 | (i3 << 2);
            if (LJII.LIZ()) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            int i12 = i11 | (i4 << 3);
            SharedPreferences sharedPreferences = LJIIIIZZ;
            if (sharedPreferences != null) {
                int i13 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i13 != i12) {
                    SharedPreferences sharedPreferences2 = LJIIIIZZ;
                    if (sharedPreferences2 != null) {
                        sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i12).apply();
                        try {
                            LLLLLLLLL = C16880lQ.LLLLLLLLL(LIZJ2.getPackageManager(), LIZJ2.getPackageName(), 128);
                        } catch (PackageManager.NameNotFoundException unused) {
                            i5 = 0;
                        }
                        if (LLLLLLLLL != null && LLLLLLLLL.metaData != null) {
                            String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                            boolean[] zArr = {true, true, true, true};
                            int i14 = 0;
                            i8 = 0;
                            i6 = 0;
                            while (true) {
                                int i15 = i14 + 1;
                                try {
                                    if (LLLLLLLLL.metaData.containsKey(strArr[i14])) {
                                        i7 = 1;
                                    } else {
                                        i7 = 0;
                                    }
                                    i8 |= i7 << i14;
                                    i6 |= (LLLLLLLLL.metaData.getBoolean(strArr[i14], zArr[i14]) ? 1 : 0) << i14;
                                    if (i15 > 3) {
                                        break;
                                    } else {
                                        i14 = i15;
                                    }
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    i5 = i8;
                                    i8 = i6;
                                    i6 = i8;
                                    i8 = i5;
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("usage", i8);
                                    bundle.putInt("initial", i6);
                                    bundle.putInt("previous", i13);
                                    bundle.putInt("current", i12);
                                    return;
                                }
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("usage", i8);
                            bundle2.putInt("initial", i6);
                            bundle2.putInt("previous", i13);
                            bundle2.putInt("current", i12);
                            return;
                        }
                        i6 = 0;
                        Bundle bundle22 = new Bundle();
                        bundle22.putInt("usage", i8);
                        bundle22.putInt("initial", i6);
                        bundle22.putInt("previous", i13);
                        bundle22.putInt("current", i12);
                        return;
                    }
                    o.LJIJI("userSettingPref");
                    throw null;
                }
                return;
            }
            o.LJIJI("userSettingPref");
            throw null;
        } catch (Throwable unused3) {
        }
    }

    public final void LIZJ() {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            C66372Q3c c66372Q3c = LJI;
            LJI(c66372Q3c);
            long currentTimeMillis = System.currentTimeMillis();
            if (c66372Q3c.LIZJ != null && currentTimeMillis - c66372Q3c.LIZLLL < 604800000) {
                return;
            }
            c66372Q3c.LIZJ = null;
            c66372Q3c.LIZLLL = 0L;
            if (!LIZJ.compareAndSet(false, true)) {
                return;
            }
            u.LJ().execute(new ARunnableS10S0000100_11(currentTimeMillis, 1));
        } catch (Throwable unused) {
        }
    }

    public final void LIZLLL() {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            if (!u.LJII()) {
                return;
            }
            int i = 0;
            if (!LIZIZ.compareAndSet(false, true)) {
                return;
            }
            SharedPreferences LIZIZ2 = F9J.LIZIZ(u.LIZJ(), 0, "com.facebook.sdk.USER_SETTINGS");
            o.LJIIIIZZ(LIZIZ2, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
            LJIIIIZZ = LIZIZ2;
            C66372Q3c[] c66372Q3cArr = {LJ, LJFF, LIZLLL};
            if (!C40700FyC.LIZ(this)) {
                do {
                    try {
                        C66372Q3c c66372Q3c = c66372Q3cArr[i];
                        i++;
                        if (c66372Q3c == LJI) {
                            LIZJ();
                        } else if (c66372Q3c.LIZJ == null) {
                            LJI(c66372Q3c);
                            if (c66372Q3c.LIZJ == null) {
                                LJ(c66372Q3c);
                            }
                        } else {
                            LJIIIIZZ(c66372Q3c);
                        }
                    } catch (Throwable unused) {
                    }
                } while (i < 3);
            }
            LIZJ();
            if (!C40700FyC.LIZ(this)) {
                try {
                    Context LIZJ2 = u.LIZJ();
                    ApplicationInfo LLLLLLLLL = C16880lQ.LLLLLLLLL(LIZJ2.getPackageManager(), LIZJ2.getPackageName(), 128);
                    if (LLLLLLLLL != null && LLLLLLLLL.metaData != null) {
                        LLLLLLLLL.metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled");
                        LLLLLLLLL.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                        LIZ();
                    }
                } catch (Throwable unused2) {
                }
            }
            LJFF();
        } catch (Throwable unused3) {
        }
    }

    public final void LJII() {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            if (LIZIZ.get()) {
            } else {
                throw new Q4U("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable unused) {
        }
    }

    public final void LJ(C66372Q3c c66372Q3c) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            LJII();
            Context LIZJ2 = u.LIZJ();
            ApplicationInfo LLLLLLLLL = C16880lQ.LLLLLLLLL(LIZJ2.getPackageManager(), LIZJ2.getPackageName(), 128);
            if (LLLLLLLLL != null && LLLLLLLLL.metaData != null && LLLLLLLLL.metaData.containsKey(c66372Q3c.LIZIZ)) {
                c66372Q3c.LIZJ = Boolean.valueOf(LLLLLLLLL.metaData.getBoolean(c66372Q3c.LIZIZ, c66372Q3c.LIZ));
            }
        } catch (Throwable unused) {
        }
    }

    public final void LJI(C66372Q3c c66372Q3c) {
        String str = "";
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            LJII();
            try {
                SharedPreferences sharedPreferences = LJIIIIZZ;
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString(c66372Q3c.LIZIZ, "");
                    if (string != null) {
                        str = string;
                    }
                    if (str.length() > 0) {
                        JSONObject jSONObject = new JSONObject(str);
                        c66372Q3c.LIZJ = Boolean.valueOf(jSONObject.getBoolean("value"));
                        c66372Q3c.LIZLLL = jSONObject.getLong("last_timestamp");
                        return;
                    }
                    return;
                }
                o.LJIJI("userSettingPref");
                throw null;
            } catch (JSONException unused) {
            }
        } catch (Throwable unused2) {
        }
    }

    public final void LJIIIIZZ(C66372Q3c c66372Q3c) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            LJII();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", c66372Q3c.LIZJ);
                jSONObject.put("last_timestamp", c66372Q3c.LIZLLL);
                SharedPreferences sharedPreferences = LJIIIIZZ;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString(c66372Q3c.LIZIZ, jSONObject.toString()).apply();
                    LJFF();
                } else {
                    o.LJIJI("userSettingPref");
                    throw null;
                }
            } catch (Exception unused) {
            }
        } catch (Throwable unused2) {
        }
    }
}
