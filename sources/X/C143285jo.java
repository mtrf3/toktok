package X;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.utils.UniqueLiveData;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import defpackage.i0;
import dmt.av.video.ReplayLiveData;
import dmt.av.video.StoredLiveData;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS92S0101000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5jo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143285jo implements InterfaceC142545ic {
    public static final C143485k8 LJLJLJ = new Object() { // from class: X.5k8
    };
    public SurfaceView LJLIL;
    public InterfaceC142545ic LJLILLLLZI;
    public final MutableLiveData<C76800UCe> LJLJI = new MutableLiveData<>();
    public final MutableLiveData<C143405k0> LJLJJI;
    public final C5H3 LJLJJL;
    public FrameLayout LJLJJLL;
    public final Queue<InterfaceC88472Yns<InterfaceC142545ic, C76800UCe>> LJLJL;

    private final void LIZIZ(String str) {
    }

    @Override // X.InterfaceC143655kP
    public void Ay(int i) {
    }

    public void LJIIIZ(C5MG c5mg) {
    }

    @Override // X.InterfaceC142545ic
    public void Yj(FilterBean filter) {
        o.LJIIIZ(filter, "filter");
    }

    @Override // X.InterfaceC143655kP
    public void Zm(MutableLiveData<Integer> value) {
        o.LJIIIZ(value, "value");
    }

    @Override // X.InterfaceC142545ic
    public void pr0(String path) {
        o.LJIIIZ(path, "path");
    }

    @Override // X.InterfaceC142545ic
    public NLEModel r9() {
        return null;
    }

    @Override // X.InterfaceC142545ic
    public void tJ() {
    }

    @Override // X.InterfaceC142545ic
    public void uJ(float f, float f2, float f3) {
    }

    @Override // X.InterfaceC143655kP
    public void x8() {
    }

    private final UniqueLiveData<InterfaceC153045zY> LIZJ() {
        return (UniqueLiveData) this.LJLJJL.getValue();
    }

    @Override // X.InterfaceC143655kP
    public LiveData<Boolean> Av() {
        LIZIZ("musicStartChangeConfirmLiveData");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public InterfaceC133095Kf Ax() {
        LIZIZ("getVEPreviewParams");
        return new VEPreviewParams();
    }

    @Override // X.InterfaceC143655kP
    public void BE() {
        LIZIZ("shortCutPublish");
    }

    @Override // X.InterfaceC142545ic
    public LiveData<C76800UCe> BP() {
        LIZIZ("textInitDoneEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public MutableLiveData<Bitmap> C0() {
        LIZIZ("firstFrameBitmap");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<SurfaceView> D50() {
        LIZIZ("surfaceViewLiveData");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public MutableLiveData<C5MM> DM() {
        LIZIZ("previewControlLiveData");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C140415fB> Dm() {
        LIZIZ("currSelectedFilter");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<OSZ<C76800UCe, String>> Dw() {
        LIZIZ("saveVideoToLocalEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<OSZ<C76800UCe, String>> Hi0() {
        LIZIZ("quickSaveDraftEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC142545ic
    public void Iq0() {
        LIZIZ("storeNLEToPublishEditModel");
    }

    @Override // X.InterfaceC143655kP
    public FrameLayout Iy() {
        LIZIZ("getPreviewLayout");
        FrameLayout frameLayout = this.LJLJJLL;
        if (frameLayout != null) {
            return frameLayout;
        }
        o.LJIJI("frameLayout");
        throw null;
    }

    @Override // X.InterfaceC143655kP
    public ArrayList<EffectPointModel> J7() {
        LIZIZ("effectPointModelStack");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC142545ic
    public boolean Jg0() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // X.InterfaceC143655kP
    public boolean Jt0() {
        LIZIZ("isInterceptApplyEffect");
        return false;
    }

    @Override // X.InterfaceC142545ic
    public LiveData<C76800UCe> Kj0() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // X.InterfaceC142545ic
    public void L() {
        LJ(new AqS168S0100000_2(this, 510));
    }

    @Override // X.InterfaceC142545ic
    public VideoPublishEditModel LLLLIL() {
        LIZIZ("getPublishEditModel");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<OSZ<Boolean, Integer>> Lg0() {
        LIZIZ("needShowToolbarLottieAnimationEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public MutableLiveData<C122144qo> Lo0() {
        LIZIZ("autoEnhanceControlOpLiveData");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC142545ic
    public LiveData<C76800UCe> MM() {
        LIZIZ("changedMusicEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public void Mo0() {
        LIZIZ("finishDelayReleaseVEEngineTask");
    }

    @Override // X.InterfaceC143655kP
    public void Mt0() {
        LIZIZ("preNextStep");
    }

    @Override // X.InterfaceC142545ic
    public LiveData<C76800UCe> N() {
        LIZIZ("modifyDisplayEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public C5S3 N40() {
        LIZIZ("audioFadeoutController");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC142545ic
    public void NF() {
        LIZIZ("emitTextInitDone");
    }

    @Override // X.InterfaceC143655kP
    public LiveData<InterfaceC148845sm> Nm() {
        LIZIZ("filterIntensityStore");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC142545ic
    public LiveData<C76800UCe> OU() {
        LIZIZ("dismissPrivacyToastEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public MutableLiveData<C140335f3> PM() {
        LIZIZ("onPreviewScaleChanged");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<OSZ<Boolean, Integer>> Qs() {
        LIZIZ("needShowTitleBarLoadingEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC142545ic
    public C126844yO Qt() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // X.InterfaceC142545ic
    public void R30() {
        LIZIZ("dismissPrivacyToast");
    }

    @Override // X.InterfaceC143655kP
    public MutableLiveData<Boolean> Rq() {
        LIZIZ("infoStickerPinStatusLiveData");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public void Ru() {
        LIZIZ("nextStep");
    }

    @Override // X.InterfaceC143655kP
    public void S50() {
        LIZIZ("registerDelayReleaseVEEngineTask");
    }

    @Override // X.InterfaceC142545ic
    public void S60() {
        this.LJLJI.setValue(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<Boolean> SW() {
        LIZIZ("preNextStepEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public StoredLiveData<C5RV> Sj0() {
        LIZIZ("timeEffectOpLiveData");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C76800UCe> TL() {
        LIZIZ("nextStepEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public MutableLiveData<Integer> UR() {
        LIZIZ("trackTypeLiveData");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public int V30() {
        LIZIZ("pauseOrigin");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC142545ic
    public LiveData<Integer> Vm() {
        LIZIZ("changePageBgColorEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public FilterBean W40() {
        LIZIZ("getCurrentFilter");
        return null;
    }

    @Override // X.InterfaceC143655kP
    public int W60() {
        LIZIZ("getSurfaceLayoutHeight");
        SurfaceView surfaceView = this.LJLIL;
        if (surfaceView != null) {
            return surfaceView.getWidth();
        }
        o.LJIJI("surfaceView");
        throw null;
    }

    @Override // X.InterfaceC143655kP
    public C5MG WS() {
        LIZIZ("veVideoEditor");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C76800UCe> We0() {
        LIZIZ("clickSettingEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<Boolean> Xb0() {
        LIZIZ("updateLayout");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<Boolean> Zj0() {
        LIZIZ("markEngineReleaseState");
        return new MutableLiveData();
    }

    @Override // X.InterfaceC143655kP
    public LiveData<OSJ<Boolean, Boolean, Boolean>> Zq0() {
        LIZIZ("showSetting");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<Void> bq0() {
        LIZIZ("editPrepareDone");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC142545ic
    public LiveData<C76800UCe> cM() {
        LIZIZ("canvasToVideoEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public ViewGroup.MarginLayoutParams cd() {
        LIZIZ("getSurfaceLayoutParams");
        SurfaceView surfaceView = this.LJLIL;
        if (surfaceView != null) {
            ViewGroup.LayoutParams layoutParams = surfaceView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return (ViewGroup.MarginLayoutParams) layoutParams;
        }
        o.LJIJI("surfaceView");
        throw null;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<Void> dZ() {
        LIZIZ("editPrepareDonePersist");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public void dq0() {
        LIZIZ("directQuit");
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C123754tP> eA() {
        LIZIZ("soundLoopChangeOpLiveData");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public MutableLiveData<Integer> fc0() {
        LIZIZ("inSecondLevelPageEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public void finish() {
        LIZIZ("finish");
    }

    @Override // X.InterfaceC143655kP
    public void go0() {
        LIZIZ("cancelDelayReleaseVEEngineTask");
    }

    @Override // X.InterfaceC143655kP
    public LiveData<OSZ<Boolean, Integer>> he0() {
        LIZIZ("needShowSaveLocalSuccessStringEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C5RV> i3() {
        LIZIZ("timeEffectOpResult");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public void i90() {
        LIZIZ("clickSetting");
    }

    @Override // X.InterfaceC143655kP
    public LiveData<OSZ<C76800UCe, String>> jC() {
        LIZIZ("saveLocalEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<Boolean> jb() {
        LIZIZ("reverseSource");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<VEPreviewMusicParams> jn() {
        LIZIZ("previewMusicParams");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C76800UCe> kn0() {
        LIZIZ("beforeNextStepEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public void lN() {
        LIZIZ("beforeNextStep");
    }

    @Override // X.InterfaceC143655kP
    public int lU() {
        LIZIZ("getSurfaceLayoutWidth");
        SurfaceView surfaceView = this.LJLIL;
        if (surfaceView != null) {
            return surfaceView.getWidth();
        }
        o.LJIJI("surfaceView");
        throw null;
    }

    @Override // X.InterfaceC143655kP
    public void p1() {
        LIZIZ("restoreFilter");
    }

    @Override // X.InterfaceC143655kP
    public ReplayLiveData<C5RT> pJ() {
        LIZIZ("filterEffectOpLiveData");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C123774tR> pR() {
        LIZIZ("musicStartChangeOpLiveData");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public boolean pi() {
        LIZIZ("getEngineReleaseState");
        return false;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C143495k9> pp0() {
        LIZIZ("videoDecodeInfo");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<Boolean> q40() {
        LIZIZ("readTextFetchAudioStatusLiveData");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<Boolean> q60() {
        LIZIZ("needShowLoadingEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public boolean qF() {
        LIZIZ("isFilterPanelShow");
        return false;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<OSZ<Boolean, C143515kB>> qP() {
        LIZIZ("quitEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC142545ic
    public void qs0() {
        LIZIZ("canvasToVideoEvent");
    }

    @Override // X.InterfaceC142545ic
    public LiveData<C76800UCe> qv() {
        LIZIZ("photosToVideoEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C76800UCe> sI() {
        LIZIZ("shortCutPublishEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<IAudioEffectParam> sP() {
        LIZIZ("modelAudioEffectLiveData");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C76800UCe> sU() {
        LIZIZ("directQuitEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public MutableLiveData<Boolean> tG() {
        LIZIZ("surfaceCreatedLiveData");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C76800UCe> tH() {
        LIZIZ("finishEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<VEVolumeChangeOp> tZ() {
        LIZIZ("volumeChangeOpLiveData");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<Integer> tf() {
        LIZIZ("bottomTabHeight");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<InterfaceC122704ri> v50() {
        LIZIZ("filterDefaultIntensityGetter");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<OSZ<Boolean, Integer>> vE() {
        LIZIZ("saveLocalReadyToMockSuccessEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC142545ic
    public void w00() {
        LIZIZ("emitPhotosToVideo");
    }

    @Override // X.InterfaceC143655kP
    public LiveData<Void> wf0() {
        LIZIZ("editFirstFrameDone");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<VEEditorAutoStartStopArbiter> wz() {
        LIZIZ("autoStopArbiter");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public MutableLiveData<Boolean> x7() {
        LIZIZ("firstFrameVisible");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public LiveData<OSZ<C76800UCe, String>> xm0() {
        LIZIZ("saveImageToLocalEvent");
        throw new C39427Fdf(null, 1, null);
    }

    @Override // X.InterfaceC143655kP
    public void y00() {
        LIZIZ("restoreLastPreviewScale");
    }

    @Override // X.InterfaceC143655kP
    public LiveData<Integer> zL() {
        LIZIZ("statusHeight");
        throw new C39427Fdf(null, 1, null);
    }

    public C143285jo() {
        MutableLiveData<C143405k0> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new C143405k0(0));
        this.LJLJJI = mutableLiveData;
        this.LJLJJL = C221108m2.LIZIZ(C143465k6.LJLIL);
        this.LJLJL = new LinkedList();
    }

    @Override // X.InterfaceC143655kP
    public LiveData<InterfaceC153045zY> Kh() {
        return LIZJ();
    }

    @Override // X.InterfaceC143655kP
    public MutableLiveData<C143405k0> Mq() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC142545ic
    public List<EffectPointModel> YA() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC142545ic
    public LiveData<C76800UCe> p20() {
        return this.LJLJI;
    }

    private final void LJ(InterfaceC88472Yns<? super InterfaceC142545ic, C76800UCe> interfaceC88472Yns) {
        this.LJLJL.offer(interfaceC88472Yns);
    }

    private final void LJFF(InterfaceC142545ic interfaceC142545ic) {
        while (!this.LJLJL.isEmpty()) {
            this.LJLJL.poll().invoke(interfaceC142545ic);
        }
    }

    @Override // X.InterfaceC143655kP
    public void AE(C140415fB op) {
        o.LJIIIZ(op, "op");
        LIZIZ("setCurrFilter");
    }

    @Override // X.InterfaceC143655kP
    public void Dl0(VEVolumeChangeOp volumeChangeOp) {
        o.LJIIIZ(volumeChangeOp, "volumeChangeOp");
        LIZIZ("setVolumeChange");
    }

    @Override // X.InterfaceC143655kP
    public void Ea(C122144qo autoEnhanceControlOp) {
        o.LJIIIZ(autoEnhanceControlOp, "autoEnhanceControlOp");
        LIZIZ("setAutoEnhanceControl");
    }

    @Override // X.InterfaceC143655kP
    public void Ic(String str) {
        LIZIZ("saveImageToLocal");
    }

    @Override // X.InterfaceC143655kP
    public void Kp(int i) {
        LIZIZ("setAddMusicTrackIndex");
    }

    public final void LJI(InterfaceC142545ic tiktokEditPreviewApi) {
        o.LJIIIZ(tiktokEditPreviewApi, "tiktokEditPreviewApi");
        this.LJLILLLLZI = tiktokEditPreviewApi;
        LJFF(tiktokEditPreviewApi);
    }

    @Override // X.InterfaceC143655kP
    public void MK(C5PF effectOp) {
        o.LJIIIZ(effectOp, "effectOp");
        LIZIZ("changeAudioEffect");
    }

    @Override // X.InterfaceC143655kP
    public void Ml(boolean z) {
        LIZIZ("setAutoStartStopArbiter");
    }

    @Override // X.InterfaceC143655kP
    public void N6(boolean z) {
        LIZIZ("clearFilter");
    }

    @Override // X.InterfaceC143655kP
    public void Nj0(C143555kF param) {
        o.LJIIIZ(param, "param");
        LIZIZ("setLyricAudioInfo");
    }

    @Override // X.InterfaceC143655kP
    public void Nn0(boolean z) {
        LIZIZ("preNextStep");
    }

    @Override // X.InterfaceC143655kP
    public void Ov(boolean z) {
        LIZIZ("setInterceptApplyEffect");
    }

    @Override // X.InterfaceC143655kP
    public void PS(boolean z) {
        LIZIZ("markEngineReleaseState");
    }

    @Override // X.InterfaceC143655kP
    public void Pf0(boolean z) {
        LIZIZ("setUserStopped");
    }

    @Override // X.InterfaceC143655kP
    public void UE(String str) {
        LIZIZ("quickSaveDraftEvent");
    }

    @Override // X.InterfaceC143655kP
    public void YM(int i) {
        LJ(new AqS92S0101000_2(this, i, 3));
    }

    @Override // X.InterfaceC143655kP
    public void ak(String str) {
        LIZIZ("saveToLocal");
    }

    @Override // X.InterfaceC143655kP
    public void dn(boolean z) {
        LIZIZ("setInfoStickerPinStatus");
    }

    @Override // X.InterfaceC143655kP
    public void gw(int i) {
        LJ(new AqS92S0101000_2(this, i, 4));
    }

    @Override // X.InterfaceC143655kP
    public LiveData<String> ij(int i) {
        LIZIZ("getEffectCallbackData");
        return null;
    }

    @Override // X.InterfaceC143655kP
    public void jo(String str) {
        LIZIZ("saveVideoToLocal");
    }

    @Override // X.InterfaceC143655kP
    public void m70(boolean z) {
        LIZIZ("shouldUpdateLayout");
    }

    @Override // X.InterfaceC143655kP
    public void nc0(boolean z) {
        LIZIZ("setFilterPanelShow");
    }

    @Override // X.InterfaceC143655kP
    public void oF(C140335f3 previewScaleOp) {
        o.LJIIIZ(previewScaleOp, "previewScaleOp");
        LIZIZ("changePreviewScale");
    }

    @Override // X.InterfaceC143655kP
    public void rZ(boolean z) {
        LIZIZ("setMusicStartChangeResult");
    }

    @Override // X.InterfaceC143655kP
    public void tt0(C123754tP soundLoopChangeOp) {
        o.LJIIIZ(soundLoopChangeOp, "soundLoopChangeOp");
        LIZIZ("setSoundLoopChange");
    }

    @Override // X.InterfaceC143655kP
    public void uC(C123774tR musicStartChangeOp) {
        o.LJIIIZ(musicStartChangeOp, "musicStartChangeOp");
        LIZIZ("setMusicStartChange");
    }

    @Override // X.InterfaceC143655kP
    public void wZ(boolean z) {
        LIZIZ("setReadTextFetchAudioStatus");
    }

    @Override // X.InterfaceC143655kP
    public boolean x70(VEPreviewMusicParams params) {
        o.LJIIIZ(params, "params");
        LIZIZ("changeMusic");
        return false;
    }

    @Override // X.InterfaceC143655kP
    public void Gd(boolean z, int i) {
        LIZIZ("needShowToolbarLottieAnimation");
    }

    @Override // X.InterfaceC143655kP
    public void Ot(boolean z, C143515kB c143515kB) {
        LIZIZ("quit");
    }

    @Override // X.InterfaceC143655kP
    public void Uc(boolean z, int i) {
        LIZIZ("needShowSaveLocalSuccessString");
    }

    @Override // X.InterfaceC143655kP
    public void aM(boolean z, int i) {
        LIZIZ("saveLocalReadyToMockSuccess");
    }

    @Override // X.InterfaceC142545ic
    public void h10(long j, long j2) {
        LIZIZ("setMobFirstFrameParams");
    }

    @Override // X.InterfaceC143655kP
    public void ul0(boolean z, int i) {
        LIZIZ("needShowTitleBarLoading");
    }

    @Override // X.InterfaceC143655kP
    public void updateTrackFilterParam(int i, VEBaseFilterParam param) {
        o.LJIIIZ(param, "param");
        LIZIZ("updateTrackFilterParam");
    }

    @Override // X.InterfaceC143655kP
    public void I7(int i, int i2, VEBaseFilterParam param) {
        o.LJIIIZ(param, "param");
        LIZIZ("updateTrackClipFilter");
    }

    @Override // X.InterfaceC143655kP
    public void U2(boolean z, boolean z2, boolean z3) {
        LIZIZ("showSetting");
    }

    @Override // X.InterfaceC143655kP
    public void tp(FilterBean filterBean, FilterBean filterBean2, float f) {
        LIZIZ("setFilterOnFling");
    }

    @Override // X.InterfaceC143655kP
    public void LJJIJL(int i, long j, long j2, String arg3) {
        o.LJIIIZ(arg3, "arg3");
        LIZIZ("sendEffectMsg");
    }

    @Override // X.InterfaceC143655kP
    public void LA(VEPreviewMusicParams params, long j, long j2, long j3, long j4) {
        o.LJIIIZ(params, "params");
        LIZIZ("updateMusicParamsCache");
    }
}
