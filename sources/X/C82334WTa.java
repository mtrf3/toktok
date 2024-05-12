package X;

import Y.AObjectS89S0100000_14;
import Y.AObserverS82S0100000_14;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.RecordEffectModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WTa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82334WTa extends AbstractC29891Fh<InterfaceC81634W2c> implements InterfaceC81634W2c, InterfaceC135635Tz, InterfaceC144185lG {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LL;
    public final WMH LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final int LJLJI;
    public final EnumC06840Oq LJLJJI;
    public final boolean LJLJJL;
    public final InterfaceC81634W2c LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final C33R<Boolean> LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final String[] LJZ;
    public volatile boolean LJZI;
    public final C5H3 LJZL;

    static {
        TBT tbt = new TBT(C82334WTa.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82334WTa.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(C82334WTa.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82334WTa.class, "recordPermissionUIApiComponent", "getRecordPermissionUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82334WTa.class, "slideSlipBottomStickerApiComponent", "getSlideSlipBottomStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/slideslip/SlideSlipBottomStickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82334WTa.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82334WTa.class, "nowsSwitchApiComponent", "getNowsSwitchApiComponent()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0, c65351Pkp), C61845OOz.LIZJ(C82334WTa.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82334WTa.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82334WTa.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp)};
    }

    private final I8W LJJLI() {
        return (I8W) this.LJLLI.LIZ(this, LL[3]);
    }

    private final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LJLJL.LIZ(this, LL[0]);
    }

    private final I0N getStickerApiComponent() {
        return (I0N) this.LJLZ.LIZ(this, LL[9]);
    }

    private final boolean isActive() {
        if (this.LJZI && !SceneExtensionsKt.LIZ(LJJLIIIJILLIZJL())) {
            return true;
        }
        return false;
    }

    public final InterfaceC82129WLd LJJLIIIIJ() {
        return (InterfaceC82129WLd) this.LJLLILLLL.LIZ(this, LL[4]);
    }

    public final C82216WOm LJJLIIIJILLIZJL() {
        return (C82216WOm) this.LJZL.getValue();
    }

    @Override // X.InterfaceC81634W2c
    public float Wb() {
        View requireViewById = this.LJLIL.requireViewById(this.LJLJI);
        o.LJIIIIZZ(requireViewById, "parentScene.requireViewById<View>(viewId)");
        return requireViewById.getAlpha();
    }

    public final InterfaceC45979I2t getBottomTabApiComponent() {
        return (InterfaceC45979I2t) this.LJLLLL.LIZ(this, LL[7]);
    }

    public final WRQ getCameraApiComponent() {
        return (WRQ) this.LJLLJ.LIZ(this, LL[5]);
    }

    public final InterfaceC82325WSr getNowsSwitchApiComponent() {
        return (InterfaceC82325WSr) this.LJLLL.LIZ(this, LL[6]);
    }

    public final InterfaceC45999I3n getPlanCUIApiComponent() {
        return (InterfaceC45999I3n) this.LJLJLLL.LIZ(this, LL[2]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLJLJ.LIZ(this, LL[1]);
    }

    public final I3K getSplitShootApiComponent() {
        return (I3K) this.LJLLLLLL.LIZ(this, LL[8]);
    }

    @Override // X.InterfaceC81634W2c
    public boolean isShowing() {
        if (this.LJZI && this.LJLIL.getSceneContext() != null && this.LJLIL.isAdded(LJJLIIIJILLIZJL()) && this.LJLIL.isShowing(LJJLIIIJILLIZJL())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC81634W2c
    public void show() {
        if (!this.LJLIL.isAdded(LJJLIIIJILLIZJL())) {
            this.LJLIL.add(this.LJLJI, LJJLIIIJILLIZJL(), "NowsRecordTabRootScene");
            if (L2L.LIZ(getDiContainer()) && ((Boolean) C53068KsC.LIZ.getValue()).booleanValue()) {
                View requireViewById = this.LJLIL.requireViewById(this.LJLJI);
                o.LJIIIIZZ(requireViewById, "parentScene.requireViewById<View>(viewId)");
                requireViewById.setLayerType(2, null);
                gT(true, new AqS164S0100000_14(requireViewById, 96));
            }
            this.LJLL.compareAndSet(Boolean.FALSE, Boolean.TRUE);
        } else if (!this.LJLIL.isShowing(LJJLIIIJILLIZJL())) {
            this.LJLIL.show(LJJLIIIJILLIZJL());
        }
        InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(this.LJLIL);
        if (LIZIZ != null) {
            LIZIZ.registerActivityResultListener(this);
        }
    }

    private final void LJJLIIIJJI() {
        C0IB<C76800UCe> Jd;
        C0IB<Boolean> F40;
        C0IB<Float> Eh0;
        LiveEvent<Boolean> O80;
        C0IB<Boolean> GD;
        LiveData<C76800UCe> bX;
        C0IB<Boolean> iz;
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new C82338WTe(this, null));
        I8W LJJLI = LJJLI();
        if (LJJLI != null && (iz = LJJLI.iz()) != null) {
            iz.LIZIZ(this, new AObjectS89S0100000_14(this, 91));
        }
        InterfaceC82325WSr nowsSwitchApiComponent = getNowsSwitchApiComponent();
        if (nowsSwitchApiComponent != null && (bX = nowsSwitchApiComponent.bX()) != null) {
            bX.observe(this, new AObserverS82S0100000_14(this, 18));
        }
        InterfaceC82325WSr nowsSwitchApiComponent2 = getNowsSwitchApiComponent();
        if (nowsSwitchApiComponent2 != null && (GD = nowsSwitchApiComponent2.GD()) != null) {
            GD.LIZIZ(this, new AObjectS89S0100000_14(this, 92));
        }
        I0N stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (O80 = stickerApiComponent.O80()) != null) {
            O80.LIZLLL(this, new AObjectS89S0100000_14(this, 93));
        }
        InterfaceC82325WSr nowsSwitchApiComponent3 = getNowsSwitchApiComponent();
        if (nowsSwitchApiComponent3 != null && (Eh0 = nowsSwitchApiComponent3.Eh0()) != null) {
            Eh0.LIZIZ(this, new AObjectS89S0100000_14(this, 94));
        }
        InterfaceC82325WSr nowsSwitchApiComponent4 = getNowsSwitchApiComponent();
        if (nowsSwitchApiComponent4 != null && (F40 = nowsSwitchApiComponent4.F40()) != null) {
            F40.LIZIZ(this, new AObjectS89S0100000_14(this, 95));
        }
        InterfaceC82325WSr nowsSwitchApiComponent5 = getNowsSwitchApiComponent();
        if (nowsSwitchApiComponent5 != null && (Jd = nowsSwitchApiComponent5.Jd()) != null) {
            Jd.LIZIZ(this, new AObjectS89S0100000_14(this, 96));
        }
        getPlanCUIApiComponent().uj().LIZIZ(this, new AObjectS89S0100000_14(this, 97));
        getPlanCUIApiComponent().mZ().LIZIZ(this, new AObjectS89S0100000_14(this, 90));
    }

    @Override // X.InterfaceC81634W2c
    public void LJIJI() {
        C0IB<Boolean> iz;
        I8W i8w;
        C82216WOm LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        LJJLIIIJILLIZJL.LLJJIJIL();
        ((InterfaceC82341WTh) LJJLIIIJILLIZJL.LJZL.getValue()).LJIJI();
        ((InterfaceC82335WTb) LJJLIIIJILLIZJL.LLD.getValue()).LJIJI();
        ((InterfaceC82336WTc) LJJLIIIJILLIZJL.LJLZ.getValue()).LJIJI();
        ((WSC) LJJLIIIJILLIZJL.LJZ.getValue()).LJIJI();
        I8W i8w2 = (I8W) LJJLIIIJILLIZJL.LJZI.getValue();
        if (i8w2 != null && (iz = i8w2.iz()) != null && o.LJ(iz.LIZ(), Boolean.TRUE) && (i8w = (I8W) LJJLIIIJILLIZJL.LJZI.getValue()) != null) {
            i8w.Dd0();
        }
    }

    @Override // X.InterfaceC81634W2c
    public void LLLLZLLLI() {
        ((InterfaceC82352WTs) LJJLIIIJILLIZJL().LL.getValue()).LLLLZLLLI();
    }

    @Override // X.InterfaceC81634W2c
    public void hide() {
        if (!isShowing()) {
            return;
        }
        C82216WOm LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        ((InterfaceC82336WTc) LJJLIIIJILLIZJL.LJLZ.getValue()).fo0();
        ((InterfaceC82352WTs) LJJLIIIJILLIZJL.LL.getValue()).Gl();
        this.LJLIL.hide(LJJLIIIJILLIZJL());
        InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(this.LJLIL);
        if (LIZIZ != null) {
            LIZIZ.unRegisterActivityResultListener(this);
        }
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJJLIIIJJI();
        C43731HEh c43731HEh = C43731HEh.LIZ;
        c43731HEh.LIZIZ().LJI().LJJJJIZL();
        c43731HEh.LIZIZ().LJ().refreshData();
        WM7 findSceneByTag = this.LJLIL.findSceneByTag("NowsRecordTabRootScene");
        if (findSceneByTag != null) {
            this.LJLIL.remove(findSceneByTag);
        }
        if (this.LJLJJI == EnumC06840Oq.SHOW) {
            show();
        }
    }

    @Override // X.InterfaceC81634W2c
    public void va0() {
        ((InterfaceC82352WTs) LJJLIIIJILLIZJL().LL.getValue()).YF();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC81634W2c getApiComponent() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    public final void LJJLIIIJJIZ(InterfaceC82352WTs interfaceC82352WTs) {
        InterfaceC82325WSr nowsSwitchApiComponent = getNowsSwitchApiComponent();
        if (nowsSwitchApiComponent != null) {
            nowsSwitchApiComponent.bw(interfaceC82352WTs);
        }
        interfaceC82352WTs.Pu().LIZLLL(this, new AObjectS89S0100000_14(this, 98));
        interfaceC82352WTs.JD().LIZLLL(this, new AObjectS89S0100000_14(this, 99));
    }

    public final void LJJLIIIJLLLLLLLZ(WSC wsc) {
        InterfaceC82325WSr nowsSwitchApiComponent = getNowsSwitchApiComponent();
        if (nowsSwitchApiComponent != null) {
            nowsSwitchApiComponent.CV(wsc);
        }
    }

    @Override // X.InterfaceC81634W2c
    public <T extends C0I6> T m0(Class<T> clazz) {
        C82622Wbi LJJLIIIJJI;
        o.LJIIIZ(clazz, "clazz");
        if (!isActive() || (LJJLIIIJJI = C44384HbQ.LJJLIIIJJI(LJJLIIIJILLIZJL())) == null) {
            return null;
        }
        return (T) LJJLIIIJJI.LJIIIIZZ(null, clazz);
    }

    @Override // X.InterfaceC81634W2c
    public void showBottomTab(boolean z) {
        if (this.LJLIL.isAdded(LJJLIIIJILLIZJL()) && LJJLIIIJILLIZJL().isVisible()) {
            C82216WOm LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
            ((InterfaceC82341WTh) LJJLIIIJILLIZJL.LJZL.getValue()).GP(z);
            ((InterfaceC82335WTb) LJJLIIIJILLIZJL.LLD.getValue()).LLFII(z);
            ((InterfaceC82336WTc) LJJLIIIJILLIZJL.LJLZ.getValue()).showBottomTab(z);
        }
    }

    @Override // X.InterfaceC81634W2c
    public void wB(float f) {
        View requireViewById = this.LJLIL.requireViewById(this.LJLJI);
        o.LJIIIIZZ(requireViewById, "parentScene.requireViewById<View>(viewId)");
        requireViewById.setAlpha(f);
    }

    @Override // X.InterfaceC81634W2c
    public void gT(boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (z) {
            View requireViewById = this.LJLIL.requireViewById(this.LJLJI);
            o.LJIIIIZZ(requireViewById, "parentScene.requireViewById<View>(viewId)");
            C6IA.LIZ(requireViewById, 300L, interfaceC65784Pro);
        } else {
            View requireViewById2 = this.LJLIL.requireViewById(this.LJLJI);
            o.LJIIIIZZ(requireViewById2, "parentScene.requireViewById<View>(viewId)");
            C6IA.LIZIZ(requireViewById2, 200L, new AqS164S0100000_14(this, 95));
        }
    }

    @Override // X.InterfaceC81634W2c, X.InterfaceC150365vE
    public <T extends C0I6> void n4(Class<T> clazz, InterfaceC88472Yns<? super T, C76800UCe> onReady) {
        o.LJIIIZ(clazz, "clazz");
        o.LJIIIZ(onReady, "onReady");
        if (this.LJLL.getValue().booleanValue()) {
            C0I6 m0 = m0(clazz);
            if (m0 != null) {
                onReady.invoke(m0);
                return;
            }
            return;
        }
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new C82337WTd(this, clazz, onReady, null));
    }

    @Override // X.InterfaceC144185lG
    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (!isActive()) {
            return false;
        }
        C82216WOm LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        LJJLIIIJILLIZJL.getClass();
        if (!C47261Igj.LJJIJIIJI(12348, 12349).contains(Integer.valueOf(i))) {
            return false;
        }
        C82622Wbi LJJLIIIJJI = C44384HbQ.LJJLIIIJJI(LJJLIIIJILLIZJL);
        if (LJJLIIIJJI != null && ((C82390WVe) LJJLIIIJJI.LJ(C82390WVe.class, null)).LLIFFJFJJ) {
            Activity activity = LJJLIIIJILLIZJL.mActivity;
            if (activity != null) {
                activity.finish();
            }
        } else {
            C82622Wbi LJJLIIIJJI2 = C44384HbQ.LJJLIIIJJI(LJJLIIIJILLIZJL);
            if (LJJLIIIJJI2 != null) {
                ((InterfaceC82336WTc) LJJLIIIJJI2.LJ(InterfaceC82336WTc.class, null)).b();
            }
            WXN wxn = LJJLIIIJILLIZJL.LJLJLJ;
            if (wxn != null) {
                wxn.M5();
            }
            NowsShootModel nowsShootModel = LJJLIIIJILLIZJL.LJLLI;
            nowsShootModel.backBitmap = null;
            nowsShootModel.frontBitmap = null;
            nowsShootModel.backImagePath = null;
            nowsShootModel.frontImagePath = null;
            C43656HBk.LIZ.set(true);
            RecordEffectModel recordEffectModel = LJJLIIIJILLIZJL.LJLLJ.creativeModel.recordEffectModel;
            recordEffectModel.stickerChallenges = null;
            recordEffectModel.stickerInfo = null;
            recordEffectModel.effectInfo = null;
        }
        LJJLIIIJILLIZJL.LJLLJ.creativeModel.nowsShootModel = null;
        return true;
    }

    public C82334WTa(WMH parentScene, C82622Wbi diContainer, int i, EnumC06840Oq defaultVisibility, boolean z) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(defaultVisibility, "defaultVisibility");
        this.LJLIL = parentScene;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = i;
        this.LJLJJI = defaultVisibility;
        this.LJLJJL = z;
        this.LJLJJLL = this;
        this.LJLJL = UCI.LJI(getDiContainer(), ActivityC45651qj.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLJLLL = UCI.LJI(getDiContainer(), InterfaceC45999I3n.class, null);
        this.LJLL = V8H.LIZ(Boolean.FALSE);
        this.LJLLI = UCI.LJII(getDiContainer(), I8W.class, null);
        this.LJLLILLLL = UCI.LJII(getDiContainer(), InterfaceC82129WLd.class, null);
        this.LJLLJ = UCI.LJI(getDiContainer(), WRQ.class, null);
        this.LJLLL = UCI.LJII(getDiContainer(), InterfaceC82325WSr.class, null);
        this.LJLLLL = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        this.LJLLLLLL = UCI.LJII(getDiContainer(), I3K.class, null);
        this.LJLZ = UCI.LJII(getDiContainer(), I0N.class, null);
        this.LJZ = new String[]{I38.RECORD_NOW.getTag(), "record_mode_duet", "DUET_MODE_CAMERA_RECORD", "record_mode_mv"};
        this.LJZL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 94));
    }
}
