package com.ss.android.ugc.aweme.comment.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class GifEmojiResponse implements Serializable {

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("emoticon_data")
    public StickerBean stickers;

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final StickerBean getStickers() {
        return this.stickers;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setStickers(StickerBean stickerBean) {
        this.stickers = stickerBean;
    }
}
