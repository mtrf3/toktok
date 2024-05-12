package Y;

import X.C65618Pp8;
import X.C75516TkO;
import X.C76762UAs;
import X.RunnableC76744UAa;
import X.U66;
import X.UC0;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S0200200_13 implements Runnable {
    public final int $t;
    public long j2;
    public long j3;
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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        JSONObject LJIJI = UC0.LJIJI((U66) this.l0);
        long currentTimeMillis = System.currentTimeMillis();
        String businessId = ((U66) this.l0).LLLZI().getBusinessId();
        C76762UAs c76762UAs = (C76762UAs) this.l1;
        U66 u66 = (U66) this.l0;
        c76762UAs.getClass();
        if (businessId == null || businessId.length() == 0) {
            C75516TkO.LIZ.LIZ(20005, "EmptyBusinessIdException", C65618Pp8.of("layoutInfo", u66.LLLZI().toString()));
        }
        C76762UAs c76762UAs2 = (C76762UAs) this.l1;
        c76762UAs2.LIZLLL.LIZIZ(new RunnableC76744UAa(c76762UAs2, (U66) this.l0, this.j2, currentTimeMillis, LJIJI, this.j3, businessId));
    }

    public static final void run$0(ARunnableS0S0200200_13 aRunnableS0S0200200_13) {
        boolean LIZ;
        try {
            aRunnableS0S0200200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0200200_13 aRunnableS0S0200200_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS0S0200200_13.l0);
            C76762UAs c76762UAs = (C76762UAs) aRunnableS0S0200200_13.l1;
            c76762UAs.LIZLLL.LIZIZ(new ARunnableS1S0300200_13(aRunnableS0S0200200_13.j2, aRunnableS0S0200200_13.j3, (U66) aRunnableS0S0200200_13.l0, c76762UAs, LJIJI, 5));
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S0200200_13(U66 u66, C76762UAs c76762UAs, long j, long j2, int i) {
        this.$t = i;
        this.l0 = u66;
        this.l1 = c76762UAs;
        this.j2 = j;
        this.j3 = j2;
    }
}
