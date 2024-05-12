package com.ss.android.ugc.aweme.now.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NowBatchReactionResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("is_downgrade")
    public final boolean isDowngrade;

    @InterfaceC65349Pkn("like_list")
    public final List<ItemLikeListPreview> itemLikeListPreviewList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NowBatchReactionResponse copy$default(NowBatchReactionResponse nowBatchReactionResponse, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = nowBatchReactionResponse.itemLikeListPreviewList;
        }
        if ((i & 2) != 0) {
            z = nowBatchReactionResponse.isDowngrade;
        }
        return nowBatchReactionResponse.copy(list, z);
    }

    public final NowBatchReactionResponse copy(List<ItemLikeListPreview> itemLikeListPreviewList, boolean z) {
        o.LJIIIZ(itemLikeListPreviewList, "itemLikeListPreviewList");
        return new NowBatchReactionResponse(itemLikeListPreviewList, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NowBatchReactionResponse) {
            return C78966Uyw.LJIIIZ(((NowBatchReactionResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{this.itemLikeListPreviewList, Boolean.valueOf(this.isDowngrade)};
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return C78966Uyw.LJJJLL("NowBatchReactionResponse:%s,%s", getObjects());
    }

    public final List<ItemLikeListPreview> getItemLikeListPreviewList() {
        return this.itemLikeListPreviewList;
    }

    public final boolean isDowngrade() {
        return this.isDowngrade;
    }

    public NowBatchReactionResponse(List<ItemLikeListPreview> itemLikeListPreviewList, boolean z) {
        o.LJIIIZ(itemLikeListPreviewList, "itemLikeListPreviewList");
        this.itemLikeListPreviewList = itemLikeListPreviewList;
        this.isDowngrade = z;
    }
}
