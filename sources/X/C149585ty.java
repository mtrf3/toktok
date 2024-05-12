package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService;
import com.ss.android.ugc.gamora.editor.music.experiment.AutoMusicRecommendConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.5ty, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149585ty extends AbstractC29891Fh<InterfaceC140175en> implements InterfaceC140175en, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJL;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;

    static {
        TBT tbt = new TBT(C149585ty.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJJL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C149585ty.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C149585ty.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0, c65351Pkp)};
    }

    public InterfaceC140175en LJJLIIIJILLIZJL() {
        return this;
    }

    private final InterfaceC142515iZ LJJLIIIJJI() {
        return (InterfaceC142515iZ) this.LJLJJI.LIZ(this, LJLJJL[2]);
    }

    private final InterfaceC143655kP LJJLIIIJJIZ() {
        return (InterfaceC143655kP) this.LJLILLLLZI.LIZ(this, LJLJJL[0]);
    }

    private final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LJLJI.LIZ(this, LJLJJL[1]);
    }

    private final void LJJLI() {
        VoiceDetectorService.LIZ().clearVoiceActivityDetection(1);
    }

    private final void LJJLIIIIJ() {
        VoiceDetectorService.LIZ().clearVoiceActivityDetection(0);
    }

    @Override // X.InterfaceC140175en
    public void na0() {
        NLEModel LJJ;
        InterfaceC153045zY value = LJJLIIIJJIZ().Kh().getValue();
        if (value == null || (LJJ = C17N.LJJ(value)) == null) {
            return;
        }
        C60903NvH.LJIIJJI().initDownloadableModel();
        LJJLIIJ(LJJ);
        LJJLIIIJLLLLLLLZ(LJJ);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        InterfaceC142515iZ LJJLIIIJJI = LJJLIIIJJI();
        if (LJJLIIIJJI != null) {
            LJJLIIIJJI.Ns0(this);
        }
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        LJJLIIIIJ();
        LJJLI();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC140175en getApiComponent() {
        LJJLIIIJILLIZJL();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C149585ty(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJI = UCI.LJII(getDiContainer(), InterfaceC142515iZ.class, null);
    }

    private final void LJJLIIIJLLLLLLLZ(NLEModel nLEModel) {
        C62822Ol8 c62822Ol8 = C149595tz.LIZIZ;
        VoiceDetectorService.LIZ().startDetectVoiceActivity(new VoiceDetectionParam(1, ((AutoMusicRecommendConfig) c62822Ol8.getValue()).aedCheckBusinessType, ((AutoMusicRecommendConfig) c62822Ol8.getValue()).aedCheckThresh), new C167046h2(System.currentTimeMillis(), nLEModel, LLLLIL()));
    }

    private final void LJJLIIJ(NLEModel nLEModel) {
        FFL.LJIIIZ().getClass();
        VoiceDetectorService.LIZ().startDetectVoiceActivity(new VoiceDetectionParam(0, "", FFL.LJII(31744, "vocal_ratio", 0.6d)), new C167056h3(System.currentTimeMillis(), nLEModel, LLLLIL()));
    }
}
