package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audiometrics.AudioMetricsHelper$checkAndDetectUploadVideoAudioMetrics$1", f = "AudioMetricsHelper.kt", l = {151, 161}, m = "invokeSuspend")
/* renamed from: X.6jZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168616jZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public long LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ BaseShortVideoContext LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ double LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C168616jZ(BaseShortVideoContext baseShortVideoContext, String str, double d, int i, InterfaceC67352kd<? super C168616jZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = baseShortVideoContext;
        this.LJLJJI = str;
        this.LJLJJL = d;
        this.LJLJJLL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C168616jZ(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long currentTimeMillis;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    currentTimeMillis = this.LJLIL;
                    C141335gf.LIZJ(obj2);
                    C168636jb.LIZLLL(4, currentTimeMillis, (VideoPublishEditModel) this.LJLJI, (String) obj2, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
                    C169636lD.LIZ("index = 4, INDEX_UPLOAD_VIDEO_SUCCESS");
                    Keva.getRepo("audio_metrics").storeInt("audio_metrics_time", 0);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj2);
        } else {
            C141335gf.LIZJ(obj2);
            this.LJLILLLLZI = 1;
            obj2 = C141865hW.LIZ("", "audio_metrics", this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        String str = (String) obj2;
        if (str.length() == 0) {
            return C76800UCe.LIZ;
        }
        String str2 = ((VideoPublishEditModel) this.LJLJI).mOutputFile;
        if (str2 == null || !FileUtils.INSTANCE.checkFileExists(str2)) {
            return C76800UCe.LIZ;
        }
        currentTimeMillis = System.currentTimeMillis();
        String LIZJ = C168626ja.LIZJ();
        this.LJLIL = currentTimeMillis;
        this.LJLILLLLZI = 2;
        obj2 = C169616lB.LIZIZ(str2, str, LIZJ, this);
        if (obj2 == enumC58928NAu) {
            return enumC58928NAu;
        }
        C168636jb.LIZLLL(4, currentTimeMillis, (VideoPublishEditModel) this.LJLJI, (String) obj2, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
        C169636lD.LIZ("index = 4, INDEX_UPLOAD_VIDEO_SUCCESS");
        Keva.getRepo("audio_metrics").storeInt("audio_metrics_time", 0);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
