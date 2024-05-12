package com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SuggestedReply extends F9E implements Serializable {

    @InterfaceC65349Pkn("reply_emoji")
    public final String replyEmoji;

    @InterfaceC65349Pkn("reply_text")
    public final String replyText;

    public static /* synthetic */ SuggestedReply copy$default(SuggestedReply suggestedReply, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suggestedReply.replyText;
        }
        if ((i & 2) != 0) {
            str2 = suggestedReply.replyEmoji;
        }
        return suggestedReply.copy(str, str2);
    }

    public final SuggestedReply copy(String replyText, String replyEmoji) {
        o.LJIIIZ(replyText, "replyText");
        o.LJIIIZ(replyEmoji, "replyEmoji");
        return new SuggestedReply(replyText, replyEmoji);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.replyText, this.replyEmoji};
    }

    public final String getReplyEmoji() {
        return this.replyEmoji;
    }

    public final String getReplyText() {
        return this.replyText;
    }

    public SuggestedReply(String replyText, String replyEmoji) {
        o.LJIIIZ(replyText, "replyText");
        o.LJIIIZ(replyEmoji, "replyEmoji");
        this.replyText = replyText;
        this.replyEmoji = replyEmoji;
    }
}
