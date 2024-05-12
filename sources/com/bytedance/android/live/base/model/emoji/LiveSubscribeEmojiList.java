package com.bytedance.android.live.base.model.emoji;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class LiveSubscribeEmojiList extends F9E {

    @InterfaceC65349Pkn("business_type")
    public final int businessType;

    @InterfaceC65349Pkn("emoji_list")
    public final List<LiveSubscribeEmojiModel> emojiModelList;

    @InterfaceC65349Pkn("preview_emoji")
    public final String previewEmoji;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.businessType), this.previewEmoji, this.emojiModelList};
    }

    public LiveSubscribeEmojiList(int i, String previewEmoji, List<LiveSubscribeEmojiModel> emojiModelList) {
        o.LJIIIZ(previewEmoji, "previewEmoji");
        o.LJIIIZ(emojiModelList, "emojiModelList");
        this.businessType = i;
        this.previewEmoji = previewEmoji;
        this.emojiModelList = emojiModelList;
    }
}
