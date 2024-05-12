package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.discover.model.FeedbackContents;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JqP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50409JqP {
    public static final C50409JqP LIZ = new C50409JqP();

    public static List LIZ(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        LIZ.getClass();
        FeedbackContents[] feedbackContentsArr = (FeedbackContents[]) SettingsManager.LIZLLL().LJIIIIZZ("search_single_feedback_survey", FeedbackContents[].class, null);
        if (feedbackContentsArr == null) {
            return null;
        }
        for (FeedbackContents feedbackContents : feedbackContentsArr) {
            if (feedbackContents != null) {
                str2 = feedbackContents.getFeedbackType();
            } else {
                str2 = null;
            }
            if (o.LJ(str2, str)) {
                if (feedbackContents == null) {
                    return null;
                }
                return feedbackContents.getMultipleChoices();
            }
        }
        return null;
    }
}
