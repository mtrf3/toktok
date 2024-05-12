package X;

import Y.ALAdapterS0S0110001_14;
import Y.AObjectS89S0100000_14;
import Y.AUListenerS101S0100000_14;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.animation.Animation;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WUV extends AbstractC29891Fh<InterfaceC45995I3j> implements InterfaceC45995I3j, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIILZL;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final InterfaceC79002UzW LJLJJI;
    public final InterfaceC45995I3j LJLJJL;
    public final C40871j1<Boolean> LJLJJLL;
    public final C40871j1<Boolean> LJLJL;
    public final C40871j1<Long> LJLJLJ;
    public final C40871j1<Boolean> LJLJLLL;
    public final C40871j1<Boolean> LJLL;
    public final C40871j1<OSZ<List<TimeSpeedModelExtension>, Long>> LJLLI;
    public final C40871j1<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LJLLILLLL;
    public final C40871j1<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LJLLJ;
    public final C40871j1<Integer> LJLLL;
    public final C40871j1<RetakeVideoContext> LJLLLL;
    public final C40871j1<OSZ<List<TimeSpeedModelExtension>, Long>> LJLLLLLL;
    public final C40871j1<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LJLZ;
    public final ActivityC45651qj LJZ;
    public final InterfaceC115514g7 LJZI;
    public final InterfaceC82353WTt LJZL;
    public final InterfaceC115514g7 LL;
    public final InterfaceC115514g7 LLD;
    public final InterfaceC115514g7 LLF;
    public final InterfaceC115514g7 LLFF;
    public final InterfaceC115514g7 LLFFF;
    public final InterfaceC115514g7 LLFII;
    public final InterfaceC115514g7 LLFZ;
    public final InterfaceC115514g7 LLI;
    public final InterfaceC46211IBr LLIFFJFJJ;
    public final C5H3 LLII;
    public String LLIIII;
    public final C73318Sq2 LLIIIILZ;
    public final int LLIIIJ;
    public Animator LLIIIL;
    public final C5H3 LLIIIZ;
    public final C29901Fi<C76800UCe> LLIIJI;
    public final C29901Fi<C76800UCe> LLIIJLIL;
    public final WUW LLIIL;
    public boolean LLIILII;

    static {
        TBT tbt = new TBT(WUV.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIILZL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(WUV.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(WUV.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(WUV.class, "recordControlApi", "getRecordControlApi()Lcom/ss/android/ugc/aweme/shortvideo/recordcontrol/TikTokRecordControlApi;", 0, c65351Pkp), C61845OOz.LIZJ(WUV.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(WUV.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0, c65351Pkp), C61845OOz.LIZJ(WUV.class, "nowSwitcherApi", "getNowSwitcherApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0, c65351Pkp), C61845OOz.LIZJ(WUV.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(WUV.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp)};
    }

    private final InterfaceC82325WSr LJJLIIIIJ() {
        return (InterfaceC82325WSr) this.LLFII.LIZ(this, LLIILZL[6]);
    }

    private final long LJJLIIIJJI() {
        return ((Number) this.LLIIIZ.getValue()).longValue();
    }

    private final I3K getSplitShootApiComponent() {
        return (I3K) this.LLFZ.LIZ(this, LLIILZL[7]);
    }

    public final ActivityC45651qj LJJLI() {
        return (ActivityC45651qj) this.LLFFF.LIZ(this, LLIILZL[5]);
    }

    public final I3K LJJLIIIJILLIZJL() {
        return (I3K) this.LLII.getValue();
    }

    @Override // X.InterfaceC45995I3j
    public void LLILIL() {
        this.LLIIL.LLILIL();
    }

    @Override // X.InterfaceC45995I3j
    public void LLLLII() {
        this.LLIIL.LLLLII();
    }

    @Override // X.InterfaceC45995I3j
    public void LLLLIILL() {
        this.LLIIL.LLLLIILL();
    }

    @Override // X.InterfaceC45995I3j
    public void Lp0() {
        this.LLIIL.LJJLIIIJLJLI();
    }

    public final InterfaceC45979I2t getBottomTabApiComponent() {
        return (InterfaceC45979I2t) this.LL.LIZ(this, LLIILZL[1]);
    }

    public final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LLD.LIZ(this, LLIILZL[2]);
    }

    public final InterfaceC45999I3n getPlanCUIApiComponent() {
        return (InterfaceC45999I3n) this.LJZI.LIZ(this, LLIILZL[0]);
    }

    public final InterfaceC45967I2h getRecordControlApi() {
        return (InterfaceC45967I2h) this.LLF.LIZ(this, LLIILZL[3]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLFF.LIZ(this, LLIILZL[4]);
    }

    public final I0N getStickerApiComponent() {
        return (I0N) this.LLI.LIZ(this, LLIILZL[8]);
    }

    @Override // X.InterfaceC45995I3j
    public int q() {
        return this.LLIIL.q();
    }

    public final long LJJLIIIJJIZ() {
        if (getShortVideoContext().LJJIJIIJI()) {
            return 3000L;
        }
        if (getShortVideoContext().cameraComponentModel.isRetakeMode) {
            return getShortVideoContext().cameraComponentModel.mRetakeDuration;
        }
        return LJJLIIIJJI();
    }

    @Override // X.InterfaceC45995I3j
    public void RV() {
        if (getShortVideoContext().LJJIIJZLJL()) {
            this.LLIIL.LJJLJ(0.2f);
        } else {
            this.LLIIL.LJJLJ(1.0f);
        }
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        IAO LLLLZ;
        C0IB<WS0> bottomTabIndexChangeEvent;
        C0IB<String> pe0;
        LiveEvent<WSA> Po;
        Long l;
        LiveEvent<Boolean> Ai0;
        C0IB<Boolean> Et;
        LiveEvent<Boolean> O80;
        LiveEvent<C76800UCe> xU;
        super.onCreate();
        this.LJLILLLLZI.add(this.LJLJI, this.LLIIL.getScene(), this.LLIIL.LJJLIIJ());
        this.LJLJJLL.LIZIZ(this, new AObjectS89S0100000_14(this, 319));
        if (W2U.LIZ()) {
            I0N stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent != null && (xU = stickerApiComponent.xU()) != null) {
                xU.LIZLLL(this, new AObjectS89S0100000_14(this, 328));
            }
            getRecordControlApi().isRecording().LIZIZ(this, new AObjectS89S0100000_14(this, 330));
            getRecordControlApi().zg(HKF.class, new C82360WUa(this));
            I0N stickerApiComponent2 = getStickerApiComponent();
            if (stickerApiComponent2 != null && (O80 = stickerApiComponent2.O80()) != null) {
                O80.LIZLLL(this, new AObjectS89S0100000_14(this, 331));
            }
        }
        this.LJLJL.LIZIZ(this, new AObjectS89S0100000_14(this, 305));
        InterfaceC45999I3n planCUIApiComponent = getPlanCUIApiComponent();
        if (planCUIApiComponent != null && (Et = planCUIApiComponent.Et()) != null) {
            Et.LIZIZ(this, new AObjectS89S0100000_14(this, 307));
        }
        InterfaceC45999I3n planCUIApiComponent2 = getPlanCUIApiComponent();
        if (planCUIApiComponent2 != null && (Ai0 = planCUIApiComponent2.Ai0()) != null) {
            Ai0.LIZLLL(this, new AObjectS89S0100000_14(this, 309));
        }
        getRecordControlApi().Vh().LIZLLL(this, new AObjectS89S0100000_14(this, 311));
        getRecordControlApi().fb0().LIZLLL(this, new AObjectS89S0100000_14(this, 306));
        getRecordControlApi().Qr0().LIZLLL(this, new AObjectS89S0100000_14(this, 308));
        getRecordControlApi().aL().LIZLLL(this, new AObjectS89S0100000_14(this, 310));
        getRecordControlApi().kX().LIZLLL(this, new AObjectS89S0100000_14(this, 312));
        getRecordControlApi().w90().LIZLLL(this, new AObjectS89S0100000_14(this, 313));
        getRecordControlApi().ck0().LIZLLL(this, new AObjectS89S0100000_14(this, 314));
        getRecordControlApi().aa0().LIZLLL(this, new AObjectS89S0100000_14(this, 315));
        getRecordControlApi().oy().LIZLLL(this, new AObjectS89S0100000_14(this, 316));
        getRecordControlApi().Gg0().LIZLLL(this, new AObjectS89S0100000_14(this, 317));
        getCameraApiComponent().bh().LIZIZ(this, new AObjectS89S0100000_14(this, 318));
        getRecordControlApi().dy().LIZIZ(this, new AObjectS89S0100000_14(this, 320));
        if (getShortVideoContext().cameraComponentModel.isRetakeMode && getShortVideoContext().LJIILL() != null && getShortVideoContext().LJIILL().stitchParams != null) {
            getShortVideoContext().LJIJJLI(getShortVideoContext().LJIILL().stitchParams);
        }
        if (getShortVideoContext().LJJIJIIJI() && getShortVideoContext().stitchContext.stitchClip != null) {
            LLLLZ = IAO.LLLLZIL(getShortVideoContext().LJII(), getShortVideoContext().LJIIIIZZ(), getShortVideoContext().stitchContext.stitchClip);
        } else {
            LLLLZ = IAO.LLLLZ(getShortVideoContext().LJIIIIZZ(), getShortVideoContext().LJII(), true);
        }
        getRecordControlApi().mv(LLLLZ);
        if (getShortVideoContext().LJJIJIIJI()) {
            long j = getShortVideoContext().cameraComponentModel.mMaxDuration;
            StitchParams stitchParams = getShortVideoContext().stitchContext.stitchParams;
            if (stitchParams != null) {
                l = Long.valueOf(stitchParams.getDuration());
            } else {
                l = null;
            }
            o.LJI(l);
            getRecordControlApi().vK(new C44302Ha6(l.longValue() + j));
        } else {
            getRecordControlApi().vK(new C44302Ha6(getShortVideoContext().cameraComponentModel.mMaxDuration));
        }
        getCameraApiComponent().md0().LIZLLL(this, new AObjectS89S0100000_14(this, 321));
        getCameraApiComponent().M70().LIZLLL(this, new AObjectS89S0100000_14(this, 322));
        InterfaceC82353WTt interfaceC82353WTt = this.LJZL;
        if (interfaceC82353WTt != null) {
            interfaceC82353WTt.Ef0(new WUY(this));
        }
        getRecordControlApi().qu0().LIZLLL(this, new AObjectS89S0100000_14(this, 323));
        getRecordControlApi().Fh0().LIZLLL(this, new AObjectS89S0100000_14(this, 324));
        getRecordControlApi().kX().LIZLLL(this, C82364WUe.LJLIL);
        getRecordControlApi().Rr0().LIZLLL(this, new AObjectS89S0100000_14(this, 325));
        InterfaceC82325WSr LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ != null && (Po = LJJLIIIIJ.Po()) != null) {
            Po.LIZLLL(this, new AObjectS89S0100000_14(this, 326));
        }
        I3K splitShootApiComponent = getSplitShootApiComponent();
        if (splitShootApiComponent != null && (pe0 = splitShootApiComponent.pe0()) != null) {
            pe0.LIZIZ(this, new AObjectS89S0100000_14(this, 327));
        }
        InterfaceC45979I2t bottomTabApiComponent = getBottomTabApiComponent();
        if (bottomTabApiComponent != null && (bottomTabIndexChangeEvent = bottomTabApiComponent.getBottomTabIndexChangeEvent()) != null) {
            bottomTabIndexChangeEvent.LIZIZ(this, new AObjectS89S0100000_14(this, 329));
        }
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        this.LLIIIILZ.dispose();
    }

    @Override // X.InterfaceC45995I3j
    public /* bridge */ /* synthetic */ LiveEvent ES() {
        return this.LLIIJI;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC45995I3j getApiComponent() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC45995I3j
    public /* bridge */ /* synthetic */ LiveEvent pj0() {
        return this.LLIIJLIL;
    }

    @Override // X.InterfaceC45995I3j
    public boolean um0() {
        return this.LLIILII;
    }

    @Override // X.InterfaceC45995I3j
    public void BW(OSJ<? extends List<? extends TimeSpeedModelExtension>, Long, ? extends TimeSpeedModelExtension> value) {
        o.LJIIIZ(value, "value");
        this.LJLLJ.LJI(value);
    }

    @Override // X.InterfaceC45995I3j
    public void F0(int i) {
        this.LLIIL.F0(i);
    }

    public final void LJJLIIIJLLLLLLLZ(long j) {
        this.LJLJLJ.LJI(Long.valueOf(j));
    }

    public final void LJJLIIJ(boolean z) {
        this.LJLL.LJI(Boolean.valueOf(z));
    }

    public final void LJJLJ(IAO iao) {
        TimeSpeedModelExtension timeSpeedModelExtension = iao.LJLJI;
        if (timeSpeedModelExtension != null) {
            o.LJIIIIZZ(timeSpeedModelExtension, "ev.stitchClip");
            if (!C76917UGr.LJJJJ(timeSpeedModelExtension)) {
                if (getShortVideoContext().cameraComponentModel.isRetakeMode) {
                    t6(new OSJ<>(iao.LJLIL, Long.valueOf(iao.LJLILLLLZI), iao.LJLJI));
                    return;
                } else {
                    O5(new OSJ<>(iao.LJLIL, Long.valueOf(iao.LJLILLLLZI), iao.LJLJI));
                    return;
                }
            }
        }
        if (getShortVideoContext().cameraComponentModel.isRetakeMode) {
            Q0(new OSZ<>(iao.LJLIL, Long.valueOf(iao.LJLILLLLZI)));
        } else {
            e6(new OSZ<>(iao.LJLIL, Long.valueOf(iao.LJLILLLLZI)));
        }
    }

    @Override // X.InterfaceC45995I3j
    public void LJJZ(boolean z) {
        this.LLIIL.LJJZ(z);
    }

    @Override // X.InterfaceC45995I3j
    public void LLJILLL(Animation value) {
        o.LJIIIZ(value, "value");
        this.LLIIL.LLJILLL(value);
    }

    @Override // X.InterfaceC45995I3j
    public void LLLLLLLLLL(boolean z) {
        this.LLIIL.LLLLLLLLLL(z);
    }

    @Override // X.InterfaceC45995I3j
    public void LLLLLLZZ(boolean z) {
        this.LLIILII = z;
        this.LLIIL.LLLLLLZZ(z);
    }

    @Override // X.InterfaceC45995I3j
    public void LLLLLZ(int i) {
        this.LLIIL.LLLLLZ(i);
    }

    @Override // X.InterfaceC45995I3j
    public void M3(int i) {
        this.LJLLL.LJI(Integer.valueOf(i));
    }

    @Override // X.InterfaceC45995I3j
    public void Mp(boolean z) {
        float f;
        Animator animator = this.LLIIIL;
        if (animator != null) {
            animator.cancel();
        }
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 1.0f - f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new AUListenerS101S0100000_14(this, 18));
        ofFloat.addListener(new ALAdapterS0S0110001_14(this, f, z, 2));
        this.LLIIIL = ofFloat;
        ofFloat.start();
    }

    @Override // X.InterfaceC45995I3j
    public void O5(OSJ<? extends List<? extends TimeSpeedModelExtension>, Long, ? extends TimeSpeedModelExtension> value) {
        o.LJIIIZ(value, "value");
        this.LJLLILLLL.LJI(value);
    }

    @Override // X.InterfaceC45995I3j
    public void Q0(OSZ<? extends List<? extends TimeSpeedModelExtension>, Long> value) {
        o.LJIIIZ(value, "value");
        this.LJLLLLLL.LJI(value);
    }

    @Override // X.InterfaceC45995I3j
    public void e6(OSZ<? extends List<? extends TimeSpeedModelExtension>, Long> value) {
        o.LJIIIZ(value, "value");
        this.LJLLI.LJI(value);
    }

    @Override // X.InterfaceC45995I3j
    public void f(int i) {
        this.LLIIL.f(i);
    }

    @Override // X.InterfaceC45995I3j
    public void g7(Long l) {
        if (l != null) {
            this.LLIIL.g7(l);
        }
    }

    @Override // X.InterfaceC45995I3j
    public void h(int i) {
        this.LLIIL.h(i);
    }

    @Override // X.InterfaceC45995I3j
    public void h5(RetakeVideoContext value) {
        o.LJIIIZ(value, "value");
        this.LJLLLL.LJI(value);
    }

    @Override // X.InterfaceC45995I3j
    public void i7(boolean z) {
        this.LJLJJLL.LJI(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC45995I3j
    public void l(int i) {
        this.LLIIL.l(i);
    }

    @Override // X.InterfaceC45995I3j
    public void s3(boolean z) {
        String str;
        boolean z2;
        WSF currentBottomTabItemBeforeOnTabChanged;
        InterfaceC45979I2t bottomTabApiComponent = getBottomTabApiComponent();
        if (bottomTabApiComponent != null && (currentBottomTabItemBeforeOnTabChanged = bottomTabApiComponent.getCurrentBottomTabItemBeforeOnTabChanged()) != null) {
            str = currentBottomTabItemBeforeOnTabChanged.LIZIZ;
        } else {
            str = null;
        }
        boolean LJ = o.LJ(str, I38.LIVE.getTag());
        if (z && !LJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJLJL.LJI(Boolean.valueOf(z2));
    }

    @Override // X.InterfaceC45995I3j
    public void t6(OSJ<? extends List<? extends TimeSpeedModelExtension>, Long, ? extends TimeSpeedModelExtension> value) {
        o.LJIIIZ(value, "value");
        this.LJLZ.LJI(value);
    }

    @Override // X.InterfaceC45995I3j
    public void LLLIL(int i, boolean z) {
        this.LLIIL.LLLIL(i, z);
    }

    @Override // X.InterfaceC45995I3j
    public void z0(MotionEvent motionEvent, float f, float f2) {
        this.LLIIL.z0(motionEvent, f, f2);
    }

    public WUV(C82622Wbi diContainer, WMH parentScene, int i, InterfaceC79002UzW recordControlProgressSceneFactory) {
        C0IB<Boolean> c0ib;
        C0IB<Boolean> c0ib2;
        C0IB<ScaleGestureDetector> c0ib3;
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(recordControlProgressSceneFactory, "recordControlProgressSceneFactory");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = recordControlProgressSceneFactory;
        this.LJLJJL = this;
        Boolean bool = Boolean.TRUE;
        this.LJLJJLL = new C40871j1<>(bool);
        this.LJLJL = new C40871j1<>(bool);
        C40871j1<Long> c40871j1 = new C40871j1<>(0L);
        this.LJLJLJ = c40871j1;
        C40871j1<Boolean> c40871j12 = new C40871j1<>(bool);
        this.LJLJLLL = c40871j12;
        C40871j1<Boolean> c40871j13 = new C40871j1<>(bool);
        this.LJLL = c40871j13;
        C0IB<WXG> c0ib4 = null;
        C40871j1<OSZ<List<TimeSpeedModelExtension>, Long>> c40871j14 = new C40871j1<>(null);
        this.LJLLI = c40871j14;
        C40871j1<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> c40871j15 = new C40871j1<>(null);
        this.LJLLILLLL = c40871j15;
        this.LJLLJ = new C40871j1<>(null);
        C40871j1<Integer> c40871j16 = new C40871j1<>(-1);
        this.LJLLL = c40871j16;
        C40871j1<RetakeVideoContext> c40871j17 = new C40871j1<>(null);
        this.LJLLLL = c40871j17;
        C40871j1<OSZ<List<TimeSpeedModelExtension>, Long>> c40871j18 = new C40871j1<>(null);
        this.LJLLLLLL = c40871j18;
        C40871j1<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> c40871j19 = new C40871j1<>(null);
        this.LJLZ = c40871j19;
        this.LJZ = (ActivityC45651qj) getDiContainer().LJ(ActivityC45651qj.class, null);
        this.LJZI = UCI.LJII(getDiContainer(), InterfaceC45999I3n.class, null);
        InterfaceC82353WTt interfaceC82353WTt = (InterfaceC82353WTt) getDiContainer().LJIIIIZZ(null, InterfaceC82353WTt.class);
        this.LJZL = interfaceC82353WTt;
        this.LL = UCI.LJII(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LLD = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LLF = UCI.LJI(getDiContainer(), InterfaceC45967I2h.class, null);
        this.LLFF = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LLFFF = UCI.LJI(getDiContainer(), ActivityC45651qj.class, null);
        this.LLFII = UCI.LJII(getDiContainer(), InterfaceC82325WSr.class, null);
        this.LLFZ = UCI.LJII(getDiContainer(), I3K.class, null);
        this.LLI = UCI.LJII(getDiContainer(), I0N.class, null);
        this.LLIFFJFJJ = (InterfaceC46211IBr) getDiContainer().LJIIIIZZ(null, InterfaceC46211IBr.class);
        this.LLII = C221108m2.LIZ(EnumC221088m0.NONE, new AqS164S0100000_14(this, 224));
        this.LLIIIILZ = new C73318Sq2();
        this.LLIIIJ = 15000;
        this.LLIIIZ = C221108m2.LIZIZ(C82361WUb.LJLIL);
        C29901Fi<C76800UCe> c29901Fi = new C29901Fi<>();
        this.LLIIJI = c29901Fi;
        C29901Fi<C76800UCe> c29901Fi2 = new C29901Fi<>();
        this.LLIIJLIL = c29901Fi2;
        InterfaceC82086WJm cameraApiComponent = getCameraApiComponent();
        C82622Wbi diContainer2 = getDiContainer();
        InterfaceC45967I2h recordControlApi = getRecordControlApi();
        ShortVideoContext shortVideoContext = getShortVideoContext();
        InterfaceC45999I3n planCUIApiComponent = getPlanCUIApiComponent();
        if (planCUIApiComponent != null) {
            c0ib = planCUIApiComponent.Na0();
        } else {
            c0ib = null;
        }
        InterfaceC45999I3n planCUIApiComponent2 = getPlanCUIApiComponent();
        if (planCUIApiComponent2 != null) {
            c0ib2 = planCUIApiComponent2.RH();
        } else {
            c0ib2 = null;
        }
        if (interfaceC82353WTt != null) {
            c0ib3 = interfaceC82353WTt.lh0();
            c0ib4 = interfaceC82353WTt.G00();
        } else {
            c0ib3 = null;
        }
        this.LLIIL = recordControlProgressSceneFactory.LIZLLL(new C79001UzV(cameraApiComponent, diContainer2, recordControlApi, shortVideoContext, c40871j1, c40871j12, c40871j14, c40871j15, c40871j16, c40871j17, c40871j18, c40871j19, c40871j13, c0ib, c0ib2, c0ib3, c0ib4, c29901Fi, c29901Fi2));
    }
}
