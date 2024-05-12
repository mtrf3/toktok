package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.services.audio.DetectionPathResult;
import com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionParam;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionResult;
import com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService$startDetectVoiceActivity$1$result$1", f = "VoiceDetectorService.kt", l = {117, LiveTryModeCountDownThresholdSetting.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.6hc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167406hc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super VoiceDetectionResult>, Object> {
    public int LJLIL;
    public final /* synthetic */ IVoiceDetectorConfig LJLILLLLZI;
    public final /* synthetic */ VoiceDetectorService LJLJI;
    public final /* synthetic */ VoiceDetectionParam LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C167406hc(IVoiceDetectorConfig iVoiceDetectorConfig, VoiceDetectorService voiceDetectorService, VoiceDetectionParam voiceDetectionParam, InterfaceC67352kd<? super C167406hc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = iVoiceDetectorConfig;
        this.LJLJI = voiceDetectorService;
        this.LJLJJI = voiceDetectionParam;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C167406hc(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj2);
                    return obj2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj2);
        } else {
            C141335gf.LIZJ(obj2);
            IVoiceDetectorConfig iVoiceDetectorConfig = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj2 = iVoiceDetectorConfig.getVoiceDetectPath(this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        DetectionPathResult detectionPathResult = (DetectionPathResult) obj2;
        String path = detectionPathResult.getPath();
        if (path != null) {
            VoiceDetectorService voiceDetectorService = this.LJLJI;
            VoiceDetectionParam voiceDetectionParam = this.LJLJJI;
            IVoiceDetectorConfig iVoiceDetectorConfig2 = this.LJLILLLLZI;
            this.LJLIL = 2;
            Object LIZIZ = voiceDetectorService.LIZIZ(path, voiceDetectionParam, iVoiceDetectorConfig2, this);
            if (LIZIZ != enumC58928NAu) {
                return LIZIZ;
            }
            return enumC58928NAu;
        }
        VoiceDetectionResult detectionResult = detectionPathResult.getDetectionResult();
        if (detectionResult != null) {
            return detectionResult;
        }
        return new VoiceDetectionResult(-1, "unknown", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, false, 12, null);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super VoiceDetectionResult> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
