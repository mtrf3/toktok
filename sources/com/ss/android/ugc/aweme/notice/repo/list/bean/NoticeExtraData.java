package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeExtraData {

    @InterfaceC65349Pkn("aweme")
    public final Aweme aweme;

    @InterfaceC65349Pkn("comment")
    public final Comment comment;

    @InterfaceC65349Pkn("sticker_info")
    public final NewFaceStickerBean sticker;

    /* JADX WARN: Multi-variable type inference failed */
    public NoticeExtraData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeExtraData)) {
            return false;
        }
        NoticeExtraData noticeExtraData = (NoticeExtraData) obj;
        return o.LJ(this.comment, noticeExtraData.comment) && o.LJ(this.aweme, noticeExtraData.aweme) && o.LJ(this.sticker, noticeExtraData.sticker);
    }

    public final int hashCode() {
        Comment comment = this.comment;
        int hashCode = (comment == null ? 0 : comment.hashCode()) * 31;
        Aweme aweme = this.aweme;
        int hashCode2 = (hashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        NewFaceStickerBean newFaceStickerBean = this.sticker;
        return hashCode2 + (newFaceStickerBean != null ? newFaceStickerBean.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NoticeExtraData(comment=");
        LIZ.append(this.comment);
        LIZ.append(", aweme=");
        LIZ.append(this.aweme);
        LIZ.append(", sticker=");
        LIZ.append(this.sticker);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public NoticeExtraData(Comment comment, Aweme aweme, NewFaceStickerBean newFaceStickerBean) {
        this.comment = comment;
        this.aweme = aweme;
        this.sticker = newFaceStickerBean;
    }

    public /* synthetic */ NoticeExtraData(Comment comment, Aweme aweme, NewFaceStickerBean newFaceStickerBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : comment, (i & 2) != 0 ? null : aweme, (i & 4) != 0 ? null : newFaceStickerBean);
    }
}
