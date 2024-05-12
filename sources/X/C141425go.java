package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.VoiceConversionModel;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5go, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141425go {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL(InterfaceC143655kP editPreviewApi) {
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        editPreviewApi.MK(C135285Sq.LIZIZ());
    }

    public static void LIZJ(InterfaceC143655kP editPreviewApi, VideoPublishEditModel publishEditModel) {
        C122034qd LJJI;
        NLEEditor nLEEditor;
        NLEModel LJJ;
        List<AVChallenge> challenges;
        AVChallenge challenge;
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        o.LJIIIZ(publishEditModel, "publishEditModel");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AudioEffectParam audioEffectParam = publishEditModel.veAudioEffectParam;
        if (audioEffectParam != null && (challenge = audioEffectParam.getChallenge()) != null) {
            publishEditModel.removeAudioEffectChallengeFromTitleAndStruct(challenge);
            linkedHashSet.add(challenge);
        }
        AudioEffectParam audioEffectParam2 = publishEditModel.veAudioEffectParam;
        if (audioEffectParam2 != null && (challenges = audioEffectParam2.getChallenges()) != null) {
            for (AVChallenge aVChallenge : challenges) {
                publishEditModel.removeAudioEffectChallengeFromTitleAndStruct(aVChallenge);
                linkedHashSet.add(aVChallenge);
            }
        }
        C60903NvH.LJIIJJI().getPublishService().LJIILLIIL().LIZ(publishEditModel, linkedHashSet);
        C149905uU.LIZLLL(publishEditModel);
        InterfaceC153045zY value = editPreviewApi.Kh().getValue();
        if (value != null && (LJJ = C17N.LJJ(value)) != null) {
            C122784rq.LJ(LJJ);
        }
        LIZLLL(editPreviewApi);
        C5MG WS = editPreviewApi.WS();
        if (WS != null && (LJJI = C17N.LJJI(WS.LJIJ())) != null && (nLEEditor = LJJI.LJIIJ) != null) {
            nLEEditor.LIZIZ();
        }
        VoiceConversionModel voiceConversionModel = publishEditModel.creativeModel.voiceConversionModel;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        voiceConversionModel.getClass();
        o.LJIIIZ(c61878OQg, "<set-?>");
        voiceConversionModel.vcMultiRecordPathList = c61878OQg;
        VoiceConversionModel voiceConversionModel2 = publishEditModel.creativeModel.voiceConversionModel;
        voiceConversionModel2.hasDubVoiceConversion = false;
        voiceConversionModel2.vcMultiOriginPathList = c61878OQg;
        publishEditModel.creativeModel.voiceConversionModel.hasOriginVoiceConversion = false;
        publishEditModel.veAudioEffectParam = null;
    }

    public static void LJ(InterfaceC143655kP editPreviewApi, Effect effect) {
        MutableLiveData<IAudioEffectParam> mutableLiveData;
        MutableLiveData<IAudioEffectParam> mutableLiveData2;
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        byte[] bArr = null;
        if (effect == null) {
            C5MG WS = editPreviewApi.WS();
            if (WS != null && (mutableLiveData2 = WS.LIZLLL) != null) {
                mutableLiveData2.setValue(null);
                return;
            }
            return;
        }
        String effectId = effect.getEffectId();
        String LJIILLIIL = C78949Uyf.LJIILLIIL(effect);
        String unzipPath = effect.getUnzipPath();
        InterfaceC153045zY value = editPreviewApi.Kh().getValue();
        if (value == null) {
            return;
        }
        int duration = value.getDuration();
        C166696gT.LIZ().getClass();
        if (unzipPath != null) {
            bArr = ((C43523H6h) C169416kr.LJ.getValue()).LIZ.LIZIZ(unzipPath);
        }
        AudioEffectParam audioEffectParam = new AudioEffectParam(effectId, 0, 0, unzipPath, LJIILLIIL, 0, duration, bArr, null, null, 512, null);
        C5MG WS2 = editPreviewApi.WS();
        if (WS2 == null || (mutableLiveData = WS2.LIZLLL) == null) {
            return;
        }
        mutableLiveData.setValue(audioEffectParam);
    }

    public static void LIZ(Effect effect, InterfaceC143655kP editPreviewApi, InterfaceC88471Ynr interfaceC88471Ynr) {
        NLEModel LJJ;
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        InterfaceC153045zY value = editPreviewApi.Kh().getValue();
        if (value != null && (LJJ = C17N.LJJ(value)) != null) {
            C122784rq.LJ(LJJ);
        }
        String effectId = effect.getEffectId();
        String LJIILLIIL = C78949Uyf.LJIILLIIL(effect);
        String unzipPath = effect.getUnzipPath();
        InterfaceC153045zY value2 = editPreviewApi.Kh().getValue();
        if (value2 != null && unzipPath.length() > 0) {
            int duration = value2.getDuration();
            C166696gT.LIZ().getClass();
            AudioEffectParam audioEffectParam = new AudioEffectParam(effectId, 0, 0, unzipPath, LJIILLIIL, 0, duration, ((C43523H6h) C169416kr.LJ.getValue()).LIZ.LIZIZ(unzipPath), null, null, 512, null);
            audioEffectParam.setShowErrorToast(true);
            audioEffectParam.setResId(effect.getResource_id());
            audioEffectParam.setPanel(effect.getPanel());
            editPreviewApi.MK(C135285Sq.LIZ(true, audioEffectParam));
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(effect, audioEffectParam);
            }
        }
    }

    public static void LIZIZ(C166116fX model, InterfaceC143655kP editPreviewApi, InterfaceC88471Ynr interfaceC88471Ynr) {
        C122034qd LJJI;
        NLEEditor nLEEditor;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        if (OUP.LJJIIZ(model.LIZJ)) {
            C5MG WS = editPreviewApi.WS();
            if (WS == null || (LJJI = C17N.LJJI(WS.LJIJ())) == null || (nLEEditor = LJJI.LJIIJ) == null) {
                return;
            }
            LIZLLL(editPreviewApi);
            if (model.LIZIZ != null) {
                C122784rq.LIZJ(model, nLEEditor, false);
                if (interfaceC88471Ynr == null) {
                    return;
                }
                interfaceC88471Ynr.invoke(model.LIZJ, null);
                return;
            }
            if (model.LIZ == null) {
                return;
            }
            C122784rq.LIZIZ(model, nLEEditor);
            NLEModel LJ = nLEEditor.LJ();
            o.LJIIIIZZ(LJ, "nleEditor.model");
            NLETrackSlot dubSlot = model.LIZ;
            o.LJIIIZ(dubSlot, "dubSlot");
            String LJ2 = C122424rG.LJ(dubSlot);
            if (LJ2 != null) {
                ArrayList arrayList = new ArrayList();
                VecNLETrackSPtr tracks = LJ.getTracks();
                ArrayList LIZ2 = C07080Po.LIZ(tracks, "nleModel.tracks");
                Iterator<NLETrack> it = tracks.iterator();
                while (it.hasNext()) {
                    NLETrack next = it.next();
                    if (o.LJ(next.getExtra("AudioTrackType"), EnumC122254qz.AUDIO_RECORD.name())) {
                        LIZ2.add(next);
                    }
                }
                Iterator it2 = LIZ2.iterator();
                while (it2.hasNext()) {
                    VecNLETrackSlotSPtr LJIILL = ((NLETrack) it2.next()).LJIILL();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<NLETrackSlot> it3 = LJIILL.iterator();
                    while (it3.hasNext()) {
                        NLETrackSlot next2 = it3.next();
                        NLETrackSlot it4 = next2;
                        o.LJIIIIZZ(it4, "it");
                        if (o.LJ(C122424rG.LJ(it4), LJ2)) {
                            arrayList2.add(next2);
                        }
                    }
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        Object slot = it5.next();
                        o.LJIIIIZZ(slot, "slot");
                        arrayList.add(slot);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        C166116fX c166116fX = new C166116fX((NLETrackSlot) it6.next(), null, model.LIZJ);
                        c166116fX.LJ = model.LJ;
                        C122784rq.LIZIZ(c166116fX, nLEEditor);
                    }
                }
            }
            if (interfaceC88471Ynr == null) {
                return;
            }
            interfaceC88471Ynr.invoke(model.LIZJ, null);
            return;
        }
        LIZ(model.LIZJ, editPreviewApi, interfaceC88471Ynr);
    }
}
