package X;

import android.content.ContentResolver;
import android.provider.Settings;
import android.text.TextUtils;

/* loaded from: classes7.dex */
public final class E72 extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final E72 LJLIL = new E72();

    public E72() {
        super(0);
    }

    public static String LIZ(ContentResolver contentResolver) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {contentResolver, "android_id"};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;", "5271291516694737453");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(102004, "android/provider/Settings$Secure", "getString", Settings.Secure.class, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", null, objArr, Settings.Secure.class, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        String string = Settings.Secure.getString(contentResolver, "android_id");
        c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", string, objArr, Settings.Secure.class, c65300Pk0, true);
        return string;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        ContentResolver contentResolver = EF7.LIZIZ().getContentResolver();
        if (TextUtils.equals("android_id", "android_id")) {
            if (AV1.LJIILLIIL() && C65928Pu8.LIZIZ.LIZ().strictModeConfigs.get("kids_mode_overseas_scene").fuseApiIds.contains(102004)) {
                return "";
            }
            if (TextUtils.isEmpty(E77.LIZ)) {
                E77.LIZ = LIZ(contentResolver);
            }
            return E77.LIZ;
        }
        return LIZ(contentResolver);
    }
}