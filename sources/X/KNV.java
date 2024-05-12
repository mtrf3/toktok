package X;

import android.content.res.Resources;
import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final /* synthetic */ class KNV {
    public static InterfaceC63694OzC LIZ() {
        return C17N.LJJJJLL().If().LIZJ();
    }

    public static Integer LIZIZ(double d) {
        return Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(d))));
    }

    public static String LIZJ(int i, String str) {
        Resources LIZJ = FKM.LIZJ();
        o.LJI(LIZJ);
        String string = LIZJ.getString(i);
        o.LJIIIIZZ(string, str);
        return string;
    }

    public static C188727au LIZLLL(String str, String str2) {
        o.LJIIIZ(str, str2);
        return new C188727au();
    }

    public static boolean LJFF(ActivityC45651qj activityC45651qj, String str) {
        return TextUtils.equals(str, C84193Sd.LIZ(activityC45651qj).hv0());
    }

    public static void LJ(int i, BZI bzi, String str, String str2, String str3) {
        bzi.LJIJJ(Integer.valueOf(i), str);
        bzi.LJIJJ(str2, str3);
    }
}
