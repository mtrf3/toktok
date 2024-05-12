package com.ss.android.ugc.aweme.comment.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes13.dex */
public final class StickerBean implements Serializable {

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("next_cursor")
    public int nextCursor;

    @InterfaceC65349Pkn("sticker_source")
    public int source;

    @InterfaceC65349Pkn("sticker_list")
    public List<GifEmoji> stickerList;

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getNextCursor() {
        return this.nextCursor;
    }

    public final int getSource() {
        return this.source;
    }

    public final List<GifEmoji> getStickerList() {
        return this.stickerList;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setNextCursor(int i) {
        this.nextCursor = i;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setStickerList(List<GifEmoji> list) {
        this.stickerList = list;
    }
}
