package X;

import Y.AObjectS89S0100000_14;
import Y.AObserverS82S0100000_14;
import Y.AfS66S0100000_14;
import Y.IDObjectS387S0100000_12;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState;
import com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS15S0102000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS31S0001000_7;
import kotlin.jvm.internal.AqS37S1000000_14;
import kotlin.jvm.internal.AqS38S0001000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vzn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81567Vzn extends AbstractC48231ut<InterfaceC45921I0n, C81489VyX, C81500Vyi, L48> implements InterfaceC45921I0n, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIJLIL;
    public final WMH LJLL;
    public final C82622Wbi LJLLI;
    public final InterfaceC45921I0n LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final C5H3 LJLLL;
    public final C29901Fi<Boolean> LJLLLL;
    public final C29901Fi<ImageUrlModel> LJLLLLLL;
    public final InterfaceC65784Pro<C81500Vyi> LJLZ;
    public final C0IB<Effect> LJZ;
    public final InterfaceC65784Pro<L48> LJZI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final InterfaceC115514g7 LLD;
    public final InterfaceC115514g7 LLF;
    public final InterfaceC115514g7 LLFF;
    public final InterfaceC115514g7 LLFFF;
    public final InterfaceC115514g7 LLFII;
    public final InterfaceC115514g7 LLFZ;
    public final InterfaceC115514g7 LLI;
    public final InterfaceC115514g7 LLIFFJFJJ;
    public final C73318Sq2 LLII;
    public final Stack<Integer> LLIIII;
    public boolean LLIIIILZ;
    public final C5H3 LLIIIJ;
    public MutableLiveData<C74413TIj<EffectChannelResponse>> LLIIIL;
    public boolean LLIIIZ;
    public float LLIIJI;

    static {
        TBT tbt = new TBT(C81567Vzn.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIJLIL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C81567Vzn.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0, c65351Pkp), C61845OOz.LIZJ(C81567Vzn.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C81567Vzn.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0, c65351Pkp), C61845OOz.LIZJ(C81567Vzn.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C81567Vzn.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C81567Vzn.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(C81567Vzn.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C81567Vzn.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C81567Vzn.class, "recordLazyHelperApiComponent", "getRecordLazyHelperApiComponent()Lcom/ss/android/ugc/aweme/utils/RecordLazyHelperApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C81567Vzn.class, "slideSlipBottomStickerApiComponent", "getSlideSlipBottomStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/slideslip/SlideSlipBottomStickerApiComponent;", 0, c65351Pkp)};
    }

    private final ChangeDuetLayoutViewModel LLIFFJFJJ() {
        return (ChangeDuetLayoutViewModel) this.LJLLL.getValue();
    }

    private final W13 LLIILZL() {
        return (W13) this.LLI.LIZ(this, LLIIJLIL[9]);
    }

    private final InterfaceC82129WLd LLIIZ() {
        return (InterfaceC82129WLd) this.LLIFFJFJJ.LIZ(this, LLIIJLIL[10]);
    }

    private final WIF LLILL() {
        return (WIF) this.LLFZ.LIZ(this, LLIIJLIL[8]);
    }

    private final InterfaceC82353WTt getGestureApiComponent() {
        return (InterfaceC82353WTt) this.LLF.LIZ(this, LLIIJLIL[4]);
    }

    private final WLB getRecordAdapterApi() {
        return (WLB) this.LJLLJ.LIZ(this, LLIIJLIL[0]);
    }

    private final I0N getStickerApiComponent() {
        return (I0N) this.LLFII.LIZ(this, LLIIJLIL[7]);
    }

    public final InterfaceC84498XEg LLIIIL() {
        return (InterfaceC84498XEg) this.LLIIIJ.getValue();
    }

    public final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LJZL.LIZ(this, LLIIJLIL[1]);
    }

    public final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LL.LIZ(this, LLIIJLIL[2]);
    }

    public final InterfaceC45999I3n getPlanCUIApiComponent() {
        return (InterfaceC45999I3n) this.LLFF.LIZ(this, LLIIJLIL[5]);
    }

    public final I3X getRecordControlApi() {
        return (I3X) this.LLD.LIZ(this, LLIIJLIL[3]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLFFF.LIZ(this, LLIIJLIL[6]);
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void hide() {
        LJJZZI(C81565Vzl.LJLIL);
    }

    public final void LLIZ() {
        super.show();
        LJJZZI(C81566Vzm.LJLIL);
    }

    public final void LLJJIII() {
        LLJJI(LLIIIL(), "duet-layout").observe(this, new AObserverS82S0100000_14(this, 23));
    }

    public final void LLJJIJI() {
        getCameraApiComponent().e8().getEffectController().ka(0.5f, 0.0f, 0, 0);
        getCameraApiComponent().e8().getEffectController().ba(0.5f, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    public final void LLJLIL() {
        boolean z;
        Boolean LIZJ = getPlanCUIApiComponent().g2().LIZJ();
        if (LIZJ == null) {
            LIZJ = Boolean.FALSE;
        }
        if (!LIZJ.booleanValue() && getShortVideoContext().LJII().isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        show(z);
    }

    public final void LLLIILIL() {
        getCameraApiComponent().z6(false, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.DUET_SWITCH_CAMERA, null), null);
    }

    @Override // X.InterfaceC45921I0n
    public void oP() {
        C45927I0t<Integer> layoutDirection = LLIFFJFJJ().Hv0(getActivity()).getLayoutDirection();
        int i = 0;
        if (layoutDirection == null || layoutDirection.LIZIZ.intValue() != 1) {
            i = 1;
        }
        ChangeDuetLayoutViewModel LLIFFJFJJ = LLIFFJFJJ();
        LLIFFJFJJ.getClass();
        LLIFFJFJJ.setState(new AqS31S0001000_7(i, 8));
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        LiveEvent<Effect> LC;
        super.onCreate();
        getRecordAdapterApi().Wc0(this);
        getCameraApiComponent().Hv().LIZLLL(this, new AObjectS89S0100000_14(this, 144));
        getRecordControlApi().w90().LIZLLL(this, new AObjectS89S0100000_14(this, 145));
        getRecordControlApi().UG().LIZLLL(this, new AObjectS89S0100000_14(this, 146));
        getRecordControlApi().Rr0().LIZLLL(this, new AObjectS89S0100000_14(this, 147));
        C78999UzT.LJFF(getStickerApiComponent().ua0().LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS66S0100000_14(this, 19), C73982T1u.LJLIL), this.LLII);
        getRecordControlApi().zg(HKF.class, new C81568Vzo(this));
        getPlanCUIApiComponent().Na0().LIZIZ(this, new AObjectS89S0100000_14(this, 148));
        getPlanCUIApiComponent().Et().LIZIZ(this, new AObjectS89S0100000_14(this, 149));
        InterfaceC45999I3n planCUIApiComponent = getPlanCUIApiComponent();
        if (planCUIApiComponent != null && (LC = planCUIApiComponent.LC()) != null) {
            LC.LIZLLL(this, new AObjectS89S0100000_14(this, 139));
        }
        if (C53558L0g.LIZ()) {
            getPlanCUIApiComponent().g2().LIZLLL(this, new AObjectS89S0100000_14(this, UserLevelGeckoUpdateSetting.DEFAULT));
        }
        getPlanCUIApiComponent().RH().LIZIZ(this, new AObjectS89S0100000_14(this, 141));
        ChangeDuetLayoutViewModel changeDuetLayoutViewModel = LLIFFJFJJ();
        o.LJIIIIZZ(changeDuetLayoutViewModel, "changeDuetLayoutViewModel");
        changeDuetLayoutViewModel.Iv0(this, new TBT() { // from class: X.I0k
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ChangeDuetLayoutState) obj).getExitDuetMode();
            }
        }, new C73165SnZ(), new AqS180S0100000_14(this, 135));
        if (C53564L0m.LIZIZ()) {
            if (!getDiContainer().LIZIZ(WIF.class)) {
                return;
            }
            whenReadyOrThrowInternal(getDiContainer(), WIF.class, new AqS180S0100000_14(this, 134));
            return;
        }
        LLILL().Q2().LIZLLL(this, new AObjectS89S0100000_14(this, 143));
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        getRecordAdapterApi().Wc0(null);
        this.LLII.dispose();
    }

    @Override // X.InterfaceC45921I0n
    public C0IB<Integer> qc() {
        return LJJLIIIJLLLLLLLZ().LIZIZ(new TBT() { // from class: X.VzV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C81500Vyi) obj).LIZIZ);
            }
        });
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        super.show();
        LJJZZI(C81564Vzk.LJLIL);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C81500Vyi> LJJLIIIJJI() {
        return this.LJLZ;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<L48> LJJLIIIJJIZ() {
        return this.LJZI;
    }

    public final void LLILZLL() {
        super.hide();
    }

    @Override // X.InterfaceC45921I0n
    public C0IB<Effect> YZ() {
        return this.LJZ;
    }

    @Override // X.AbstractC41331jl, X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C0I6 getApiComponent() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC45921I0n
    public /* bridge */ /* synthetic */ LiveEvent t5() {
        return this.LJLLLL;
    }

    @Override // X.InterfaceC45921I0n
    public /* bridge */ /* synthetic */ LiveEvent tA() {
        return this.LJLLLLLL;
    }

    private final void LJZI(int i) {
        ChangeDuetLayoutViewModel LLIFFJFJJ = LLIFFJFJJ();
        LLIFFJFJJ.getClass();
        LLIFFJFJJ.setState(new AqS31S0001000_7(i, 8));
    }

    private final void LLJ(EffectChannelResponse effectChannelResponse) {
        if (effectChannelResponse == null || C32151Nz.LJJIIJZLJL(effectChannelResponse.getAllCategoryEffects())) {
            LJJZZI(C81517Vyz.LJLIL);
            return;
        }
        ArrayList arrayList = new ArrayList(effectChannelResponse.getAllCategoryEffects());
        if (arrayList.size() >= 2) {
            Object obj = ListProtector.get(arrayList, 0);
            ListProtector.set(arrayList, 0, ListProtector.get(arrayList, 1));
            ListProtector.set(arrayList, 1, obj);
        }
        LJJZZI(new AqS145S0200000_14(arrayList, (ArrayList<Effect>) this, (C81567Vzn) 6));
        LLJJIJIL(arrayList);
    }

    private final void LLJJIJIL(List<? extends Effect> list) {
        Effect effect;
        if (!getShortVideoContext().mIsFromDraft) {
            return;
        }
        DuetContext duetContext = getShortVideoContext().cameraComponentModel.duetContext;
        o.LJIIIIZZ(duetContext, "shortVideoContext.duetContext");
        Iterator<? extends Effect> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                effect = it.next();
                if (o.LJ(EHI.LIZJ(effect), duetContext.duetLayoutMode)) {
                    break;
                }
            } else {
                effect = null;
                break;
            }
        }
        Effect effect2 = effect;
        if (effect2 != null) {
            int indexOf = list.indexOf(effect2);
            if (indexOf < 0) {
                indexOf = 0;
            }
            if (LLIIIL().LJJIL(effect2)) {
                LLJI(effect2, duetContext, indexOf);
            } else {
                LLIIIL().LJJIIZI(effect2, new C81554Vza(this, effect2, duetContext, indexOf));
            }
        }
    }

    private final void LLJJJIL(WXA wxa) {
        InterfaceC82353WTt gestureApiComponent = getGestureApiComponent();
        if (gestureApiComponent != null) {
            gestureApiComponent.Ik0(wxa, 2);
        }
    }

    public final void LJLZ(boolean z) {
        C78928UyK.LIZIZ(z, false, false, getCameraApiComponent());
    }

    public final void LLFFF(Effect value) {
        ChangeDuetLayoutViewModel LLIFFJFJJ = LLIFFJFJJ();
        LLIFFJFJJ.getClass();
        o.LJIIIZ(value, "value");
        LLIFFJFJJ.setState(new AqS173S0100000_7(value, 408));
    }

    public final void LLILZIL(C74413TIj<EffectChannelResponse> c74413TIj) {
        EnumC74323TEx enumC74323TEx;
        if (c74413TIj == null || (enumC74323TEx = c74413TIj.LIZIZ) == null) {
            return;
        }
        int i = C74324TEy.LIZ[enumC74323TEx.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LLJ(c74413TIj.LIZ);
                return;
            }
            LJJZZI(C81516Vyy.LJLIL);
            return;
        }
        LJJZZI(C81515Vyx.LJLIL);
    }

    public final void LLJJL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C26227ARb LIZ = C3AW.LIZ(getActivity());
        LIZ.LIZ(R.string.f0l);
        UC0.LIZJ(LIZ, new AqS172S0100000_6(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 38));
        LIZ.LJI().LIZLLL();
    }

    public final void LLJZIJLIL(boolean z) {
        if (z && !getShortVideoContext().LJJIIJZLJL() && !o.LJ(this.LJLLLL.LIZJ(), Boolean.TRUE)) {
            String str = getShortVideoContext().cameraComponentModel.duetContext.duetVideoPath;
            String str2 = getShortVideoContext().cameraComponentModel.duetContext.duetAudioPath;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !getShortVideoContext().mIsFromDraft) {
                if (C53558L0g.LIZ()) {
                    LLJLIL();
                    return;
                } else {
                    show();
                    return;
                }
            }
            if (!getShortVideoContext().mIsFromDraft) {
                return;
            }
            LLIZ();
            return;
        }
        LLILZLL();
    }

    @Override // X.InterfaceC45921I0n
    public void Su(Effect effect) {
        LJJZZI(new AqS180S0100000_14(effect, 133));
    }

    @Override // X.InterfaceC45921I0n
    public void Zi0(ImageUrlModel imageUrlModel) {
        this.LJLLLLLL.LJII(imageUrlModel);
    }

    @Override // X.InterfaceC45921I0n
    public void show(boolean z) {
        if (z) {
            show();
        } else {
            hide();
        }
    }

    @Override // X.InterfaceC45921I0n
    public void showToast(String toast) {
        o.LJIIIZ(toast, "toast");
        LJJZZI(new AqS37S1000000_14(toast, 3));
    }

    @Override // X.InterfaceC45921I0n
    public void vL(boolean z) {
        this.LJLLLL.LJII(Boolean.valueOf(z));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81567Vzn(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = parentScene;
        this.LJLLI = diContainer;
        this.LJLLILLLL = this;
        this.LJLLJ = UCI.LJI(getDiContainer(), WLB.class, null);
        this.LJLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 139));
        this.LJLLLL = new C29901Fi<>();
        this.LJLLLLLL = new C29901Fi<>();
        this.LJLZ = C81523Vz5.LJLIL;
        this.LJZ = new C40871j1(null);
        this.LJZI = new AqS159S0100000_9(this, 622);
        this.LJZL = UCI.LJI(getDiContainer(), ActivityC45651qj.class, null);
        this.LL = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LLD = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LLF = UCI.LJII(getDiContainer(), InterfaceC82353WTt.class, null);
        this.LLFF = UCI.LJI(getDiContainer(), InterfaceC45999I3n.class, null);
        this.LLFFF = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LLFII = UCI.LJI(getDiContainer(), I0N.class, null);
        this.LLFZ = UCI.LJI(getDiContainer(), WIF.class, null);
        this.LLI = UCI.LJI(getDiContainer(), W13.class, null);
        this.LLIFFJFJJ = UCI.LJII(getDiContainer(), InterfaceC82129WLd.class, null);
        this.LLII = new C73318Sq2();
        this.LLIIII = new Stack<>();
        this.LLIIIJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, UserLevelGeckoUpdateSetting.DEFAULT));
        this.LLIIIZ = true;
    }

    private final MutableLiveData<C74413TIj<EffectChannelResponse>> LLJJI(InterfaceC84498XEg interfaceC84498XEg, String str) {
        MutableLiveData<C74413TIj<EffectChannelResponse>> mutableLiveData = this.LLIIIL;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        MutableLiveData<C74413TIj<EffectChannelResponse>> mutableLiveData2 = new MutableLiveData<>();
        this.LLIIIL = mutableLiveData2;
        mutableLiveData2.setValue(C74413TIj.LIZIZ());
        interfaceC84498XEg.LJI(str, false, new IDObjectS387S0100000_12(this, 0));
        MutableLiveData<C74413TIj<EffectChannelResponse>> mutableLiveData3 = this.LLIIIL;
        if (mutableLiveData3 != null) {
            return mutableLiveData3;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LLJLLIL(float f, float f2) {
        int LIZIZ = C81184Vtc.LIZIZ(getActivity());
        if (this.LLIIIZ) {
            this.LLIIJI = f2;
            getCameraApiComponent().e8().getEffectController().ka(0.5f, (-f) / LIZIZ, 0, 0);
            this.LLIIIZ = false;
        }
        float f3 = LIZIZ;
        getCameraApiComponent().e8().getEffectController().ba(0.5f, ((-f) + f2) / f3, 0.0f, (-(f2 - this.LLIIJI)) / f3, 1.0f);
    }

    public final void LLJI(Effect effect, DuetContext duetContext, int i) {
        if (effect == null || duetContext == null) {
            return;
        }
        LJJZZI(new AqS38S0001000_14(i, 5));
        int i2 = duetContext.layoutDirection;
        if (i2 != 0) {
            LJZI(i2);
        }
    }

    public final void LLF(Effect effect, int i, int i2, int i3) {
        if (((Number) LJJLIIIJLLLLLLLZ().LIZ(new TBT() { // from class: X.Vyo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C81500Vyi) obj).LIZJ);
            }
        }).LIZ()).intValue() != i3) {
            this.LLIIIZ = true;
        }
        LJJZZI(new AqS15S0102000_14(effect, i, i3, 3));
        YZ().LJ(effect);
        if (i2 != 0) {
            if (i2 != 1) {
                return;
            }
            InterfaceC83727WtX effectController = getCameraApiComponent().e8().getEffectController();
            ViewGroup.LayoutParams layoutParams = getCameraApiComponent().sm0().getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            LLJJJIL(new W14(effectController, new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams)));
            return;
        }
        LLJJJIL(new W15());
    }

    public static /* synthetic */ void LLJJ(C81567Vzn c81567Vzn, Effect effect, DuetContext duetContext, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        c81567Vzn.LLJI(effect, duetContext, i);
    }
}
