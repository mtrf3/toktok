package X;

import com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionListener;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionParam;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionResult;
import com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService$startDetectVoiceActivity$1", f = "VoiceDetectorService.kt", l = {115}, m = "invokeSuspend")
/* renamed from: X.6hd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167416hd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ IVoiceDetectorConfig LJLILLLLZI;
    public final /* synthetic */ C167436hf LJLJI;
    public final /* synthetic */ VoiceDetectionParam LJLJJI;
    public final /* synthetic */ VoiceDetectorService LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C167416hd(IVoiceDetectorConfig iVoiceDetectorConfig, C167436hf c167436hf, VoiceDetectionParam voiceDetectionParam, VoiceDetectorService voiceDetectorService, InterfaceC67352kd<? super C167416hd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = iVoiceDetectorConfig;
        this.LJLJI = c167436hf;
        this.LJLJJI = voiceDetectionParam;
        this.LJLJJL = voiceDetectorService;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C167416hd(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            XIC xic = C78613UtF.LIZ;
            C167406hc c167406hc = new C167406hc(this.LJLILLLLZI, this.LJLJJL, this.LJLJJI, null);
            this.LJLIL = 1;
            obj = XKX.LJI(xic, c167406hc, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        VoiceDetectionResult voiceDetectionResult = (VoiceDetectionResult) obj;
        this.LJLILLLLZI.setVoiceDetectCacheResult(voiceDetectionResult.getMatchThreshold());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("record voiceDetectionResult, ");
        LIZ.append(voiceDetectionResult.getMatchThreshold());
        LIZ.append(" , has callback = ");
        if (this.LJLJI.LIZJ == null) {
            z = false;
        }
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        this.LJLJI.LIZ = Boolean.valueOf(voiceDetectionResult.getMatchThreshold());
        VoiceDetectionListener voiceDetectionListener = this.LJLJI.LIZJ;
        if (voiceDetectionListener != null) {
            voiceDetectionListener.onVoiceActivityDetected(voiceDetectionResult.getMatchThreshold(), this.LJLJJI.getTargetThresholds());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
