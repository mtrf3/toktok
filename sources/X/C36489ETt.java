package X;

import android.content.ContentResolver;
import android.provider.Settings;

/* renamed from: X.ETt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36489ETt {
    public static String LIZ(ContentResolver contentResolver) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {contentResolver, "time_12_24"};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;", "-8623291511850890965");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(102003, "android/provider/Settings$System", "getString", Settings.System.class, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(102003, "android/provider/Settings$System", "getString", null, objArr, Settings.System.class, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        String string = Settings.System.getString(contentResolver, "time_12_24");
        c03880Dg.LIZIZ(102003, "android/provider/Settings$System", "getString", string, objArr, Settings.System.class, c65300Pk0, true);
        return string;
    }
}
