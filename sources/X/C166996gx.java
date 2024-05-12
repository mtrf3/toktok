package X;

import com.mammon.audiosdk.enums.SAMICoreTokenType;
import com.mammon.audiosdk.structures.SAMICoreResponse;
import com.mammon.audiosdk.structures.SAMICoreResponseSyncListener;
import com.mammon.audiosdk.structures.SAMICoreSpeechToSongContextCreateParameter;
import com.ss.android.ugc.aweme.services.audio.StsRequestModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import fjb.a;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.speechtosong.handlers.SpeechToSongFetchHandler$handleData$2$asyncTask$1", f = "SpeechToSongFetchHandler.kt", l = {55}, m = "invokeSuspend")
/* renamed from: X.6gx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166996gx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super SAMICoreResponse>, Object> {
    public int LJLIL;
    public final /* synthetic */ C166856gj LJLILLLLZI;
    public final /* synthetic */ C166876gl LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C166996gx(C166856gj c166856gj, C166876gl c166876gl, InterfaceC67352kd<? super C166996gx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c166856gj;
        this.LJLJI = c166876gl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C166996gx(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EffectTemplate effectTemplate;
        EffectTemplate effectTemplate2;
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
            C166856gj c166856gj = this.LJLILLLLZI;
            String str = c166856gj.LJII;
            obj = null;
            r12 = null;
            String str2 = null;
            r12 = null;
            String str3 = null;
            if (str != null) {
                C166876gl c166876gl = this.LJLJI;
                StsRequestModel stsRequestModel = c166856gj.LIZLLL.LIZ;
                float LIZ = c166856gj.LJ.LIZ();
                this.LJLIL = 1;
                c166876gl.getClass();
                final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
                SAMICoreSpeechToSongContextCreateParameter sAMICoreSpeechToSongContextCreateParameter = new SAMICoreSpeechToSongContextCreateParameter();
                sAMICoreSpeechToSongContextCreateParameter.url = "https://sami.tiktokv.com/internal";
                sAMICoreSpeechToSongContextCreateParameter.appKey = "HWGLUUXbHV";
                sAMICoreSpeechToSongContextCreateParameter.tokenType = SAMICoreTokenType.TOKEN_TO_C_D;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("passport-auth", "session");
                    jSONObject.put("x-tt-token", C60903NvH.LJIIJJI().getAccountService().getUserTTToken());
                    C60903NvH.LJIIJJI().getAccountService().getSDKVersion();
                    jSONObject.put("sdk-version", "2");
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("sessionid=");
                    LIZ2.append(((RBX) HG3.LJIILL()).getSessionKey());
                    jSONObject.put("cookie", X1D.LIZIZ(LIZ2));
                    sAMICoreSpeechToSongContextCreateParameter.token = jSONObject.toString();
                    sAMICoreSpeechToSongContextCreateParameter.audioUrl = str;
                    sAMICoreSpeechToSongContextCreateParameter.audioUrlType = "vid_origin";
                    sAMICoreSpeechToSongContextCreateParameter.responseType = 1;
                    sAMICoreSpeechToSongContextCreateParameter.videoStatus = 1;
                    String LIZLLL = C47959Irz.LIZLLL(31744, "sts_output_format", "", true);
                    if (LIZLLL != null && LIZLLL.length() != 0) {
                        z = false;
                    }
                    if (z) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("{\"template_id_list\":[\"");
                        List<Effect> templateIds = stsRequestModel.getTemplateIds();
                        if (templateIds != null && (effectTemplate2 = (EffectTemplate) ORZ.LJLLLL(templateIds)) != null) {
                            str2 = effectTemplate2.getEffectId();
                        }
                        LIZ3.append(str2);
                        LIZ3.append("\"],\"video_duration_sec\":");
                        LIZ3.append(LIZ);
                        LIZ3.append('}');
                        sAMICoreSpeechToSongContextCreateParameter.extra = X1D.LIZIZ(LIZ3);
                    } else {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("{\"template_id_list\":[\"");
                        List<Effect> templateIds2 = stsRequestModel.getTemplateIds();
                        if (templateIds2 != null && (effectTemplate = (EffectTemplate) ORZ.LJLLLL(templateIds2)) != null) {
                            str3 = effectTemplate.getEffectId();
                        }
                        LIZ4.append(str3);
                        LIZ4.append("\"],\"video_duration_sec\":");
                        LIZ4.append(LIZ);
                        LIZ4.append(",\"output_format\":\"");
                        sAMICoreSpeechToSongContextCreateParameter.extra = JBR.LJFF(LIZ4, LIZLLL, "\"}", LIZ4);
                    }
                    sAMICoreSpeechToSongContextCreateParameter.connectTimeout = 0;
                    sAMICoreSpeechToSongContextCreateParameter.syncRequest(new SAMICoreResponseSyncListener() { // from class: X.6gy
                        @Override // com.mammon.audiosdk.structures.SAMICoreResponseSyncListener
                        public final void onStart() {
                        }

                        @Override // com.mammon.audiosdk.structures.SAMICoreResponseSyncListener
                        public final void onFinished(SAMICoreResponse sAMICoreResponse) {
                            Integer num;
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append("request onFinished, errorCode=  ");
                            if (sAMICoreResponse != null) {
                                num = Integer.valueOf(sAMICoreResponse.errorCode);
                            } else {
                                num = null;
                            }
                            LIZ5.append(num);
                            X1D.LIZIZ(LIZ5);
                            InterfaceC67352kd<SAMICoreResponse> interfaceC67352kd = c84654XKg;
                            C3C5.m7constructorimpl(sAMICoreResponse);
                            interfaceC67352kd.resumeWith(sAMICoreResponse);
                        }
                    });
                } catch (JSONException unused) {
                    C3C5.m7constructorimpl(null);
                    c84654XKg.resumeWith(null);
                }
                obj = c84654XKg.LIZ();
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super SAMICoreResponse> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
