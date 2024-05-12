package X;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import kotlin.jvm.internal.o;

/* renamed from: X.Ng6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC59962Ng6 implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C86603Xyp LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ Integer LJLJL;

    public RunnableC59962Ng6(String str, C86603Xyp c86603Xyp, String str2, int i, String str3, String str4, Integer num) {
        this.LJLIL = str;
        this.LJLILLLLZI = c86603Xyp;
        this.LJLJI = str2;
        this.LJLJJI = i;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
        this.LJLJL = num;
    }

    public final void LIZ() {
        View view;
        WebView webView;
        Object LIZ;
        View view2;
        VNS vns;
        Object LIZ2;
        String str = this.LJLIL;
        C86603Xyp c86603Xyp = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        int i = this.LJLJJI;
        String str3 = this.LJLJJL;
        String str4 = this.LJLJJLL;
        Integer num = this.LJLJL;
        try {
            boolean LJ = o.LJ(str, EnumC37844EtE.LYNX.name());
            int i2 = 0;
            C3C5 c3c5 = null;
            if (LJ) {
                InterfaceC38263Ezz interfaceC38263Ezz = c86603Xyp.LJLIL;
                if (interfaceC38263Ezz != null) {
                    view2 = interfaceC38263Ezz.getView();
                } else {
                    view2 = null;
                }
                if ((view2 instanceof VNS) && (vns = (VNS) view2) != null) {
                    try {
                        LynxViewMonitor.Companion.getClass();
                        LynxViewMonitor lynxViewMonitor = LynxViewMonitor.INSTANCE;
                        VLQ vlq = new VLQ();
                        vlq.LJLJI = str2;
                        vlq.LJLJJL = i;
                        vlq.LJLJJLL = str3;
                        vlq.LJLILLLLZI = str4;
                        if (num != null) {
                            i2 = num.intValue();
                        }
                        vlq.LJLJJI = i2;
                        lynxViewMonitor.reportJsbFetchError(vns, vlq);
                        LIZ2 = C76800UCe.LIZ;
                        C3C5.m7constructorimpl(LIZ2);
                    } catch (Throwable th) {
                        LIZ2 = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ2);
                    }
                    c3c5 = C3C5.m6boximpl(LIZ2);
                }
                C3C5.m7constructorimpl(c3c5);
            }
            InterfaceC38263Ezz interfaceC38263Ezz2 = c86603Xyp.LJLIL;
            if (interfaceC38263Ezz2 != null) {
                view = interfaceC38263Ezz2.getView();
            } else {
                view = null;
            }
            if ((view instanceof WebView) && (webView = (WebView) view) != null) {
                try {
                    C38222EzK c38222EzK = C38222EzK.LJFF;
                    new VJ7();
                    if (num != null) {
                        num.intValue();
                    }
                    c38222EzK.getClass();
                    try {
                        if (c38222EzK.LJ()) {
                            c38222EzK.LJFF(webView);
                        }
                    } catch (Exception unused) {
                        C70657RoD.LJIILL();
                    }
                    LIZ = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th2) {
                    LIZ = C141335gf.LIZ(th2);
                    C3C5.m7constructorimpl(LIZ);
                }
                c3c5 = C3C5.m6boximpl(LIZ);
            }
            C3C5.m7constructorimpl(c3c5);
        } catch (Throwable th3) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th3));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
