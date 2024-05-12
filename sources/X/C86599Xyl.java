package X;

import Y.ARunnableS0S4201000_6;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostThreadPoolExecutorDepend;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.Xyl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86599Xyl extends AbstractC86600Xym {
    static {
        C16880lQ.LJLLJ(C86599Xyl.class);
    }

    private final ExecutorService LJIIJ() {
        C86291Xtn c86291Xtn;
        IHostThreadPoolExecutorDepend iHostThreadPoolExecutorDepend;
        ExecutorService normalThreadExecutor;
        C86291Xtn c86291Xtn2 = (C86291Xtn) LJII(C86291Xtn.class);
        if (((c86291Xtn2 != null && (iHostThreadPoolExecutorDepend = c86291Xtn2.LJIIJ) != null) || ((c86291Xtn = C86291Xtn.LJIIL) != null && (iHostThreadPoolExecutorDepend = c86291Xtn.LJIIJ) != null)) && (normalThreadExecutor = iHostThreadPoolExecutorDepend.getNormalThreadExecutor()) != null) {
            return normalThreadExecutor;
        }
        ExecutorService executorService = C38016Ew0.LIZ;
        o.LJFF(executorService, "TTExecutors.getNormalExecutor()");
        return executorService;
    }

    public final IHostNetworkDepend LJIIJJI() {
        IHostNetworkDepend iHostNetworkDepend;
        IHostNetworkDepend iHostNetworkDepend2;
        C86291Xtn c86291Xtn = (C86291Xtn) LJII(C86291Xtn.class);
        if (c86291Xtn != null && (iHostNetworkDepend2 = c86291Xtn.LJIIIIZZ) != null) {
            return iHostNetworkDepend2;
        }
        C86291Xtn c86291Xtn2 = C86291Xtn.LJIIL;
        if (c86291Xtn2 != null && (iHostNetworkDepend = c86291Xtn2.LJIIIIZZ) != null) {
            return iHostNetworkDepend;
        }
        return new C65084PgW();
    }

    public final InterfaceC86629XzF LJIIL() {
        InterfaceC86629XzF interfaceC86629XzF;
        InterfaceC86629XzF interfaceC86629XzF2;
        C86291Xtn c86291Xtn = (C86291Xtn) LJII(C86291Xtn.class);
        if (c86291Xtn != null && (interfaceC86629XzF2 = c86291Xtn.LJIIJJI) != null) {
            return interfaceC86629XzF2;
        }
        C86291Xtn c86291Xtn2 = C86291Xtn.LJIIL;
        if (c86291Xtn2 != null && (interfaceC86629XzF = c86291Xtn2.LJIIJJI) != null) {
            return interfaceC86629XzF;
        }
        return new C61491OBj();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f6  */
    @Override // X.AbstractC86600Xym
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C86609Xyv r23, X.C86611Xyx r24, X.EnumC37847EtH r25) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86599Xyl.LJIIIIZZ(X.Xyv, X.Xyx, X.EtH):void");
    }

    public final void LJIILIIL(int i, String str, String str2, String str3, Integer num, String str4) {
        LJIIJ().execute(new ARunnableS0S4201000_6(this, str, str2, num, i, str3, str4, 1));
    }
}
