package com.ss.android.ugc.aweme.feed.model;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NewStickerItemList extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public long cursor;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("effect")
    public List<NewFaceSticker> stickers;

    /* JADX WARN: Multi-variable type inference failed */
    public NewStickerItemList() {
        this(0L, 0, null, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewStickerItemList copy$default(NewStickerItemList newStickerItemList, long j, int i, List list, LogPbBean logPbBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = newStickerItemList.cursor;
        }
        if ((i2 & 2) != 0) {
            i = newStickerItemList.hasMore;
        }
        if ((i2 & 4) != 0) {
            list = newStickerItemList.stickers;
        }
        if ((i2 & 8) != 0) {
            logPbBean = newStickerItemList.logPb;
        }
        return newStickerItemList.copy(j, i, list, logPbBean);
    }

    public final NewStickerItemList copy(long j, int i, List<NewFaceSticker> list, LogPbBean logPbBean) {
        return new NewStickerItemList(j, i, list, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewStickerItemList)) {
            return false;
        }
        NewStickerItemList newStickerItemList = (NewStickerItemList) obj;
        return this.cursor == newStickerItemList.cursor && this.hasMore == newStickerItemList.hasMore && o.LJ(this.stickers, newStickerItemList.stickers) && o.LJ(this.logPb, newStickerItemList.logPb);
    }

    public int hashCode() {
        int LLJIJIL = ((C16880lQ.LLJIJIL(this.cursor) * 31) + this.hasMore) * 31;
        List<NewFaceSticker> list = this.stickers;
        int hashCode = (LLJIJIL + (list == null ? 0 : list.hashCode())) * 31;
        LogPbBean logPbBean = this.logPb;
        return hashCode + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewStickerItemList(cursor=");
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

    public NewStickerItemList(long j, int i, List<NewFaceSticker> list, LogPbBean logPbBean) {
        this.cursor = j;
        this.hasMore = i;
        this.stickers = list;
        this.logPb = logPbBean;
    }

    public /* synthetic */ NewStickerItemList(long j, int i, List list, LogPbBean logPbBean, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : list, (i2 & 8) == 0 ? logPbBean : null);
    }
}
