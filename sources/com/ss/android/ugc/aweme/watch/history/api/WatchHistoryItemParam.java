package com.ss.android.ugc.aweme.watch.history.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class WatchHistoryItemParam extends F9E implements Serializable {

    @InterfaceC65349Pkn("item_id")
    public final String itemId;

    @InterfaceC65349Pkn("timestamp")
    public final String timestamp;

    public static /* synthetic */ WatchHistoryItemParam copy$default(WatchHistoryItemParam watchHistoryItemParam, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = watchHistoryItemParam.itemId;
        }
        if ((i & 2) != 0) {
            str2 = watchHistoryItemParam.timestamp;
        }
        return watchHistoryItemParam.copy(str, str2);
    }

    public final WatchHistoryItemParam copy(String itemId, String timestamp) {
        o.LJIIIZ(itemId, "itemId");
        o.LJIIIZ(timestamp, "timestamp");
        return new WatchHistoryItemParam(itemId, timestamp);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.itemId, this.timestamp};
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public WatchHistoryItemParam(String itemId, String timestamp) {
        o.LJIIIZ(itemId, "itemId");
        o.LJIIIZ(timestamp, "timestamp");
        this.itemId = itemId;
        this.timestamp = timestamp;
    }
}
