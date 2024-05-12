package X;

import Y.ARunnableS51S0100000_15;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.net.PanelInfoResponse;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XDd, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84469XDd extends XCZ {
    public final XCG LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.ss.ugc.effectplatform.model.net.PanelInfoResponse] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.ss.ugc.effectplatform.model.net.PanelInfoResponse, X.XDH] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // X.XCZ
    public final void LIZ() {
        C32611Pt c32611Pt;
        InterfaceC84458XCs interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJI.LJJIFFI);
        Throwable th = null;
        ?? r5 = 0;
        if (interfaceC84458XCs != null) {
            c32611Pt = interfaceC84458XCs.queryToStream(XDN.LJI(this.LJIIL, this.LJIIJJI, this.LJI.LJFF, this.LJII, this.LJIIJ, this.LJIIIZ));
        } else {
            c32611Pt = null;
        }
        if (c32611Pt == null) {
            LJI(new C84418XBe(10004));
            return;
        }
        try {
            try {
                String LJIIJ = C10820be.LJIIJ(c32611Pt);
                G0J g0j = this.LJI.LJIJ;
                if (g0j != null) {
                    th = (PanelInfoResponse) ((KNJsonConverter) g0j.LIZ).convertJsonToObj(LJIIJ, PanelInfoResponse.class);
                    r5 = th;
                }
            } catch (Exception e) {
                C12310e3 c12310e3 = C12310e3.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Json Parse Exception: ");
                LIZ.append(e);
                String LIZIZ = X1D.LIZIZ(LIZ);
                c12310e3.getClass();
                C12310e3.LIZIZ("FetchPanelInfoCacheTask", LIZIZ, th);
                r5 = th;
            }
            if (r5 == 0 || !r5.checkValue()) {
                LJI(new C84418XBe(10004));
                return;
            }
            PanelInfoModel data = r5.getData();
            if (data == null) {
                return;
            }
            XCG xcg = this.LJI;
            if (xcg.LJJIL == 2) {
                XDM xdm = XDM.LIZ;
                String str = this.LJII;
                xdm.getClass();
                XDM.LIZJ(xcg, str, data, false);
            }
            C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, data, 41), 64));
        } finally {
            try {
                c32611Pt.close();
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
    }

    @Override // X.XCZ
    public final void LIZJ() {
        C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS165S0100000_15(this, 714), 64));
    }

    public final void LJI(C84418XBe c84418XBe) {
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Failed: ");
        LIZ.append(c84418XBe);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZIZ("FetchPanelInfoCacheTask", LIZIZ, null);
        C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, c84418XBe, 38), 64));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84469XDd(XCG effectConfig, String panel, String taskFlag, boolean z, String str, int i, int i2) {
        super(taskFlag, null);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(panel, "panel");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJI = effectConfig;
        this.LJII = panel;
        this.LJIIIIZZ = taskFlag;
        this.LJIIIZ = z;
        this.LJIIJ = str;
        this.LJIIJJI = i;
        this.LJIIL = i2;
    }
}
