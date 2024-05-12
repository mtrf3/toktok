package X;

import Y.AObjectS89S0100000_14;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.RecordEffectModel;
import com.ss.android.ugc.aweme.framework.services.StickerTagChangeData;
import com.ss.android.ugc.aweme.services.recording.NowsShootActivityArg;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS18S0010000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WUh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82367WUh extends AbstractC48231ut<WSC, WVO, WVI, C53602L1y> implements WSC, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIFFJFJJ;
    public final WMH LJLL;
    public final C82622Wbi LJLLI;
    public String LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final C73318Sq2 LJLLL;
    public final C0IB<Boolean> LJLLLL;
    public final ShortVideoContext LJLLLLLL;
    public final C5H3 LJLZ;
    public final C5H3 LJZ;
    public final C5H3 LJZI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final InterfaceC115514g7 LLD;
    public final InterfaceC115514g7 LLF;
    public final InterfaceC115514g7 LLFF;
    public final InterfaceC115514g7 LLFFF;
    public final InterfaceC115514g7 LLFII;
    public final InterfaceC115514g7 LLFZ;
    public long LLI;

    static {
        TBT tbt = new TBT(C82367WUh.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIFFJFJJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82367WUh.class, "tikTokRecordControlApi", "getTikTokRecordControlApi()Lcom/ss/android/ugc/aweme/shortvideo/recordcontrol/TikTokRecordControlApi;", 0, c65351Pkp), C61845OOz.LIZJ(C82367WUh.class, "creativeInfo", "getCreativeInfo()Lcom/ss/android/ugc/aweme/creative/CreativeInfo;", 0, c65351Pkp), C61845OOz.LIZJ(C82367WUh.class, "shootModel", "getShootModel()Lcom/ss/android/ugc/aweme/creative/model/NowsShootModel;", 0, c65351Pkp), C61845OOz.LIZJ(C82367WUh.class, "enterPramas", "getEnterPramas()Lcom/ss/android/ugc/aweme/services/recording/NowsShootActivityArg;", 0, c65351Pkp), C61845OOz.LIZJ(C82367WUh.class, "nowToolbarComponent", "getNowToolbarComponent()Lcom/ss/android/ugc/aweme/nows/toolbar/NowSimpleToolbarApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82367WUh.class, "nowDockBarApiComponent", "getNowDockBarApiComponent()Lcom/ss/android/ugc/aweme/nows/dock/NowDockBarApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82367WUh.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82367WUh.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0, c65351Pkp)};
    }

    private final InterfaceC82336WTc LJLZ() {
        return (InterfaceC82336WTc) this.LJZ.getValue();
    }

    private final InterfaceC82352WTs LJZI() {
        return (InterfaceC82352WTs) this.LJLZ.getValue();
    }

    private final CreativeInfo LLF() {
        return (CreativeInfo) this.LL.LIZ(this, LLIFFJFJJ[2]);
    }

    private final NowsShootActivityArg LLFFF() {
        return (NowsShootActivityArg) this.LLF.LIZ(this, LLIFFJFJJ[4]);
    }

    private final InterfaceC82341WTh LLIFFJFJJ() {
        return (InterfaceC82341WTh) this.LLFFF.LIZ(this, LLIFFJFJJ[6]);
    }

    private final InterfaceC82335WTb LLIIIL() {
        return (InterfaceC82335WTb) this.LLFF.LIZ(this, LLIFFJFJJ[5]);
    }

    private final NowsShootModel LLIILZL() {
        return (NowsShootModel) this.LLD.LIZ(this, LLIFFJFJJ[3]);
    }

    private final InterfaceC45967I2h LLIIZ() {
        return (InterfaceC45967I2h) this.LJZL.LIZ(this, LLIFFJFJJ[1]);
    }

    private final InterfaceC82353WTt getGestureApiComponent() {
        return (InterfaceC82353WTt) this.LJLLJ.LIZ(this, LLIFFJFJJ[0]);
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.LJZI.getValue();
    }

    @Override // X.WSC
    public void LJIJI() {
        LJJZZI(C82371WUl.LJLIL);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C53602L1y> LJJLIIIJJIZ() {
        return new AqS159S0100000_9(this, 478);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLILZLL() {
        String str;
        IDH LLLF;
        IDH LLLF2;
        MutableLiveData Za;
        StickerTagChangeData stickerTagChangeData;
        new C61996OUu(C78688UuS.LJIJJ(this)).LIZ(0);
        C0IB<Boolean> mD = mD();
        o.LJII(mD, "null cannot be cast to non-null type com.bytedance.als.MutableLiveState<kotlin.Boolean>");
        ((C40871j1) mD).LJI(Boolean.TRUE);
        LJLZ().G2(1);
        if (W2U.LIZ()) {
            RecordEffectModel recordEffectModel = this.LJLLLLLL.creativeModel.recordEffectModel;
            recordEffectModel.isStoryRecording = true;
            I0N stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent != null && (LLLF = stickerApiComponent.LLLF()) != null && LLLF.isShowing()) {
                I0N stickerApiComponent2 = getStickerApiComponent();
                if (stickerApiComponent2 != null && (LLLF2 = stickerApiComponent2.LLLF()) != null && (Za = LLLF2.Za()) != null && (stickerTagChangeData = (StickerTagChangeData) Za.getValue()) != null) {
                    str = stickerTagChangeData.getTabName();
                } else {
                    str = null;
                }
            } else {
                str = "video_shoot_page";
            }
            recordEffectModel.enterFrom = str;
            I0N stickerApiComponent3 = getStickerApiComponent();
            if (stickerApiComponent3 != null) {
                stickerApiComponent3.W90(false, "");
            }
        }
        LJZI().il0();
        InterfaceC82335WTb LLIIIL = LLIIIL();
        if (LLIIIL != null) {
            LLIIIL.LLFII(false);
        }
        InterfaceC82341WTh LLIFFJFJJ2 = LLIFFJFJJ();
        if (LLIFFJFJJ2 != null) {
            LLIFFJFJJ2.GP(false);
        }
        LJJZZI(C82368WUi.LJLIL);
        LLIILZL().firstContentType = "photo";
        HC6.LJIIJ(LLFFF(), LJZI().e8().getMediaController(), LJZI().LLFZ(), LLIILZL(), false);
    }

    public final void LLIZ() {
        this.LJLLLLLL.creativeModel.recordEffectModel.isStoryRecording = false;
        LJZI().LJJJJIZL();
        if (C82442WXe.LIZIZ) {
            CreativeInfo creativeInfo = LLF();
            o.LJIIIZ(creativeInfo, "creativeInfo");
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("shoot_way", "now");
            c145995oB.LJI("creation_id", creativeInfo.getCreationId());
            GXR.LIZ("slide_zoom", c145995oB.LIZ);
        }
    }

    @Override // X.WSC
    public void ME() {
        LJJZZI(C82370WUk.LJLIL);
    }

    public final I3K getSplitShootApiComponent() {
        return (I3K) this.LLFZ.LIZ(this, LLIFFJFJJ[8]);
    }

    public final I0N getStickerApiComponent() {
        return (I0N) this.LLFII.LIZ(this, LLIFFJFJJ[7]);
    }

    @Override // X.WSC
    public void reset() {
        LJJZZI(C82369WUj.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLILZIL() {
        String str;
        IDH LLLF;
        IDH LLLF2;
        MutableLiveData Za;
        StickerTagChangeData stickerTagChangeData;
        C0IB<Boolean> mD = mD();
        o.LJII(mD, "null cannot be cast to non-null type com.bytedance.als.MutableLiveState<kotlin.Boolean>");
        ((C40871j1) mD).LJI(Boolean.TRUE);
        LJLZ().G2(3);
        InterfaceC82335WTb LLIIIL = LLIIIL();
        if (LLIIIL != null) {
            LLIIIL.LLFII(false);
        }
        InterfaceC82341WTh LLIFFJFJJ2 = LLIFFJFJJ();
        if (LLIFFJFJJ2 != null) {
            LLIFFJFJJ2.GP(false);
        }
        if (W2U.LIZ()) {
            RecordEffectModel recordEffectModel = this.LJLLLLLL.creativeModel.recordEffectModel;
            I0N stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent != null && (LLLF = stickerApiComponent.LLLF()) != null && LLLF.isShowing()) {
                I0N stickerApiComponent2 = getStickerApiComponent();
                if (stickerApiComponent2 != null && (LLLF2 = stickerApiComponent2.LLLF()) != null && (Za = LLLF2.Za()) != null && (stickerTagChangeData = (StickerTagChangeData) Za.getValue()) != null) {
                    str = stickerTagChangeData.getTabName();
                } else {
                    str = null;
                }
            } else {
                str = "video_shoot_page";
            }
            recordEffectModel.enterFrom = str;
            this.LJLLLLLL.creativeModel.recordEffectModel.isStoryRecording = true;
            I0N stickerApiComponent3 = getStickerApiComponent();
            if (stickerApiComponent3 != null) {
                stickerApiComponent3.W90(false, "");
            }
        }
        LJZI().LLJJJJ();
        C82442WXe.LIZIZ = false;
        HC6.LJIIJ(LLFFF(), LJZI().e8().getMediaController(), LJZI().LLFZ(), LLIILZL(), false);
    }

    public final void LLJ() {
        LJZI().LJL();
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        I0N stickerApiComponent;
        LiveEvent<C76800UCe> xU;
        LiveEvent<C44302Ha6> aa0;
        super.onCreate();
        InterfaceC45967I2h LLIIZ = LLIIZ();
        if (LLIIZ != null && (aa0 = LLIIZ.aa0()) != null) {
            aa0.LIZLLL(this, new AObjectS89S0100000_14(this, 105));
        }
        if (W2U.LIZ() && (stickerApiComponent = getStickerApiComponent()) != null && (xU = stickerApiComponent.xU()) != null) {
            xU.LIZLLL(this, new AObjectS89S0100000_14(this, 106));
        }
        getRecordControlApi().Vh().LIZLLL(this, new AObjectS89S0100000_14(this, 107));
        getGestureApiComponent().lh0().LIZLLL(this, new AObjectS89S0100000_14(this, 108));
        getGestureApiComponent().G00().LIZIZ(this, new AObjectS89S0100000_14(this, 109));
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        this.LJLLL.dispose();
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<WVI> LJJLIIIJJI() {
        return C82373WUn.LJLIL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    @Override // X.WSC
    public C0IB<Boolean> mD() {
        return this.LJLLLL;
    }

    @Override // X.WSC
    public void Il(boolean z) {
        LJJZZI(new AqS18S0010000_14(z, 10));
    }

    @Override // X.WSC
    public void i5(boolean z) {
        LJJZZI(new AqS18S0010000_14(z, 12));
    }

    @Override // X.WSC
    public void setEnabled(boolean z) {
        LJJZZI(new AqS18S0010000_14(z, 11));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82367WUh(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = parentScene;
        this.LJLLI = diContainer;
        this.LJLLJ = UCI.LJI(getDiContainer(), InterfaceC82353WTt.class, null);
        this.LJLLL = new C73318Sq2();
        this.LJLLLL = new C40871j1(Boolean.FALSE);
        this.LJLLLLLL = (ShortVideoContext) getDiContainer().LJ(ShortVideoContext.class, null);
        this.LJLZ = C269113v.LIZ(this, InterfaceC82352WTs.class);
        this.LJZ = C269113v.LIZ(this, InterfaceC82336WTc.class);
        this.LJZI = C269113v.LIZ(this, I3X.class);
        this.LJZL = UCI.LJII(getDiContainer(), InterfaceC45967I2h.class, null);
        this.LL = UCI.LJI(getDiContainer(), CreativeInfo.class, null);
        this.LLD = UCI.LJI(getDiContainer(), NowsShootModel.class, null);
        this.LLF = UCI.LJI(getDiContainer(), NowsShootActivityArg.class, null);
        this.LLFF = UCI.LJII(getDiContainer(), InterfaceC82335WTb.class, null);
        this.LLFFF = UCI.LJII(getDiContainer(), InterfaceC82341WTh.class, null);
        this.LLFII = UCI.LJII(getDiContainer(), I0N.class, null);
        this.LLFZ = UCI.LJII(getDiContainer(), I3K.class, null);
        this.LLI = LivePlayEnforceIntervalSetting.DEFAULT;
    }

    public final void LLILL(float f, float f2) {
        LJZI().LLILII(f, f2);
    }
}
