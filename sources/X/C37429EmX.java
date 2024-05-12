package X;

import com.bytedance.pia.core.setting.Settings;

/* renamed from: X.EmX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37429EmX {
    public static boolean LIZ(android.net.Uri uri) {
        Settings.LJIIIZ.getClass();
        if (!Settings.LJII || C37431EmZ.LIZJ.LIZIZ(uri) != null) {
            return true;
        }
        C37542EoM.LJIIJJI.getClass();
        if (uri != null) {
            if (!C37542EoM.LJII) {
                return true;
            }
            String LIZJ = C85693Xx.LIZJ(uri, null);
            if (LIZJ != null && (C37542EoM.LJIIIIZZ.contains(LIZJ) || C37542EoM.LJIIJ.contains(LIZJ))) {
                return true;
            }
        }
        return false;
    }
}
