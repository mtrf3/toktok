package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.E2y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35792E2y {
    public static final String[] LIZ;
    public static final String[] LIZIZ;

    static {
        String[] strArr;
        String[] strArr2 = {"surl", "fallback_url"};
        LIZ = strArr2;
        try {
            strArr = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("lynxview_command_blacklist", String[].class, strArr2);
        } catch (Exception unused) {
            strArr = LIZ;
        }
        LIZIZ = strArr;
    }
}
