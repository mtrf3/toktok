package X;

import com.ss.android.ugc.aweme.node.InboxPageNode;
import com.ss.android.ugc.aweme.node.MainPageNode;
import com.ss.android.ugc.aweme.node.MyProfilePageNode;
import com.ss.android.ugc.aweme.node.ProfileGroupPageNode;
import com.ss.android.ugc.aweme.node.ProfilePageNode;

/* loaded from: classes10.dex */
public final class LGT {
    public static AbstractC53895LDf LIZ;
    public static AbstractC53895LDf LIZIZ;

    public static AbstractC53895LDf LIZ(ActivityC45651qj activityC45651qj, String str) {
        switch (str.hashCode()) {
            case -1382453013:
                if (!str.equals("NOTIFICATION")) {
                    return null;
                }
                return new InboxPageNode(activityC45651qj);
            case 2614219:
                if (!str.equals("USER")) {
                    return null;
                }
                return new MyProfilePageNode();
            case 185242617:
                if (!str.equals("page_profile")) {
                    return null;
                }
                if (C53765L8f.LJIJJLI()) {
                    return new ProfileGroupPageNode(activityC45651qj);
                }
                return new ProfilePageNode(activityC45651qj);
            case 883457358:
                if (!str.equals("page_feed")) {
                    return null;
                }
                return new MainPageNode(activityC45651qj);
            default:
                return null;
        }
    }
}
