package Y;

import X.C56178M3a;
import X.M3Z;

/* loaded from: classes4.dex */
public class ARunnableS0S0000200_3 implements Runnable {
    public final int $t;
    public long j0;
    public long j1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        M3Z m3z = new M3Z("poi_collect_list");
        m3z.LIZLLL = "page_render";
        m3z.LIZ(System.currentTimeMillis() - this.j0);
        C56178M3a.LIZ(m3z);
        M3Z m3z2 = new M3Z("poi_collect_list");
        m3z2.LIZLLL = "first_frame";
        m3z2.LIZ(System.currentTimeMillis() - this.j1);
        C56178M3a.LIZ(m3z2);
    }

    public final void LIZ$1() {
        long currentTimeMillis = System.currentTimeMillis();
        M3Z m3z = new M3Z("poi_search");
        m3z.LIZLLL = "page_render";
        m3z.LIZ(currentTimeMillis - this.j0);
        C56178M3a.LIZ(m3z);
        M3Z m3z2 = new M3Z("poi_search");
        m3z2.LIZLLL = "first_frame";
        m3z2.LIZ(currentTimeMillis - this.j1);
        C56178M3a.LIZ(m3z2);
    }

    public static final void run$0(ARunnableS0S0000200_3 aRunnableS0S0000200_3) {
        boolean LIZ;
        try {
            aRunnableS0S0000200_3.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0000200_3 aRunnableS0S0000200_3) {
        boolean LIZ;
        try {
            aRunnableS0S0000200_3.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S0000200_3(long j, long j2, int i) {
        this.$t = i;
        this.j0 = j;
        this.j1 = j2;
    }
}
