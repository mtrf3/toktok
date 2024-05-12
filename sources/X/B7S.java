package X;

import Y.ARunnableS11S1000000_5;
import android.os.Handler;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B7S {
    public static long LIZ;

    public static void LIZ() {
        String string = C15380j0.LIZLLL().getString(R.string.nep);
        o.LJIIIIZZ(string, "getContext().getString(resId)");
        C30868C9o.LJI(string);
        LIZ = System.nanoTime() / 1000000;
    }

    public static void LIZIZ(int i) {
        String string = C15380j0.LIZLLL().getString(i);
        o.LJIIIIZZ(string, "getContext().getString(resId)");
        long nanoTime = System.nanoTime() / 1000000;
        long j = LIZ;
        long j2 = nanoTime - j;
        if (j == 0 || j2 >= 2000) {
            C30868C9o.LJI(string);
        } else {
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS11S1000000_5(string, 2), j2);
        }
        LIZ = 0L;
    }
}
