package X;

import Y.AObjectS89S0100000_14;
import Y.AObserverS82S0100000_14;
import Y.ARunnableS20S0110000_14;
import Y.ARunnableS50S0100000_14;
import Y.AfS66S0100000_14;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.navi.DynamicSelectorHandler;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.ProTemplateEffect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS38S0001000_14;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.WVy */
/* loaded from: classes15.dex */
public final class C82410WVy extends AbstractC29891Fh<InterfaceC82129WLd> implements InterfaceC82129WLd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIJI;
    public final WMH LJLIL;
    public final int LJLILLLLZI;
    public final C82622Wbi LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC115514g7 LJZI;
    public final InterfaceC115514g7 LJZL;
    public final List<AbstractC77369UYb> LL;
    public boolean LLD;
    public boolean LLF;
    public boolean LLFF;
    public final C29901Fi<Boolean> LLFFF;
    public final C29901Fi<Boolean> LLFII;
    public final LiveEvent<Boolean> LLFZ;
    public final C73318Sq2 LLI;
    public final InterfaceC29911Fj<Boolean> LLIFFJFJJ;
    public final C5H3 LLII;
    public final C5H3 LLIIII;
    public final C5H3 LLIIIILZ;
    public final C5H3 LLIIIJ;
    public final InterfaceC82129WLd LLIIIL;
    public final Runnable LLIIIZ;

    public final int LLJI(boolean z) {
        return z ? R.drawable.b4c : R.drawable.b4d;
    }

    static {
        TBT tbt = new TBT(C82410WVy.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIJI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82410WVy.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82410WVy.class, "recordControlApi", "getRecordControlApi()Lcom/ss/android/ugc/aweme/shortvideo/recordcontrol/TikTokRecordControlApi;", 0, c65351Pkp), C61845OOz.LIZJ(C82410WVy.class, "stickerComponent", "getStickerComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82410WVy.class, "stickerPanelComponent", "getStickerPanelComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerPanelApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82410WVy.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82410WVy.class, "dockBarApiComponent", "getDockBarApiComponent()Lcom/ss/android/ugc/gamora/recorder/control/DockBarApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82410WVy.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82410WVy.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82410WVy.class, "iStickerMob", "getIStickerMob()Lcom/ss/android/ugc/aweme/sticker/mob/IStickerMob;", 0, c65351Pkp), C61845OOz.LIZJ(C82410WVy.class, "commerceApiComponent", "getCommerceApiComponent()Lcom/ss/android/ugc/gamora/recorder/commerce/CommerceApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82410WVy.class, "optionListApiComponent", "getOptionListApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/optionlist/OptionListApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82410WVy.class, "favoriteProcessor", "getFavoriteProcessor()Lcom/ss/android/ugc/aweme/sticker/favorite/FavoriteStickerProcessor;", 0, c65351Pkp), C61845OOz.LIZJ(C82410WVy.class, "nowsRecordTabApi", "getNowsRecordTabApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsRecordTabApi;", 0, c65351Pkp), C61845OOz.LIZJ(C82410WVy.class, "nowsSwitcherApi", "getNowsSwitcherApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0, c65351Pkp), C61845OOz.LIZJ(C82410WVy.class, "splitShootComponent", "getSplitShootComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82410WVy.class, "activityMayNull", "getActivityMayNull()Landroid/app/Activity;", 0, c65351Pkp)};
    }

    private final WXA LJJLIIIJJIZ() {
        return new C82409WVx(this);
    }

    private final Activity LJJLJ() {
        return (Activity) this.LJZL.LIZ(this, LLIIJI[16]);
    }

    private final C5HC LJJLJLI() {
        return (C5HC) this.LLIIIJ.getValue();
    }

    private final InterfaceC45889Hzh LJJZZIII() {
        return (InterfaceC45889Hzh) this.LJLL.LIZ(this, LLIIJI[6]);
    }

    private final InterfaceC45540Hu4 LJLJJLL() {
        return (InterfaceC45540Hu4) this.LLIIIILZ.getValue();
    }

    private final InterfaceC81634W2c LJLJLJ() {
        return (InterfaceC81634W2c) this.LJLZ.LIZ(this, LLIIJI[13]);
    }

    private final TK3 LJLLILLLL() {
        return (TK3) this.LJLLLL.LIZ(this, LLIIJI[11]);
    }

    private final I3K LJZI() {
        return (I3K) this.LJZI.LIZ(this, LLIIJI[15]);
    }

    private final InterfaceC45925I0r LLFFF() {
        return (InterfaceC45925I0r) this.LJLJLJ.LIZ(this, LLIIJI[4]);
    }

    private final void LLILL() {
        IDH idh;
        ViewGroup Uh;
        ViewGroup viewGroup;
        View cb;
        ViewParent parent;
        IDH LLLF;
        if (this.LLFF) {
            return;
        }
        I0N LLF = LLF();
        if (LLF != null && (LLLF = LLF.LLLF()) != null) {
            LLLF.prepare();
        }
        WW1 LJLLL = LJLLL();
        I0N LLF2 = LLF();
        if (LLF2 != null) {
            idh = LLF2.LLLF();
        } else {
            idh = null;
        }
        LJLLL.LLIIJLIL = idh;
        if (idh != null && (cb = idh.cb()) != null && (parent = cb.getParent()) != null) {
            LJLLL.LLIIIJ = (ViewGroup) parent;
        }
        IDH idh2 = LJLLL.LLIIJLIL;
        if (idh2 != null && (Uh = idh2.Uh()) != null && (viewGroup = (ViewGroup) Uh.findViewById(R.id.kgg)) != null) {
            LJLLL.LLIIIILZ = viewGroup;
        }
    }

    private final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLJJL.LIZ(this, LLIIJI[1]);
    }

    private final InterfaceC82325WSr getNowsSwitcherApi() {
        return (InterfaceC82325WSr) this.LJZ.LIZ(this, LLIIJI[14]);
    }

    public final InterfaceC74398THu LJJLI() {
        return new WW4(this);
    }

    public final WW6 LJJLIIIIJ() {
        return new C82411WVz(this);
    }

    public final C34380DeS LJJLIIIJILLIZJL() {
        return new C34380DeS(WWC.LJLIL, WWD.LJLIL, WWE.LJLIL, WWF.LJLIL, C34419Df5.LJLIL, new AqS164S0100000_14(this, 232), WWG.LJLIL, WWH.LJLIL, WWI.LJLIL, WW9.LJLIL, WWA.LJLIL, WWB.LJLIL, new AqS172S0100000_6(this, 49), new AqS172S0100000_6(this, 50), C34418Df4.LJLIL, 2065924);
    }

    public final WTU LJJLL() {
        return (WTU) this.LJLLL.LIZ(this, LLIIJI[10]);
    }

    public final THX LJLIIL() {
        return (THX) this.LJLLLLLL.LIZ(this, LLIIJI[12]);
    }

    public final InterfaceC74343TFr LJLJJL() {
        return (InterfaceC74343TFr) this.LJLLJ.LIZ(this, LLIIJI[9]);
    }

    public final WW1 LJLLL() {
        return (WW1) this.LLII.getValue();
    }

    public final WWJ LJLZ() {
        return (WWJ) this.LLIIII.getValue();
    }

    public final I0N LLF() {
        return (I0N) this.LJLJL.LIZ(this, LLIIJI[3]);
    }

    public final InterfaceC45979I2t getBottomTabApiComponent() {
        return (InterfaceC45979I2t) this.LJLLI.LIZ(this, LLIIJI[7]);
    }

    public final InterfaceC82353WTt getGestureApiComponent() {
        return (InterfaceC82353WTt) this.LJLLILLLL.LIZ(this, LLIIJI[8]);
    }

    public final InterfaceC45999I3n getPlanCUIApiComponent() {
        return (InterfaceC45999I3n) this.LJLJLLL.LIZ(this, LLIIJI[5]);
    }

    public final InterfaceC45967I2h getRecordControlApi() {
        return (InterfaceC45967I2h) this.LJLJJLL.LIZ(this, LLIIJI[2]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLJJI.LIZ(this, LLIIJI[0]);
    }

    private final AbstractC77369UYb LJJZZI() {
        return LJLLL().LLIIL;
    }

    private final void LLIIZ() {
        TEZ LLLLL;
        TEZ tez;
        InterfaceC74393THp LJJJJLL;
        TJV LIZ;
        LiveData LIZ2;
        TEZ tez2;
        InterfaceC74393THp LJJJJLL2;
        TJV LIZ3;
        LiveData LIZ4;
        C0IB<Boolean> s70;
        getPlanCUIApiComponent().Et().LIZIZ(this, new AObjectS89S0100000_14(this, 369));
        getCameraApiComponent().M70().LIZLLL(this, new AObjectS89S0100000_14(this, 370));
        InterfaceC81634W2c LJLJLJ = LJLJLJ();
        if (LJLJLJ != null) {
            LJLJLJ.n4(InterfaceC82352WTs.class, new AqS180S0100000_14(this, 244));
        }
        InterfaceC82325WSr nowsSwitcherApi = getNowsSwitcherApi();
        if (nowsSwitcherApi != null && (s70 = nowsSwitcherApi.s70()) != null) {
            s70.LIZIZ(this, new AObjectS89S0100000_14(this, 371));
        }
        getPlanCUIApiComponent().RH().LIZIZ(this, new AObjectS89S0100000_14(this, 363));
        LLFFF().ET(new WW7(this));
        LLIZ();
        C82622Wbi diContainer = getDiContainer();
        if (L2L.LIZ(diContainer)) {
            ((C1EP) diContainer.LJ(C1EP.class, null)).m3(InterfaceC82358WTy.class, new AqS180S0100000_14(this, 243));
        } else {
            C0I6 c0i6 = (C0I6) diContainer.LJIIIIZZ(null, InterfaceC82358WTy.class);
            if (c0i6 != null) {
                ((InterfaceC82358WTy) c0i6).U3().LIZLLL(this, new AObjectS89S0100000_14(this, 364));
            }
        }
        WWJ LJLZ = LJLZ();
        LJLZ.getClass();
        LJLZ.LJ(new AqS180S0100000_14(LJLZ, 240));
        if (LJLZ.LIZJ.LJII.invoke().booleanValue() && (tez2 = LJLZ.LJ) != null && (LJJJJLL2 = tez2.LJJJJLL()) != null && (LIZ3 = LJJJJLL2.LIZ()) != null && (LIZ4 = C74310TEk.LIZ(LIZ3, "sticker_category:favorite", false, 12)) != null) {
            LIZ4.observe(LJLZ.LIZ, new AObserverS82S0100000_14(LJLZ, 46));
        }
        if (!LJLZ.LIZJ.LJIJJ.invoke().booleanValue() && (tez = LJLZ.LJ) != null && (LJJJJLL = tez.LJJJJLL()) != null && (LIZ = LJJJJLL.LIZ()) != null && (LIZ2 = C74310TEk.LIZ(LIZ, "sticker_category:recent_used", false, 12)) != null) {
            LIZ2.observe(LJLZ.LIZ, new AObserverS82S0100000_14(LJLZ, 48));
        }
        I0N LLF = LLF();
        if (LLF == null || (LLLLL = LLF.LLLLL()) == null) {
            return;
        }
        LLLLL.LJJJJ();
    }

    private final void LLIZ() {
        I0N LLF = LLF();
        if (LLF != null) {
            LLF.xU().LIZLLL(this, new AObjectS89S0100000_14(this, 365));
            LLF.sF().LIZLLL(this, new AObjectS89S0100000_14(this, 366));
            LLF.CY().LIZLLL(this, new AObjectS89S0100000_14(this, 367));
            LLF.LLLLL().LJIIIIZZ().LIZLLL().observe(this, new AObserverS82S0100000_14(this, 49));
            LLF.LLLLL().LJIIIIZZ().LJIILL().observe(this, new AObserverS82S0100000_14(this, 50));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r1.shootMode == 19) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void LLJJ() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.experiment.SlideSlipBottomStickerConfig r0 = X.C53558L0g.LIZIZ()
            boolean r0 = r0.tapOpen
            if (r0 == 0) goto L1f
            com.ss.android.ugc.aweme.experiment.SlideSlipBottomStickerConfig r0 = X.C53558L0g.LIZIZ()
            boolean r0 = r0.supportCancel
            if (r0 == 0) goto L1f
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r3.getShortVideoContext()
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            int r1 = r1.shootMode
            r0 = 19
            if (r1 != r0) goto L2f
        L1f:
            com.ss.android.ugc.aweme.experiment.SlideSlipBottomStickerConfig r0 = X.C53558L0g.LIZIZ()
            boolean r0 = r0.supportLeftRightGesture
            if (r0 != 0) goto L2f
            com.ss.android.ugc.aweme.experiment.SlideSlipBottomStickerConfig r0 = X.C53558L0g.LIZIZ()
            boolean r0 = r0.supportUpslideOpenPanel
            if (r0 == 0) goto L3e
        L2f:
            X.WTt r2 = r3.getGestureApiComponent()
            if (r2 == 0) goto L3e
            X.WXA r1 = r3.LJJLIIIJJIZ()
            r0 = 13
            r2.Ik0(r1, r0)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82410WVy.LLJJ():void");
    }

    @Override // X.InterfaceC82129WLd
    public boolean AO() {
        return LJLLL().LLIILZL;
    }

    public final boolean LJJLIIIJJI() {
        return !getCameraApiComponent().e8().getIsExposureSeekBarShowing();
    }

    public final boolean LJJLIIJ() {
        Effect LIZJ;
        I0N LLF = LLF();
        if (LLF == null || (LIZJ = C82398WVm.LIZJ(LLF)) == null) {
            return false;
        }
        if (!V3N.LJIILLIIL(LIZJ) && !ID0.LJIIIZ(LIZJ) && !ID0.LJIILL(LIZJ) && !C79260V8u.LIZIZ(LIZJ) && !ID0.LIZLLL(LIZJ)) {
            if (LIZJ.getEffectId().length() <= 0) {
                return false;
            }
            String VALUE = (String) C52279KfT.LIZ.getValue();
            o.LJIIIIZZ(VALUE, "VALUE");
            if (!ORZ.LLJI(s.LJLJJL(VALUE, new String[]{","}, 0, 6)).contains(LIZJ.getEffectId())) {
                return false;
            }
        }
        return true;
    }

    public final void LLJJI() {
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        I0N LLF = LLF();
        if (LLF != null) {
            F4V LLLIIII = LLF.LLLIIII(WWL.INSTANCE);
            F4V f4v = null;
            if (!(LLLIIII instanceof BackgroundVideoStickerPresenter)) {
                LLLIIII = null;
            }
            BackgroundVideoStickerPresenter backgroundVideoStickerPresenter = (BackgroundVideoStickerPresenter) LLLIIII;
            if (backgroundVideoStickerPresenter != null && (mutableLiveData2 = backgroundVideoStickerPresenter.LJLLILLLL) != null && !mutableLiveData2.hasObservers()) {
                mutableLiveData2.observe(this, this.LLIFFJFJJ);
            }
            F4V LLLIIII2 = LLF.LLLIIII(WWM.INSTANCE);
            if (LLLIIII2 instanceof DynamicSelectorHandler) {
                f4v = LLLIIII2;
            }
            DynamicSelectorHandler dynamicSelectorHandler = (DynamicSelectorHandler) f4v;
            if (dynamicSelectorHandler != null && (mutableLiveData = dynamicSelectorHandler.LJLLILLLL) != null && !mutableLiveData.hasObservers()) {
                mutableLiveData.observe(this, this.LLIFFJFJJ);
            }
        }
    }

    public final void LLJJIII() {
        IDH LLLF;
        AbstractC73672Svk<THZ> Rc;
        I0N LLF = LLF();
        if (LLF != null && (LLLF = LLF.LLLF()) != null && (Rc = LLLF.Rc()) != null) {
            C78999UzT.LJFF(Rc.LJJL(C73969T1h.LIZIZ()).LJJJJZI(new AfS66S0100000_14(this, 27)), this.LLI);
        }
    }

    @Override // X.InterfaceC82129WLd
    public Effect lI() {
        boolean z;
        AbstractC77369UYb abstractC77369UYb;
        if (LJLZ().LJIILIIL != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !(!LJLZ().LJIILIIL.isEmpty()) || (abstractC77369UYb = (AbstractC77369UYb) ListProtector.get(LJLZ().LJIILIIL, 0)) == null) {
            return null;
        }
        return C47261Igj.LJIJJLI(abstractC77369UYb);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        this.LJLIL.add(this.LJLILLLLZI, LJLLL(), "SlideSlipStickerScene");
        LLJJ();
        LLIIZ();
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        this.LLI.dispose();
    }

    @Override // X.AbstractC29891Fh
    public void onPause() {
        super.onPause();
        if (AO() && this.LLD) {
            InterfaceC45540Hu4 LJLJJLL = LJLJJLL();
            if (LJLJJLL != null) {
                LJLJJLL.unRegisterActivityOnKeyDownListener(LJJLJLI());
            }
            this.LLD = false;
        }
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
        if (AO() && !this.LLD) {
            InterfaceC45540Hu4 LJLJJLL = LJLJJLL();
            if (LJLJJLL != null) {
                LJLJJLL.registerActivityOnKeyDownListenerHead(LJJLJLI());
            }
            this.LLD = true;
        }
    }

    @Override // X.InterfaceC82129WLd
    public /* bridge */ /* synthetic */ LiveEvent HD() {
        return this.LLFFF;
    }

    @Override // X.InterfaceC82129WLd
    public LiveEvent<Boolean> bL() {
        return this.LLFZ;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC82129WLd getApiComponent() {
        return this.LLIIIL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLJI;
    }

    private final void LLIIIL(String str) {
        boolean LLJJIJI = LLJJIJI(str);
        if (o.LJ(str, "recover")) {
            getPlanCUIApiComponent().MF(LLJJIJI);
        } else if (o.LJ(str, "key_back")) {
            getPlanCUIApiComponent().MF(false);
        } else if (!o.LJ(getPlanCUIApiComponent().g2().LIZJ(), Boolean.valueOf(LLJJIJI))) {
            getPlanCUIApiComponent().MF(LLJJIJI);
        }
        if (LLJJIJI) {
            LinearLayout linearLayout = LJLLL().LLI;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                return;
            } else {
                o.LJIJI("stickerBarCanRemove");
                throw null;
            }
        }
        LinearLayout linearLayout2 = LJLLL().LLI;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        } else {
            o.LJIJI("stickerBarCanRemove");
            throw null;
        }
    }

    private final boolean LLJJIJI(String str) {
        boolean z;
        Effect effect;
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        IDH LLLF;
        List<TGT> LIZ;
        I0N LLF = LLF();
        Effect effect2 = null;
        if (LLF != null && (LLLF = LLF.LLLF()) != null && (LIZ = LLLF.LIZ()) != null && (!o.LJ(str, "click_icon"))) {
            ArrayList arrayList = new ArrayList();
            for (TGT tgt : LIZ) {
                if (!(tgt instanceof C81663W3f)) {
                    arrayList.add(tgt);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((TGT) it.next()).LLIIIJ()) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        if (!o.LJ(str, "click_icon")) {
            I0N LLF2 = LLF();
            if (LLF2 != null) {
                F4V LLLIIII = LLF2.LLLIIII(WWN.INSTANCE);
                if (!(LLLIIII instanceof BackgroundVideoStickerPresenter)) {
                    LLLIIII = null;
                }
                BackgroundVideoStickerPresenter backgroundVideoStickerPresenter = (BackgroundVideoStickerPresenter) LLLIIII;
                if (backgroundVideoStickerPresenter != null && (mutableLiveData2 = backgroundVideoStickerPresenter.LJLLILLLL) != null && o.LJ(mutableLiveData2.getValue(), Boolean.TRUE)) {
                    return true;
                }
            }
            I0N LLF3 = LLF();
            if (LLF3 != null) {
                F4V LLLIIII2 = LLF3.LLLIIII(WWO.INSTANCE);
                if (!(LLLIIII2 instanceof DynamicSelectorHandler)) {
                    LLLIIII2 = null;
                }
                DynamicSelectorHandler dynamicSelectorHandler = (DynamicSelectorHandler) LLLIIII2;
                if (dynamicSelectorHandler != null && (mutableLiveData = dynamicSelectorHandler.LJLLILLLL) != null && o.LJ(mutableLiveData.getValue(), Boolean.TRUE)) {
                    return true;
                }
            }
            I0N LLF4 = LLF();
            if (LLF4 != null) {
                effect = C82398WVm.LIZJ(LLF4);
            } else {
                effect = null;
            }
            if (ID0.LJIIIZ(effect)) {
                return true;
            }
            I0N LLF5 = LLF();
            if (LLF5 != null) {
                effect2 = C82398WVm.LIZJ(LLF5);
            }
            C44946HkU LIZ2 = C79260V8u.LIZ(effect2, true);
            if (LIZ2 != null && LIZ2.LJLILLLLZI) {
                return true;
            }
        }
        return z;
    }

    @Override // X.InterfaceC82129WLd
    public void Jd0(boolean z) {
        int i;
        if (z) {
            WW1 LJLLL = LJLLL();
            AqS180S0100000_14 aqS180S0100000_14 = new AqS180S0100000_14(this, 242);
            View view = LJLLL.LJLJLJ;
            if (view != null) {
                aqS180S0100000_14.invoke(view);
                return;
            } else {
                o.LJIJI("stickerToolUp");
                throw null;
            }
        }
        if (C44363Hb5.LIZ()) {
            i = 25;
        } else {
            i = 40;
        }
        int LIZIZ = C7MY.LIZIZ(i);
        Boolean LIZ = getPlanCUIApiComponent().RH().LIZ();
        o.LJIIIIZZ(LIZ, "planCUIApiComponent.relayoutEvent.value");
        int LIZ2 = C1549666i.LIZ(LIZ.booleanValue()) + LIZIZ;
        WW1 LJLLL2 = LJLLL();
        AqS38S0001000_14 aqS38S0001000_14 = new AqS38S0001000_14(LIZ2, 10);
        View view2 = LJLLL2.LJLJLJ;
        if (view2 != null) {
            aqS38S0001000_14.invoke(view2);
        } else {
            o.LJIJI("stickerToolUp");
            throw null;
        }
    }

    public final void LJJLIIIJLLLLLLLZ(ExceptionResult exceptionResult) {
        Integer num;
        int i;
        if (exceptionResult != null) {
            num = Integer.valueOf(exceptionResult.getErrorCode());
            if (num != null) {
                if (num.intValue() == 2003) {
                    i = R.string.eh_;
                } else if (num.intValue() == 2006) {
                    i = R.string.tg4;
                }
                C24540xm.LIZ(i, C78688UuS.LJIJJ(this), 3056);
            }
        } else {
            num = null;
        }
        if (num == null || (num.intValue() != 2004 && num.intValue() != 2002)) {
            int i2 = T37.LIZ[C74216TAu.LIZIZ.LJII().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    i = R.string.g85;
                } else {
                    i = R.string.dtd;
                }
            } else {
                i = R.string.dtf;
            }
        } else {
            i = R.string.fyi;
        }
        C24540xm.LIZ(i, C78688UuS.LJIJJ(this), 3056);
    }

    public final boolean LLIFFJFJJ(int i) {
        if (i == 4 && AO() && LJLLL().isVisible()) {
            getPlanCUIApiComponent().MF(LLJJIJIL(this, null, 1, null));
            C82130WLe.LIZ(this, false, true, false, "key_back", false, 44);
            I0N LLF = LLF();
            if (LLF != null) {
                C82398WVm.LJI(LLF, null);
            }
            return true;
        }
        return false;
    }

    public final boolean LLILZIL(Effect effect) {
        boolean z;
        String extra;
        boolean z2 = true;
        if (C43416H2e.LIZ() && (((effect instanceof MobileEffect) && ((MobileEffect) effect).getModerationStatus() != 3) || (effect instanceof ProTemplateEffect) || (effect instanceof DraftEffect))) {
            z = true;
        } else {
            z = false;
        }
        if (effect != null && (extra = effect.getExtra()) != null && extra.length() > 0) {
            if (!z && !new JSONObject(extra).optBoolean("forbid_favorite")) {
                z2 = false;
            }
            return z2;
        }
        return z;
    }

    public final void LLILZLL(ViewGroup viewGroup) {
        View recordButtonMock = viewGroup.findViewById(R.id.kiz);
        o.LJIIIIZZ(recordButtonMock, "recordButtonMock");
        C26338AVi.LJI(recordButtonMock, 0, 0, 0, AnonymousClass391.LIZJ(8), false, 16);
        View findViewById = viewGroup.findViewById(R.id.kj1);
        View findViewById2 = findViewById.findViewById(R.id.kj0);
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.f9n);
        findViewById2.getLayoutParams().width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
        findViewById2.getLayoutParams().height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
        C26338AVi.LJI(findViewById2, 0, 0, 0, 0, false, 16);
        findViewById2.setBackgroundResource(R.drawable.c5t);
        imageView.setImageResource(R.drawable.vl);
    }

    public final void LLJ(boolean z) {
        SafeHandler LLLZI;
        I0N LLF = LLF();
        if (LLF != null && (LLLZI = LLF.LLLZI()) != null) {
            LLLZI.post(new ARunnableS20S0110000_14(this, z, 4));
        }
    }

    @Override // X.InterfaceC82129WLd
    public void lA(boolean z) {
        if (z && this.LLFF && this.LLF) {
            I0N LLF = LLF();
            if ((LLF != null && C82398WVm.LIZJ(LLF) != null) || o.LJ(LJLZ().LJIIZILJ, C77378UYk.LIZ)) {
                C82130WLe.LIZ(this, true, false, false, "recover", true, 14);
            } else if (!AO()) {
                getBottomTabApiComponent().showBottomTab(true);
            }
            this.LLF = false;
        }
    }

    public C82410WVy(WMH parentScene, int i, C82622Wbi diContainer) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = parentScene;
        this.LJLILLLLZI = i;
        this.LJLJI = diContainer;
        this.LJLJJI = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), InterfaceC45967I2h.class, null);
        this.LJLJL = UCI.LJII(getDiContainer(), I0N.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), InterfaceC45925I0r.class, null);
        this.LJLJLLL = UCI.LJI(getDiContainer(), InterfaceC45999I3n.class, null);
        this.LJLL = UCI.LJI(getDiContainer(), InterfaceC45889Hzh.class, null);
        this.LJLLI = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LJLLILLLL = UCI.LJII(getDiContainer(), InterfaceC82353WTt.class, null);
        this.LJLLJ = UCI.LJII(getDiContainer(), InterfaceC74343TFr.class, null);
        this.LJLLL = UCI.LJII(getDiContainer(), WTU.class, null);
        this.LJLLLL = UCI.LJII(getDiContainer(), TK3.class, null);
        this.LJLLLLLL = UCI.LJI(getDiContainer(), THX.class, null);
        this.LJLZ = UCI.LJII(getDiContainer(), InterfaceC81634W2c.class, null);
        this.LJZ = UCI.LJII(getDiContainer(), InterfaceC82325WSr.class, null);
        this.LJZI = UCI.LJII(getDiContainer(), I3K.class, null);
        this.LJZL = UCI.LJII(getDiContainer(), Activity.class, null);
        this.LL = new ArrayList();
        this.LLFFF = new C29901Fi<>();
        C29901Fi<Boolean> c29901Fi = new C29901Fi<>();
        this.LLFII = c29901Fi;
        this.LLFZ = c29901Fi;
        this.LLI = new C73318Sq2();
        this.LLIFFJFJJ = new AObjectS89S0100000_14(this, 368);
        this.LLII = C221108m2.LIZIZ(new AqS164S0100000_14(this, 231));
        this.LLIIII = C221108m2.LIZIZ(new AqS164S0100000_14(this, 233));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 230));
        this.LLIIIJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 228));
        this.LLIIIL = this;
        this.LLIIIZ = new ARunnableS50S0100000_14(this, 119);
    }

    public static /* synthetic */ void LLIILZL(C82410WVy c82410WVy, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        c82410WVy.LLIIIL(str);
    }

    public static /* synthetic */ boolean LLJJIJIL(C82410WVy c82410WVy, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c82410WVy.LLJJIJI(str);
    }

    @Override // X.InterfaceC82129WLd
    public void Vt0(boolean z, boolean z2, boolean z3, boolean z4, String enterMethod, boolean z5) {
        InterfaceC82353WTt gestureApiComponent;
        SafeHandler LLLZI;
        Effect effect;
        TEZ LLLLL;
        InterfaceC74393THp LJJJJLL;
        InterfaceC74443TJn LJIJ;
        String str;
        Effect LIZJ;
        InterfaceC82353WTt gestureApiComponent2;
        SafeHandler LLLZI2;
        boolean z6;
        Effect effect2;
        IDH LLLF;
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LLFII.LJII(Boolean.valueOf(z));
        if (z == AO()) {
            return;
        }
        boolean z7 = false;
        int i = -1;
        if (z) {
            I0N LLF = LLF();
            if (LLF != null && (LLLF = LLF.LLLF()) != null) {
                LLLF.bb(false);
            }
            LLILL();
            this.LLFF = true;
            if (z4) {
                i = 0;
            }
            long currentTimeMillis = System.currentTimeMillis();
            WW1 LJLLL = LJLLL();
            if (LJLLL.LLJJIJIL()) {
                LJLLL.LLJLLIL(i, currentTimeMillis, true);
            }
            WWJ LJLZ = LJLZ();
            LJLZ.getClass();
            LJLZ.LJIL = enterMethod;
            LJLZ.LJJ = true;
            if (enterMethod.length() > 0) {
                LJLZ.LJIJJLI = System.currentTimeMillis();
            }
            if ((!((ArrayList) LJLZ.LJIILIIL).isEmpty()) && (LJLZ.LIZ() || LJLZ.LIZIZ())) {
                Effect first = LJLZ.LJFF().getFirst();
                if (o.LJ(enterMethod, "recover")) {
                    TEZ tez = LJLZ.LJ;
                    if (tez != null) {
                        effect2 = tez.LJJIIZI();
                    } else {
                        effect2 = null;
                    }
                    if (o.LJ(effect2, first)) {
                        z6 = true;
                        WW0.LJIIIZ(LJLZ, z6, true, enterMethod, 17);
                        LJLZ.LJJ = false;
                    }
                }
                z6 = false;
                WW0.LJIIIZ(LJLZ, z6, true, enterMethod, 17);
                LJLZ.LJJ = false;
            } else {
                LJLZ.LIZJ();
                LJLZ.LIZIZ.LLJJIII(TEN.NONE);
                WW1.LLJJI(LJLZ.LIZIZ, (List) LJLZ.LJJII.getValue(), null, null, true, false, enterMethod, false, 86);
            }
            LJJZZIII().setEffectContainerVisibility(8);
            getBottomTabApiComponent().showBottomTab(false);
            if (!this.LLD) {
                InterfaceC45540Hu4 LJLJJLL = LJLJJLL();
                if (LJLJJLL != null) {
                    LJLJJLL.registerActivityOnKeyDownListenerHead(LJJLJLI());
                }
                this.LLD = true;
            }
            if (enterMethod.length() > 0 && !o.LJ(enterMethod, "recover")) {
                ShortVideoContext shortVideoContext = getShortVideoContext();
                o.LJIIIZ(shortVideoContext, "shortVideoContext");
                C78880UxY.LJJLIIIJL("prop_carousel_show", C78880UxY.LJIJJLI(shortVideoContext, new OSZ("enter_method", enterMethod)));
            }
            I0N LLF2 = LLF();
            if (LLF2 != null && (LLLZI2 = LLF2.LLLZI()) != null) {
                LLLZI2.removeCallbacks(this.LLIIIZ);
            }
            getShortVideoContext().isCarouselOpen = true;
            if (C53558L0g.LIZIZ().supportLeftRightGesture && (gestureApiComponent2 = getGestureApiComponent()) != null) {
                WTL.LIZ(gestureApiComponent2, true);
            }
            if (C53558L0g.LIZIZ().supportShowFavouriteList) {
                I0N LLF3 = LLF();
                if (LLF3 != null && (LLLLL = LLF3.LLLLL()) != null && (LJJJJLL = LLLLL.LJJJJLL()) != null && (LJIJ = LJJJJLL.LJIJ()) != null) {
                    I0N LLF4 = LLF();
                    if (LLF4 != null && (LIZJ = C82398WVm.LIZJ(LLF4)) != null) {
                        str = LIZJ.getEffectId();
                    } else {
                        str = null;
                    }
                    if (LJIJ.LJJJLL(str)) {
                        z7 = true;
                    }
                }
                WW1 LJLLL2 = LJLLL();
                I0N LLF5 = LLF();
                if (LLF5 != null) {
                    effect = C82398WVm.LIZJ(LLF5);
                } else {
                    effect = null;
                }
                LJLLL2.LLJJ(z7, LLILZIL(effect));
            }
            LLIIIL(enterMethod);
        } else {
            if (enterMethod.length() > 0) {
                ShortVideoContext shortVideoContext2 = getShortVideoContext();
                o.LJIIIZ(shortVideoContext2, "shortVideoContext");
                C78880UxY.LJJLIIIJL("click_prop_carousel_exit", C78880UxY.LJIJJLI(shortVideoContext2, new OSZ[0]));
            }
            WW1 LJLLL3 = LJLLL();
            if (LJLLL3.LLJJIJIL()) {
                if (z2) {
                    LJLLL3.LLIIL = null;
                }
                LJLLL3.LLJLLIL(-1, -1L, false);
            }
            if (z3) {
                LJJZZIII().setEffectContainerVisibility(0);
                if (getShortVideoContext().LIZIZ().size() == 0) {
                    getBottomTabApiComponent().showBottomTab(true);
                }
            }
            if (this.LLD) {
                InterfaceC45540Hu4 LJLJJLL2 = LJLJJLL();
                if (LJLJJLL2 != null) {
                    LJLJJLL2.unRegisterActivityOnKeyDownListener(LJJLJLI());
                }
                this.LLD = false;
            }
            this.LL.clear();
            if (z5) {
                I0N LLF6 = LLF();
                if (LLF6 != null && (LLLZI = LLF6.LLLZI()) != null) {
                    LLLZI.postDelayed(this.LLIIIZ, 1000L);
                }
            } else {
                getShortVideoContext().isCarouselOpen = false;
            }
            if (C53558L0g.LIZIZ().supportLeftRightGesture && (gestureApiComponent = getGestureApiComponent()) != null) {
                WTL.LIZ(gestureApiComponent, false);
            }
        }
        this.LLFFF.LJII(Boolean.valueOf(z));
    }
}
