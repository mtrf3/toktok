package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5bB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137935bB {
    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, Effect effect) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        o.LJIIIZ(effect, "effect");
        ArrayList arrayList = new ArrayList();
        List<String> challenge = effect.getChallenge();
        if (challenge != null) {
            Iterator<String> it = challenge.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        LIZJ(videoPublishEditModel, arrayList);
    }

    public static final void LIZJ(VideoPublishEditModel videoPublishEditModel, List<String> challengeIds) {
        AVChallenge aVChallenge;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        o.LJIIIZ(challengeIds, "challengeIds");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : challengeIds) {
            Iterator<AVChallenge> it = videoPublishEditModel.getTextStickerChallenges().getReadTextChallenges().iterator();
            while (true) {
                if (it.hasNext()) {
                    aVChallenge = it.next();
                    if (o.LJ(aVChallenge.cid, str)) {
                        break;
                    }
                } else {
                    aVChallenge = null;
                    break;
                }
            }
            AVChallenge aVChallenge2 = aVChallenge;
            if (aVChallenge2 != null) {
                videoPublishEditModel.removeTitleAndChallenge(aVChallenge2);
                linkedHashSet.add(aVChallenge2);
            }
            videoPublishEditModel.getTextStickerChallenges().removeReadTextChallenge(str, C137945bC.LJLIL);
        }
        C60903NvH.LJIIJJI().getPublishService().LJIILLIIL().LIZ(videoPublishEditModel, linkedHashSet);
    }

    public static final void LIZ(LifecycleOwner owner, final VideoPublishEditModel videoPublishEditModel, Effect effect) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(owner, "owner");
        ArrayList arrayList = new ArrayList();
        List<String> challenge = effect.getChallenge();
        if (challenge != null) {
            Iterator<String> it = challenge.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            new C41386GMc(owner, (String) it2.next()).LIZ(new BOC() { // from class: X.5a9
                @Override // X.BOC
                public final void LIZ(AVChallenge challenge2) {
                    TextStickerChallenges textStickerChallenges = VideoPublishEditModel.this.getTextStickerChallenges();
                    if (textStickerChallenges != null) {
                        o.LJIIIIZZ(challenge2, "challenge");
                        textStickerChallenges.addReadTextChallenge(challenge2);
                    }
                }
            });
        }
    }
}
