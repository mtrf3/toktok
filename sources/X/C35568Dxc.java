package X;

import android.os.Process;
import com.bytedance.common.jato.JatoXL;
import java.util.HashSet;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Dxc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35568Dxc {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        if (((Boolean) DSG.LJIILIIL.getValue()).booleanValue() && C2NW.LIZ().LJJIIJZLJL()) {
            return true;
        }
        return false;
    }

    public static void LIZJ(int i) {
        Object LIZ2;
        if (!LIZ()) {
            return;
        }
        try {
            JatoXL.resetPriority(i);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(i);
            LIZ3.append(" resetThreadPriority:");
            LIZ3.append(Process.getThreadPriority(i));
            LIZ2 = Integer.valueOf(android.util.Log.d("RequestThreadPriority", X1D.LIZIZ(LIZ3)));
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        C3C5.m10exceptionOrNullimpl(LIZ2);
    }

    public static void LIZIZ(int i, String str) {
        Object LIZ2;
        int LJJLIIIJJIZ;
        int i2;
        if (!LIZ()) {
            return;
        }
        try {
            LJJLIIIJJIZ = s.LJJLIIIJJIZ(str, '?', 0, false, 6);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (LJJLIIIJJIZ <= 0) {
            return;
        }
        String substring = str.substring(0, LJJLIIIJJIZ);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        HashSet<String> LIZ3 = C83703Qg.LIZ();
        if (LIZ3 != null && LIZ3.contains(substring) && C76800UCe.LIZ != null) {
            int threadPriority = Process.getThreadPriority(i);
            if (((Boolean) DSG.LJIILJJIL.getValue()).booleanValue()) {
                i2 = 10;
            } else {
                i2 = 5;
            }
            if (threadPriority > i2) {
                return;
            }
            EVM.LIZ(i, i2);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(i);
            LIZ4.append(" threadPriority change after:");
            LIZ4.append(Process.getThreadPriority(i));
            LIZ2 = Integer.valueOf(android.util.Log.d("RequestThreadPriority", X1D.LIZIZ(LIZ4)));
            C3C5.m7constructorimpl(LIZ2);
            C3C5.m10exceptionOrNullimpl(LIZ2);
        }
    }
}
