package X;

import Y.AObjectS89S0100000_14;
import android.app.Activity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.recording.NowsShootActivityArg;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS176S0200000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS18S0010000_14;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WIM extends AbstractC48231ut<InterfaceC82335WTb, W3M, W3V, WIS> implements InterfaceC135635Tz, InterfaceC82335WTb {
    public static final WIQ LLIIIJ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIL;
    public final WMH LJLL;
    public final C82622Wbi LJLLI;
    public final MutableLiveData<Integer> LJLLILLLL;
    public final LiveData<Integer> LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC115514g7 LJZI;
    public InterfaceC45540Hu4 LJZL;
    public boolean LL;
    public boolean LLD;
    public final InterfaceC115514g7 LLF;
    public final InterfaceC115514g7 LLFF;
    public final int LLFFF;
    public boolean LLFII;
    public final InterfaceC115514g7 LLFZ;
    public final InterfaceC115514g7 LLI;
    public final InterfaceC115514g7 LLIFFJFJJ;
    public final InterfaceC65784Pro<W3V> LLII;
    public final InterfaceC65784Pro<WIS> LLIIII;
    public final InterfaceC82335WTb LLIIIILZ;

    static {
        TBT tbt = new TBT(WIM.class, "toolApiComponent", "getToolApiComponent()Lcom/ss/android/ugc/gamora/recorder/toolbar/refactory/ToolbarApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIL = new InterfaceC74236TBo[]{tbt, new TBT(WIM.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new TBT(WIM.class, "musicApiComponent", "getMusicApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/ChooseMusicApiComponent;", 0), new TBT(WIM.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0), new TBT(WIM.class, "beautyApi", "getBeautyApi()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0), new TBT(WIM.class, "activity", "getActivity()Landroid/app/Activity;", 0), new TBT(WIM.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new TBT(WIM.class, "permissionUIApiComponent", "getPermissionUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0), new TBT(WIM.class, "creativeInfo", "getCreativeInfo()Lcom/ss/android/ugc/aweme/creative/CreativeInfo;", 0), new TBT(WIM.class, "enterShootParam", "getEnterShootParam()Lcom/ss/android/ugc/aweme/services/recording/NowsShootActivityArg;", 0), new TBT(WIM.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0)};
        LLIIIJ = new WIQ();
    }

    private final I37 LLIIIL() {
        return (I37) this.LJZ.LIZ(this, LLIIIL[4]);
    }

    private final CreativeInfo LLIILZL() {
        return (CreativeInfo) this.LLFZ.LIZ(this, LLIIIL[8]);
    }

    private final NowsShootActivityArg LLIIZ() {
        return (NowsShootActivityArg) this.LLI.LIZ(this, LLIIIL[9]);
    }

    private final I8W LLILZIL() {
        return (I8W) this.LLFF.LIZ(this, LLIIIL[7]);
    }

    private final InterfaceC82062WIo LLILZLL() {
        return (InterfaceC82062WIo) this.LJLLL.LIZ(this, LLIIIL[0]);
    }

    private final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LLIFFJFJJ.LIZ(this, LLIIIL[10]);
    }

    private final I3K getSplitShootApiComponent() {
        return (I3K) this.LJLZ.LIZ(this, LLIIIL[3]);
    }

    private final I0N getStickerApiComponent() {
        return (I0N) this.LJLLLL.LIZ(this, LLIIIL[1]);
    }

    @Override // X.InterfaceC82335WTb
    public void LJIJI() {
        LJJZZI(W3Y.LJLIL);
    }

    public final List<W3N> LLF() {
        ArrayList arrayList = new ArrayList();
        W3N w3n = new W3N(0, R.raw.icon_camera_flip_camera, false, 0, null, false, new AqS196S0100000_14(this, 16), 124);
        W3N w3n2 = new W3N(19, R.raw.icon_camera_flash_slash_fill, false, 0, null, false, new AqS196S0100000_14(this, 14), 124);
        W3N w3n3 = new W3N(12, R.raw.icon_music_note_s_alt, false, 0, null, false, new AqS196S0100000_14(this, 15), 124);
        if (C43865HJl.LIZIZ() && C1B8.LIZJ() && !C1DG.LJIIIIZZ()) {
            arrayList.add(new W3N(25, R.raw.icon_caption_ai, C60903NvH.LJIIJJI().LJJIL().getAICaptionSwitch(false), 0, null, true, new AqS196S0100000_14(this, 13), 52));
        }
        C34K c34k = new C34K();
        c34k.element = C78886Uxe.LJFF().LIZIZ();
        if (!HYV.LIZ()) {
            c34k.element = false;
        }
        arrayList.addAll(C47261Igj.LJJIJIIJI(w3n3, new W3N(6, WI2.LIZ(), c34k.element, 0, new AqS180S0100000_14(this, 107), false, new AqS176S0200000_14(c34k, this, 0), 84), w3n2, w3n));
        if (C53210KuU.LIZ() && !C78605Ut7.LJFF("android.permission.RECORD_AUDIO")) {
            this.LLFII = true;
            ListProtector.add(arrayList, this.LLFFF, new W3N(10, R.raw.icon_mic_fill, true, R.raw.icon_color_right_bottom_none, null, false, new AqS196S0100000_14(this, 12), 100));
        }
        return arrayList;
    }

    public final void LLFFF() {
        this.LJLLILLLL.setValue(19);
    }

    public final Activity LLIFFJFJJ() {
        return (Activity) this.LJZI.LIZ(this, LLIIIL[5]);
    }

    public final I27 LLILL() {
        return (I27) this.LJLLLLLL.LIZ(this, LLIIIL[2]);
    }

    public final void LLJ() {
        if (this.LLFII) {
            this.LLFII = false;
            LJJZZI(new AqS180S0100000_14(this, 109));
        }
    }

    public final void LLJI() {
        OHI ohi = OHI.LIZ;
        Activity LLIFFJFJJ = LLIFFJFJJ();
        ohi.getClass();
        C61099NyR.LIZIZ.LIZIZ(LLIFFJFJJ(), TokenCert.Companion.with("bpea-request_audio_by_click_mic_story")).LIZ("android.permission.RECORD_AUDIO").LIZJ(new WJN(OHI.LJI(LLIFFJFJJ, "android.permission.RECORD_AUDIO"), this));
    }

    public final void LLJJ() {
        this.LJLLILLLL.setValue(0);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLF.LIZ(this, LLIIIL[6]);
    }

    public final void LJLZ() {
        Object obj;
        boolean aICaptionSwitch = C60903NvH.LJIIJJI().LJJIL().getAICaptionSwitch(false);
        boolean z = !aICaptionSwitch;
        LJJZZI(new AqS18S0010000_14(z, 13));
        C60903NvH.LJIIJJI().LJJIL().setAICaptionSwitch(z);
        OSZ[] oszArr = new OSZ[7];
        oszArr[0] = new OSZ("creation_id", LLIILZL().getCreationId());
        oszArr[1] = new OSZ("shoot_way", LLIIZ().getShootWay());
        oszArr[2] = new OSZ("enter_from", "video_shoot_page");
        oszArr[3] = new OSZ("content_source", "shoot");
        oszArr[4] = new OSZ("content_type", "now");
        String str = "on";
        if (aICaptionSwitch) {
            obj = "on";
        } else {
            obj = "off";
        }
        oszArr[5] = new OSZ("from_mode", obj);
        if (!z) {
            str = "off";
        }
        oszArr[6] = new OSZ("to_mode", str);
        FMX.LJIIL("click_auto_meme_mode_entrance", C113554cx.LJJLIIIIJ(oszArr));
    }

    public final void LJZI() {
        if (HYV.LIZ()) {
            InterfaceC82062WIo LLILZLL = LLILZLL();
            if (LLILZLL != null) {
                LLILZLL.Ak(2);
                return;
            }
            return;
        }
        InterfaceC82062WIo LLILZLL2 = LLILZLL();
        if (LLILZLL2 == null) {
            return;
        }
        LLILZLL2.Ak(6);
    }

    public final void LLIZ() {
        ((InterfaceC45925I0r) getDiContainer().LJ(InterfaceC45925I0r.class, null)).l10(true, false);
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        C0IB<Boolean> x80;
        C0IB<Boolean> ip0;
        super.onCreate();
        this.LJZL = C163756bj.LIZIZ(this.LJLL);
        getStickerApiComponent().sF().LIZLLL(this, new AObjectS89S0100000_14(this, 111));
        C82622Wbi diContainer = getDiContainer();
        if (L2L.LIZ(diContainer)) {
            ((C1EP) diContainer.LJ(C1EP.class, null)).m3(I27.class, new AqS180S0100000_14(this, 108));
        } else {
            C0I6 c0i6 = (C0I6) diContainer.LJIIIIZZ(null, I27.class);
            if (c0i6 != null) {
                ((I27) c0i6).getChooseMusic().LIZLLL(this, new AObjectS89S0100000_14(this, 112));
            }
        }
        LLIIIL().Hg0().LIZLLL(this, new AObjectS89S0100000_14(this, 113));
        InterfaceC82086WJm cameraApiComponent = getCameraApiComponent();
        if (cameraApiComponent != null && (ip0 = cameraApiComponent.ip0()) != null) {
            ip0.LIZIZ(this, new AObjectS89S0100000_14(this, 114));
        }
        getSplitShootApiComponent().fv0().LIZLLL(this, new AObjectS89S0100000_14(this, 115));
        I8W LLILZIL = LLILZIL();
        if (LLILZIL != null && (x80 = LLILZIL.x80()) != null) {
            x80.LIZIZ(this, new AObjectS89S0100000_14(this, 116));
        }
        e4(true);
    }

    @Override // X.AbstractC29891Fh
    public void onStart() {
        super.onStart();
        if (C53210KuU.LIZ() && C78605Ut7.LJFF("android.permission.RECORD_AUDIO") && this.LLFII) {
            LLJ();
        }
        if (C43865HJl.LIZIZ() && C1B8.LIZJ() && !C1DG.LJIIIIZZ()) {
            LJJZZI(W3X.LJLIL);
        }
    }

    @Override // X.InterfaceC82335WTb
    public LiveData<Integer> Cq0() {
        return this.LJLLJ;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<W3V> LJJLIIIJJI() {
        return this.LLII;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<WIS> LJJLIIIJJIZ() {
        return this.LLIIII;
    }

    @Override // X.AbstractC41331jl, X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C0I6 getApiComponent() {
        return this.LLIIIILZ;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC82335WTb
    public void LLFII(boolean z) {
        e4(z);
    }

    @Override // X.InterfaceC82335WTb
    public void dd(boolean z) {
        this.LL = z;
        LJJZZI(new AqS180S0100000_14(this, 110));
    }

    public final void e4(boolean z) {
        if (z) {
            if (C78605Ut7.LJFF("android.permission.RECORD_AUDIO")) {
                LLJ();
            }
            show();
            return;
        }
        hide();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WIM(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        boolean z;
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = parentScene;
        this.LJLLI = diContainer;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.LJLLILLLL = mutableLiveData;
        this.LJLLJ = mutableLiveData;
        this.LJLLL = UCI.LJII(getDiContainer(), InterfaceC82062WIo.class, null);
        this.LJLLLL = UCI.LJI(getDiContainer(), I0N.class, null);
        this.LJLLLLLL = UCI.LJI(getDiContainer(), I27.class, null);
        this.LJLZ = UCI.LJI(getDiContainer(), I3K.class, null);
        this.LJZ = UCI.LJI(getDiContainer(), I37.class, null);
        this.LJZI = UCI.LJI(getDiContainer(), Activity.class, null);
        if (C78886Uxe.LJFF().LIZIZ() && HYV.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        this.LLD = z;
        this.LLF = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LLFF = UCI.LJII(getDiContainer(), I8W.class, null);
        this.LLFFF = 1;
        this.LLFZ = UCI.LJI(getDiContainer(), CreativeInfo.class, null);
        this.LLI = UCI.LJI(getDiContainer(), NowsShootActivityArg.class, null);
        this.LLIFFJFJJ = UCI.LJII(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LLII = new AqS164S0100000_14(this, 113);
        this.LLIIII = new AqS164S0100000_14(this, 114);
        this.LLIIIILZ = this;
    }
}
