package X;

import com.bytedance.speech.speechengine.SpeechEngine;
import com.bytedance.speech.speechengine.SpeechEngineGenerator;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.media.mic.model.SpeechErrorResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.media.mic.model.SpeechResult;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.media.mic.model.SpeechResultResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.voice2text.vm.TakoSpeechViewModel;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.List;
import kotlin.jvm.internal.AqS26S1000000_1;

/* renamed from: X.4E7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4E7 implements SpeechEngine.SpeechListener {
    public SpeechEngine LIZ;
    public TakoSpeechViewModel LIZIZ;

    public final void LIZJ() {
        SpeechEngine speechEngine = this.LIZ;
        if (speechEngine == null) {
            LIZ(true);
            return;
        }
        speechEngine.sendDirective(2001, "");
        SpeechEngine speechEngine2 = this.LIZ;
        if (speechEngine2 != null) {
            speechEngine2.sendDirective(1000, "");
        }
    }

    public C4E7() {
        TTNetInit.forceInitCronetKernel();
        LIZ(false);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.4EB] */
    public final void LIZ(final boolean z) {
        String str;
        ?? r2 = new Object() { // from class: X.4EB
            public final void LIZ(SpeechEngine speechEngine) {
                C4E7 c4e7 = C4E7.this;
                c4e7.LIZ = speechEngine;
                speechEngine.setListener(c4e7);
                if (z) {
                    C4E7.this.LIZJ();
                }
            }
        };
        try {
            SpeechEngine speechEngineGenerator = SpeechEngineGenerator.getInstance();
            if (!speechEngineGenerator.isEngineSupported("asr")) {
                speechEngineGenerator.destroyEngine();
                C34B.LJ("DMASRSpeechProcessor", new RuntimeException("not support ASR"));
            }
            speechEngineGenerator.createEngine();
            RBY LJFF = AccountService.LJIJ().LJFF();
            if (LJFF.isLogin()) {
                str = LJFF.getCurUserId();
            } else {
                str = "DEFAULT_USER";
            }
            speechEngineGenerator.setOptionString("engine_name", "asr");
            speechEngineGenerator.setOptionString("log_level", "TRACE");
            speechEngineGenerator.setOptionString("appid", C4EA.LIZ().getAppId());
            speechEngineGenerator.setOptionString("uid", str);
            speechEngineGenerator.setOptionBoolean("enable_get_volume", false);
            speechEngineGenerator.setOptionBoolean("recorder_disable_reuse", false);
            speechEngineGenerator.setOptionString("recorder_data_source_type", "Recorder");
            speechEngineGenerator.setOptionBoolean("asr_auto_stop", C4Y9.LIZIZ());
            speechEngineGenerator.setOptionBoolean("asr_show_punctuation", true);
            String str2 = "";
            speechEngineGenerator.setOptionString("asr_rec_path", "");
            speechEngineGenerator.setOptionInt("asr_conn_timeout", C4EA.LIZ().getConnectTimeOut());
            speechEngineGenerator.setOptionInt("asr_recv_timeout", C4EA.LIZ().getReceiveTimeOut());
            speechEngineGenerator.setOptionBoolean("asr_show_utterances", true);
            speechEngineGenerator.setOptionBoolean("enable_get_volume", true);
            speechEngineGenerator.setOptionString("asr_address", C4EA.LIZ().getAddress());
            speechEngineGenerator.setOptionString("asr_uri", C4EA.LIZ().getUri());
            speechEngineGenerator.setOptionString("asr_cluster", C4EA.LIZ().getCluster());
            speechEngineGenerator.setOptionBoolean("asr_enable_itn", true);
            speechEngineGenerator.setOptionString("asr_language", "fil-PH");
            if (C4Y9.LIZ()) {
                str2 = "normal_vad";
            }
            speechEngineGenerator.setOptionString("asr_vad_mode", str2);
            if (speechEngineGenerator.initEngine() != 0) {
                C34B.LJ("DMASRSpeechProcessor", new RuntimeException("init engine failed"));
            }
            r2.LIZ(speechEngineGenerator);
        } catch (Throwable th) {
            C78983UzD.LJIILL("asr_engine_loadso_failed_2");
            C34B.LJ("DMASRSpeechProcessor", th);
        }
    }

    public final SpeechResultResponse LIZIZ(byte[] bArr) {
        SpeechResultResponse speechResultResponse;
        if (bArr == null) {
            return null;
        }
        try {
            speechResultResponse = (SpeechResultResponse) GsonHolder.LIZLLL().LIZ().LJI(new String(bArr, PVC.LIZ), SpeechResultResponse.class);
        } catch (Exception e) {
            TakoSpeechViewModel takoSpeechViewModel = this.LIZIZ;
            if (takoSpeechViewModel != null) {
                takoSpeechViewModel.iv0(-1, e);
            }
            C34B.LJ("DMASRSpeechProcessor", e);
        }
        if (!(!speechResultResponse.result.isEmpty())) {
            return null;
        }
        return speechResultResponse;
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine.SpeechListener
    public final void onSpeechMessage(int i, byte[] bArr, int i2) {
        String str;
        Integer num;
        String f9e;
        List<SpeechResult> list;
        SpeechResult speechResult;
        String str2;
        TakoSpeechViewModel takoSpeechViewModel;
        String f9e2;
        List<SpeechResult> list2;
        SpeechResult speechResult2;
        String str3;
        TakoSpeechViewModel takoSpeechViewModel2;
        Float LJJIJLIJ;
        SpeechErrorResponse speechErrorResponse = null;
        String str4 = "";
        if (i != 1003) {
            if (i != 1201) {
                if (i != 1204) {
                    if (i != 1600 || bArr == null || (LJJIJLIJ = C38350F3i.LJJIJLIJ(new String(bArr, PVC.LIZ))) == null) {
                        return;
                    }
                    float floatValue = LJJIJLIJ.floatValue();
                    TakoSpeechViewModel takoSpeechViewModel3 = this.LIZIZ;
                    if (takoSpeechViewModel3 == null) {
                        return;
                    }
                    if (C4Y9.LIZ()) {
                        takoSpeechViewModel3.setState(new C4E6(floatValue));
                        return;
                    } else {
                        if (!C4Y9.LIZIZ() || floatValue <= 0.2d) {
                            return;
                        }
                        takoSpeechViewModel3.setState(C4E9.LJLIL);
                        return;
                    }
                }
                SpeechResultResponse LIZIZ = LIZIZ(bArr);
                if (LIZIZ != null && (list2 = LIZIZ.result) != null && (speechResult2 = (SpeechResult) ORZ.LJLLLL(list2)) != null && (str3 = speechResult2.text) != null && (takoSpeechViewModel2 = this.LIZIZ) != null) {
                    XKQ xkq = takoSpeechViewModel2.LJLILLLLZI;
                    if (xkq != null) {
                        xkq.LIZIZ(null);
                    }
                    takoSpeechViewModel2.setState(new AqS26S1000000_1(str3, 3));
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("finish: ");
                if (LIZIZ != null && (f9e2 = LIZIZ.toString()) != null) {
                    str4 = f9e2;
                }
                C48690J9a.LJIIL(LIZ, str4, LIZ, "DMASRSpeechProcessor");
                return;
            }
            SpeechResultResponse LIZIZ2 = LIZIZ(bArr);
            if (LIZIZ2 != null && (list = LIZIZ2.result) != null && (speechResult = (SpeechResult) ORZ.LJLLLL(list)) != null && (str2 = speechResult.text) != null && (takoSpeechViewModel = this.LIZIZ) != null) {
                takoSpeechViewModel.setState(new AqS26S1000000_1(str2, 4));
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("speaking: ");
            if (LIZIZ2 != null && (f9e = LIZIZ2.toString()) != null) {
                str4 = f9e;
            }
            C48690J9a.LJIIL(LIZ2, str4, LIZ2, "DMASRSpeechProcessor");
            return;
        }
        int i3 = -1;
        if (bArr != null) {
            try {
                speechErrorResponse = (SpeechErrorResponse) GsonHolder.LIZLLL().LIZ().LJI(new String(bArr, PVC.LIZ), SpeechErrorResponse.class);
            } catch (Exception e) {
                TakoSpeechViewModel takoSpeechViewModel4 = this.LIZIZ;
                if (takoSpeechViewModel4 != null) {
                    takoSpeechViewModel4.iv0(-1, e);
                }
                C34B.LJ("DMASRSpeechProcessor", e);
            }
        }
        TakoSpeechViewModel takoSpeechViewModel5 = this.LIZIZ;
        if (takoSpeechViewModel5 != null) {
            if (speechErrorResponse != null && (num = speechErrorResponse.errorCode) != null) {
                i3 = num.intValue();
            }
            if (speechErrorResponse != null && (str = speechErrorResponse.errorMsg) != null) {
                str4 = str;
            }
            takoSpeechViewModel5.iv0(i3, new Exception(str4));
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("error: ");
        if (bArr == null) {
            return;
        }
        LIZ3.append(new String(bArr, PVC.LIZ));
        C34B.LIZJ("DMASRSpeechProcessor", X1D.LIZIZ(LIZ3));
    }
}
