package X;

import Y.AObjectS89S0100000_14;
import Y.IDCListenerS260S0100000_14;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WSy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82332WSy extends AbstractC29891Fh<WIF> implements InterfaceC143795kd, WIF, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIL;
    public final WMH LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final WIF LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC45999I3n LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final C46611sH<Boolean> LJLLLL;
    public final C46611sH<Integer> LJLLLLLL;
    public final C29901Fi<Integer> LJLZ;
    public final boolean LJZ;
    public final C29901Fi<EnumC82528WaC> LJZI;
    public final C29901Fi<Boolean> LJZL;
    public final C29901Fi<W1T> LL;
    public final C29901Fi<OSZ<Integer, Integer>> LLD;
    public final InterfaceC115514g7 LLF;
    public final InterfaceC115514g7 LLFF;
    public final InterfaceC115514g7 LLFFF;
    public boolean LLFII;
    public W1I LLFZ;
    public final boolean LLI;
    public View LLIFFJFJJ;
    public InterfaceC65784Pro<C76800UCe> LLII;
    public final boolean LLIIII;
    public final W1P LLIIIILZ;
    public final LiveEvent<Integer> LLIIIJ;

    @Override // X.InterfaceC73141SnB
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    /* renamed from: getReceiver, reason: avoid collision after fix types in other method */
    public AML getReceiver2() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    static {
        TBT tbt = new TBT(C82332WSy.class, "speedPanelShowStore", "getSpeedPanelShowStore()Lcom/ss/android/ugc/gamora/recorder/speed/ISpeedPanelShowPropertyStore;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIIL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82332WSy.class, "commerceApiComponent", "getCommerceApiComponent()Lcom/ss/android/ugc/gamora/recorder/commerce/CommerceApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82332WSy.class, "toolbarApiComponent", "getToolbarApiComponent()Lcom/ss/android/ugc/gamora/recorder/toolbar/refactory/ToolbarApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82332WSy.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82332WSy.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(C82332WSy.class, "stickerLogicComponent", "getStickerLogicComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82332WSy.class, "lighteningControlApiComponent", "getLighteningControlApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/LighteningControlProgressApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82332WSy.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82332WSy.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0, c65351Pkp), C61845OOz.LIZJ(C82332WSy.class, "nowSwitchApiComponent", "getNowSwitchApiComponent()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0, c65351Pkp), C61845OOz.LIZJ(C82332WSy.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0, c65351Pkp), C61845OOz.LIZJ(C82332WSy.class, "exitApiComponent", "getExitApiComponent()Lcom/ss/android/ugc/gamora/recorder/exit/ExitApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82332WSy.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0, c65351Pkp)};
    }

    private final void LJJLI() {
        boolean z;
        if (this.LJLIL.findSceneByTag("RecordSpeedGroupScene") != null) {
            return;
        }
        C0IB<Boolean> RH = this.LJLJJL.RH();
        C46611sH<Integer> c46611sH = this.LJLLLLLL;
        W1P w1p = this.LLIIIILZ;
        C29901Fi<W1T> c29901Fi = this.LL;
        C29901Fi<OSZ<Integer, Integer>> c29901Fi2 = this.LLD;
        View LJJLIIIIJ = LJJLIIIIJ();
        if (!TextUtils.isEmpty(getShortVideoContext().cameraComponentModel.duetContext.duetVideoPath) && !TextUtils.isEmpty(getShortVideoContext().cameraComponentModel.duetContext.duetAudioPath) && !getShortVideoContext().mIsFromDraft) {
            z = true;
        } else {
            z = false;
        }
        W1I w1i = new W1I(RH, c46611sH, w1p, c29901Fi, c29901Fi2, new C81243VuZ(LJJLIIIIJ, z, getShortVideoContext().LJJIJIIJIL(), new AqS164S0100000_14(this, 225), new AqS164S0100000_14(this, 226)), getCameraApiComponent());
        this.LLFZ = w1i;
        this.LJLIL.add(R.id.iri, w1i, "RecordSpeedGroupScene");
        C79234V7u.LJIL(this.LJLIL, "RecordSpeedGroupScene");
    }

    private final View LJJLIIIIJ() {
        if (this.LLIIII) {
            return this.LLIFFJFJJ;
        }
        return LJJLJLI().R3(1);
    }

    private final HXE LJJLIIIJJI() {
        return (HXE) this.LLFF.LIZ(this, LLIIIL[11]);
    }

    private final InterfaceC45891Hzj LJJLIIIJJIZ() {
        return (InterfaceC45891Hzj) this.LJLLI.LIZ(this, LLIIIL[6]);
    }

    private final InterfaceC82325WSr LJJLIIIJLLLLLLLZ() {
        return (InterfaceC82325WSr) this.LJLLL.LIZ(this, LLIIIL[9]);
    }

    private final I0N LJJLJ() {
        return (I0N) this.LJLL.LIZ(this, LLIIIL[5]);
    }

    private final InterfaceC82062WIo LJJLJLI() {
        return (InterfaceC82062WIo) this.LJLJL.LIZ(this, LLIIIL[2]);
    }

    private final InterfaceC45979I2t getBottomTabApiComponent() {
        return (InterfaceC45979I2t) this.LLFFF.LIZ(this, LLIIIL[12]);
    }

    private final WLB getRecordAdapterApi() {
        return (WLB) this.LJLLJ.LIZ(this, LLIIIL[8]);
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.LLF.LIZ(this, LLIIIL[10]);
    }

    public final WTU LJJLIIIJILLIZJL() {
        return (WTU) this.LJLJJLL.LIZ(this, LLIIIL[1]);
    }

    public final WTM LJJLIIJ() {
        return (WTM) this.LJLJJI.LIZ(this, LLIIIL[0]);
    }

    public final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLJLJ.LIZ(this, LLIIIL[3]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLJLLL.LIZ(this, LLIIIL[4]);
    }

    public final I3K getSplitShootApiComponent() {
        return (I3K) this.LJLLILLLL.LIZ(this, LLIIIL[7]);
    }

    @Override // X.WIF
    public boolean me() {
        return LJJLIIJ().LIZJ();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        C0IB<String> pe0;
        C0IB<Boolean> Hf;
        super.onCreate();
        getRecordAdapterApi().J10(this);
        if (!this.LLI && !this.LJZ) {
            LJJLI();
        }
        this.LJLLLL.LIZIZ(this, new AObjectS89S0100000_14(this, 332));
        LJJLJ().Os0().LIZLLL(this, new AObjectS89S0100000_14(this, 333));
        this.LJLJJL.Et().LIZIZ(this, new AObjectS89S0100000_14(this, 334));
        if (this.LLI) {
            InterfaceC82086WJm cameraApiComponent = getCameraApiComponent();
            EnumC82528WaC enumC82528WaC = EnumC82528WaC.NORMAL;
            cameraApiComponent.y90(enumC82528WaC);
            T4(enumC82528WaC);
        }
        LJJLIIIJJI().YO().LIZLLL(this, new AObjectS89S0100000_14(this, 335));
        InterfaceC45891Hzj LJJLIIIJJIZ = LJJLIIIJJIZ();
        if (LJJLIIIJJIZ != null && (Hf = LJJLIIIJJIZ.Hf()) != null) {
            Hf.LIZIZ(this, new AObjectS89S0100000_14(this, 336));
        }
        I3K splitShootApiComponent = getSplitShootApiComponent();
        if (splitShootApiComponent != null && (pe0 = splitShootApiComponent.pe0()) != null) {
            pe0.LIZIZ(this, new AObjectS89S0100000_14(this, 337));
        }
        this.LJLJJL.LC().LIZLLL(this, new AObjectS89S0100000_14(this, 338));
        getBottomTabApiComponent().getBottomTabIndexChangeEvent().LIZIZ(this, new AObjectS89S0100000_14(this, 339));
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        LJJLIIJ().LIZIZ(false);
        this.LJLZ.LJII(8);
        LJJLIIIJILLIZJL().FL(true);
        super.onDestroy();
        getRecordAdapterApi().J10(null);
    }

    @Override // X.AbstractC29891Fh
    public void onStop() {
        super.onStop();
        if (W1I.LJLLI && this.LJLIL.findSceneByTag("RecordSpeedGroupScene") != null) {
            WMH wmh = this.LJLIL;
            W1I w1i = this.LLFZ;
            if (w1i != null) {
                wmh.remove(w1i);
            } else {
                o.LJIJI("recordSpeedGroupScene");
                throw null;
            }
        }
    }

    @Override // X.WIF
    public WIY t2() {
        return LJJLIIJ().LIZ();
    }

    @Override // X.WIF
    public LiveEvent<EnumC82528WaC> N1() {
        return this.LJZI;
    }

    @Override // X.WIF
    public LiveEvent<Integer> Q2() {
        return this.LLIIIJ;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ WIF getApiComponent() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC73149SnJ
    public /* bridge */ /* synthetic */ AML getReceiver() {
        getReceiver2();
        return this;
    }

    @Override // X.WIF
    public LiveEvent<Boolean> u90() {
        return this.LJZL;
    }

    public final void LJJLL(boolean z) {
        this.LJZL.LJII(Boolean.valueOf(z));
    }

    public final void LJJZZI(boolean z) {
        C81019Vqx c81019Vqx;
        C81019Vqx c81019Vqx2;
        if (this.LLI && LJJLJLI().R3(1) == null && this.LLIFFJFJJ == null) {
            h1(false);
            return;
        }
        if (z) {
            Boolean LIZ = this.LJLLLL.LIZ();
            o.LJIIIIZZ(LIZ, "speedPanelShow.value");
            if (LIZ.booleanValue()) {
                LJJLI();
                C79234V7u.LJJJ(this.LJLIL, "RecordSpeedGroupScene");
                if (this.LLI) {
                    W1I w1i = this.LLFZ;
                    if (w1i != null) {
                        View view = w1i.mView;
                        if ((view instanceof C81019Vqx) && (c81019Vqx2 = (C81019Vqx) view) != null) {
                            c81019Vqx2.LJI();
                            return;
                        }
                        return;
                    }
                    o.LJIJI("recordSpeedGroupScene");
                    throw null;
                }
                return;
            }
            return;
        }
        if (this.LJLIL.findSceneByTag("RecordSpeedGroupScene") == null) {
            return;
        }
        if (this.LLI) {
            W1I w1i2 = this.LLFZ;
            if (w1i2 != null) {
                View view2 = w1i2.mView;
                if (!(view2 instanceof C81019Vqx) || (c81019Vqx = (C81019Vqx) view2) == null) {
                    return;
                }
                c81019Vqx.LJ();
                return;
            }
            o.LJIJI("recordSpeedGroupScene");
            throw null;
        }
        C79234V7u.LJIL(this.LJLIL, "RecordSpeedGroupScene");
    }

    @Override // X.WIF
    public void P1(int i) {
        this.LJLLLLLL.LJI(Integer.valueOf(i));
    }

    @Override // X.WIF
    public void T4(EnumC82528WaC speed) {
        o.LJIIIZ(speed, "speed");
        this.LJZI.LJII(speed);
        InterfaceC82325WSr LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
        if (LJJLIIIJLLLLLLLZ != null) {
            LJJLIIIJLLLLLLLZ.gM(speed);
        }
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at> S1 getState(VM1 vm1) {
        return (S1) C73297Sph.LIZIZ(this, vm1);
    }

    @Override // X.WIF
    public void h1(boolean z) {
        this.LJLLLL.LJI(Boolean.valueOf(z));
    }

    @Override // X.WIF
    public void t3(WIY enterType) {
        o.LJIIIZ(enterType, "enterType");
        LJJLIIJ().LIZLLL(enterType);
    }

    public C82332WSy(WMH parent, C82622Wbi diContainer) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = parent;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = this;
        this.LJLJJI = UCI.LJI(getDiContainer(), WTM.class, null);
        this.LJLJJL = (InterfaceC45999I3n) getDiContainer().LJ(InterfaceC45999I3n.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), WTU.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), InterfaceC82062WIo.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLJLLL = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLL = UCI.LJI(getDiContainer(), I0N.class, null);
        this.LJLLI = UCI.LJII(getDiContainer(), InterfaceC45891Hzj.class, null);
        this.LJLLILLLL = UCI.LJII(getDiContainer(), I3K.class, null);
        this.LJLLJ = UCI.LJI(getDiContainer(), WLB.class, null);
        this.LJLLL = UCI.LJII(getDiContainer(), InterfaceC82325WSr.class, null);
        this.LJLLLL = new C46611sH<>(Boolean.valueOf(LJJLIIJ().LIZJ()));
        boolean z = false;
        this.LJLLLLLL = new C46611sH<>(0);
        C29901Fi<Integer> c29901Fi = new C29901Fi<>();
        this.LJLZ = c29901Fi;
        this.LJZ = e1.LIZ(31744, "creative_tools_open_enter_record", true, false);
        this.LJZI = new C29901Fi<>();
        this.LJZL = new C29901Fi<>();
        this.LL = new C29901Fi<>();
        this.LLD = new C29901Fi<>();
        this.LLF = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LLFF = UCI.LJI(getDiContainer(), HXE.class, null);
        this.LLFFF = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LLFII = true;
        this.LLI = C53557L0f.LIZ();
        this.LLII = WTN.LJLIL;
        if (C148745sc.LIZ()) {
            AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
            if (C43119Gw7.LIZ()) {
                z = true;
            }
        }
        this.LLIIII = z;
        this.LLIIIILZ = new WT5(this);
        this.LLIIIJ = c29901Fi;
    }

    @Override // X.WIF
    public void s7(int i, int i2) {
        this.LLD.LJII(new OSZ<>(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // X.InterfaceC73150SnK
    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, InterfaceC88472Yns<? super PROP1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIL(c73139Sn9, interfaceC88472Yns);
    }

    @Override // X.WIF
    public void z40(View view, InterfaceC65784Pro<C76800UCe> onHideAction) {
        C81019Vqx c81019Vqx;
        o.LJIIIZ(onHideAction, "onHideAction");
        this.LLIFFJFJJ = view;
        this.LLII = onHideAction;
        W1I w1i = this.LLFZ;
        if (w1i != null) {
            View view2 = w1i.mView;
            if ((view2 instanceof C81019Vqx) && (c81019Vqx = (C81019Vqx) view2) != null) {
                C81243VuZ c81243VuZ = w1i.LJLJJLL;
                boolean z = c81243VuZ.LIZIZ;
                boolean z2 = c81243VuZ.LIZJ;
                InterfaceC65784Pro<C76800UCe> hideAnimEndCallback = c81243VuZ.LIZLLL;
                InterfaceC65784Pro<C76800UCe> onTouchUpOutsideCallback = c81243VuZ.LJ;
                o.LJIIIZ(hideAnimEndCallback, "hideAnimEndCallback");
                o.LJIIIZ(onTouchUpOutsideCallback, "onTouchUpOutsideCallback");
                C81243VuZ c81243VuZ2 = new C81243VuZ(view, z, z2, hideAnimEndCallback, onTouchUpOutsideCallback);
                c81019Vqx.LJLIL = c81243VuZ2;
                View view3 = c81243VuZ2.LIZ;
                if (view3 != null) {
                    view3.addOnLayoutChangeListener(new IDCListenerS260S0100000_14(c81019Vqx, 2));
                }
            }
        }
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, InterfaceC88471Ynr<? super S1, ? super S2, ? extends R> interfaceC88471Ynr) {
        return (R) C73297Sph.LJIILLIIL(vm1, vm2, interfaceC88471Ynr);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, InterfaceC88471Ynr<? super PROP1, ? super PROP2, ? extends R> interfaceC88471Ynr) {
        return (R) C73297Sph.LJIJJLI(c73139Sn9, c73139Sn92, interfaceC88471Ynr);
    }

    @Override // X.WIF
    public void I(int i, int i2, int i3, int i4) {
        this.LL.LJII(new W1T(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
    }

    @Override // X.InterfaceC143795kd
    public <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    public <S extends InterfaceC61312at, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C2KE<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIL(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC88473Ynt<? super S1, ? super S2, ? super S3, ? extends R> interfaceC88473Ynt) {
        return (R) C73297Sph.LJIILL(vm1, vm2, vm3, interfaceC88473Ynt);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, InterfaceC88473Ynt<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> interfaceC88473Ynt) {
        return (R) C73297Sph.LJIJJ(c73139Sn9, c73139Sn92, c73139Sn93, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73297Sph.LJFF(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, InterfaceC88474Ynu<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> interfaceC88474Ynu) {
        return (R) C73297Sph.LJIILJJIL(vm1, vm2, vm3, vm4, interfaceC88474Ynu);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, C73139Sn9<S4, PROP4> c73139Sn94, InterfaceC88474Ynu<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> interfaceC88474Ynu) {
        return (R) C73297Sph.LJIJI(c73139Sn9, c73139Sn92, c73139Sn93, c73139Sn94, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73297Sph.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, VM5 extends JediViewModel<S5>, S5 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, InterfaceC88475Ynv<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> interfaceC88475Ynv) {
        return (R) C73297Sph.LJIILIIL(vm1, vm2, vm3, vm4, vm5, interfaceC88475Ynv);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, M5 extends C73139Sn9<S5, PROP5>, PROP5 extends InterfaceC61312at, S5 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, C73139Sn9<S4, PROP4> c73139Sn94, C73139Sn9<S5, PROP5> c73139Sn95, InterfaceC88475Ynv<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> interfaceC88475Ynv) {
        return (R) C73297Sph.LJIJ(c73139Sn9, c73139Sn92, c73139Sn93, c73139Sn94, c73139Sn95, interfaceC88475Ynv);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }

    public <S extends InterfaceC61312at, A, B, C, D, E> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C73165SnZ<TMF> c73165SnZ, InterfaceC88476Ynw<? super AML, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C73297Sph.LJIIIIZZ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c73165SnZ, interfaceC88476Ynw);
    }
}
