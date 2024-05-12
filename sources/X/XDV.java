package X;

import Y.ARunnableS51S0100000_15;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.EffectChannelModel;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.net.EffectNetListResponse;
import kotlin.jvm.internal.AqS0S0100300_15;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XDV extends XCZ {
    public final XCG LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    @Override // X.XCZ
    public final void LIZ() {
        LJI(null, null);
    }

    @Override // X.XCZ
    public final void LIZJ() {
        C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS165S0100000_15(this, 726), 64));
    }

    public final void LJI(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super C84418XBe, C76800UCe> interfaceC88472Yns2) {
        C32611Pt c32611Pt;
        boolean z;
        EffectNetListResponse effectNetListResponse;
        InterfaceC84458XCs interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJI.LJJIFFI);
        EffectChannelModel effectChannelModel = null;
        if (interfaceC84458XCs != null) {
            c32611Pt = interfaceC84458XCs.queryToStream(XDN.LIZJ(this.LJI.LJFF, this.LJII));
        } else {
            c32611Pt = null;
        }
        int i = 0;
        if (this.LJI.LJJIL == 2) {
            z = true;
        } else {
            z = false;
        }
        try {
            try {
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            if (c32611Pt == null) {
                C84418XBe c84418XBe = new C84418XBe(10004);
                C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, c84418XBe, 58), 64));
                if (interfaceC88472Yns2 != null) {
                    ((AqS181S0100000_15) interfaceC88472Yns2).invoke(c84418XBe);
                    return;
                }
                return;
            }
            try {
                String LJIIJ = C10820be.LJIIJ(c32611Pt);
                i = LJIIJ.length() / 1024;
                if (z) {
                    G0J g0j = this.LJI.LJIJ;
                    if (g0j != null && (effectNetListResponse = (EffectNetListResponse) ((KNJsonConverter) g0j.LIZ).convertJsonToObj(LJIIJ, EffectNetListResponse.class)) != null) {
                        effectChannelModel = effectNetListResponse.getData();
                    }
                } else {
                    G0J g0j2 = this.LJI.LJIJ;
                    if (g0j2 != null) {
                        effectChannelModel = (EffectChannelModel) ((KNJsonConverter) g0j2.LIZ).convertJsonToObj(LJIIJ, EffectChannelModel.class);
                    }
                }
                c32611Pt.close();
                if (effectChannelModel != null && effectChannelModel.checkValued()) {
                    if (z) {
                        XDM.LIZ.getClass();
                        XDM.LJIILIIL(effectChannelModel.getUrl_prefix(), effectChannelModel.getEffect_list());
                        XDM.LJIILIIL(effectChannelModel.getUrl_prefix(), effectChannelModel.getCollection_list());
                    }
                    EffectChannelResponse LIZ = new XET(this.LJII, this.LJI.LJIIIIZZ, !z).LIZ(effectChannelModel);
                    XDR LIZ2 = this.LJI.LJJJ.LIZ(this.LJIIIIZZ);
                    if (LIZ2 != null) {
                        LIZ2.preProcess(LIZ);
                    }
                    C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, LIZ, 61), 64));
                    if (interfaceC88472Yns == null) {
                        return;
                    }
                    ((AqS0S0100300_15) interfaceC88472Yns).invoke(Integer.valueOf(i));
                    return;
                }
            } catch (Exception e2) {
                C12310e3 c12310e3 = C12310e3.LIZIZ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Json Parse Exception: ");
                LIZ3.append(e2);
                String LIZIZ = X1D.LIZIZ(LIZ3);
                c12310e3.getClass();
                C12310e3.LIZIZ("FetchPanelEffectListCacheTask", LIZIZ, null);
                InterfaceC84458XCs interfaceC84458XCs2 = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJI.LJJIFFI);
                if (interfaceC84458XCs2 != null) {
                    interfaceC84458XCs2.remove(XDN.LIZJ(this.LJI.LJFF, this.LJII));
                }
                c32611Pt.close();
            }
            C84418XBe c84418XBe2 = new C84418XBe(10004);
            C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, c84418XBe2, 58), 64));
            if (interfaceC88472Yns2 == null) {
                return;
            }
            ((AqS181S0100000_15) interfaceC88472Yns2).invoke(c84418XBe2);
        } catch (Throwable th) {
            try {
                c32611Pt.close();
            } catch (Exception e3) {
                C16880lQ.LLLLIIL(e3);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XDV(XCG effectConfig, String panel, String taskFlag) {
        super(taskFlag, null);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(panel, "panel");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJI = effectConfig;
        this.LJII = panel;
        this.LJIIIIZZ = taskFlag;
    }
}
