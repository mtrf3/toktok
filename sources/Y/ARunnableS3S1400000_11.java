package Y;

import X.C113554cx;
import X.C37115EhT;
import X.C65922Pu2;
import X.C65926Pu6;
import X.OSZ;
import X.PYQ;
import android.net.Uri;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.common.interfaces.IExceptionMonitor;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS66S1200000_11;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes12.dex */
public class ARunnableS3S1400000_11 implements Runnable {
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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        String str;
        for (String str2 : (Set) this.l1) {
            Uri uri = UriProtector.parse(str2);
            String str3 = (String) ListProtector.get(s.LJLJJL(str2, new String[]{"?"}, 0, 6), 0);
            o.LJIIIIZZ(uri, "uri");
            String scheme = uri.getScheme();
            String str4 = "null";
            if (scheme == null) {
                scheme = "null";
            }
            String host = uri.getHost();
            if (host == null) {
                host = "null";
            }
            String path = uri.getPath();
            if (path != null) {
                str4 = path;
            }
            Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("scheme", scheme), new OSZ("domain", host), new OSZ("path", str4), new OSZ("url", str3), new OSZ("apiId", String.valueOf(((C65922Pu2) this.l2).LIZ)), new OSZ("threadName", this.s0), new OSZ("sdkVersion", "5.2.0-rc.4"), new OSZ("currentPage", ((PYQ) this.l3).LJJJJL().LJLJL), new OSZ("EventType", "NetworkStack"));
            NetworkComponent networkComponent = NetworkComponent.INSTANCE;
            SettingsModel settings = networkComponent.getSettings();
            if (settings != null && (str = settings.version) != null && !ujb.o.LJJJJJL(str)) {
                LJJLIIIIJ.put("settingsVersion", str);
            }
            String LIZ = C37115EhT.LIZ(str3, null, (Throwable) this.l4);
            IExceptionMonitor exceptionMonitor = networkComponent.getExceptionMonitor();
            if (exceptionMonitor != null) {
                String threadName = this.s0;
                o.LJIIIIZZ(threadName, "threadName");
                exceptionMonitor.monitorThrowable(LIZ, str3, "helios_log_type", "EnsureNotReachHere", threadName, true, LJJLIIIIJ, LJJLIIIIJ);
            }
            C65926Pu6.LIZ("Helios:Network-Stack", new AqS66S1200000_11(str3, LJJLIIIIJ, this, 11), 4, (Throwable) this.l4);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(5:(1:67)(3:5|(2:56|(12:61|(1:63)(2:64|(1:66))|14|15|16|(1:18)(1:31)|19|20|21|22|23|24)(1:60))(2:9|(1:11)(2:53|(1:55)))|12)|21|22|23|24)|15|16|(0)(0)|19|20|(2:(0)|(1:47))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
    
        r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e0, code lost:
    
        r7.disconnect();
        r2.lock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
    
        r4.signal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ed, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab A[Catch: Exception -> 0x00dc, all -> 0x00f2, TryCatch #2 {Exception -> 0x00dc, blocks: (B:16:0x0097, B:18:0x00ab, B:19:0x00ad, B:31:0x00c4), top: B:15:0x0097, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4 A[Catch: Exception -> 0x00dc, all -> 0x00f2, TRY_LEAVE, TryCatch #2 {Exception -> 0x00dc, blocks: (B:16:0x0097, B:18:0x00ab, B:19:0x00ad, B:31:0x00c4), top: B:15:0x0097, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$0(Y.ARunnableS3S1400000_11 r13) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS3S1400000_11.run$0(Y.ARunnableS3S1400000_11):void");
    }

    public static final void run$1(ARunnableS3S1400000_11 aRunnableS3S1400000_11) {
        boolean LIZ;
        try {
            aRunnableS3S1400000_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS3S1400000_11(Object obj, Object obj2, String str, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
        this.l3 = obj3;
        this.l4 = obj4;
    }
}
