package X;

import android.view.ViewConfiguration;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.AlK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27162AlK {
    public static final int LIZ = KL2.LJIIJJI(EF7.LIZIZ());
    public static final int LIZIZ;
    public static final float LIZJ;
    public static final float LIZLLL;
    public static final float LJ;
    public static final float LJFF;
    public static final float LJI;
    public static final int LJII;
    public static final int LJIIIIZZ;
    public static final int LJIIIZ;
    public static final int LJIIJ;
    public static final String LJIIJJI;
    public static final int LJIIL;
    public static final int LJIILIIL;
    public static final int LJIILJJIL;
    public static final int LJIILL;
    public static final float LJIILLIIL;
    public static final int LJIIZILJ;
    public static final int LJIJ;
    public static final int LJIJI;
    public static final int LJIJJ;
    public static final int LJIJJLI;
    public static final int LJIL;
    public static final int LJJ;
    public static final int LJJI;
    public static final int LJJIFFI;
    public static final int LJJII;
    public static final int LJJIII;
    public static final int LJJIIJ;
    public static final int LJJIIJZLJL;
    public static final int LJJIIZ;
    public static final int LJJIIZI;

    static {
        int LJIIIZ2 = KL2.LJIIIZ(EF7.LIZIZ());
        LIZIZ = LJIIIZ2;
        float f = LJIIIZ2;
        LIZJ = 0.73f * f;
        LIZLLL = 0.95f * f;
        LJ = 0.85f * f;
        LJFF = f * 0.9f;
        LJI = KL2.LIZJ(EF7.LIZIZ(), 12.0f);
        LJII = (int) KL2.LIZJ(EF7.LIZIZ(), 32.0f);
        LJIIIIZZ = (int) KL2.LIZJ(EF7.LIZIZ(), 16.0f);
        LJIIIZ = (int) KL2.LIZJ(EF7.LIZIZ(), 8.0f);
        LJIIJ = ViewConfiguration.get(EF7.LIZIZ()).getScaledTouchSlop();
        LJIIJJI = "end";
        LJIIL = (int) KL2.LIZJ(EF7.LIZIZ(), 44.0f);
        LJIILIIL = (int) KL2.LIZJ(EF7.LIZIZ(), 6.5f);
        LJIILJJIL = (int) KL2.LIZJ(EF7.LIZIZ(), 4.0f);
        LJIILL = (int) KL2.LIZJ(EF7.LIZIZ(), 12.0f);
        LJIILLIIL = C32151Nz.LJIIZILJ(2);
        C32151Nz.LJIIZILJ(4);
        LJIIZILJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(0));
        LJIJ = (int) C32151Nz.LJIIZILJ(Double.valueOf(0.5d));
        LJIJI = C7MY.LIZIZ(1);
        LJIJJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(4));
        LJIJJLI = (int) C32151Nz.LJIIZILJ(Double.valueOf(4.17d));
        LJIL = C7MY.LIZIZ(6);
        LJJ = C7MY.LIZIZ(8);
        LJJI = C7MY.LIZIZ(12);
        LJJIFFI = C7MY.LIZIZ(13);
        LJJII = C7MY.LIZIZ(16);
        LJJIII = C7MY.LIZIZ(15);
        LJJIIJ = C7MY.LIZIZ(18);
        LJJIIJZLJL = C7MY.LIZIZ(21);
        LJJIIZ = C7MY.LIZIZ(60);
        LJJIIZI = C7MY.LIZIZ(LiveCoverMinSizeSetting.DEFAULT);
    }

    public static final float LIZIZ() {
        int i = C60996Nwm.LJI(EF7.LIZIZ())[1];
        if (i < 0) {
            i = 0;
        }
        return i * 0.73f;
    }

    public static String LIZ(String cur, String total) {
        o.LJIIIZ(cur, "cur");
        o.LJIIIZ(total, "total");
        if (!C90193gN.LIZ()) {
            return C00F.LIZIZ(cur, '/', total);
        }
        return C00F.LIZIZ(total, '/', cur);
    }
}
