package X;

import Y.ARunnableS51S0100000_15;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XDP extends XCZ {
    public final boolean LJI;
    public final XCG LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final String LJIILJJIL;

    @Override // X.XCZ
    public final void LIZ() {
        LJI(null, null);
    }

    @Override // X.XCZ
    public final void LIZJ() {
        C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS165S0100000_15(this, 723), 64));
    }

    public final void LJII(C84418XBe c84418XBe) {
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Failed: ");
        LIZ.append(c84418XBe);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZIZ("FetchPanelInfoPagingCheckedCacheTask", LIZIZ, null);
        C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, c84418XBe, 52), 64));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:12|(3:13|14|(1:16))|18|19|(2:36|(2:38|39)(1:40))(3:23|(5:25|(1:27)|28|(1:30)|31)|(2:33|34)(1:35))) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.ss.ugc.effectplatform.model.net.PanelInfoPagingCheckedResponse] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.ugc.effectplatform.model.net.PanelInfoPagingCheckedResponse, X.XDH] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.InterfaceC88472Yns<? super java.lang.Integer, X.C76800UCe> r12, X.InterfaceC88472Yns<? super X.C84418XBe, X.C76800UCe> r13) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XDP.LJI(X.Yns, X.Yns):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XDP(XCG effectConfig, String panel, String taskFlag, String str, int i, int i2, int i3, String str2) {
        super(taskFlag, null);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(panel, "panel");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJII = effectConfig;
        this.LJIIIIZZ = panel;
        this.LJIIIZ = taskFlag;
        this.LJIIJ = str;
        this.LJIIJJI = i;
        this.LJIIL = i2;
        this.LJIILIIL = i3;
        this.LJIILJJIL = str2;
        this.LJI = true;
    }
}
