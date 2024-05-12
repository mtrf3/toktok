package X;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.UUID;

/* renamed from: X.Ej4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37214Ej4 {
    public static volatile UUID LIZ = null;
    public static String LIZIZ = "";

    public static String LIZIZ(ContentResolver contentResolver) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {contentResolver, "android_id"};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;", "-5170192890848292297");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(102004, "android/provider/Settings$Secure", "getString", Settings.Secure.class, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", null, objArr, Settings.Secure.class, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        String string = Settings.Secure.getString(contentResolver, "android_id");
        c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", string, objArr, Settings.Secure.class, c65300Pk0, true);
        return string;
    }

    public C37214Ej4(Context context) {
        String str;
        if (LIZ == null) {
            synchronized (C37214Ej4.class) {
                if (LIZ == null) {
                    C64256PJs LIZIZ2 = C64256PJs.LIZIZ();
                    LIZIZ2.getClass();
                    String str2 = null;
                    try {
                        str = PK8.LJFF(LIZIZ2.LIZJ.getAbsolutePath());
                    } catch (Throwable unused) {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            LIZ = UUID.fromString(str);
                        } catch (Throwable unused2) {
                            LIZ = UUID.randomUUID();
                        }
                    } else {
                        try {
                            str2 = LIZ(context.getContentResolver());
                        } catch (Throwable unused3) {
                        }
                        try {
                            if (str2 != null) {
                                LIZ = UUID.nameUUIDFromBytes(str2.getBytes("utf8"));
                            } else {
                                LIZ = UUID.randomUUID();
                            }
                        } catch (Throwable unused4) {
                            LIZ = UUID.randomUUID();
                        }
                        C64256PJs LIZIZ3 = C64256PJs.LIZIZ();
                        String valueOf = String.valueOf(LIZ);
                        LIZIZ3.getClass();
                        try {
                            PK8.LJIILJJIL(LIZIZ3.LIZJ, valueOf, false);
                        } catch (Throwable unused5) {
                        }
                    }
                }
            }
        }
    }

    public static String LIZ(ContentResolver contentResolver) {
        if (TextUtils.equals("android_id", "android_id")) {
            if (AV1.LJIILLIIL() && C65928Pu8.LIZIZ.LIZ().strictModeConfigs.get("kids_mode_overseas_scene").fuseApiIds.contains(102004)) {
                return "";
            }
            if (TextUtils.isEmpty(E77.LIZ)) {
                E77.LIZ = LIZIZ(contentResolver);
            }
            return E77.LIZ;
        }
        return LIZIZ(contentResolver);
    }

    public static synchronized String LIZJ(Context context) {
        String str;
        synchronized (C37214Ej4.class) {
            if (TextUtils.isEmpty(LIZIZ)) {
                new C37214Ej4(context);
                UUID uuid = LIZ;
                if (uuid != null) {
                    LIZIZ = uuid.toString();
                }
            }
            str = LIZIZ;
        }
        return str;
    }
}
