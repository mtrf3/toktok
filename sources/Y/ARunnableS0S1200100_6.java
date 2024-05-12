package Y;

import X.C16880lQ;
import X.C17230lz;
import X.C38159EyJ;
import X.C38162EyM;
import X.C44432HcC;
import X.C65265PjR;
import X.C68322mC;
import X.OSZ;
import X.VNS;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.netecho.Netecho;
import com.bytedance.netecho.result.DnsResolveResult;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public class ARunnableS0S1200100_6 implements Runnable {
    public final int $t;
    public long j3;
    public Object l1;
    public Object l2;
    public String s0;

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

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$0() {
        int parseInt;
        DnsResolveResult dnsResolveResult;
        try {
            List LJLJJL = s.LJLJJL(this.s0, new String[]{":"}, 0, 6);
            if (LJLJJL.size() == 2 && 1 <= (parseInt = Integer.parseInt((String) LJLJJL.get(1))) && 65534 >= parseInt) {
                ((ConcurrentHashMap) ((C68322mC) this.l1).element).put(this.s0, new OSZ(Netecho.INSTANCE.resolveDns((String) LJLJJL.get(0), this.j3), Integer.valueOf(parseInt)));
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("dns return ");
                OSZ osz = (OSZ) ((ConcurrentHashMap) ((C68322mC) this.l1).element).get(this.s0);
                Integer num = null;
                if (osz != null) {
                    dnsResolveResult = (DnsResolveResult) osz.getFirst();
                } else {
                    dnsResolveResult = null;
                }
                LIZ.append(dnsResolveResult);
                LIZ.append(" ");
                OSZ osz2 = (OSZ) ((ConcurrentHashMap) ((C68322mC) this.l1).element).get(this.s0);
                if (osz2 != null) {
                    num = (Integer) osz2.getSecond();
                }
                LIZ.append(num);
                X1D.LIZIZ(LIZ);
            }
        } catch (Throwable unused) {
        }
        ((CountDownLatch) ((C68322mC) this.l2).element).countDown();
    }

    public final void LIZ$1() {
        long j;
        List<TimeLineEvent> list;
        VNS vns = (VNS) ((C38159EyJ) this.l1).LIZ.LIZ();
        if (vns == null || TextUtils.isEmpty(this.s0)) {
            return;
        }
        C17230lz c17230lz = (C17230lz) this.l2;
        if (c17230lz != null && (list = (List) c17230lz.LIZJ) != null) {
            j = 0;
            for (TimeLineEvent timeLineEvent : list) {
                if (timeLineEvent != null && o.LJ("label_create_java_call", timeLineEvent.getLabel())) {
                    j = timeLineEvent.getElapsedTimestamp();
                }
            }
        } else {
            j = 0;
        }
        C38162EyM c38162EyM = new C38162EyM();
        String str = this.s0;
        long j2 = this.j3;
        c38162EyM.LJLILLLLZI = str;
        c38162EyM.LJLJI = 0;
        c38162EyM.LJLJJLL = j;
        if (j != 0) {
            c38162EyM.LJLJL = j2;
            c38162EyM.LJLJJL = j2 - j;
        }
        LynxViewMonitor.Companion.getClass();
        LynxViewMonitor.INSTANCE.reportJsbInfo(vns, c38162EyM);
    }

    public static final void run$0(ARunnableS0S1200100_6 aRunnableS0S1200100_6) {
        ExecutorService executorService = (ExecutorService) aRunnableS0S1200100_6.l1;
        long j = aRunnableS0S1200100_6.j3;
        TimeUnit timeUnit = (TimeUnit) aRunnableS0S1200100_6.l2;
        String str = aRunnableS0S1200100_6.s0;
        try {
            executorService.shutdown();
            if (!executorService.awaitTermination(j, timeUnit)) {
                C44432HcC LIZIZ = C65265PjR.LIZIZ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(" did not shutdown in the allocated time. Requesting immediate shutdown.");
                X1D.LIZIZ(LIZ);
                LIZIZ.getClass();
                executorService.shutdownNow();
            }
        } catch (InterruptedException unused) {
            C44432HcC LIZIZ2 = C65265PjR.LIZIZ();
            C16880lQ.LLLZI(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{str});
            LIZIZ2.getClass();
            executorService.shutdownNow();
        }
    }

    public static final void run$1(ARunnableS0S1200100_6 aRunnableS0S1200100_6) {
        boolean LIZ;
        try {
            aRunnableS0S1200100_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S1200100_6 aRunnableS0S1200100_6) {
        boolean LIZ;
        try {
            aRunnableS0S1200100_6.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S1200100_6(String str, ExecutorService executorService, TimeUnit timeUnit, int i) {
        this.$t = i;
        this.l1 = executorService;
        this.j3 = 1L;
        this.l2 = timeUnit;
        this.s0 = str;
    }

    public ARunnableS0S1200100_6(Object obj, String str, Object obj2, long j, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.j3 = j;
    }
}
