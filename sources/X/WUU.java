package X;

import Y.ALAdapterS0S0110001_14;
import Y.AObjectS89S0100000_14;
import Y.ARunnableS50S0100000_14;
import Y.AUListenerS101S0100000_14;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.RecordContext;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WUU extends AbstractC29891Fh<InterfaceC45891Hzj> implements InterfaceC45891Hzj, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLILLL;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public String LJLJJI;
    public final InterfaceC45891Hzj LJLJJL;
    public final C29901Fi<C76800UCe> LJLJJLL;
    public final C29901Fi<C76800UCe> LJLJL;
    public final C40871j1<Boolean> LJLJLJ;
    public final C40871j1<Boolean> LJLJLLL;
    public final C40871j1<Long> LJLL;
    public final C40871j1<Boolean> LJLLI;
    public final C40871j1<Boolean> LJLLILLLL;
    public final C40871j1<OSZ<List<TimeSpeedModelExtension>, Long>> LJLLJ;
    public final C40871j1<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LJLLL;
    public final C40871j1<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LJLLLL;
    public final C40871j1<Long> LJLLLLLL;
    public final C40871j1<Boolean> LJLZ;
    public final C46611sH<Integer> LJZ;
    public final C40871j1<Integer> LJZI;
    public final C40871j1<RetakeVideoContext> LJZL;
    public final C40871j1<OSZ<List<TimeSpeedModelExtension>, Long>> LL;
    public final C40871j1<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LLD;
    public final ActivityC45651qj LLF;
    public final InterfaceC115514g7 LLFF;
    public final InterfaceC115514g7 LLFFF;
    public final InterfaceC82353WTt LLFII;
    public final InterfaceC115514g7 LLFZ;
    public final InterfaceC115514g7 LLI;
    public final InterfaceC115514g7 LLIFFJFJJ;
    public final InterfaceC115514g7 LLII;
    public final InterfaceC46211IBr LLIIII;
    public final InterfaceC115514g7 LLIIIILZ;
    public final InterfaceC115514g7 LLIIIJ;
    public final InterfaceC115514g7 LLIIIL;
    public final InterfaceC115514g7 LLIIIZ;
    public final InterfaceC115514g7 LLIIJI;
    public final int LLIIJLIL;
    public final int LLIIL;
    public boolean LLIILII;
    public Animator LLIILZL;
    public WeakReference<TimeSpeedModelExtension> LLIIZ;
    public final C73318Sq2 LLIL;
    public final Integer[] LLILII;
    public final C5H3 LLILIL;
    public final C5H3 LLILL;
    public boolean LLILLIZIL;
    public final C5H3 LLILLJJLI;

    public final void LJLJLJ() {
        int i = 1;
        sJ(true);
        if (!C41669GWz.LIZ() && !V16.LJJLIIIJ(getShortVideoContext())) {
            i = 0;
        }
        bl0(i);
        getRecordControlApi().DG(HU0.class);
    }

    public final void LJLLILLLL() {
        sJ(false);
        bl0(0);
        getRecordControlApi().DG(HKF.class);
    }

    @Override // X.InterfaceC45891Hzj
    public void c6() {
        LLLIL(3, false);
        LJJLJ().LLILZLL = true;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        Iterator<TimeSpeedModelExtension> it = shortVideoContext.LJII().iterator();
        while (it.hasNext()) {
            shortVideoContext.LJJIJL(it.next());
        }
        HZ2.LIZ(getRecordControlApi(), false, 3);
        InterfaceC45967I2h recordControlApi = getRecordControlApi();
        I9L i9l = new I9L("reset progress");
        i9l.LIZ = 3;
        recordControlApi.hb0(i9l);
        LJJLIIIIJ();
    }

    static {
        TBT tbt = new TBT(WUU.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLILLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(WUU.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(WUU.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(WUU.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(WUU.class, "recordControlApi", "getRecordControlApi()Lcom/ss/android/ugc/aweme/shortvideo/recordcontrol/TikTokRecordControlApi;", 0, c65351Pkp), C61845OOz.LIZJ(WUU.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(WUU.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0, c65351Pkp), C61845OOz.LIZJ(WUU.class, "recordPermissionApiComponent", "getRecordPermissionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(WUU.class, "nowSwitcherApi", "getNowSwitcherApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0, c65351Pkp), C61845OOz.LIZJ(WUU.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(WUU.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp)};
    }

    private final InterfaceC82325WSr LJJLIIJ() {
        return (InterfaceC82325WSr) this.LLIIIL.LIZ(this, LLILLL[8]);
    }

    private final long LJJLJLI() {
        return ((Number) this.LLILL.getValue()).longValue();
    }

    private final WLB getRecordAdapterApi() {
        return (WLB) this.LLFF.LIZ(this, LLILLL[0]);
    }

    private final I3K getSplitShootApiComponent() {
        return (I3K) this.LLIIIZ.LIZ(this, LLILLL[9]);
    }

    public final ActivityC45651qj LJJLIIIJJIZ() {
        return (ActivityC45651qj) this.LLIIIILZ.LIZ(this, LLILLL[6]);
    }

    public final I3K LJJLIIIJLLLLLLLZ() {
        return (I3K) this.LLILLJJLI.getValue();
    }

    public final C82374WUo LJJLJ() {
        return (C82374WUo) this.LLILIL.getValue();
    }

    public final InterfaceC45979I2t getBottomTabApiComponent() {
        return (InterfaceC45979I2t) this.LLFZ.LIZ(this, LLILLL[2]);
    }

    public final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LLI.LIZ(this, LLILLL[3]);
    }

    public final InterfaceC45999I3n getPlanCUIApiComponent() {
        return (InterfaceC45999I3n) this.LLFFF.LIZ(this, LLILLL[1]);
    }

    public final InterfaceC45967I2h getRecordControlApi() {
        return (InterfaceC45967I2h) this.LLIFFJFJJ.LIZ(this, LLILLL[4]);
    }

    public final I8W getRecordPermissionApiComponent() {
        return (I8W) this.LLIIIJ.LIZ(this, LLILLL[7]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLII.LIZ(this, LLILLL[5]);
    }

    public final I0N getStickerApiComponent() {
        return (I0N) this.LLIIJI.LIZ(this, LLILLL[10]);
    }

    private final void LJJLIIIIJ() {
        RecordContext recordContext = getShortVideoContext().cameraComponentModel.recordContext;
        recordContext.filterLabels.reset();
        recordContext.filterIds.reset();
        recordContext.filterValues.reset();
    }

    private final void LJJZZI() {
        LiveEvent<C76800UCe> Ia;
        C0IB<String> pe0;
        LiveEvent<WSA> Po;
        C0IB<WS0> bottomTabIndexChangeEvent;
        LiveEvent<OSJ<Integer, Integer, Intent>> qo0;
        InterfaceC45999I3n planCUIApiComponent = getPlanCUIApiComponent();
        if (planCUIApiComponent != null && (qo0 = planCUIApiComponent.qo0()) != null) {
            qo0.LIZLLL(this, new AObjectS89S0100000_14(this, 243));
        }
        InterfaceC45979I2t bottomTabApiComponent = getBottomTabApiComponent();
        if (bottomTabApiComponent != null && (bottomTabIndexChangeEvent = bottomTabApiComponent.getBottomTabIndexChangeEvent()) != null) {
            bottomTabIndexChangeEvent.LIZIZ(this, new AObjectS89S0100000_14(this, 245));
        }
        InterfaceC82325WSr LJJLIIJ = LJJLIIJ();
        if (LJJLIIJ != null && (Po = LJJLIIJ.Po()) != null) {
            Po.LIZLLL(this, new AObjectS89S0100000_14(this, 247));
        }
        I3K splitShootApiComponent = getSplitShootApiComponent();
        if (splitShootApiComponent != null && (pe0 = splitShootApiComponent.pe0()) != null) {
            pe0.LIZIZ(this, new AObjectS89S0100000_14(this, 248));
        }
        InterfaceC45999I3n planCUIApiComponent2 = getPlanCUIApiComponent();
        if (planCUIApiComponent2 != null && (Ia = planCUIApiComponent2.Ia()) != null) {
            Ia.LIZLLL(this, new AObjectS89S0100000_14(this, LiveCoverMinSizeSetting.DEFAULT));
        }
    }

    public final boolean LJJLIIIJJI() {
        if (getShortVideoContext().shootMode == 16) {
            return true;
        }
        return false;
    }

    public final long LJJLL() {
        if (getShortVideoContext().LJJIJIIJI()) {
            return 3000L;
        }
        if (getShortVideoContext().cameraComponentModel.isRetakeMode) {
            return getShortVideoContext().cameraComponentModel.mRetakeDuration;
        }
        if (C52910Kpe.LIZ()) {
            return LJJLJLI();
        }
        return C44529Hdl.LIZIZ();
    }

    public final void LJJZZIII() {
        LJLJLJ();
        LLLIL(3, false);
        if (!L2F.LIZ()) {
            getCameraApiComponent().s9(0);
        }
    }

    public final void LJLIIL() {
        LLLLII();
        bl0(0);
        LLLIL(3, false);
        i7(true);
        RecordPageOptionalConfig recordPageOptionalConfig = getShortVideoContext().creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig != null && recordPageOptionalConfig.recordBottomTabConfig != null) {
            getShortVideoContext().shootMode = 15;
        } else {
            MD(true);
        }
        sJ(false);
    }

    @Override // X.InterfaceC45995I3j
    public void LLILIL() {
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = LJJLJ().LLIIIL;
        if (viewOnTouchListenerC82375WUp != null) {
            int i = viewOnTouchListenerC82375WUp.LJLLILLLL;
            if (i == 1 || i == 4 || i == 12) {
                viewOnTouchListenerC82375WUp.LJIIIZ(2);
                viewOnTouchListenerC82375WUp.invalidate();
                return;
            } else if (i == 10 || i == 9) {
                viewOnTouchListenerC82375WUp.LJIIIZ(11);
                viewOnTouchListenerC82375WUp.invalidate();
                return;
            } else {
                if (i != 3 && i != 2) {
                    return;
                }
                viewOnTouchListenerC82375WUp.LJIIIZ(4);
                return;
            }
        }
        o.LJIJI("recordLayout");
        throw null;
    }

    @Override // X.InterfaceC45995I3j
    public void LLLLII() {
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = LJJLJ().LLIIIL;
        if (viewOnTouchListenerC82375WUp != null) {
            viewOnTouchListenerC82375WUp.LJIILL();
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC45995I3j
    public void LLLLIILL() {
        C82374WUo LJJLJ = LJJLJ();
        FrameLayout frameLayout = LJJLJ.LLILLL;
        if (frameLayout == null) {
            return;
        }
        frameLayout.post(new ARunnableS50S0100000_14(LJJLJ, 116));
    }

    @Override // X.InterfaceC45995I3j
    public void Lp0() {
        C82374WUo LJJLJ = LJJLJ();
        if (LJJLJ.LLIIIL == null) {
            return;
        }
        LJJLJ.LLJJIJIIJIL(false);
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = LJJLJ.LLIIIL;
        if (viewOnTouchListenerC82375WUp != null) {
            if (viewOnTouchListenerC82375WUp.LJLLILLLL != 7) {
                return;
            }
            viewOnTouchListenerC82375WUp.LJIIIZ(1);
            return;
        }
        o.LJIJI("recordLayout");
        throw null;
    }

    @Override // X.InterfaceC45995I3j
    public void RV() {
        if (getShortVideoContext().LJJIIJZLJL()) {
            View view = LJJLJ().LLIIIZ;
            if (view != null) {
                view.setAlpha(0.2f);
                return;
            } else {
                o.LJIJI("deleteLast");
                throw null;
            }
        }
        View view2 = LJJLJ().LLIIIZ;
        if (view2 != null) {
            view2.setAlpha(1.0f);
        } else {
            o.LJIJI("deleteLast");
            throw null;
        }
    }

    @Override // X.InterfaceC45891Hzj
    public void bQ() {
        LJJLJ().LLJJ();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        IAO LLLLZ;
        C0IB<Integer> Ig0;
        Long l;
        List<TimeSpeedModelExtension> list;
        Object obj;
        LiveEvent<Boolean> Ai0;
        C0IB<Boolean> Et;
        LiveEvent<Boolean> O80;
        LiveEvent<C76800UCe> xU;
        super.onCreate();
        getRecordAdapterApi().Lr(this);
        this.LJLILLLLZI.add(this.LJLJI, LJJLJ(), "LighteningControlProgressScene");
        this.LJLJLJ.LIZIZ(this, new AObjectS89S0100000_14(this, 266));
        this.LJLJLLL.LIZIZ(this, new AObjectS89S0100000_14(this, 242));
        if (W2U.LIZ()) {
            I0N stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent != null && (xU = stickerApiComponent.xU()) != null) {
                xU.LIZLLL(this, new AObjectS89S0100000_14(this, 249));
            }
            getRecordControlApi().isRecording().LIZIZ(this, new AObjectS89S0100000_14(this, 251));
            getRecordControlApi().zg(HKF.class, new WUZ(this));
            I0N stickerApiComponent2 = getStickerApiComponent();
            if (stickerApiComponent2 != null && (O80 = stickerApiComponent2.O80()) != null) {
                O80.LIZLLL(this, new AObjectS89S0100000_14(this, 253));
            }
        }
        InterfaceC45999I3n planCUIApiComponent = getPlanCUIApiComponent();
        if (planCUIApiComponent != null && (Et = planCUIApiComponent.Et()) != null) {
            Et.LIZIZ(this, new AObjectS89S0100000_14(this, 255));
        }
        InterfaceC45999I3n planCUIApiComponent2 = getPlanCUIApiComponent();
        if (planCUIApiComponent2 != null && (Ai0 = planCUIApiComponent2.Ai0()) != null) {
            Ai0.LIZLLL(this, new AObjectS89S0100000_14(this, 257));
        }
        getRecordControlApi().Vh().LIZLLL(this, new AObjectS89S0100000_14(this, 259));
        getRecordControlApi().fb0().LIZLLL(this, new AObjectS89S0100000_14(this, 252));
        getRecordControlApi().Qr0().LIZLLL(this, new AObjectS89S0100000_14(this, 254));
        getRecordControlApi().kX().LIZLLL(this, new AObjectS89S0100000_14(this, 256));
        getRecordControlApi().w90().LIZLLL(this, new AObjectS89S0100000_14(this, 258));
        getRecordControlApi().ck0().LIZLLL(this, new AObjectS89S0100000_14(this, 260));
        getRecordControlApi().aa0().LIZLLL(this, new AObjectS89S0100000_14(this, 261));
        getRecordControlApi().oy().LIZLLL(this, new AObjectS89S0100000_14(this, 262));
        getRecordControlApi().Gg0().LIZLLL(this, new AObjectS89S0100000_14(this, 263));
        getCameraApiComponent().bh().LIZIZ(this, new AObjectS89S0100000_14(this, 264));
        getRecordControlApi().dy().LIZIZ(this, new AObjectS89S0100000_14(this, 265));
        if (getShortVideoContext().cameraComponentModel.isRetakeMode && getShortVideoContext().LJIILL() != null && getShortVideoContext().LJIILL().stitchParams != null) {
            getShortVideoContext().LJIJJLI(getShortVideoContext().LJIILL().stitchParams);
        }
        if (getShortVideoContext().LJJIJIIJI() && getShortVideoContext().stitchContext.stitchClip != null) {
            LLLLZ = IAO.LLLLZIL(getShortVideoContext().LJII(), getShortVideoContext().LJIIIIZZ(), getShortVideoContext().stitchContext.stitchClip);
        } else {
            LLLLZ = IAO.LLLLZ(getShortVideoContext().LJIIIIZZ(), getShortVideoContext().LJII(), true);
        }
        List<TimeSpeedModelExtension> list2 = LLLLZ.LJLIL;
        if (list2 != null && !list2.isEmpty() && (list = LLLLZ.LJLIL) != null && (obj = ListProtector.get(list, 0)) != null) {
            this.LLIIZ = new WeakReference<>(obj);
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
        getCameraApiComponent().md0().LIZLLL(this, new AObjectS89S0100000_14(this, 267));
        getCameraApiComponent().M70().LIZLLL(this, new AObjectS89S0100000_14(this, 268));
        getRecordControlApi().qu0().LIZLLL(this, new AObjectS89S0100000_14(this, 269));
        getRecordControlApi().Fh0().LIZLLL(this, new AObjectS89S0100000_14(this, 270));
        getRecordControlApi().kX().LIZLLL(this, C82363WUd.LJLIL);
        if (getShortVideoContext().mIsFromDraft && C47261Igj.LJJIJIIJI(15, 17, 16, 20).contains(Integer.valueOf(getShortVideoContext().shootMode))) {
            HZ2.LIZ(getRecordControlApi(), false, 3);
        }
        this.LJLZ.LIZIZ(this, new AObjectS89S0100000_14(this, 271));
        I3K i3k = (I3K) getDiContainer().LJIIIIZZ(null, I3K.class);
        if (i3k != null && (Ig0 = i3k.Ig0()) != null) {
            Ig0.LIZIZ(this, new AObjectS89S0100000_14(this, 272));
        }
        getRecordControlApi().aL().LIZLLL(this, new AObjectS89S0100000_14(this, 273));
        getRecordControlApi().UG().LIZLLL(this, new AObjectS89S0100000_14(this, 274));
        getRecordControlApi().Rr0().LIZLLL(this, new AObjectS89S0100000_14(this, 244));
        getRecordControlApi().ck0().LIZLLL(this, new AObjectS89S0100000_14(this, 246));
        LJJZZI();
        InterfaceC82353WTt interfaceC82353WTt = this.LLFII;
        if (interfaceC82353WTt != null) {
            interfaceC82353WTt.Ef0(new WUX(this));
        }
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        getRecordAdapterApi().Lr(null);
        this.LLIL.dispose();
        Animator animator = this.LLIILZL;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // X.InterfaceC45995I3j
    public int q() {
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = LJJLJ().LLIIIL;
        if (viewOnTouchListenerC82375WUp != null) {
            return viewOnTouchListenerC82375WUp.getCurrentScaleMode();
        }
        o.LJIJI("recordLayout");
        throw null;
    }

    @Override // X.InterfaceC45995I3j
    public /* bridge */ /* synthetic */ LiveEvent ES() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC45891Hzj
    public /* bridge */ /* synthetic */ C0IB Hf() {
        return this.LJLZ;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC45891Hzj getApiComponent() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC45995I3j
    public /* bridge */ /* synthetic */ LiveEvent pj0() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC45995I3j
    public boolean um0() {
        return this.LLILLIZIL;
    }

    @Override // X.InterfaceC45995I3j
    public void BW(OSJ<? extends List<? extends TimeSpeedModelExtension>, Long, ? extends TimeSpeedModelExtension> value) {
        o.LJIIIZ(value, "value");
        this.LJLLLL.LJI(value);
    }

    @Override // X.InterfaceC45995I3j
    public void F0(int i) {
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = LJJLJ().LLIIIL;
        if (viewOnTouchListenerC82375WUp != null) {
            viewOnTouchListenerC82375WUp.setVisibility(i);
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC45891Hzj
    public void Hs(boolean z) {
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = LJJLJ().LLIIIL;
        if (viewOnTouchListenerC82375WUp != null) {
            viewOnTouchListenerC82375WUp.LJLZ = z;
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    public final void LJJLI(boolean z) {
        I3K LJJLIIIJLLLLLLLZ;
        I3K LJJLIIIJLLLLLLLZ2;
        if (z) {
            I3K LJJLIIIJLLLLLLLZ3 = LJJLIIIJLLLLLLLZ();
            if (LJJLIIIJLLLLLLLZ3 != null && LJJLIIIJLLLLLLLZ3.Fb() && (LJJLIIIJLLLLLLLZ2 = LJJLIIIJLLLLLLLZ()) != null) {
                LJJLIIIJLLLLLLLZ2.P1(-SFS.LJI(42.0d));
                return;
            }
            return;
        }
        I3K LJJLIIIJLLLLLLLZ4 = LJJLIIIJLLLLLLLZ();
        if (LJJLIIIJLLLLLLLZ4 == null || !LJJLIIIJLLLLLLLZ4.Fb() || (LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ()) == null) {
            return;
        }
        LJJLIIIJLLLLLLLZ.P1(0);
    }

    @Override // X.InterfaceC45995I3j
    public void LJJZ(boolean z) {
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = LJJLJ().LLIIIL;
        if (viewOnTouchListenerC82375WUp != null) {
            viewOnTouchListenerC82375WUp.setEnabled(z);
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    public final void LJLJJL(long j) {
        this.LJLL.LJI(Long.valueOf(j));
    }

    public final void LJLJJLL(boolean z) {
        this.LJLLILLLL.LJI(Boolean.valueOf(z));
    }

    public final void LJLZ(IAO iao) {
        TimeSpeedModelExtension timeSpeedModelExtension = iao.LJLJI;
        if (timeSpeedModelExtension != null) {
            o.LJIIIIZZ(timeSpeedModelExtension, "ev.stitchClip");
            if (C76917UGr.LJJJJ(timeSpeedModelExtension)) {
                if (getShortVideoContext().cameraComponentModel.isRetakeMode) {
                    if (!C52910Kpe.LIZ()) {
                        H7B.LIZJ("ZHENGLI: Oops, something should not happen, we don't support retake for library");
                        return;
                    }
                    return;
                } else {
                    if (!C52910Kpe.LIZ()) {
                        H7B.LIZ("ZHENGLI: updateProgressbar for library clip");
                    }
                    BW(new OSJ<>(iao.LJLIL, Long.valueOf(iao.LJLILLLLZI), iao.LJLJI));
                    return;
                }
            }
            if (getShortVideoContext().cameraComponentModel.isRetakeMode) {
                t6(new OSJ<>(iao.LJLIL, Long.valueOf(iao.LJLILLLLZI), iao.LJLJI));
                return;
            } else {
                O5(new OSJ<>(iao.LJLIL, Long.valueOf(iao.LJLILLLLZI), iao.LJLJI));
                return;
            }
        }
        if (getShortVideoContext().cameraComponentModel.isRetakeMode) {
            Q0(new OSZ<>(iao.LJLIL, Long.valueOf(iao.LJLILLLLZI)));
        } else {
            e6(new OSZ<>(iao.LJLIL, Long.valueOf(iao.LJLILLLLZI)));
        }
    }

    @Override // X.InterfaceC45995I3j
    public void LLJILLL(Animation value) {
        o.LJIIIZ(value, "value");
        LJJLJ().LLJILLL(value);
    }

    @Override // X.InterfaceC45995I3j
    public void LLLLLLLLLL(boolean z) {
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = LJJLJ().LLIIIL;
        if (viewOnTouchListenerC82375WUp != null) {
            viewOnTouchListenerC82375WUp.LLL = z;
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC45995I3j
    public void LLLLLLZZ(boolean z) {
        this.LLILLIZIL = z;
        View view = LJJLJ().LLIIJI;
        if (view != null) {
            view.setSelected(z);
        } else {
            o.LJIJI("goNextButton");
            throw null;
        }
    }

    @Override // X.InterfaceC45995I3j
    public void LLLLLZ(int i) {
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = LJJLJ().LLIIIL;
        if (viewOnTouchListenerC82375WUp != null) {
            viewOnTouchListenerC82375WUp.setCurrentScaleMode(i);
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC45995I3j
    public void M3(int i) {
        this.LJZI.LJI(Integer.valueOf(i));
    }

    @Override // X.InterfaceC45891Hzj
    public void MD(boolean z) {
        this.LLIILII = z;
        LJJLJ().LLJJIJIIJIL(z);
    }

    @Override // X.InterfaceC45995I3j
    public void Mp(boolean z) {
        float f;
        Animator animator = this.LLIILZL;
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
        ofFloat.addUpdateListener(new AUListenerS101S0100000_14(this, 17));
        ofFloat.addListener(new ALAdapterS0S0110001_14(this, f, z, 1));
        this.LLIILZL = ofFloat;
        ofFloat.start();
    }

    @Override // X.InterfaceC45995I3j
    public void O5(OSJ<? extends List<? extends TimeSpeedModelExtension>, Long, ? extends TimeSpeedModelExtension> value) {
        o.LJIIIZ(value, "value");
        this.LJLLL.LJI(value);
    }

    @Override // X.InterfaceC45995I3j
    public void Q0(OSZ<? extends List<? extends TimeSpeedModelExtension>, Long> value) {
        o.LJIIIZ(value, "value");
        this.LL.LJI(value);
    }

    @Override // X.InterfaceC45891Hzj
    public void TJ(InterfaceC88472Yns<? super ViewOnTouchListenerC82375WUp, C76800UCe> action) {
        o.LJIIIZ(action, "action");
        C82374WUo LJJLJ = LJJLJ();
        LJJLJ.getClass();
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = LJJLJ.LLIIIL;
        if (viewOnTouchListenerC82375WUp != null) {
            action.invoke(viewOnTouchListenerC82375WUp);
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC45891Hzj
    public void Xa0(boolean z) {
        View view = LJJLJ().LLII;
        if (view != null) {
            C87277YNd.LJJIJIIJI(view, z);
        } else {
            o.LJIJI("svcTipsContainer");
            throw null;
        }
    }

    @Override // X.InterfaceC45891Hzj
    public void bl0(int i) {
        int i2;
        C82374WUo LJJLJ = LJJLJ();
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = LJJLJ.LLIIIL;
        if (viewOnTouchListenerC82375WUp != null) {
            viewOnTouchListenerC82375WUp.setPhotoIdleStyle(i);
            if (!V16.LJJIL(LJJLJ.LJLJI) && V16.LJJLIIIJ(LJJLJ.LJLJI) && LJJLJ.LJLJI.creativeModel.initialModel.recordPageOptionalConfig == null) {
                WV6 wv6 = LJJLJ.LLI;
                if (wv6 != null) {
                    Context requireSceneContext = LJJLJ.requireSceneContext();
                    o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
                    if (i == 1) {
                        i2 = R.attr.eg;
                    } else {
                        i2 = R.attr.eb;
                    }
                    wv6.setProgressColor(AnonymousClass636.LJIIIIZZ(i2, requireSceneContext));
                    return;
                }
                o.LJIJI("progressSegmentView");
                throw null;
            }
            return;
        }
        o.LJIJI("recordLayout");
        throw null;
    }

    @Override // X.InterfaceC45995I3j
    public void e6(OSZ<? extends List<? extends TimeSpeedModelExtension>, Long> value) {
        o.LJIIIZ(value, "value");
        this.LJLLJ.LJI(value);
    }

    @Override // X.InterfaceC45995I3j
    public void f(int i) {
        LJJLJ().f(i);
    }

    @Override // X.InterfaceC45995I3j
    public void g7(Long l) {
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = LJJLJ().LLIIIL;
        if (viewOnTouchListenerC82375WUp == null || l == null) {
            return;
        }
        viewOnTouchListenerC82375WUp.setActionDownTime(l.longValue());
    }

    @Override // X.InterfaceC45995I3j
    public void h(int i) {
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = LJJLJ().LLIIIL;
        if (viewOnTouchListenerC82375WUp != null) {
            viewOnTouchListenerC82375WUp.LJIILJJIL(i);
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC45995I3j
    public void h5(RetakeVideoContext value) {
        o.LJIIIZ(value, "value");
        this.LJZL.LJI(value);
    }

    @Override // X.InterfaceC45995I3j
    public void i7(boolean z) {
        this.LJLJLJ.LJI(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC45891Hzj
    public void ig(int i) {
        ViewGroup viewGroup = LJJLJ().LLIIIJ;
        if (viewGroup != null) {
            viewGroup.setVisibility(i);
        } else {
            o.LJIJI("controlProgress");
            throw null;
        }
    }

    @Override // X.InterfaceC45995I3j
    public void l(int i) {
        C82374WUo LJJLJ = LJJLJ();
        if (i == 0) {
            ViewGroup viewGroup = LJJLJ.LLIIL;
            if (viewGroup != null) {
                if (viewGroup.getVisibility() == 0) {
                    Boolean LIZ = LJJLJ.LJLILLLLZI.Ue0().LIZ();
                    o.LJIIIIZZ(LIZ, "recordControlApi.hasStopped.value");
                    if (LIZ.booleanValue()) {
                        LJJLJ.LLJJI();
                    } else {
                        return;
                    }
                }
            } else {
                o.LJIJI("handsFreeLayout");
                throw null;
            }
        }
        View view = LJJLJ.LLIIIZ;
        if (view != null) {
            view.setVisibility(i);
        } else {
            o.LJIJI("deleteLast");
            throw null;
        }
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
        this.LJLJLLL.LJI(Boolean.valueOf(z2));
    }

    @Override // X.InterfaceC45891Hzj
    public void sJ(boolean z) {
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = LJJLJ().LLIIIL;
        if (viewOnTouchListenerC82375WUp != null) {
            viewOnTouchListenerC82375WUp.setCombineTakePhoto(z);
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC45995I3j
    public void t6(OSJ<? extends List<? extends TimeSpeedModelExtension>, Long, ? extends TimeSpeedModelExtension> value) {
        o.LJIIIZ(value, "value");
        this.LLD.LJI(value);
    }

    public final void LJLLL(long j, TimeSpeedModelExtension timeSpeedModelExtension) {
        int i = 0;
        if (getShortVideoContext().LJJIJIIJI() && (timeSpeedModelExtension != null || (timeSpeedModelExtension = getShortVideoContext().stitchContext.stitchClip) != null)) {
            i = timeSpeedModelExtension.getDuration();
        }
        this.LJLLLLLL.LJI(Long.valueOf(j + i));
    }

    @Override // X.InterfaceC45995I3j
    public void LLLIL(int i, boolean z) {
        C82374WUo LJJLJ = LJJLJ();
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = LJJLJ.LLIIIL;
        if (viewOnTouchListenerC82375WUp != null) {
            viewOnTouchListenerC82375WUp.LJIJ(i, z, LJJLJ.LJLJI.LJJIJIIJIL());
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    public WUU(C82622Wbi diContainer, WMH parentScene, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJL = this;
        this.LJLJJLL = new C29901Fi<>();
        this.LJLJL = new C29901Fi<>();
        Boolean bool = Boolean.TRUE;
        this.LJLJLJ = new C40871j1<>(bool);
        this.LJLJLLL = new C40871j1<>(bool);
        this.LJLL = new C40871j1<>(0L);
        this.LJLLI = new C40871j1<>(bool);
        this.LJLLILLLL = new C40871j1<>(bool);
        this.LJLLJ = new C40871j1<>(null);
        this.LJLLL = new C40871j1<>(null);
        this.LJLLLL = new C40871j1<>(null);
        this.LJLLLLLL = new C40871j1<>(0L);
        this.LJLZ = new C40871j1<>(Boolean.FALSE);
        this.LJZ = new C46611sH<>(0);
        this.LJZI = new C40871j1<>(-1);
        this.LJZL = new C40871j1<>(null);
        this.LL = new C40871j1<>(null);
        this.LLD = new C40871j1<>(null);
        this.LLF = (ActivityC45651qj) getDiContainer().LJ(ActivityC45651qj.class, null);
        this.LLFF = UCI.LJI(getDiContainer(), WLB.class, null);
        this.LLFFF = UCI.LJII(getDiContainer(), InterfaceC45999I3n.class, null);
        this.LLFII = (InterfaceC82353WTt) getDiContainer().LJIIIIZZ(null, InterfaceC82353WTt.class);
        this.LLFZ = UCI.LJII(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LLI = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LLIFFJFJJ = UCI.LJI(getDiContainer(), InterfaceC45967I2h.class, null);
        this.LLII = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LLIIII = (InterfaceC46211IBr) getDiContainer().LJIIIIZZ(null, InterfaceC46211IBr.class);
        this.LLIIIILZ = UCI.LJI(getDiContainer(), ActivityC45651qj.class, null);
        this.LLIIIJ = UCI.LJII(getDiContainer(), I8W.class, null);
        this.LLIIIL = UCI.LJII(getDiContainer(), InterfaceC82325WSr.class, null);
        this.LLIIIZ = UCI.LJII(getDiContainer(), I3K.class, null);
        this.LLIIJI = UCI.LJII(getDiContainer(), I0N.class, null);
        this.LLIIJLIL = 15000;
        this.LLIIL = -21;
        this.LLIL = new C73318Sq2();
        this.LLILII = new Integer[]{15, 17, 20};
        this.LLILIL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 221));
        this.LLILL = C221108m2.LIZIZ(C82362WUc.LJLIL);
        this.LLILLJJLI = C221108m2.LIZ(EnumC221088m0.NONE, new AqS164S0100000_14(this, 220));
    }

    @Override // X.InterfaceC45995I3j
    public void z0(MotionEvent motionEvent, float f, float f2) {
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = LJJLJ().LLIIIL;
        if (viewOnTouchListenerC82375WUp == null) {
            return;
        }
        viewOnTouchListenerC82375WUp.getClass();
        viewOnTouchListenerC82375WUp.LJLJLLL = f2;
        viewOnTouchListenerC82375WUp.onTouchEvent(motionEvent);
    }

    public final C82374WUo LJJLIIIJILLIZJL(InterfaceC82086WJm interfaceC82086WJm, I3X i3x, ShortVideoContext shortVideoContext, C0IB<Long> c0ib, C0IB<Boolean> c0ib2, C0IB<OSZ<List<TimeSpeedModelExtension>, Long>> c0ib3, C0IB<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> c0ib4, C0IB<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> c0ib5, C0IB<Integer> c0ib6, C0IB<RetakeVideoContext> c0ib7, C0IB<OSZ<List<TimeSpeedModelExtension>, Long>> c0ib8, C0IB<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> c0ib9, C0IB<Boolean> c0ib10, C0IB<Boolean> c0ib11, C0IB<Boolean> c0ib12, C0IB<ScaleGestureDetector> c0ib13, C0IB<WXG> c0ib14, C0IB<Long> c0ib15, C40871j1<Boolean> c40871j1, C46611sH<Integer> c46611sH, I8W i8w, I0N i0n) {
        return new C82374WUo(interfaceC82086WJm, i3x, shortVideoContext, c0ib, c0ib2, c0ib3, c0ib4, c0ib5, c0ib6, c0ib7, c0ib8, c0ib9, c0ib10, c0ib11, c0ib12, c0ib13, c0ib14, c0ib15, c40871j1, c46611sH, i8w, getPlanCUIApiComponent(), this.LJLJJLL, this.LJLJL, i0n, getDiContainer());
    }
}
