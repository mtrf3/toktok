package com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SuggestedReplyAnimeEmoji extends F9E implements Serializable {

    @InterfaceC65349Pkn("emoji_anime")
    public final String emojiAnime;

    public static /* synthetic */ SuggestedReplyAnimeEmoji copy$default(SuggestedReplyAnimeEmoji suggestedReplyAnimeEmoji, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suggestedReplyAnimeEmoji.emojiAnime;
        }
        return suggestedReplyAnimeEmoji.copy(str);
    }

    public final SuggestedReplyAnimeEmoji copy(String emojiAnime) {
        o.LJIIIZ(emojiAnime, "emojiAnime");
        return new SuggestedReplyAnimeEmoji(emojiAnime);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.emojiAnime};
    }

    public final String getEmojiAnime() {
        return this.emojiAnime;
    }

    public SuggestedReplyAnimeEmoji(String emojiAnime) {
        o.LJIIIZ(emojiAnime, "emojiAnime");
        this.emojiAnime = emojiAnime;
    }
}
