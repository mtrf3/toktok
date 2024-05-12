package X;

import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audiometrics.AudioMetricsHelper$checkAndDetectDUBAudioMetrics$1", f = "AudioMetricsHelper.kt", l = {106, 116}, m = "invokeSuspend")
/* renamed from: X.6jY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168606jY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public long LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ VideoPublishEditModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C168606jY(VideoPublishEditModel videoPublishEditModel, InterfaceC67352kd<? super C168606jY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = videoPublishEditModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C168606jY(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        long currentTimeMillis;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    currentTimeMillis = this.LJLIL;
                    C141335gf.LIZJ(obj);
                    C168636jb.LIZJ(2, currentTimeMillis, this.LJLJI, (String) obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            this.LJLILLLLZI = 1;
            obj = C141865hW.LIZ("", "audio_metrics", this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        String str2 = (String) obj;
        if (str2.length() == 0) {
            return C76800UCe.LIZ;
        }
        AudioRecorderParam audioRecorderParam = this.LJLJI.veAudioRecorderParam;
        if (audioRecorderParam != null) {
            str = audioRecorderParam.getAudioUrl();
            if (str != null && str.length() == 0) {
                return C76800UCe.LIZ;
            }
        } else {
            str = null;
        }
        currentTimeMillis = System.currentTimeMillis();
        String LIZJ = C168626ja.LIZJ();
        this.LJLIL = currentTimeMillis;
        this.LJLILLLLZI = 2;
        obj = C169616lB.LIZIZ(str, str2, LIZJ, this);
        if (obj == enumC58928NAu) {
            return enumC58928NAu;
        }
        C168636jb.LIZJ(2, currentTimeMillis, this.LJLJI, (String) obj);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
