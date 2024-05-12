package Y;

import X.C31012CFc;
import X.C76762UAs;
import X.C77557UcD;
import X.U66;
import X.UA8;
import X.UC0;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS9S0200100_13 implements Runnable {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

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
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0299, code lost:
    
        if (r1 == true) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS9S0200100_13.LIZ$0():void");
    }

    public static final void run$0(ARunnableS9S0200100_13 aRunnableS9S0200100_13) {
        boolean LIZ;
        try {
            C77557UcD c77557UcD = (C77557UcD) aRunnableS9S0200100_13.l0;
            c77557UcD.LJLJJI = 2;
            c77557UcD.LJ(aRunnableS9S0200100_13.j2, (Runnable) aRunnableS9S0200100_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS9S0200100_13 aRunnableS9S0200100_13) {
        boolean LIZ;
        try {
            aRunnableS9S0200100_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS9S0200100_13 aRunnableS9S0200100_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS9S0200100_13.l0);
            long LIZIZ = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            C76762UAs c76762UAs = (C76762UAs) aRunnableS9S0200100_13.l1;
            c76762UAs.LIZLLL.LIZIZ(new UA8((U66) aRunnableS9S0200100_13.l0, LIZIZ, currentTimeMillis, LJIJI, c76762UAs, aRunnableS9S0200100_13.j2));
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS9S0200100_13(Object obj, Object obj2, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.j2 = j;
    }
}
