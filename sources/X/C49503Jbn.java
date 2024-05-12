package X;

import android.view.View;

/* renamed from: X.Jbn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49503Jbn implements InterfaceC49275JVn {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static String LJ = "";
    public static String LJFF = "";
    public static int LJI = -1;
    public static java.util.Map<String, String> LJII;
    public static JQA LJIIIIZZ;
    public static boolean LJIIIZ;

    public static String LIZIZ() {
        C50160JmO LIZJ2;
        String str;
        InterfaceC50157JmL LIZ = K0M.LIZ();
        if (LIZ == null || (LIZJ2 = LIZ.LIZJ()) == null || (str = LIZJ2.LIZ) == null) {
            return "";
        }
        return str;
    }

    public static void LIZ(View view, String str, int i, java.util.Map map) {
        if (view == null) {
            return;
        }
        JQA LIZ = JY2.LIZ(view);
        LJIIIIZZ = LIZ;
        LJFF = LIZ.LIZLLL;
        if (str == null) {
            str = "";
        }
        LJ = str;
        LJI = i;
        LJII = map;
    }
}
