package com.ss.android.ugc.aweme.watch.history.api;

import X.AbstractC73672Svk;
import X.C188117Zv;
import X.E8L;
import X.E8M;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes4.dex */
public interface WatchHistoryApi {
    public static final C188117Zv LIZ = C188117Zv.LIZ;

    @E8M("/tiktok/watch/history/delete/v1")
    AbstractC73672Svk<BaseResponse> deleteWatchHistory(@InterfaceC64986Pew("items") String str, @InterfaceC64986Pew("scene") int i, @InterfaceC64986Pew("delete_all") boolean z);

    @E8L("/tiktok/watch/history/dialog/get/v1")
    AbstractC73672Svk<WatchHistoryCopyResponse> getDialogCopy();

    @E8L("/tiktok/watch/history/list/v1")
    AbstractC73672Svk<WatchHistoryResponse> getWatchHistory(@InterfaceC64986Pew("max_cursor") String str, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("scene") int i2);
}
