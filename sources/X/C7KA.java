package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.7KA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7KA {
    public static final /* synthetic */ int LIZ = 0;

    public static C7KB LIZ(M89 m89) {
        boolean z;
        if (m89 == null) {
            return C7KB.OTHERS;
        }
        Integer upvoteScene = m89.getUpvoteScene();
        if (upvoteScene == null || C7KB.OUT_APP_PUSH_UPVOTE_POST.getValue() != upvoteScene.intValue()) {
            z = false;
        } else {
            z = true;
        }
        String str = null;
        if (z) {
            m89.setUpvoteScene(null);
            return C7KB.OUT_APP_PUSH_UPVOTE_POST;
        }
        String eventType = m89.getEventType();
        if (eventType != null) {
            switch (eventType.hashCode()) {
                case -1572049565:
                    if (eventType.equals("notification_page")) {
                        HashMap<String, String> inboxLogExtra = m89.getInboxLogExtra();
                        if (inboxLogExtra != null) {
                            str = inboxLogExtra.get("notice_message_type");
                        }
                        if (o.LJ(str, "261")) {
                            return C7KB.NOTICE_LIKE_THE_VIDEO_YOU_UPVOTE;
                        }
                        return C7KB.NOTICE;
                    }
                    break;
                case -1271119582:
                    if (eventType.equals("homepage_follow")) {
                        return C7KB.FOLLOWING_FEED;
                    }
                    break;
                case -667094460:
                    if (eventType.equals("homepage_friends")) {
                        return C7KB.FRIENDS_FEED;
                    }
                    break;
                case -562830579:
                    if (eventType.equals("personal_homepage")) {
                        if (o.LJ(m89.getFrom(), "REPOSTED_LIST_ENTRANCE")) {
                            return C7KB.MY_UPVOTE_TAB;
                        }
                        return C7KB.MY_PROFILE;
                    }
                    break;
                case 809483594:
                    if (eventType.equals("others_homepage")) {
                        if (o.LJ(m89.getFrom(), "REPOSTED_LIST_ENTRANCE")) {
                            return C7KB.OTHERS_UPVOTE_TAB;
                        }
                        return C7KB.OTHERS_PROFILE;
                    }
                    break;
                case 1691937916:
                    if (eventType.equals("homepage_hot")) {
                        return C7KB.FOR_YOU_FEED;
                    }
                    break;
            }
        }
        return C7KB.OTHERS;
    }
}
