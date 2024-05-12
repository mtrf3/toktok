package X;

import Y.ARunnableS51S0100000_15;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.UrlModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import ujb.o;

/* loaded from: classes16.dex */
public final class XCL extends XCZ {
    public final List<String> LJI;
    public final C0FT LJII;
    public final C0R1 LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public long LJIIJJI;
    public final Effect LJIIL;
    public final XCG LJIILIIL;
    public final String LJIILJJIL;
    public final XEU LJIILL;

    @Override // X.XCZ
    public final void LIZ() {
        XBW<C84430XBq> xbw;
        if (this.LJIIIIZZ.LIZIZ()) {
            C84415XBb c84415XBb = new C84415XBb(this.LJIIL, this.LJI, this.LJIILIIL.LJIIIIZZ);
            c84415XBb.LJLJJL = Boolean.valueOf(this.LJIIIZ);
            if (C78685UuP.LJJJJLI(this.LJIILIIL.LJJI) == null) {
                C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS165S0100000_15(this, 715), 64));
                return;
            }
            C0FT c0ft = this.LJII;
            InterfaceC84427XBn interfaceC84427XBn = (InterfaceC84427XBn) this.LJIILIIL.LJJI.LIZ;
            if (interfaceC84427XBn != null) {
                xbw = interfaceC84427XBn.LIZ(c84415XBb);
            } else {
                xbw = null;
            }
            c0ft.LIZ = xbw;
            C0FT c0ft2 = this.LJII;
            XBW xbw2 = (XBW) c0ft2.LIZ;
            if (xbw2 != null) {
                xbw2.LIZ.LIZ = new XCV(this);
            }
            XBW xbw3 = (XBW) c0ft2.LIZ;
            if (xbw3 == null) {
                return;
            }
            xbw3.LIZIZ();
        }
    }

    @Override // X.XCZ
    public final void LIZJ() {
        if (!this.LIZLLL) {
            XDR LIZ = this.LJIILIIL.LJJJ.LIZ(this.LJIILJJIL);
            if ((LIZ instanceof XCP) && LIZ != null) {
                LIZ.onFail(this.LJIIL, new C84418XBe(10001, new Exception(String.valueOf(10001))));
            }
            C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS165S0100000_15(this, 712), 64));
        }
    }

    @Override // X.XCZ
    public final void LIZLLL() {
        if (!this.LIZLLL) {
            XDR LIZ = this.LJIILIIL.LJJJ.LIZ(this.LJIILJJIL);
            if (!(LIZ instanceof XCP) || LIZ == null) {
                return;
            }
            LIZ.onFail(this.LJIIL, new C84418XBe(10020, new Exception(String.valueOf(10020))));
        }
    }

    @Override // X.XCZ
    public final void LJ() {
        String LJIL;
        C30941Ji c30941Ji = XCQ.LIZ;
        c30941Ji.LIZIZ();
        try {
            Effect effect = this.LJIIL;
            effect.setId(o.LJJJJZ(o.LJJJJZ(effect.getId(), "\"", "_", false), "/", "_", false));
            XCM xcm = this.LJIILIIL.LJJIZ;
            String LJIL2 = C78966Uyw.LJIL(this.LJIIL);
            xcm.getClass();
            if (XCM.LIZLLL(LJIL2)) {
                C12310e3 c12310e3 = C12310e3.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("effect: ");
                LIZ.append(this.LJIIL.getEffect_id());
                LIZ.append(", name: ");
                LIZ.append(this.LJIIL.getName());
                LIZ.append(", ");
                LIZ.append(C78966Uyw.LJIL(this.LJIIL));
                LIZ.append(" is now downloading, add in listener");
                String LIZIZ = X1D.LIZIZ(LIZ);
                c12310e3.getClass();
                C12310e3.LIZ("DownloadEffectTask", LIZIZ);
                XDR LIZ2 = this.LJIILIIL.LJJJ.LIZ(this.LJIILJJIL);
                if (!(LIZ2 instanceof XCP)) {
                    LIZ2 = null;
                }
                XCP xcp = (XCP) LIZ2;
                if (xcp != null) {
                    xcp.onStart(this.LJIIL);
                    XCM xcm2 = this.LJIILIIL.LJJIZ;
                    Effect effect2 = this.LJIIL;
                    XCO xco = new XCO(xcp, this);
                    xcm2.getClass();
                    XCM.LIZ(xco, effect2);
                }
                this.LJIIIIZZ.LIZLLL(false);
            } else {
                this.LJIIIIZZ.LIZLLL(true);
                XCM xcm3 = this.LJIILIIL.LJJIZ;
                Effect effect3 = this.LJIIL;
                xcm3.getClass();
                if (effect3 != null && (LJIL = C78966Uyw.LJIL(effect3)) != null) {
                    XCM.LIZ.put(LJIL, effect3);
                }
                C12310e3 c12310e32 = C12310e3.LIZIZ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("effect: ");
                LIZ3.append(this.LJIIL.getEffect_id());
                LIZ3.append(", name: ");
                LIZ3.append(this.LJIIL.getName());
                LIZ3.append(", ");
                LIZ3.append(C78966Uyw.LJIL(this.LJIIL));
                LIZ3.append(" added in download list!");
                String LIZIZ2 = X1D.LIZIZ(LIZ3);
                c12310e32.getClass();
                C12310e3.LIZ("DownloadEffectTask", LIZIZ2);
            }
        } finally {
            c30941Ji.LIZLLL();
        }
    }

    @Override // X.XCZ, X.InterfaceC13850gX
    public final void cancel() {
        XBW xbw = (XBW) this.LJII.LIZ;
        if (xbw != null) {
            xbw.LIZ();
        }
        super.cancel();
    }

    @Override // X.XCZ, X.InterfaceC13850gX
    public final void pause() {
        super.pause();
        XBW xbw = (XBW) this.LJII.LIZ;
        if (xbw != null) {
            xbw.LJIIIZ();
        }
    }

    @Override // X.XCZ, X.InterfaceC13850gX
    public final int getLevel() {
        return this.LJIIJ;
    }

    @Override // X.XCZ, X.InterfaceC13850gX
    public final long getModifyTime() {
        return this.LJIIJJI;
    }

    @Override // X.XCZ, X.InterfaceC13850gX
    public final void setModifyTime(long j) {
        this.LJIIJJI = j;
    }

    public final void LJI(boolean z, C84418XBe c84418XBe) {
        XEU xeu;
        String LIZIZ;
        String str;
        if (this.LJIILIIL.LJIJJ.LIZ != null && (xeu = this.LJIILL) != null) {
            if (kotlin.jvm.internal.o.LJ("beautify", xeu.getPanel()) || kotlin.jvm.internal.o.LJ("beautifynew", this.LJIILL.getPanel())) {
                int i = !z ? 1 : 0;
                StringBuilder sb = new StringBuilder();
                List<String> list = this.LJI;
                if (list != null) {
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        sb.append(",");
                    }
                }
                InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) this.LJIILIIL.LJIJJ.LIZ;
                if (interfaceC58749N3x != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("effect_id", this.LJIIL.getEffect_id());
                    hashMap.put("effect_name", this.LJIIL.getName());
                    String str2 = this.LJIILIIL.LJIIJ;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    hashMap.put("app_id", str2);
                    hashMap.put("download_urls", sb.toString());
                    String panel = this.LJIILL.getPanel();
                    if (panel == null) {
                        panel = "";
                    }
                    hashMap.put("panel", panel);
                    if (c84418XBe == null) {
                        LIZIZ = "";
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("");
                        LIZ.append(c84418XBe.LIZ);
                        LIZIZ = X1D.LIZIZ(LIZ);
                    }
                    hashMap.put("error_code", LIZIZ);
                    if (c84418XBe != null && (str = c84418XBe.LIZIZ) != null) {
                        str3 = str;
                    }
                    hashMap.put("error_msg", str3);
                    interfaceC58749N3x.monitorStatusRate("effect_resource_download_success_rate", i, hashMap);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XCL(Effect effect, XCG effectConfig, String taskFlag, XEU xeu) {
        super(taskFlag, null);
        kotlin.jvm.internal.o.LJIIJ(effect, "effect");
        kotlin.jvm.internal.o.LJIIJ(effectConfig, "effectConfig");
        kotlin.jvm.internal.o.LJIIJ(taskFlag, "taskFlag");
        this.LJIIL = effect;
        this.LJIILIIL = effectConfig;
        this.LJIILJJIL = taskFlag;
        this.LJIILL = xeu;
        XDM xdm = XDM.LIZ;
        UrlModel file_url = effect.getFile_url();
        xdm.getClass();
        this.LJI = XDM.LJ(file_url);
        this.LJII = new C0FT((Object) null);
        this.LJIIIIZZ = new C0R1(true);
    }
}
