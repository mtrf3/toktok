package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes9.dex */
public final class JN7 extends C49010JLi<JN7> {
    public JN7(JQA jqa) {
        super(jqa, "feed_enter");
    }

    public final void LJJIJ(Aweme aweme) {
        if (aweme != null) {
            LJIIZILJ("author_id", aweme.getAuthorUid());
            LJIIZILJ("group_id", aweme.getGroupId());
            LJIIZILJ("request_id", aweme.getRequestId());
            if (aweme.getRank() != -1) {
                LJJI(Integer.valueOf(aweme.getRank()));
            }
            LJIIZILJ("aweme_id", aweme.getAid());
        }
    }
}
