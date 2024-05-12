package Y;

import X.C35936E8m;
import X.FMX;
import X.InterfaceC64592gB;
import X.InterfaceC79713Ax;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.legoImp.task.observer_task.CohortSubscriptionObserver;

/* loaded from: classes7.dex */
public class AfS1S2100100_6 implements InterfaceC64592gB {
    public final int $t;
    public long j3;
    public Object l2;
    public String s0;
    public String s1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS1S2100100_6 afS1S2100100_6, Object obj) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZ(1, "is_success");
        c35936E8m.LIZIZ(SystemClock.elapsedRealtime() - afS1S2100100_6.j3, "req_duration");
        c35936E8m.LIZLLL("qs", afS1S2100100_6.s0);
        c35936E8m.LIZLLL("path", afS1S2100100_6.s1);
        FMX.LJIIL("cohort_subscribe_result", c35936E8m.LIZ);
        InterfaceC79713Ax interfaceC79713Ax = ((CohortSubscriptionObserver) afS1S2100100_6.l2).LIZ;
        if (interfaceC79713Ax != null) {
            interfaceC79713Ax.onComplete();
        }
    }

    public static final void accept$1(AfS1S2100100_6 afS1S2100100_6, Object obj) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZ(0, "is_success");
        c35936E8m.LIZIZ(SystemClock.elapsedRealtime() - afS1S2100100_6.j3, "req_duration");
        c35936E8m.LIZLLL("qs", afS1S2100100_6.s0);
        c35936E8m.LIZLLL("path", afS1S2100100_6.s1);
        FMX.LJIIL("cohort_subscribe_result", c35936E8m.LIZ);
        InterfaceC79713Ax interfaceC79713Ax = ((CohortSubscriptionObserver) afS1S2100100_6.l2).LIZ;
        if (interfaceC79713Ax != null) {
            interfaceC79713Ax.onComplete();
        }
    }

    public AfS1S2100100_6(long j, String str, String str2, CohortSubscriptionObserver cohortSubscriptionObserver, int i) {
        this.$t = i;
        this.j3 = j;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = cohortSubscriptionObserver;
    }
}
