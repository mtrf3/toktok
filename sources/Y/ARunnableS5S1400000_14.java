package Y;

import X.C16880lQ;
import X.C77117UOj;
import X.C79346VCc;
import X.C79356VCm;
import X.C79358VCo;
import X.C79367VCx;
import X.R2K;
import X.VDE;
import X.VML;
import X.X1D;
import com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge;
import com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class ARunnableS5S1400000_14 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
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

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0234, code lost:
    
        if (r1.LJIL == r0.size()) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x023a, code lost:
    
        ((com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer) r9.l4).LJIILL = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x024a, code lost:
    
        if (X.C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableHttpDns != 1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0252, code lost:
    
        if (((com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer) r9.l4).LJJIIJ != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0275, code lost:
    
        if (((X.VDE) r9.l3) == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0277, code lost:
    
        r1 = (com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer) r9.l4;
        r0 = r1.LJIIZILJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x027d, code lost:
    
        if (r0 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0285, code lost:
    
        if (r1.LJJ != r0.size()) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0289, code lost:
    
        if (r9.s0 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x028b, code lost:
    
        r5 = ((com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer) r9.l4).LJFF;
        r3 = java.lang.System.currentTimeMillis();
        r2 = (com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer) r9.l4;
        r5.LIZ = r3 - r2.LJJIJIIJIL;
        r1 = r2.LJFF;
        r1.LIZJ = r2.LJIL;
        r1.LIZIZ = r2.LJIIZILJ.size();
        ((com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer) r9.l4).LJFF.LJIIJ = X.C79346VCc.LIZLLL().LIZLLL;
        r0 = (com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer) r9.l4;
        r1 = r0.LJFF;
        r1.LJIIIIZZ = r0.LJJIIJ ? 1 : 0;
        r1.uploadMonitorLog();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02c7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02cc, code lost:
    
        if (((X.VDE) r9.l3) == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02d0, code lost:
    
        if (r9.s0 == null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02d2, code lost:
    
        r2 = (com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer) r9.l4;
        r1 = r2.LJI;
        r1.LJII = "force_refresh";
        r1.LJFF = r2.LJFF.LJII;
        r1.LJI = X.C79346VCc.LIZLLL().LIZLLL;
        r1 = ((com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer) r9.l4).LJI;
        r1.LJ = r9.s0;
        r1.uploadMonitorLog();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x025a, code lost:
    
        if (X.C79346VCc.LIZLLL().LJJI != 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0264, code lost:
    
        if (((com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer) r9.l4).LJFF.LJII == 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0266, code lost:
    
        ((X.C79367VCx) ((X.VDE) r9.l3)).LIZ(r9.s0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0238, code lost:
    
        if (r9.s0 != null) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS5S1400000_14.LIZ$1():void");
    }

    public final void LIZ$2() {
        try {
            ((Future) this.l1).get(C79346VCc.LIZLLL().LJIIL.LIZLLL.mLocalDnsTimeOut, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            ((Future) this.l1).cancel(true);
            DnsOptimizer dnsOptimizer = (DnsOptimizer) this.l4;
            dnsOptimizer.LJIILL = true;
            if (!dnsOptimizer.LJJIIJ) {
                ((C79367VCx) ((VDE) this.l3)).LIZ(this.s0);
            }
            DnsOptimizer dnsOptimizer2 = (DnsOptimizer) this.l4;
            dnsOptimizer2.LJJIIJ = true;
            C79358VCo c79358VCo = dnsOptimizer2.LJI;
            c79358VCo.LJII = "dns_time_out";
            c79358VCo.LJ = ((R2K) this.l2).LIZ;
            c79358VCo.LJFF = dnsOptimizer2.LJFF.LJII;
            c79358VCo.LJI = C79346VCc.LIZLLL().LIZLLL;
            ((DnsOptimizer) this.l4).LJI.uploadMonitorLog();
            DnsOptimizer dnsOptimizer3 = (DnsOptimizer) this.l4;
            Set<String> set = dnsOptimizer3.LJIIZILJ;
            if (set != null && dnsOptimizer3.LJJ == set.size()) {
                C79356VCm c79356VCm = ((DnsOptimizer) this.l4).LJFF;
                long currentTimeMillis = System.currentTimeMillis();
                DnsOptimizer dnsOptimizer4 = (DnsOptimizer) this.l4;
                c79356VCm.LIZ = currentTimeMillis - dnsOptimizer4.LJJIJIIJIL;
                C79356VCm c79356VCm2 = dnsOptimizer4.LJFF;
                c79356VCm2.LIZJ = dnsOptimizer4.LJIL;
                c79356VCm2.LIZIZ = dnsOptimizer4.LJIIZILJ.size();
                ((DnsOptimizer) this.l4).LJFF.LJIIJ = C79346VCc.LIZLLL().LIZLLL;
                DnsOptimizer dnsOptimizer5 = (DnsOptimizer) this.l4;
                C79356VCm c79356VCm3 = dnsOptimizer5.LJFF;
                c79356VCm3.LJIIIIZZ = dnsOptimizer5.LJJIIJ ? 1 : 0;
                c79356VCm3.uploadMonitorLog();
            }
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LIZ$0() {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("reportPageLatestData : ");
            LIZ.append(this.s0);
            X1D.LIZIZ(LIZ);
            ((WebViewMonitorJsBridge) ((ARunnableS15S1100000_14) this.l4).l1).webViewDataManager.LJFF((JSONObject) this.l1);
            ((WebViewMonitorJsBridge) ((ARunnableS15S1100000_14) this.l4).l1).webViewDataManager.LJFF((JSONObject) this.l2);
            VML navigationManager = ((WebViewMonitorJsBridge) ((ARunnableS15S1100000_14) this.l4).l1).getNavigationManager();
            if (navigationManager != null) {
                navigationManager.LIZLLL();
            }
            if (((JSONObject) this.l3).length() > 0) {
                ((WebViewMonitorJsBridge) ((ARunnableS15S1100000_14) this.l4).l1).webViewDataManager.LJFF((JSONObject) this.l3);
            }
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }

    public static final void run$0(ARunnableS5S1400000_14 aRunnableS5S1400000_14) {
        boolean LIZ;
        try {
            aRunnableS5S1400000_14.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS5S1400000_14 aRunnableS5S1400000_14) {
        boolean LIZ;
        try {
            aRunnableS5S1400000_14.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS5S1400000_14 aRunnableS5S1400000_14) {
        boolean LIZ;
        try {
            aRunnableS5S1400000_14.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS5S1400000_14(Object obj, String str, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l4 = obj;
        this.s0 = str;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
