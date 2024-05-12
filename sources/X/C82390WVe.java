package X;

import Y.AObjectS89S0100000_14;
import Y.AObserverS82S0100000_14;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.recording.NowsShootActivityArg;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS18S0010000_14;
import kotlin.jvm.internal.AqS38S0001000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WVe */
/* loaded from: classes15.dex */
public final class C82390WVe extends AbstractC48231ut<InterfaceC82336WTc, ViewOnClickListenerC82415WWd, WVY, C82414WWc> implements InterfaceC82336WTc, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIILII;
    public final ActivityC45651qj LJLL;
    public final int LJLLI;
    public final WMH LJLLILLLL;
    public final C82622Wbi LJLLJ;
    public final C5H3 LJLLL;
    public final C5H3 LJLLLL;
    public final C5H3 LJLLLLLL;
    public final C5H3 LJLZ;
    public final C5H3 LJZ;
    public final InterfaceC115514g7 LJZI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final InterfaceC115514g7 LLD;
    public final InterfaceC115514g7 LLF;
    public final InterfaceC115514g7 LLFF;
    public final InterfaceC115514g7 LLFFF;
    public final InterfaceC115514g7 LLFII;
    public final InterfaceC115514g7 LLFZ;
    public final InterfaceC115514g7 LLI;
    public boolean LLIFFJFJJ;
    public long LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public boolean LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public int LLIIJI;
    public final C43885HKf LLIIJLIL;
    public final InterfaceC65784Pro<ViewOnClickListenerC82415WWd> LLIIL;

    public static /* synthetic */ void LLFFF() {
    }

    public final void LLJJJIL() {
        this.LLIFFJFJJ = true;
        if (this.LLIIJI == 0) {
            LLJJIJIL(this, null, 1, null);
        }
    }

    @Override // X.InterfaceC82336WTc
    public void b() {
        LJLZ(true);
    }

    static {
        TBT tbt = new TBT(C82390WVe.class, "avListenableActivityRegistry", "getAvListenableActivityRegistry()Lcom/ss/android/ugc/tools/view/activity/AVListenableActivityRegistry;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIILII = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82390WVe.class, "creativeInfo", "getCreativeInfo()Lcom/ss/android/ugc/aweme/creative/CreativeInfo;", 0, c65351Pkp), C61845OOz.LIZJ(C82390WVe.class, "nowsShootModel", "getNowsShootModel()Lcom/ss/android/ugc/aweme/creative/model/NowsShootModel;", 0, c65351Pkp), C61845OOz.LIZJ(C82390WVe.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(C82390WVe.class, "enterShootParam", "getEnterShootParam()Lcom/ss/android/ugc/aweme/services/recording/NowsShootActivityArg;", 0, c65351Pkp), C61845OOz.LIZJ(C82390WVe.class, "dockBarApiComponent", "getDockBarApiComponent()Lcom/ss/android/ugc/gamora/recorder/control/DockBarApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82390WVe.class, "toolApiComponent", "getToolApiComponent()Lcom/ss/android/ugc/aweme/nows/toolbar/NowSimpleToolbarApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82390WVe.class, "nowDockBarApiComponent", "getNowDockBarApiComponent()Lcom/ss/android/ugc/aweme/nows/dock/NowDockBarApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82390WVe.class, "nowStickerChangeApiComponent", "getNowStickerChangeApiComponent()Lcom/ss/android/ugc/aweme/nows/sticker/NowStickerChangeApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82390WVe.class, "permissionUIApiComponent", "getPermissionUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0, c65351Pkp)};
    }

    private final InterfaceC45540Hu4 LLF() {
        return (InterfaceC45540Hu4) this.LJZI.LIZ(this, LLIILII[0]);
    }

    private final CreativeInfo LLIFFJFJJ() {
        return (CreativeInfo) this.LJZL.LIZ(this, LLIILII[1]);
    }

    private final InterfaceC45889Hzh LLIIIL() {
        return (InterfaceC45889Hzh) this.LLFF.LIZ(this, LLIILII[5]);
    }

    private final InterfaceC82341WTh LLIIZ() {
        return (InterfaceC82341WTh) this.LLFII.LIZ(this, LLIILII[7]);
    }

    private final InterfaceC45315HqR LLILL() {
        return (InterfaceC45315HqR) this.LLFZ.LIZ(this, LLIILII[8]);
    }

    private final InterfaceC82352WTs LLILZIL() {
        return (InterfaceC82352WTs) this.LJLLL.getValue();
    }

    private final I8W LLIZ() {
        return (I8W) this.LLI.LIZ(this, LLIILII[9]);
    }

    private final C161786Wo LLJ() {
        return (C161786Wo) this.LJZ.getValue();
    }

    private final GTW LLJI() {
        return (GTW) this.LJLZ.getValue();
    }

    private final C82367WUh LLJJ() {
        return (C82367WUh) this.LJLLLLLL.getValue();
    }

    private final InterfaceC82335WTb LLJJI() {
        return (InterfaceC82335WTb) this.LLFFF.LIZ(this, LLIILII[6]);
    }

    private final boolean LLJJIII() {
        int i = this.LLIIJI;
        if (i == 2 || i == 0) {
            return true;
        }
        return false;
    }

    private final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLLLL.getValue();
    }

    @Override // X.InterfaceC82336WTc
    public void Ik() {
        LJJZZI(C82391WVf.LJLIL);
    }

    @Override // X.InterfaceC82336WTc
    public void LJIJI() {
        LJJZZI(C82394WVi.LJLIL);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<WVY> LJJLIIIJJI() {
        return new AqS164S0100000_14(this, 119);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C82414WWc> LJJLIIIJJIZ() {
        return new AqS164S0100000_14(this, LiveTryModeCountDownThresholdSetting.DEFAULT);
    }

    public final NowsShootActivityArg LLIILZL() {
        return (NowsShootActivityArg) this.LLF.LIZ(this, LLIILII[4]);
    }

    public final NowsShootModel LLILZLL() {
        return (NowsShootModel) this.LL.LIZ(this, LLIILII[2]);
    }

    public final void LLJLIL() {
        String str;
        int i = this.LLIIJI;
        if (i != 0) {
            if (i != 2) {
                return;
            }
            b();
            return;
        }
        this.LLIIIZ = !this.LLIIIZ;
        LLLIIIL();
        NowsShootModel LLILZLL = LLILZLL();
        String str2 = "on";
        if (this.LLIIIZ) {
            str = "on";
        } else {
            str = "off";
        }
        LLILZLL.getClass();
        LLILZLL.lightStatus = str;
        CreativeInfo creativeInfo = LLIFFJFJJ();
        boolean z = this.LLIIIZ;
        String shootWay = LLIILZL().getShootWay();
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(shootWay, "shootWay");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creativeInfo.getCreationId());
        c145995oB.LJI("shoot_way", shootWay);
        c145995oB.LJI("shoot_page", "now_shoot_page");
        c145995oB.LJI("content_type", "now");
        c145995oB.LJI("shoot_tab_name", "now");
        if (!z) {
            str2 = "off";
        }
        c145995oB.LJI("to_status", str2);
        GXR.LIZ("light", c145995oB.LIZ);
    }

    public final void LLJLLIL() {
        int i = this.LLIIJI;
        if (i != 0) {
            if (i != 2) {
                return;
            }
            LLILZIL().Zr();
            return;
        }
        LJZI();
    }

    public final void LLJZIJLIL() {
        C142625ik.LIZIZ = this.LJLLI;
        InterfaceC45889Hzh LLIIIL = LLIIIL();
        if (LLIIIL != null) {
            LLIIIL.manualClickUploadButton();
        }
    }

    @Override // X.InterfaceC82336WTc
    public void P50() {
        LJJZZI(C82393WVh.LJLIL);
    }

    @Override // X.InterfaceC82336WTc
    public void bf() {
        LJJZZI(C82392WVg.LJLIL);
    }

    @Override // X.InterfaceC82336WTc
    public void fo0() {
        if (this.LLIIIZ) {
            this.LLIIIZ = false;
            LJJZZI(new AqS180S0100000_14(this, 121));
            InterfaceC82335WTb LLJJI = LLJJI();
            if (LLJJI != null) {
                LLJJI.dd(this.LLIIIZ);
            }
            LLILZIL().v90(this.LLIIIZ);
        }
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLD.LIZ(this, LLIILII[3]);
    }

    public final void LJZI() {
        String str;
        boolean LLFZ = getCameraApiComponent().LLFZ();
        LLILZIL().LLLIILIL();
        if (LLFZ) {
            str = "back";
        } else {
            str = "front";
        }
        String shootWay = LLIILZL().getShootWay();
        o.LJIIIZ(shootWay, "shootWay");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", shootWay);
        c145995oB.LJI("shoot_page", "now_shoot_page");
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("to_status", str);
        c145995oB.LJI("action_type", "click_flip_button");
        c145995oB.LJI("dual_camera_support", CardStruct.IStatusCode.DEFAULT);
        GXR.LIZ("flip_now_camera", c145995oB.LIZ);
    }

    public final void LLLI() {
        LLILZIL().GO(getCameraApiComponent().LLFZ());
    }

    public final void LLLIIIL() {
        InterfaceC82335WTb LLJJI = LLJJI();
        if (LLJJI != null) {
            LLJJI.dd(this.LLIIIZ);
        }
        LLILZIL().v90(this.LLIIIZ);
        LJJZZI(new AqS180S0100000_14(this, 122));
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        LiveData<Integer> Cq0;
        C0IB<Boolean> x80;
        C0IB<Boolean> albumPageVisibilityState;
        super.onCreate();
        getCameraApiComponent().uB().LIZLLL(this, new AObjectS89S0100000_14(this, 117));
        C82622Wbi diContainer = getDiContainer();
        if (L2L.LIZ(diContainer)) {
            ((C1EP) diContainer.LJ(C1EP.class, null)).m3(I27.class, new AqS180S0100000_14(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
        } else {
            C0I6 c0i6 = (C0I6) diContainer.LJIIIIZZ(null, I27.class);
            if (c0i6 != null) {
                ((I27) c0i6).getMusicPanelShow().LIZLLL(this, new AObjectS89S0100000_14(this, 118));
            }
        }
        InterfaceC45889Hzh LLIIIL = LLIIIL();
        if (LLIIIL != null && (albumPageVisibilityState = LLIIIL.getAlbumPageVisibilityState()) != null) {
            albumPageVisibilityState.LIZIZ(this, new AObjectS89S0100000_14(this, 119));
        }
        I8W LLIZ = LLIZ();
        if (LLIZ != null && (x80 = LLIZ.x80()) != null) {
            x80.LIZIZ(this, new AObjectS89S0100000_14(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
        }
        InterfaceC82335WTb LLJJI = LLJJI();
        if (LLJJI != null && (Cq0 = LLJJI.Cq0()) != null) {
            Cq0.observe(this, new AObserverS82S0100000_14(this, 20));
        }
        ((InterfaceC82353WTt) getDiContainer().LJ(InterfaceC82353WTt.class, null)).Ef0(new C82395WVj(this));
        LLLIIIL();
    }

    @Override // X.AbstractC29891Fh
    public void onPause() {
        super.onPause();
        if (LLJJIII()) {
            return;
        }
        LLILZIL().p();
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
        if (LLJJIII()) {
            return;
        }
        LJLZ(false);
    }

    @Override // X.AbstractC29891Fh
    public void onStart() {
        super.onStart();
        LLF().registerActivityOnKeyDownListener(this.LLIIJLIL);
    }

    @Override // X.AbstractC29891Fh
    public void onStop() {
        super.onStop();
        LLF().unRegisterActivityOnKeyDownListener(this.LLIIJLIL);
    }

    @Override // X.AbstractC48231ut
    public InterfaceC65784Pro<ViewOnClickListenerC82415WWd> LJLJJLL() {
        return this.LLIIL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLJ;
    }

    private final void LJLZ(boolean z) {
        LLILZIL().of0(z);
        LLJJ().reset();
        G2(0);
        InterfaceC82335WTb LLJJI = LLJJI();
        if (LLJJI != null) {
            LLJJI.LLFII(true);
        }
        InterfaceC82341WTh LLIIZ = LLIIZ();
        if (LLIIZ != null) {
            LLIIZ.GP(true);
        }
        getShortVideoContext().creativeModel.recordEffectModel.isStoryRecording = false;
        fo0();
        LLLI();
        if (z) {
            LLILZLL().nowsExtra.retakeNum++;
        }
    }

    private final void LLLFFI(View view) {
        if (o.LJ(LLIILZL().getEnterMethod(), "click_regular_push")) {
            C197457oz.LIZ(Z89.LIZIZ, this.LJLL, null, true, 8);
        }
        this.LJLL.finish();
        if (LLILZLL().nowsExtra.retakeNum == 0) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("shoot_way", "now");
            c145995oB.LJI("shoot_entrance", "now");
            c145995oB.LJI("shoot_page", "now_shoot_page");
            c145995oB.LJI("dual_camera_support", CardStruct.IStatusCode.DEFAULT);
            GXR.LIZ("shoot_exceed_countdown", c145995oB.LIZ);
        }
    }

    @Override // X.InterfaceC82336WTc
    public void G2(int i) {
        this.LLIIJI = i;
        if (i == 2) {
            LLJI().NA();
            LLJ().show();
            this.LLIIIL = true;
        } else if (this.LLIIIL) {
            LLJ().hide();
        }
        LJJZZI(new AqS38S0001000_14(i, 3));
    }

    public final boolean LLJJIJI(View view) {
        if (this.LLIIIILZ || this.LLIIIJ) {
            return false;
        }
        int i = this.LLIIJI;
        if (i != 0) {
            if (i == 1) {
                LLLFZ(this, null, 1, null);
            }
        } else {
            LLLFZ(this, null, 1, null);
        }
        return true;
    }

    public final void LLJJL(boolean z) {
        LLILZLL().nowsExtra.isDualCamera = z;
        ((Keva) C43879HJz.LIZ.getValue()).storeBoolean("is_dual_camera", z);
        LLILZIL().t0(z);
        InterfaceC45315HqR LLILL = LLILL();
        if (LLILL != null) {
            LLILL.Ob(z);
        }
    }

    @Override // X.InterfaceC82336WTc
    public void hc(boolean z) {
        if (this.LLIIIILZ == z) {
            return;
        }
        this.LLIIIILZ = z;
    }

    @Override // X.InterfaceC82336WTc
    public void showBottomTab(boolean z) {
        InterfaceC82341WTh LLIIZ;
        LJJZZI(new AqS18S0010000_14(z, 14));
        if (z) {
            LLJJ().show();
            return;
        }
        if (W2U.LIZ() && (LLIIZ = LLIIZ()) != null) {
            LLIIZ.Lc(true);
        }
        LLJJ().hide();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82390WVe(ActivityC45651qj activity, int i, WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = activity;
        this.LJLLI = i;
        this.LJLLILLLL = parentScene;
        this.LJLLJ = diContainer;
        this.LJLLL = C269113v.LIZ(this, InterfaceC82352WTs.class);
        this.LJLLLL = C269113v.LIZ(this, InterfaceC82086WJm.class);
        this.LJLLLLLL = C269113v.LIZ(this, C82367WUh.class);
        this.LJLZ = C269113v.LIZ(this, GTW.class);
        this.LJZ = C269113v.LIZ(this, C161786Wo.class);
        this.LJZI = UCI.LJI(getDiContainer(), InterfaceC45540Hu4.class, null);
        this.LJZL = UCI.LJI(getDiContainer(), CreativeInfo.class, null);
        this.LL = UCI.LJI(getDiContainer(), NowsShootModel.class, null);
        this.LLD = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LLF = UCI.LJI(getDiContainer(), NowsShootActivityArg.class, null);
        this.LLFF = UCI.LJII(getDiContainer(), InterfaceC45889Hzh.class, null);
        this.LLFFF = UCI.LJII(getDiContainer(), InterfaceC82335WTb.class, null);
        this.LLFII = UCI.LJII(getDiContainer(), InterfaceC82341WTh.class, null);
        this.LLFZ = UCI.LJII(getDiContainer(), InterfaceC45315HqR.class, null);
        this.LLI = UCI.LJII(getDiContainer(), I8W.class, null);
        this.LLIIJLIL = new C43885HKf(this);
        this.LLIIL = C82396WVk.LJLIL;
    }

    public static /* synthetic */ boolean LLJJIJIL(C82390WVe c82390WVe, View view, int i, Object obj) {
        if ((i & 1) != 0) {
            view = null;
        }
        return c82390WVe.LLJJIJI(view);
    }

    public static /* synthetic */ void LLLFZ(C82390WVe c82390WVe, View view, int i, Object obj) {
        if ((i & 1) != 0) {
            view = null;
        }
        c82390WVe.LLLFFI(view);
    }
}
