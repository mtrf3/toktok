package X;

import Y.ARunnableS40S0100000_4;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.ies.ugc.aweme.smartanchor_declaration.RouterAnchorPoint;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.IRouterInjectInitializer;
import com.google.gson.internal.n;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class OHZ implements n, IRouterInjectInitializer, InterfaceC81974WFe, InterfaceC25290yz, InterfaceC176976x3, C0K7 {
    public static boolean LJLIL;
    public static String LJLILLLLZI;
    public static boolean LJLJI;
    public static long LJLJJI;
    public static boolean LJLJJL;
    public static int LJLJJLL;
    public static final OHZ LJLJL = new OHZ();
    public static final OHZ LJLJLJ = new OHZ();

    @Override // X.InterfaceC25290yz
    public void LIZ(String containerType) {
        o.LJIIIZ(containerType, "containerType");
    }

    @Override // X.InterfaceC25290yz
    public void LIZJ() {
    }

    @Override // X.InterfaceC25290yz
    public void LIZLLL(String containerType) {
        o.LJIIIZ(containerType, "containerType");
    }

    @Override // X.InterfaceC25290yz
    public void LLLLLLL(String containerType) {
        o.LJIIIZ(containerType, "containerType");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        if (r4 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJFF() {
        /*
            java.lang.String r1 = X.OHZ.LJLILLLLZI
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L9
            return r1
        L9:
            r5 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L49
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L49
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L49
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L49
            r1.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "/cmdline"
            r1.append(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L49
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "iso-8859-1"
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L49
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r1.<init>()     // Catch: java.lang.Throwable -> L4a
        L39:
            int r0 = r4.read()     // Catch: java.lang.Throwable -> L4a
            if (r0 <= 0) goto L44
            char r0 = (char) r0     // Catch: java.lang.Throwable -> L4a
            r1.append(r0)     // Catch: java.lang.Throwable -> L4a
            goto L39
        L44:
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L4a
            goto L4c
        L49:
            r4 = r5
        L4a:
            if (r4 == 0) goto L4f
        L4c:
            r4.close()     // Catch: java.lang.Exception -> L4f
        L4f:
            X.OHZ.LJLILLLLZI = r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OHZ.LJFF():java.lang.String");
    }

    public static synchronized void LJII() {
        synchronized (OHZ.class) {
            if (LJLIL) {
                return;
            }
            C16880lQ.LLJJJIL("bdzstd");
            LJLIL = true;
        }
    }

    @Override // com.google.gson.internal.n
    public Object LJI() {
        return new ConcurrentHashMap();
    }

    @Override // com.bytedance.router.IRouterInjectInitializer
    public void injectInitialize() {
        RouterAnchorPoint.getPoint().run(new Object());
        C61210O0o.LIZ.LIZIZ();
    }

    @Override // X.InterfaceC81974WFe
    public void LIZIZ(SmartImageView smartImageView) {
        smartImageView.animate().rotationBy(180.0f).setDuration(200L).withStartAction(new ARunnableS40S0100000_4(smartImageView, 153)).withEndAction(new ARunnableS40S0100000_4(smartImageView, 154));
    }

    @Override // X.InterfaceC176976x3
    public void LJ(int i) {
        C176956x1 c176956x1 = C56484MEu.LIZ;
        if (c176956x1 != null) {
            c176956x1.LIZJ(i, "homepage_other_aweme_post", false);
        }
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }
}
