package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.vesdk.filterparam.VEAudioSamiFilterParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4xV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC126294xV extends AbstractC126304xW {
    public final List<String> LIZLLL;

    @Override // X.InterfaceC126544xu
    public final void LIZ() {
        if (this.LIZIZ == null || ((ArrayList) this.LIZLLL).isEmpty()) {
            return;
        }
        C122034qd LJJI = C17N.LJJI(this.LIZIZ);
        if (LJJI != null) {
            Iterator it = ((ArrayList) this.LIZLLL).iterator();
            while (it.hasNext()) {
                C121634pz LJJIJIIJIL = LJJI.LJFF().LJJIJIIJIL((String) it.next());
                if (LJJIJIIJIL != null) {
                    LJJI.LJFF().LJII(LJJIJIIJIL);
                    this.LIZ.creativeModel.audioAlgorithmModel.isDenoiseOn = false;
                }
            }
            ((ArrayList) this.LIZLLL).clear();
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC126544xu
    public final void LIZJ() {
        if (this.LIZIZ == null) {
            return;
        }
        LIZ();
        VEAudioSamiFilterParam vEAudioSamiFilterParam = new VEAudioSamiFilterParam();
        vEAudioSamiFilterParam.samiType = 2;
        vEAudioSamiFilterParam.samiModelPath = this.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("\n            {\n                \"name\":\"denoise_v2\",\n                \"version\":\"1.0\",\n                \"config\":{\n                    \"denoisemode\":");
        SettingsManager.LIZLLL().getClass();
        LIZ.append(SettingsManager.LJ("sami_ftgru_denoise_mode", 1));
        LIZ.append(",\n                    \"denoiserate\":1.0\n                }\n            }\n    ");
        vEAudioSamiFilterParam.samiParam = C38346F3e.LJJIJIIJIL(X1D.LIZIZ(LIZ));
        C122034qd LJJI = C17N.LJJI(this.LIZIZ);
        if (LJJI != null) {
            String str = "";
            if (this.LIZ.audioEnhanceParam.getEnableOriginEnhance()) {
                if (this.LIZ.isFastImport) {
                    String uuid = LJJI.LJIIJ.LJ().getMainTrack().getUUID();
                    o.LJIIIIZZ(uuid, "editorPro.editor.model.mainTrack.uuid");
                    LJFF(uuid, LJJI, vEAudioSamiFilterParam);
                } else {
                    Iterator<NLETrack> it = LJJI.LJIIJ.LJ().getTracks().iterator();
                    String str2 = "";
                    while (it.hasNext()) {
                        NLETrack next = it.next();
                        if (o.LJ(next.getExtra("AudioTrackType"), EnumC122254qz.ORIGIN.name())) {
                            str2 = next.getUUID();
                            o.LJIIIIZZ(str2, "track.uuid");
                        }
                    }
                    if (str2.length() > 0) {
                        LJFF(str2, LJJI, vEAudioSamiFilterParam);
                    }
                }
            }
            if (this.LIZ.audioEnhanceParam.getEnableMusicEnhance()) {
                Iterator<NLETrack> it2 = LJJI.LJIIJ.LJ().getTracks().iterator();
                while (it2.hasNext()) {
                    NLETrack next2 = it2.next();
                    if (o.LJ(next2.getExtra("AudioTrackType"), EnumC122254qz.BGM.name())) {
                        str = next2.getUUID();
                        o.LJIIIIZZ(str, "track.uuid");
                    }
                }
                if (str.length() > 0) {
                    LJFF(str, LJJI, vEAudioSamiFilterParam);
                    return;
                }
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC126544xu
    public final void P6() {
        AudioEnhanceParam audioEnhanceParam = this.LIZ.audioEnhanceParam;
        o.LJIIIIZZ(audioEnhanceParam, "model.audioEnhanceParam");
        if (C78685UuP.LJJIFFI(audioEnhanceParam)) {
            if (this.LIZIZ != null) {
                if (!this.LIZ.mIsFromDraft) {
                    LIZIZ(null);
                    return;
                } else {
                    C43045Guv.LIZLLL(new AqS152S0100000_2(this, 939), 0L);
                    return;
                }
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (this.LIZIZ != null) {
            if (!this.LIZ.mIsFromDraft) {
                return;
            }
            C43045Guv.LIZLLL(new AqS152S0100000_2(this, 940), 0L);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC126294xV(C126314xX params) {
        super(params);
        o.LJIIIZ(params, "params");
        this.LIZLLL = new ArrayList();
    }

    public final void LJFF(String str, C122034qd c122034qd, VEAudioSamiFilterParam vEAudioSamiFilterParam) {
        C121634pz c121634pz = new C121634pz(NLEEditorJniJNI.NLEFilterName_getAUDIO_SAMI_FILTER());
        c121634pz.LIZ = str;
        c121634pz.LJIILIIL = vEAudioSamiFilterParam.samiModelPath;
        c121634pz.LJIILJJIL = vEAudioSamiFilterParam.samiParam;
        c121634pz.LJIIL = Integer.valueOf(vEAudioSamiFilterParam.samiType);
        String LJJJ = c122034qd.LJFF().LJJJ(str, c121634pz);
        this.LIZ.creativeModel.audioAlgorithmModel.isDenoiseOn = true;
        ((ArrayList) this.LIZLLL).add(LJJJ);
    }
}
