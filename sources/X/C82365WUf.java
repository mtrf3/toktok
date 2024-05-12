package X;

import Y.AObjectS89S0100000_14;
import Y.ARunnableS50S0100000_14;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WUf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82365WUf extends AbstractC29891Fh<InterfaceC164206cS> implements InterfaceC164206cS, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFFF;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final InterfaceC164206cS LJLJJI;
    public final C40871j1<Boolean> LJLJJL;
    public final C40871j1<Boolean> LJLJJLL;
    public final C40871j1<Long> LJLJL;
    public final C40871j1<Boolean> LJLJLJ;
    public final C40871j1<OSZ<List<TimeSpeedModelExtension>, Long>> LJLJLLL;
    public final C40871j1<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LJLL;
    public final C40871j1<Integer> LJLLI;
    public final C40871j1<RetakeVideoContext> LJLLILLLL;
    public final C40871j1<OSZ<List<TimeSpeedModelExtension>, Long>> LJLLJ;
    public final C40871j1<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LJLLL;
    public final ActivityC45651qj LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC82353WTt LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC115514g7 LJZI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final InterfaceC115514g7 LLD;
    public final int LLF;
    public final C82378WUs LLFF;

    static {
        TBT tbt = new TBT(C82365WUf.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLFFF = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82365WUf.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82365WUf.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82365WUf.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0, c65351Pkp), C61845OOz.LIZJ(C82365WUf.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(C82365WUf.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0, c65351Pkp)};
    }

    private final C82366WUg LJJLI() {
        C0IB<Boolean> c0ib;
        C0IB<Boolean> c0ib2;
        C0IB<ScaleGestureDetector> c0ib3;
        C82366WUg c82366WUg = new C82366WUg();
        InterfaceC82086WJm cameraApiComponent = getCameraApiComponent();
        o.LJIIIZ(cameraApiComponent, "<set-?>");
        c82366WUg.LIZ = cameraApiComponent;
        I3X recordControlApi = getRecordControlApi();
        o.LJIIIZ(recordControlApi, "<set-?>");
        c82366WUg.LIZIZ = recordControlApi;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        o.LJIIIZ(shortVideoContext, "<set-?>");
        c82366WUg.LIZJ = shortVideoContext;
        C40871j1<Long> c40871j1 = this.LJLJL;
        o.LJIIIZ(c40871j1, "<set-?>");
        c82366WUg.LIZLLL = c40871j1;
        C40871j1<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> c40871j12 = this.LJLL;
        o.LJIIIZ(c40871j12, "<set-?>");
        c82366WUg.LJFF = c40871j12;
        C40871j1<OSZ<List<TimeSpeedModelExtension>, Long>> c40871j13 = this.LJLJLLL;
        o.LJIIIZ(c40871j13, "<set-?>");
        c82366WUg.LJ = c40871j13;
        C40871j1<Integer> c40871j14 = this.LJLLI;
        o.LJIIIZ(c40871j14, "<set-?>");
        c82366WUg.LJI = c40871j14;
        C40871j1<RetakeVideoContext> c40871j15 = this.LJLLILLLL;
        o.LJIIIZ(c40871j15, "<set-?>");
        c82366WUg.LJII = c40871j15;
        C40871j1<OSZ<List<TimeSpeedModelExtension>, Long>> c40871j16 = this.LJLLJ;
        o.LJIIIZ(c40871j16, "<set-?>");
        c82366WUg.LJIIIIZZ = c40871j16;
        C40871j1<OSJ<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> c40871j17 = this.LJLLL;
        o.LJIIIZ(c40871j17, "<set-?>");
        c82366WUg.LJIIIZ = c40871j17;
        C40871j1<Boolean> c40871j18 = this.LJLJLJ;
        o.LJIIIZ(c40871j18, "<set-?>");
        c82366WUg.LJIIJ = c40871j18;
        InterfaceC45999I3n planCUIApiComponent = getPlanCUIApiComponent();
        C0IB<WXG> c0ib4 = null;
        if (planCUIApiComponent != null) {
            c0ib = planCUIApiComponent.Na0();
        } else {
            c0ib = null;
        }
        c82366WUg.LJIIJJI = c0ib;
        InterfaceC45999I3n planCUIApiComponent2 = getPlanCUIApiComponent();
        if (planCUIApiComponent2 != null) {
            c0ib2 = planCUIApiComponent2.RH();
        } else {
            c0ib2 = null;
        }
        c82366WUg.LJIIL = c0ib2;
        InterfaceC82353WTt interfaceC82353WTt = this.LJLZ;
        if (interfaceC82353WTt != null) {
            c0ib3 = interfaceC82353WTt.lh0();
        } else {
            c0ib3 = null;
        }
        c82366WUg.LJIILIIL = c0ib3;
        InterfaceC82353WTt interfaceC82353WTt2 = this.LJLZ;
        if (interfaceC82353WTt2 != null) {
            c0ib4 = interfaceC82353WTt2.G00();
        }
        c82366WUg.LJIILJJIL = c0ib4;
        return c82366WUg;
    }

    private final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJZI.LIZ(this, LLFFF[2]);
    }

    public final ActivityC45651qj LJJLIIIIJ() {
        return (ActivityC45651qj) this.LLD.LIZ(this, LLFFF[5]);
    }

    @Override // X.InterfaceC164206cS
    public void LLILIL() {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLFF.LJLJJLL;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.LJIIZILJ();
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC164206cS
    public void LLLLII() {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLFF.LJLJJLL;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.LJIIJJI();
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC164206cS
    public void LLLLIILL() {
        C82378WUs c82378WUs = this.LLFF;
        FrameLayout frameLayout = c82378WUs.LJLL;
        if (frameLayout == null) {
            return;
        }
        frameLayout.post(new ARunnableS50S0100000_14(c82378WUs, 64));
    }

    public final InterfaceC45979I2t getBottomTabApiComponent() {
        return (InterfaceC45979I2t) this.LJZ.LIZ(this, LLFFF[1]);
    }

    public final InterfaceC45999I3n getPlanCUIApiComponent() {
        return (InterfaceC45999I3n) this.LJLLLLLL.LIZ(this, LLFFF[0]);
    }

    public final I3X getRecordControlApi() {
        return (I3X) this.LJZL.LIZ(this, LLFFF[3]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LL.LIZ(this, LLFFF[4]);
    }

    @Override // X.InterfaceC164206cS
    public int q() {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLFF.LJLJJLL;
        if (viewOnTouchListenerC82377WUr != null) {
            return viewOnTouchListenerC82377WUr.getCurrentScaleMode();
        }
        o.LJIJI("recordLayout");
        throw null;
    }

    public final long LJJLIIIJILLIZJL() {
        if (getShortVideoContext().LJJIJIIJI()) {
            return 3000L;
        }
        if (getShortVideoContext().cameraComponentModel.isRetakeMode) {
            return getShortVideoContext().cameraComponentModel.mRetakeDuration;
        }
        return C44529Hdl.LIZIZ();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        IAO LLLLZ;
        Long l;
        LiveEvent<Boolean> Ai0;
        C0IB<Boolean> Et;
        super.onCreate();
        this.LJLILLLLZI.add(this.LJLJI, this.LLFF, "FTCRecordControlProgressScene");
        this.LJLJJL.LIZIZ(this, new AObjectS89S0100000_14(this, 44));
        this.LJLJJLL.LIZIZ(this, new AObjectS89S0100000_14(this, 45));
        InterfaceC45999I3n planCUIApiComponent = getPlanCUIApiComponent();
        if (planCUIApiComponent != null && (Et = planCUIApiComponent.Et()) != null) {
            Et.LIZIZ(this, new AObjectS89S0100000_14(this, 46));
        }
        InterfaceC45999I3n planCUIApiComponent2 = getPlanCUIApiComponent();
        if (planCUIApiComponent2 != null && (Ai0 = planCUIApiComponent2.Ai0()) != null) {
            Ai0.LIZLLL(this, new AObjectS89S0100000_14(this, 47));
        }
        getRecordControlApi().Vh().LIZLLL(this, new AObjectS89S0100000_14(this, 48));
        getRecordControlApi().fb0().LIZLLL(this, new AObjectS89S0100000_14(this, 49));
        getRecordControlApi().Qr0().LIZLLL(this, new AObjectS89S0100000_14(this, 50));
        getRecordControlApi().aL().LIZLLL(this, new AObjectS89S0100000_14(this, 51));
        getRecordControlApi().kX().LIZLLL(this, new AObjectS89S0100000_14(this, 52));
        getRecordControlApi().w90().LIZLLL(this, new AObjectS89S0100000_14(this, 34));
        getRecordControlApi().ck0().LIZLLL(this, new AObjectS89S0100000_14(this, 35));
        getRecordControlApi().aa0().LIZLLL(this, new AObjectS89S0100000_14(this, 36));
        getRecordControlApi().Gg0().LIZLLL(this, new AObjectS89S0100000_14(this, 37));
        getCameraApiComponent().bh().LIZIZ(this, new AObjectS89S0100000_14(this, 38));
        getRecordControlApi().dy().LIZIZ(this, new AObjectS89S0100000_14(this, 39));
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
        getCameraApiComponent().md0().LIZLLL(this, new AObjectS89S0100000_14(this, 40));
        getCameraApiComponent().M70().LIZLLL(this, new AObjectS89S0100000_14(this, 41));
        getRecordControlApi().qu0().LIZLLL(this, new AObjectS89S0100000_14(this, 42));
        getRecordControlApi().Fh0().LIZLLL(this, new AObjectS89S0100000_14(this, 43));
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC164206cS getApiComponent() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public final void LJJLIIIJJI(long j) {
        this.LJLJL.LJI(Long.valueOf(j));
    }

    public final void LJJLIIIJJIZ(boolean z) {
        this.LJLJLJ.LJI(Boolean.valueOf(z));
    }

    public final void LJJLIIIJLLLLLLLZ(IAO iao) {
        if (iao.LJLJI != null) {
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

    @Override // X.InterfaceC164206cS
    public void LJJZ(boolean z) {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLFF.LJLJJLL;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.setEnabled(z);
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC164206cS
    public void LLJILLL(Animation value) {
        o.LJIIIZ(value, "value");
        this.LLFF.LLJILLL(value);
    }

    @Override // X.InterfaceC164206cS
    public void LLLLLLLLLL(boolean z) {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLFF.LJLJJLL;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.LLILLIZIL = z;
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC164206cS
    public void LLLLLLZZ(boolean z) {
        ImageView imageView = this.LLFF.LJLJLJ;
        if (imageView != null) {
            imageView.setSelected(z);
        } else {
            o.LJIJI("goNextButton");
            throw null;
        }
    }

    @Override // X.InterfaceC164206cS
    public void LLLLLZ(int i) {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLFF.LJLJJLL;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.setCurrentScaleMode(i);
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC164206cS
    public void M3(int i) {
        this.LJLLI.LJI(Integer.valueOf(i));
    }

    @Override // X.InterfaceC164206cS
    public void O5(OSJ<? extends List<? extends TimeSpeedModelExtension>, Long, ? extends TimeSpeedModelExtension> value) {
        o.LJIIIZ(value, "value");
        this.LJLL.LJI(value);
    }

    @Override // X.InterfaceC164206cS
    public void Q0(OSZ<? extends List<? extends TimeSpeedModelExtension>, Long> value) {
        o.LJIIIZ(value, "value");
        this.LJLLJ.LJI(value);
    }

    @Override // X.InterfaceC164206cS
    public void e6(OSZ<? extends List<? extends TimeSpeedModelExtension>, Long> value) {
        o.LJIIIZ(value, "value");
        this.LJLJLLL.LJI(value);
    }

    @Override // X.InterfaceC164206cS
    public void f(int i) {
        ImageView imageView = this.LLFF.LJLJLJ;
        if (imageView != null) {
            imageView.setVisibility(i);
        } else {
            o.LJIJI("goNextButton");
            throw null;
        }
    }

    @Override // X.InterfaceC164206cS
    public void h(int i) {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLFF.LJLJJLL;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.LJIIJ(i);
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC164206cS
    public void h5(RetakeVideoContext value) {
        o.LJIIIZ(value, "value");
        this.LJLLILLLL.LJI(value);
    }

    @Override // X.InterfaceC164206cS
    public void i7(boolean z) {
        this.LJLJJL.LJI(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC164206cS
    public void l(int i) {
        View view = this.LLFF.LJLJL;
        if (view != null) {
            view.setVisibility(i);
        } else {
            o.LJIJI("deleteLast");
            throw null;
        }
    }

    @Override // X.InterfaceC164206cS
    public void s3(boolean z) {
        this.LJLJJLL.LJI(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC164206cS
    public void t6(OSJ<? extends List<? extends TimeSpeedModelExtension>, Long, ? extends TimeSpeedModelExtension> value) {
        o.LJIIIZ(value, "value");
        this.LJLLL.LJI(value);
    }

    @Override // X.InterfaceC164206cS
    public void LLLIL(int i, boolean z) {
        ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr = this.LLFF.LJLJJLL;
        if (viewOnTouchListenerC82377WUr != null) {
            viewOnTouchListenerC82377WUr.LJIILIIL(i, z);
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    public C82365WUf(C82622Wbi diContainer, WMH parentScene, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = this;
        Boolean bool = Boolean.TRUE;
        this.LJLJJL = new C40871j1<>(bool);
        this.LJLJJLL = new C40871j1<>(bool);
        this.LJLJL = new C40871j1<>(0L);
        this.LJLJLJ = new C40871j1<>(bool);
        this.LJLJLLL = new C40871j1<>(null);
        this.LJLL = new C40871j1<>(null);
        this.LJLLI = new C40871j1<>(-1);
        this.LJLLILLLL = new C40871j1<>(null);
        this.LJLLJ = new C40871j1<>(null);
        this.LJLLL = new C40871j1<>(null);
        this.LJLLLL = (ActivityC45651qj) getDiContainer().LJ(ActivityC45651qj.class, null);
        this.LJLLLLLL = UCI.LJII(getDiContainer(), InterfaceC45999I3n.class, null);
        this.LJLZ = (InterfaceC82353WTt) getDiContainer().LJIIIIZZ(null, InterfaceC82353WTt.class);
        this.LJZ = UCI.LJII(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LJZI = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJZL = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LL = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LLD = UCI.LJI(getDiContainer(), ActivityC45651qj.class, null);
        this.LLF = 15000;
        this.LLFF = new C82378WUs(LJJLI(), getDiContainer());
    }
}
