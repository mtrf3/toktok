package Y;

import com.ss.android.ugc.aweme.simreporterdt.SimDtReportService;
import com.ss.android.ugc.aweme.simreporterdt.SimDtReportServiceV2;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public class ARunnableS0S2211100_8 implements Runnable {
    public final int $t;
    public int i5;
    public long j6;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;
    public boolean z4;

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

    public static final void run$0(ARunnableS0S2211100_8 aRunnableS0S2211100_8) {
        SimDtReportService.m172reportBlock$lambda4((Callable) aRunnableS0S2211100_8.l2, (SimDtReportService) aRunnableS0S2211100_8.l3, aRunnableS0S2211100_8.s0, aRunnableS0S2211100_8.i5, aRunnableS0S2211100_8.j6, aRunnableS0S2211100_8.s1, aRunnableS0S2211100_8.z4);
    }

    public static final void run$1(ARunnableS0S2211100_8 aRunnableS0S2211100_8) {
        SimDtReportServiceV2.m186reportBlock$lambda6((Callable) aRunnableS0S2211100_8.l2, (SimDtReportServiceV2) aRunnableS0S2211100_8.l3, aRunnableS0S2211100_8.s0, aRunnableS0S2211100_8.z4, aRunnableS0S2211100_8.i5, aRunnableS0S2211100_8.j6, aRunnableS0S2211100_8.s1);
    }

    public ARunnableS0S2211100_8(Object obj, Object obj2, String str, int i, long j, String str2, boolean z, int i2) {
        this.$t = i2;
        this.l2 = obj;
        this.l3 = obj2;
        this.s0 = str;
        this.i5 = i;
        this.j6 = j;
        this.s1 = str2;
        this.z4 = z;
    }
}
