package X;

import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;
import com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService;
import com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService;

/* renamed from: X.ItU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48052ItU {
    public static int LIZ() {
        CommerceSmartUITasks predictTaskIndex;
        SmartFeedAdUIService.Companion.getClass();
        ISmartFeedAdUIService iSmartFeedAdUIService = C48053ItV.LIZ;
        if (iSmartFeedAdUIService.getSmartAdUIExperimentValue() != null && LIZIZ() != null && (predictTaskIndex = iSmartFeedAdUIService.getPredictTaskIndex()) != null) {
            return predictTaskIndex.getAdCardDelay();
        }
        return -100;
    }

    public static String LIZIZ() {
        SmartFeedAdUIService.Companion.getClass();
        String predictLabelResult = C48053ItV.LIZ.getPredictLabelResult();
        if (predictLabelResult != null) {
            return predictLabelResult;
        }
        return null;
    }
}
