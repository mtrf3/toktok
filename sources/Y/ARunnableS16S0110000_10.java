package Y;

import X.C26045AKb;
import X.C61776OMi;
import X.C61780OMm;
import X.C62114OZi;
import X.C63143OqJ;
import X.C63291Osh;
import X.C63308Osy;
import X.C63322OtC;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public class ARunnableS16S0110000_10 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r4 != null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS16S0110000_10.LIZ$0():void");
    }

    public final void LIZ$1() {
        ((C63308Osy) this.l0).LJIIIIZZ();
        if (this.z1) {
            C63143OqJ.LJII().LIZLLL();
        }
        C63291Osh.LIZ().getClass();
        C63322OtC.LJFF("SPUtils reset");
        int i = C63291Osh.LIZLLL.getInt(C63291Osh.LJIIIZ("im_reset_count"));
        if (SystemClock.uptimeMillis() - C63291Osh.LIZLLL.LIZLLL(0L, C63291Osh.LJIIIZ("im_reset_time")) > 3600000) {
            C63322OtC.LJFF("SPUtils clear all");
            C63291Osh.LIZLLL.clearAll();
            C63291Osh.LIZLLL.LIZIZ(Long.valueOf(SystemClock.uptimeMillis()), C63291Osh.LJIIIZ("im_reset_time"));
        }
        C63291Osh.LIZLLL.putInt(C63291Osh.LJIIIZ("im_reset_count"), i + 1);
        ((C63308Osy) this.l0).LJII();
    }

    public static final void run$0(ARunnableS16S0110000_10 aRunnableS16S0110000_10) {
        int i;
        C62114OZi c62114OZi = (C62114OZi) aRunnableS16S0110000_10.l0;
        boolean z = aRunnableS16S0110000_10.z1;
        c62114OZi.getClass();
        C26045AKb c26045AKb = new C26045AKb(c62114OZi.LIZ);
        if (z) {
            c62114OZi.LJII.getClass();
            i = R.string.hin;
        } else {
            i = R.string.jbv;
        }
        c26045AKb.LJIIIIZZ(i);
        c26045AKb.LJIIJ();
    }

    public static final void run$1(ARunnableS16S0110000_10 aRunnableS16S0110000_10) {
        boolean LIZ;
        try {
            aRunnableS16S0110000_10.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS16S0110000_10 aRunnableS16S0110000_10) {
        boolean LIZ;
        try {
            aRunnableS16S0110000_10.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS16S0110000_10 aRunnableS16S0110000_10) {
        boolean LIZ;
        try {
            if (C61776OMi.LJ) {
                if (aRunnableS16S0110000_10.z1) {
                    System.currentTimeMillis();
                } else {
                    C61776OMi.LJ("background", (Aweme) aRunnableS16S0110000_10.l0, C61776OMi.LIZLLL);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS16S0110000_10 aRunnableS16S0110000_10) {
        boolean LIZ;
        try {
            if (C61780OMm.LIZLLL && !aRunnableS16S0110000_10.z1) {
                C61780OMm.LJI("background", (Aweme) aRunnableS16S0110000_10.l0, C61780OMm.LIZIZ);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS16S0110000_10(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
