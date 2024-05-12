package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;

/* renamed from: X.7KB, reason: invalid class name */
/* loaded from: classes4.dex */
public enum C7KB {
    OTHERS(0),
    FOR_YOU_FEED(100),
    FOLLOWING_FEED(101),
    FRIENDS_FEED(102),
    MY_PROFILE(200),
    MY_UPVOTE_TAB(201),
    OTHERS_PROFILE(300),
    OTHERS_UPVOTE_TAB(301),
    NOTICE(LiveChatShowDelayForHotLiveSetting.DEFAULT),
    NOTICE_LIKE_THE_VIDEO_YOU_UPVOTE(401),
    OUT_APP_PUSH(LiveMaxRetainAlogMessageSizeSetting.DEFAULT),
    OUT_APP_PUSH_UPVOTE_POST(501),
    IN_APP_PUSH(600);

    public final int LJLIL;

    public static C7KB valueOf(String str) {
        return (C7KB) V0N.LJJJ(C7KB.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    C7KB(int i) {
        this.LJLIL = i;
    }
}
