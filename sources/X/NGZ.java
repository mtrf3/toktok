package X;

import android.content.Context;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NGZ extends AbstractC59064NGa implements InterfaceC59068NGe, InterfaceC59067NGd {
    public final AbstractC59064NGa LIZIZ;
    public final String LIZJ;
    public final C59066NGc LIZLLL;
    public InterfaceC59068NGe LJ;
    public InterfaceC59067NGd LJFF;
    public int LJI;
    public EnumC59053NFp LJII;

    @Override // X.InterfaceC59068NGe
    public final void LIZJ() {
        this.LJI = 1;
        LJJI(1, "", "");
        InterfaceC59068NGe interfaceC59068NGe = this.LJ;
        if (interfaceC59068NGe != null) {
            interfaceC59068NGe.LIZJ();
        }
    }

    @Override // X.AbstractC59064NGa
    public final void LJIIJJI() {
        LJJII(1, "", "");
        this.LIZIZ.LJIIJJI();
    }

    @Override // X.InterfaceC59067NGd
    public final void LIZIZ() {
        InterfaceC59067NGd interfaceC59067NGd = this.LJFF;
        if (interfaceC59067NGd != null) {
            interfaceC59067NGd.LIZIZ();
        }
        LJJIII(false);
    }

    @Override // X.AbstractC59064NGa
    public final void LJFF() {
        this.LIZIZ.LJFF();
    }

    @Override // X.AbstractC59064NGa
    public final void LJII() {
        this.LIZIZ.LJII();
    }

    @Override // X.AbstractC59064NGa
    public final void LJIIIZ() {
        this.LIZIZ.LJIIIZ();
    }

    @Override // X.AbstractC59064NGa
    public final void LJIJ() {
        this.LIZIZ.LJIJ();
    }

    public NGZ(C59065NGb c59065NGb) {
        super(c59065NGb.LIZ);
        this.LIZIZ = c59065NGb;
        this.LIZJ = "AdHybridContainerEventImpl";
        this.LIZLLL = c59065NGb.LIZ;
        this.LJI = 1;
        this.LJII = EnumC59053NFp.ONLY_RENDER;
    }

    @Override // X.InterfaceC59067NGd
    public final void LIZLLL(boolean z) {
        int i;
        C58582Rq.LIZ(Q7L.LIZJ("onRealRenderSuccess isFromPre = ", z), this.LIZJ);
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.LJI = i;
        InterfaceC59067NGd interfaceC59067NGd = this.LJFF;
        if (interfaceC59067NGd != null) {
            interfaceC59067NGd.LIZLLL(z);
        }
        LJJIFFI(1, "", "");
    }

    @Override // X.AbstractC59064NGa
    public final void LJIILIIL(InterfaceC59069NGf interfaceC59069NGf) {
        this.LIZIZ.LJIILIIL(interfaceC59069NGf);
    }

    @Override // X.AbstractC59064NGa
    public final void LJIILJJIL(NVV nvv) {
        this.LIZIZ.LJIILJJIL(nvv);
    }

    @Override // X.AbstractC59064NGa
    public final void LJIILL(NVQ nvq) {
        this.LIZIZ.LJIILL(nvq);
    }

    @Override // X.AbstractC59064NGa
    public final void LJIILLIIL(NZ2 nz2) {
        this.LIZIZ.LJIILLIIL(nz2);
    }

    @Override // X.AbstractC59064NGa
    public final void LJIIZILJ(NVR nvr) {
        this.LIZIZ.LJIIZILJ(nvr);
    }

    @Override // X.AbstractC59064NGa
    public final void LJIJI(String cacheKey) {
        o.LJIIIZ(cacheKey, "cacheKey");
        this.LIZIZ.LJIJI(cacheKey);
    }

    @Override // X.AbstractC59064NGa
    public final void LJIJJLI(C59421NTt c59421NTt) {
        C58582Rq.LIZIZ(this.LIZIZ.LIZ.LJLJI, "show fullscreen container");
        this.LIZIZ.LJIJJLI(c59421NTt);
    }

    public final void LJJIII(boolean z) {
        String str;
        C59071NGh c59071NGh = new C59071NGh(null, this.LIZLLL.LJLIL, null, null, null, 0, null, null, null, null, null, null, null, 16381);
        NGY adDataModel = this.LIZLLL.LJLJJI;
        o.LJIIIZ(adDataModel, "adDataModel");
        C59070NGg c59070NGg = new C59070NGg();
        c59070NGg.LJIIIIZZ(c59071NGh);
        if (z) {
            str = "prerender";
        } else {
            str = "render";
        }
        C58655N0h LJ = C58704N2e.LJ("hybrid_ad", str, String.valueOf(adDataModel.LIZ), adDataModel.LIZIZ, adDataModel.LIZJ);
        LJ.LIZ(c59070NGg.LJFF(WM7.SCENE_SERVICE));
        LJ.LJI();
        C58582Rq.LIZ("onTriggerRender", "AdHybridEventManager");
    }

    @Override // X.InterfaceC59068NGe
    public final void LJ(String str, String str2) {
        this.LJI = 1;
        LJJI(0, "data_load_fail", str);
        InterfaceC59068NGe interfaceC59068NGe = this.LJ;
        if (interfaceC59068NGe != null) {
            interfaceC59068NGe.LJ(str, str2);
        }
    }

    @Override // X.AbstractC59064NGa
    public final NMS LJI(C59421NTt c59421NTt, boolean z) {
        C58582Rq.LIZIZ(this.LIZIZ.LIZ.LJLJI, "create fragment");
        return this.LIZIZ.LJI(c59421NTt, z);
    }

    @Override // X.AbstractC59064NGa
    public final void LJIIIIZZ(String str, JSONObject jSONObject) {
        this.LIZIZ.LJIIIIZZ(str, jSONObject);
    }

    @Override // X.AbstractC59064NGa
    public final void LJIIJ(String mainReason, String detailReasonCode) {
        o.LJIIIZ(mainReason, "mainReason");
        o.LJIIIZ(detailReasonCode, "detailReasonCode");
        LJJII(0, mainReason, detailReasonCode);
        this.LIZIZ.LJIIJ(mainReason, detailReasonCode);
    }

    @Override // X.AbstractC59064NGa
    public final void LJIIL(C59421NTt adHybridRenderOption, InterfaceC59068NGe interfaceC59068NGe) {
        o.LJIIIZ(adHybridRenderOption, "adHybridRenderOption");
        LJJIII(true);
        C58582Rq.LIZ("preRender", this.LIZJ);
        this.LJ = interfaceC59068NGe;
        this.LIZIZ.LJIIL(adHybridRenderOption, this);
    }

    @Override // X.AbstractC59064NGa
    public final void LJIL(C59421NTt c59421NTt, CN8 cn8) {
        this.LIZIZ.LJIL(c59421NTt, cn8);
    }

    @Override // X.AbstractC59064NGa
    public final void LJJ(Context context, String str) {
        o.LJIIIZ(context, "context");
        this.LIZIZ.LJJ(context, str);
    }

    @Override // X.InterfaceC59067NGd
    public final void LIZ(String str, String str2, boolean z) {
        int i;
        C58582Rq.LIZ(Q7L.LIZJ("onRealRenderFailed isFromPre = ", z), this.LIZJ);
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.LJI = i;
        InterfaceC59067NGd interfaceC59067NGd = this.LJFF;
        if (interfaceC59067NGd != null) {
            interfaceC59067NGd.LIZ(str, str2, z);
        }
        LJJIFFI(0, "data_load_fail", str);
    }

    @Override // X.AbstractC59064NGa
    public final void LJIJJ(C59421NTt adHybridRenderOption, NV4 adHybridLoadStatus, InterfaceC59067NGd interfaceC59067NGd) {
        o.LJIIIZ(adHybridRenderOption, "adHybridRenderOption");
        o.LJIIIZ(adHybridLoadStatus, "adHybridLoadStatus");
        this.LJFF = interfaceC59067NGd;
        this.LJII = adHybridRenderOption.LIZ;
        this.LIZIZ.LJIJJ(adHybridRenderOption, adHybridLoadStatus, this);
        C59071NGh c59071NGh = new C59071NGh(null, this.LIZLLL.LJLIL, null, null, null, 0, null, null, null, null, null, null, null, 16381);
        NGY adDataModel = this.LIZLLL.LJLJJI;
        o.LJIIIZ(adDataModel, "adDataModel");
        C59070NGg c59070NGg = new C59070NGg();
        c59070NGg.LJIIIIZZ(c59071NGh);
        C58655N0h LJ = C58704N2e.LJ("hybrid_ad", "fetch_view", String.valueOf(adDataModel.LIZ), adDataModel.LIZIZ, adDataModel.LIZJ);
        LJ.LIZ(c59070NGg.LJFF(WM7.SCENE_SERVICE));
        LJ.LJI();
        C58582Rq.LIZ("onFetchView", "AdHybridEventManager");
    }

    public final void LJJI(int i, String str, String str2) {
        C59071NGh c59071NGh = new C59071NGh(null, this.LIZLLL.LJLIL, null, null, Integer.valueOf(i), 0, null, null, str, str2, null, null, null, 14813);
        NGY adDataModel = this.LIZLLL.LJLJJI;
        o.LJIIIZ(adDataModel, "adDataModel");
        C59070NGg c59070NGg = new C59070NGg();
        c59070NGg.LJIIIIZZ(c59071NGh);
        C58655N0h LJ = C58704N2e.LJ("hybrid_ad", "prerender_status", String.valueOf(adDataModel.LIZ), adDataModel.LIZIZ, adDataModel.LIZJ);
        LJ.LIZ(c59070NGg.LJFF(WM7.SCENE_SERVICE, "fail_reason", "error_code"));
        Object LIZLLL = c59070NGg.LIZLLL("success");
        o.LJII(LIZLLL, "null cannot be cast to non-null type kotlin.Int");
        LJ.LIZIZ(LIZLLL, "success");
        LJ.LJI();
        C58582Rq.LIZ("preRenderStatus", "AdHybridEventManager");
    }

    public final void LJJIFFI(int i, String str, String str2) {
        C59071NGh c59071NGh = new C59071NGh(null, this.LIZLLL.LJLIL, null, null, Integer.valueOf(i), 0, this.LJII.name(), null, str, str2, null, null, null, 14685);
        NGY adDataModel = this.LIZLLL.LJLJJI;
        o.LJIIIZ(adDataModel, "adDataModel");
        C59070NGg c59070NGg = new C59070NGg();
        c59070NGg.LJIIIIZZ(c59071NGh);
        C58655N0h LJ = C58704N2e.LJ("hybrid_ad", "render_status", String.valueOf(adDataModel.LIZ), adDataModel.LIZIZ, adDataModel.LIZJ);
        LJ.LIZ(c59070NGg.LJFF(WM7.SCENE_SERVICE, "fail_reason", "error_code"));
        Object LIZLLL = c59070NGg.LIZLLL("success");
        o.LJII(LIZLLL, "null cannot be cast to non-null type kotlin.Int");
        LJ.LIZIZ(LIZLLL, "success");
        LJ.LIZIZ(c59070NGg.LIZLLL("strategy"), "strategy");
        LJ.LJI();
        C58582Rq.LIZ("renderStatus", "AdHybridEventManager");
    }

    public final void LJJII(int i, String str, String str2) {
        C59066NGc c59066NGc = this.LIZLLL;
        String str3 = c59066NGc.LJLIL;
        String name = c59066NGc.LJLILLLLZI.name();
        C59071NGh c59071NGh = new C59071NGh(null, str3, null, null, Integer.valueOf(i), this.LJI, this.LJII.name(), name, str, str2, null, null, null, 14365);
        NGY adDataModel = this.LIZLLL.LJLJJI;
        o.LJIIIZ(adDataModel, "adDataModel");
        C59070NGg c59070NGg = new C59070NGg();
        c59070NGg.LJIIIIZZ(c59071NGh);
        C58655N0h LJ = C58704N2e.LJ("hybrid_ad", "show_status", String.valueOf(adDataModel.LIZ), adDataModel.LIZIZ, adDataModel.LIZJ);
        LJ.LIZ(c59070NGg.LJFF(WM7.SCENE_SERVICE, "fail_reason", "error_code", "show_type"));
        Object LIZLLL = c59070NGg.LIZLLL("success");
        o.LJII(LIZLLL, "null cannot be cast to non-null type kotlin.Int");
        LJ.LIZIZ(LIZLLL, "success");
        Object LIZLLL2 = c59070NGg.LIZLLL("status");
        o.LJII(LIZLLL2, "null cannot be cast to non-null type kotlin.Int");
        LJ.LIZIZ(LIZLLL2, "status");
        LJ.LIZIZ(c59070NGg.LIZLLL("strategy"), "strategy");
        LJ.LJI();
        C58582Rq.LIZ("showStatus", "AdHybridEventManager");
    }
}
