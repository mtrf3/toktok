package X;

import android.animation.AnimatorSet;
import com.bytedance.librarian.Librarian;
import kotlin.jvm.internal.o;

/* renamed from: X.1DD, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1DD implements InterfaceC81733W5x {
    public static AnimatorSet LIZ(long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(j);
        return animatorSet;
    }

    @Override // X.InterfaceC81733W5x
    public void loadLibrary(String str) {
        Librarian.LJ(str);
    }

    public static N68 LIZIZ(String str, long j) {
        N68 n68 = new N68(str);
        n68.LIZIZ(j);
        return n68;
    }

    public static String LIZLLL(int i, String str) {
        String string = EF7.LIZIZ().getString(i);
        o.LJIIIIZZ(string, str);
        return string;
    }

    public static String LJ(String str, Exception exc) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(exc);
        return X1D.LIZIZ(LIZ);
    }

    public static Double LIZJ(double d, double d2, double d3) {
        return Double.valueOf((d * d2) / d3);
    }

    public static void LJFF(StringBuilder sb, int i, StringBuilder sb2, String str) {
        sb.append(i);
        C0NB.LIZIZ(str, X1D.LIZIZ(sb2));
    }
}
