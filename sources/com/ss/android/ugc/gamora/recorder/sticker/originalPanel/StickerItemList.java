package com.ss.android.ugc.gamora.recorder.sticker.originalPanel;

import X.AnonymousClass391;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StickerItemList extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public final int cursor;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPb;

    @InterfaceC65349Pkn("effect")
    public final List<NewFaceStickerBean> stickers;

    public StickerItemList() {
        this(0, false, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StickerItemList copy$default(StickerItemList stickerItemList, int i, boolean z, List list, LogPbBean logPbBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = stickerItemList.cursor;
        }
        if ((i2 & 2) != 0) {
            z = stickerItemList.hasMore;
        }
        if ((i2 & 4) != 0) {
            list = stickerItemList.stickers;
        }
        if ((i2 & 8) != 0) {
            logPbBean = stickerItemList.logPb;
        }
        return stickerItemList.copy(i, z, list, logPbBean);
    }

    public final StickerItemList copy(int i, boolean z, List<? extends NewFaceStickerBean> stickers, LogPbBean logPbBean) {
        o.LJIIIZ(stickers, "stickers");
        return new StickerItemList(i, z, stickers, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerItemList)) {
            return false;
        }
        StickerItemList stickerItemList = (StickerItemList) obj;
        return this.cursor == stickerItemList.cursor && this.hasMore == stickerItemList.hasMore && o.LJ(this.stickers, stickerItemList.stickers) && o.LJ(this.logPb, stickerItemList.logPb);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerItemList(cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", stickers=");
        LIZ.append(this.stickers);
        LIZ.append(", logPb=");
        LIZ.append(this.logPb);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int i = this.cursor * 31;
        boolean z = this.hasMore;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.stickers, (i + i2) * 31, 31);
        LogPbBean logPbBean = this.logPb;
        if (logPbBean == null) {
            hashCode = 0;
        } else {
            hashCode = logPbBean.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final List<NewFaceStickerBean> getStickers() {
        return this.stickers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StickerItemList(int i, boolean z, List<? extends NewFaceStickerBean> stickers, LogPbBean logPbBean) {
        o.LJIIIZ(stickers, "stickers");
        this.cursor = i;
        this.hasMore = z;
        this.stickers = stickers;
        this.logPb = logPbBean;
    }

    public StickerItemList(int i, boolean z, List list, LogPbBean logPbBean, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? C61878OQg.INSTANCE : list, (i2 & 8) != 0 ? null : logPbBean);
    }
}
