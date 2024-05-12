package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.IAudioEffectPreferences;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.Effect;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.5uU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149905uU {
    /* JADX WARN: Multi-variable type inference failed */
    public static CategoryPageModel LIZ() {
        List LJJIJIIJI = C47261Igj.LJJIJIIJI("chipmunk", "baritone");
        Context LIZ = C5L7.LIZ();
        int i = 0;
        int i2 = 1;
        List LJJIJIIJI2 = C47261Igj.LJJIJIIJI(LIZ.getString(R.string.bzj), LIZ.getString(R.string.bzi));
        List LJJIJIIJI3 = C47261Igj.LJJIJIIJI("default_1", "default_2");
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJJIJIIJI2, 10));
        Iterator it = LJJIJIIJI2.iterator();
        int i3 = -1;
        while (true) {
            Effect effect = null;
            Object[] objArr = 0;
            if (it.hasNext()) {
                it.next();
                int i4 = i + 1;
                if (i >= 0) {
                    com.ss.android.ugc.effectmanager.effect.model.Effect effect2 = new com.ss.android.ugc.effectmanager.effect.model.Effect(effect, i2, objArr == true ? 1 : 0);
                    int i5 = i3 - 1;
                    effect2.setEffectId(String.valueOf(i3));
                    Object obj = ListProtector.get(LJJIJIIJI2, i);
                    o.LJIIIIZZ(obj, "localEffectNames[index]");
                    effect2.setName((String) obj);
                    effect2.setUnzipPath(C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJIJJLI((String) ListProtector.get(LJJIJIIJI, i)));
                    effect2.setTags(C47261Igj.LJJIJ(ListProtector.get(LJJIJIIJI3, i)));
                    arrayList.add(effect2);
                    i3 = i5;
                    i = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            } else {
                CategoryPageModel categoryPageModel = new CategoryPageModel(null, 1, null);
                CategoryEffectModel categoryEffectModel = new CategoryEffectModel(null, 1, null);
                categoryEffectModel.setEffects(arrayList);
                categoryPageModel.setCategoryEffects(categoryEffectModel);
                return categoryPageModel;
            }
        }
    }

    public static void LIZJ() {
        File[] listFiles;
        IAudioEffectPreferences iAudioEffectPreferences = (IAudioEffectPreferences) new C44350Has(0).LIZ(C5L7.LIZ(), IAudioEffectPreferences.class);
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        int LJFF = (int) EF7.LJFF();
        if (LJFF != iAudioEffectPreferences.getResourceVersion(0) || (listFiles = new File(C164746dK.LJFF(C60903NvH.LJIIJJI().LJJIJL().getPathAdapter())).listFiles()) == null || listFiles.length == 0) {
            C60903NvH.LJIIJJI().LJIILL().LJFF();
            C10K.LIZJ(new Callable() { // from class: X.5aP
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String LJIJJLI;
                    String LJIJJLI2;
                    Context LIZ = C5L7.LIZ();
                    LJIJJLI = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJIJJLI("");
                    C38978FRm.LIZJ(LIZ, R.raw.baritone, LJIJJLI);
                    LJIJJLI2 = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJIJJLI("");
                    C38978FRm.LIZJ(LIZ, R.raw.chipmunk, LJIJJLI2);
                    return C76800UCe.LIZ;
                }
            });
            iAudioEffectPreferences.setResourceVersion(LJFF);
        }
    }

    public static final String LIZIZ(VideoPublishEditModel args) {
        String uploadId;
        o.LJIIIZ(args, "args");
        AudioEffectParam audioEffectParam = args.veAudioEffectParam;
        if (audioEffectParam == null || (uploadId = audioEffectParam.getUploadId()) == null) {
            return "";
        }
        return uploadId;
    }

    public static final void LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        AudioEffectParam audioEffectParam;
        if (videoPublishEditModel != null && (audioEffectParam = videoPublishEditModel.veAudioEffectParam) != null) {
            LJ(videoPublishEditModel, audioEffectParam.getChallenge());
            Iterator<AVChallenge> it = audioEffectParam.getChallenges().iterator();
            while (it.hasNext()) {
                LJ(videoPublishEditModel, it.next());
            }
        }
    }

    public static void LJ(VideoPublishEditModel model, AVChallenge aVChallenge) {
        AVChallenge aVChallenge2;
        List<AVChallenge> recordStickerChallengeList;
        o.LJIIIZ(model, "model");
        if (aVChallenge != null && model.challenges != null) {
            StickerChallenge stickerChallenge = model.stickerChallenge;
            Object obj = null;
            if (stickerChallenge != null && (recordStickerChallengeList = stickerChallenge.getRecordStickerChallengeList()) != null) {
                Iterator<AVChallenge> it = recordStickerChallengeList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        aVChallenge2 = it.next();
                        if (o.LJ(aVChallenge.challengeName, aVChallenge2.challengeName)) {
                            break;
                        }
                    } else {
                        aVChallenge2 = null;
                        break;
                    }
                }
            } else {
                aVChallenge2 = null;
            }
            List<AVChallenge> list = C41658GWo.LIZLLL().LIZ;
            if (list != null) {
                Iterator it2 = ((ArrayList) list).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (o.LJ(((AVChallenge) next).challengeName, aVChallenge.challengeName)) {
                        obj = next;
                        break;
                    }
                }
            }
            if (aVChallenge2 == null && obj == null) {
                model.challenges.remove(aVChallenge);
                model.removeAudioEffectChallengeFromTitleAndStruct(aVChallenge);
            }
        }
    }
}
