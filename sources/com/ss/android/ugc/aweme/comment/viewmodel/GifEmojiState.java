package com.ss.android.ugc.aweme.comment.viewmodel;

import X.F9E;
import X.InterfaceC61312at;
import com.ss.android.ugc.aweme.comment.model.GifEmoji;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GifEmojiState extends F9E implements InterfaceC61312at {
    public final GifEmoji gifEmoji;

    /* JADX WARN: Multi-variable type inference failed */
    public GifEmojiState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GifEmojiState copy$default(GifEmojiState gifEmojiState, GifEmoji gifEmoji, int i, Object obj) {
        if ((i & 1) != 0) {
            gifEmoji = gifEmojiState.gifEmoji;
        }
        return gifEmojiState.copy(gifEmoji);
    }

    public final GifEmojiState copy(GifEmoji gifEmoji) {
        o.LJIIIZ(gifEmoji, "gifEmoji");
        return new GifEmojiState(gifEmoji);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.gifEmoji};
    }

    public final GifEmoji getGifEmoji() {
        return this.gifEmoji;
    }

    public GifEmojiState(GifEmoji gifEmoji) {
        o.LJIIIZ(gifEmoji, "gifEmoji");
        this.gifEmoji = gifEmoji;
    }

    public /* synthetic */ GifEmojiState(GifEmoji gifEmoji, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new GifEmoji() : gifEmoji);
    }
}
