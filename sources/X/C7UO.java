package X;

import Y.IDCListenerS279S0100000_3;
import Y.IDDListenerS143S0100000_3;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import com.ss.android.ugc.aweme.topic.review.panel.TopicReviewPanel;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7UO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7UO {
    public static void LIZ(FragmentManager fragmentManager, Integer num, TopicReview topicReview, boolean z, AqS153S0100000_3 aqS153S0100000_3, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            topicReview = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            aqS153S0100000_3 = null;
        }
        o.LJIIIZ(fragmentManager, "fragmentManager");
        if (topicReview != null && !o.LJ(topicReview.getUser().getUid(), ((RBX) HG3.LJIILL()).getCurUserId())) {
            return;
        }
        TopicReviewPanel topicReviewPanel = new TopicReviewPanel();
        Bundle LIZ = C01R.LIZ("auto_focus", z);
        if (num != null) {
            LIZ.putInt("initial_rating", num.intValue());
        }
        if (topicReview != null) {
            LIZ.putSerializable("initial_review", topicReview);
        }
        topicReviewPanel.setArguments(LIZ);
        ASL asl = new ASL();
        asl.LJI(1);
        int LIZIZ = C7MY.LIZIZ(344);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLLLLL = LIZIZ;
        tuxSheet.LJZI = false;
        tuxSheet.LJZL = true;
        asl.LJFF(16);
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLLILLLL = topicReviewPanel;
        tuxSheet2.LJLIL = new IDCListenerS279S0100000_3(topicReviewPanel, 4);
        tuxSheet2.LJLILLLLZI = new IDDListenerS143S0100000_3(aqS153S0100000_3, 2);
        tuxSheet2.show(fragmentManager, "TopicReviewPanel");
    }
}
