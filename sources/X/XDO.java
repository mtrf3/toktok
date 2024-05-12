package X;

import Y.ARunnableS51S0100000_15;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.net.PanelInfoCheckedResponse;
import kotlin.jvm.internal.AqS0S0100300_15;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XDO extends XCZ {
    public final XCG LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;

    @Override // X.XCZ
    public final void LIZ() {
        LJI(null, null);
    }

    @Override // X.XCZ
    public final void LIZJ() {
        C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS165S0100000_15(this, 719), 64));
    }

    public final void LJII(C84418XBe c84418XBe) {
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Failed: ");
        LIZ.append(c84418XBe);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZIZ("FetchPanelInfoCheckedCacheTask", LIZIZ, null);
        C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, c84418XBe, 45), 64));
    }

    public final void LJI(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super C84418XBe, C76800UCe> interfaceC88472Yns2) {
        C32611Pt c32611Pt;
        PanelInfoCheckedResponse panelInfoCheckedResponse;
        InterfaceC84458XCs interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJI.LJJIFFI);
        if (interfaceC84458XCs != null) {
            c32611Pt = interfaceC84458XCs.queryToStream(XDN.LJ(this.LJIIL, this.LJIIJJI, this.LJI.LJFF, this.LJII, this.LJIIJ, this.LJIIIZ));
        } else {
            c32611Pt = null;
        }
        if (c32611Pt == null) {
            C84418XBe c84418XBe = new C84418XBe(10004);
            LJII(c84418XBe);
            if (interfaceC88472Yns2 != null) {
                ((AqS181S0100000_15) interfaceC88472Yns2).invoke(c84418XBe);
                return;
            }
            return;
        }
        try {
            String LJIIJ = C10820be.LJIIJ(c32611Pt);
            int length = LJIIJ.length() / 1024;
            G0J g0j = this.LJI.LJIJ;
            if (g0j != null) {
                panelInfoCheckedResponse = (PanelInfoCheckedResponse) ((KNJsonConverter) g0j.LIZ).convertJsonToObj(LJIIJ, PanelInfoCheckedResponse.class);
            } else {
                panelInfoCheckedResponse = null;
            }
            if (panelInfoCheckedResponse != null) {
                PanelInfoModel data = panelInfoCheckedResponse.getData();
                if (panelInfoCheckedResponse.checkValue() && data != null) {
                    XCG xcg = this.LJI;
                    if (xcg.LJJIL == 2) {
                        XDM xdm = XDM.LIZ;
                        String str = this.LJII;
                        xdm.getClass();
                        XDM.LIZJ(xcg, str, data, true);
                    }
                    C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, data, 48), 64));
                    if (interfaceC88472Yns == null) {
                        return;
                    }
                    ((AqS0S0100300_15) interfaceC88472Yns).invoke(Integer.valueOf(length));
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                C12310e3 c12310e3 = C12310e3.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Json Parse Exception: ");
                LIZ.append(th);
                String LIZIZ = X1D.LIZIZ(LIZ);
                c12310e3.getClass();
                C12310e3.LIZIZ("FetchPanelInfoCheckedCacheTask", LIZIZ, null);
                try {
                    c32611Pt.close();
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            } finally {
                try {
                    c32611Pt.close();
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
        }
        C84418XBe c84418XBe2 = new C84418XBe(10004);
        LJII(c84418XBe2);
        if (interfaceC88472Yns2 == null) {
            return;
        }
        ((AqS181S0100000_15) interfaceC88472Yns2).invoke(c84418XBe2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XDO(XCG effectConfig, String panel, String taskFlag, boolean z, String str, int i, int i2) {
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
