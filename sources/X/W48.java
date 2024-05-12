package X;

import Y.AObjectS118S0200000_12;
import Y.AObjectS119S0200000_14;
import Y.AObjectS87S0100000_12;
import Y.AObjectS89S0100000_14;
import Y.AObserverS82S0100000_14;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoStickerHandler;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.OptionListHandler;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W48 extends W49 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLII;
    public final ActivityC45651qj LJZI;
    public final C82632Wbs LJZL;
    public final InterfaceC46211IBr LL;
    public final InterfaceC82353WTt LLD;
    public final C82632Wbs LLF;
    public final C82632Wbs LLFF;
    public final C82631Wbr LLFFF;
    public final C82631Wbr LLFII;
    public final C82632Wbs LLFZ;
    public final C5H3 LLI;
    public AqS162S0100000_12 LLIFFJFJJ;

    static {
        TBT tbt = new TBT(W48.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLII = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(W48.class, "tikTokCameraApiComponent", "getTikTokCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(W48.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(W48.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(W48.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(W48.class, "nowSwitchApi", "getNowSwitchApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0, c65351Pkp), C61845OOz.LIZJ(W48.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0, c65351Pkp)};
    }

    public final W17 LJJZZI() {
        C82632Wbs c82632Wbs = this.LLF;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLII;
        if (((ShortVideoContext) c82632Wbs.LIZ(this, interfaceC74236TBoArr[2])).shootMode == 16) {
            int LJ = C81184Vtc.LJ(this.LJZI);
            int i = (LJ * 16) / 9;
            int LIZLLL = C6IA.LIZLLL(this.LJZI);
            return new W17(((WLT) this.LJZL.LIZ(this, interfaceC74236TBoArr[0])).e8().getEffectController(), LJ, i, AnonymousClass668.LIZIZ().LJ(LJ, i).getMarginStart(), LIZLLL - ((LJ * 2) / 9));
        }
        InterfaceC83727WtX effectController = ((WLT) this.LJZL.LIZ(this, interfaceC74236TBoArr[0])).e8().getEffectController();
        ViewGroup.LayoutParams layoutParams = ((WLT) this.LJZL.LIZ(this, interfaceC74236TBoArr[0])).sm0().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return new W17(effectController, new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams));
    }

    public final InterfaceC45999I3n getPlanCUIApiComponent() {
        return (InterfaceC45999I3n) this.LLFF.LIZ(this, LLII[3]);
    }

    @Override // X.W49, X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
        TKB tkb;
        EnumC74323TEx enumC74323TEx;
        super.LJJLIIIJLLLLLLLZ();
        if (!C74216TAu.LIZIZ.LIZIZ() || (tkb = (TKB) this.LLI.getValue()) == null || tkb.LIZIZ) {
            return;
        }
        tkb.LIZIZ = true;
        C74413TIj c74413TIj = (C74413TIj) C74310TEk.LIZIZ(tkb.LIZ.LLLLL().LJJJJLL().LIZ(), false, 14).getValue();
        if (c74413TIj != null) {
            enumC74323TEx = c74413TIj.LIZIZ;
        } else {
            enumC74323TEx = null;
        }
        if (enumC74323TEx == EnumC74323TEx.SUCCESS) {
            if (tkb.LIZJ == null) {
                tkb.LIZJ = new TKA(tkb.LIZ);
            }
            if (tkb.LIZLLL == null) {
                tkb.LIZLLL = new TK9(tkb.LIZ);
            }
            TKA tka = tkb.LIZJ;
            if (tka != null) {
                tka.LIZJ();
            }
            TK9 tk9 = tkb.LIZLLL;
            if (tk9 == null) {
                return;
            }
            tk9.LIZ();
            return;
        }
        TK5 tk5 = new TK5(tkb.LIZ);
        tk5.LIZ().observe(tk5.LIZ.getLifecycleOwner(), new AObjectS118S0200000_12(tk5, new AqS162S0100000_12(tkb, 1029), 1));
    }

    @Override // X.W49
    public final void LJJLJLI() {
        if (C53564L0m.LIZIZ()) {
            W13 w13 = (W13) this.LJLLLL.LJIIIIZZ(null, W13.class);
            if (w13 != null) {
                w13.tu0().LIZIZ(this, new AObjectS89S0100000_14(this, 444));
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            super.LJJLJLI();
            return;
        }
        super.LJJLJLI();
    }

    @Override // X.W49, X.AbstractC165596eh, X.AbstractC29891Fh
    public final void onCreate() {
        C0IB<WS0> bottomTabIndexChangeEvent;
        TEZ LLLLL;
        InterfaceC74393THp LJJJJLL;
        TJV LIZ;
        LiveData LIZIZ;
        LiveData<C76800UCe> bX;
        I9W LJJLIIJ;
        LiveEvent<Boolean> sF;
        LiveEvent<AbstractC82213WOj> t40;
        LiveEvent<T4S> CY;
        LiveEvent<Boolean> sF2;
        I9W LJJLIIJ2;
        I9W LJJLIIJ3;
        super.onCreate();
        C82632Wbs c82632Wbs = this.LLFZ;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLII;
        ((WLB) c82632Wbs.LIZ(this, interfaceC74236TBoArr[6])).z80((InterfaceC45925I0r) LJJLIIIJJI());
        if (C52462KiQ.LIZ() && (LJJLIIJ3 = LJJLIIJ()) != null) {
            LJJLIIJ3.P2(new OptionListHandler(this, this.LJLLLL));
        }
        if (((Boolean) C53562L0k.LIZ.getValue()).booleanValue() && C2311895m.LJ() && (LJJLIIJ2 = LJJLIIJ()) != null) {
            LJJLIIJ2.P2(new EffectInfoStickerHandler(this, this.LJLLLL));
        }
        InterfaceC82353WTt interfaceC82353WTt = this.LLD;
        if (interfaceC82353WTt != null) {
            I9W LJJLIIJ4 = LJJLIIJ();
            if (LJJLIIJ4 != null && (sF2 = LJJLIIJ4.sF()) != null) {
                sF2.LIZLLL(this, new AObjectS89S0100000_14(interfaceC82353WTt, 437));
            }
            I9W LJJLIIJ5 = LJJLIIJ();
            if (LJJLIIJ5 != null && (CY = LJJLIIJ5.CY()) != null) {
                CY.LIZLLL(this, new AObjectS119S0200000_14(interfaceC82353WTt, this, 7));
            }
            InterfaceC46211IBr interfaceC46211IBr = this.LL;
            if (interfaceC46211IBr != null && (t40 = interfaceC46211IBr.t40()) != null) {
                t40.LIZLLL(this, new AObjectS89S0100000_14(interfaceC82353WTt, 438));
            }
        }
        if (C74216TAu.LIZIZ.LIZIZ() && (LJJLIIJ = LJJLIIJ()) != null && (sF = LJJLIIJ.sF()) != null) {
            sF.LIZLLL(this, new AObjectS87S0100000_12(this, 3));
        }
        InterfaceC82325WSr interfaceC82325WSr = (InterfaceC82325WSr) this.LLFII.LIZ(this, interfaceC74236TBoArr[5]);
        if (interfaceC82325WSr != null && (bX = interfaceC82325WSr.bX()) != null) {
            bX.observe(this, new AObserverS82S0100000_14(this, 56));
        }
        InterfaceC82325WSr interfaceC82325WSr2 = (InterfaceC82325WSr) this.LLFII.LIZ(this, interfaceC74236TBoArr[5]);
        if (interfaceC82325WSr2 != null) {
            interfaceC82325WSr2.yb0((InterfaceC45925I0r) LJJLIIIJJI());
        }
        I9W LJJLIIJ6 = LJJLIIJ();
        if (LJJLIIJ6 != null && (LLLLL = LJJLIIJ6.LLLLL()) != null && (LJJJJLL = LLLLL.LJJJJLL()) != null && (LIZ = LJJJJLL.LIZ()) != null && (LIZIZ = C74310TEk.LIZIZ(LIZ, false, 14)) != null) {
            LIZIZ.observe(this, new AObjectS87S0100000_12(this, 4));
        }
        getPlanCUIApiComponent().et().LIZLLL(this, new AObjectS89S0100000_14(this, 439));
        getPlanCUIApiComponent().so0().LIZIZ(this, new AObjectS89S0100000_14(this, 440));
        getPlanCUIApiComponent().ys0().LIZIZ(this, new AObjectS89S0100000_14(this, 441));
        getPlanCUIApiComponent().ae().LIZIZ(this, new AObjectS89S0100000_14(this, 442));
        InterfaceC45979I2t interfaceC45979I2t = (InterfaceC45979I2t) this.LLFFF.LIZ(this, interfaceC74236TBoArr[4]);
        if (interfaceC45979I2t != null && (bottomTabIndexChangeEvent = interfaceC45979I2t.getBottomTabIndexChangeEvent()) != null) {
            bottomTabIndexChangeEvent.LIZIZ(this, new AObjectS89S0100000_14(this, 443));
        }
    }

    @Override // X.AbstractC165596eh, X.AbstractC29891Fh
    public final void onDestroy() {
        super.onDestroy();
        ((WLB) this.LLFZ.LIZ(this, LLII[6])).z80(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W48(C82622Wbi diContainer, WMH parentScene, int i, AqS180S0100000_14 aqS180S0100000_14) {
        super(diContainer, parentScene, i, aqS180S0100000_14);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJZI = (ActivityC45651qj) this.LJLLLL.LJ(ActivityC45651qj.class, null);
        this.LJZL = UCI.LJI(this.LJLLLL, InterfaceC82086WJm.class, null);
        UCI.LJII(this.LJLLLL, WRQ.class, null);
        this.LL = (InterfaceC46211IBr) this.LJLLLL.LJIIIIZZ(null, InterfaceC46211IBr.class);
        this.LLD = (InterfaceC82353WTt) this.LJLLLL.LJIIIIZZ(null, InterfaceC82353WTt.class);
        this.LLF = UCI.LJI(this.LJLLLL, ShortVideoContext.class, null);
        this.LLFF = UCI.LJI(this.LJLLLL, InterfaceC45999I3n.class, null);
        this.LLFFF = UCI.LJII(this.LJLLLL, InterfaceC45979I2t.class, null);
        this.LLFII = UCI.LJII(this.LJLLLL, InterfaceC82325WSr.class, null);
        this.LLFZ = UCI.LJI(this.LJLLLL, WLB.class, null);
        this.LLI = C221108m2.LIZ(EnumC221088m0.NONE, new AqS162S0100000_12(this, 1023));
    }
}
