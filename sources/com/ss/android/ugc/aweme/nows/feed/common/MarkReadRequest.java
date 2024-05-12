package com.ss.android.ugc.aweme.nows.feed.common;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public final class MarkReadRequest extends F9E {

    @InterfaceC65349Pkn("aweme_type")
    public final int awemeType;

    @InterfaceC65349Pkn("item_id")
    public final long itemId;

    @InterfaceC65349Pkn("now_state")
    public final int nowState;

    public static /* synthetic */ MarkReadRequest copy$default(MarkReadRequest markReadRequest, int i, long j, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = markReadRequest.awemeType;
        }
        if ((i3 & 2) != 0) {
            j = markReadRequest.itemId;
        }
        if ((i3 & 4) != 0) {
            i2 = markReadRequest.nowState;
        }
        return markReadRequest.copy(i, j, i2);
    }

    public final MarkReadRequest copy(int i, long j, int i2) {
        return new MarkReadRequest(i, j, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.awemeType), Long.valueOf(this.itemId), Integer.valueOf(this.nowState)};
    }

    public final int getAwemeType() {
        return this.awemeType;
    }

    public final long getItemId() {
        return this.itemId;
    }

    public final int getNowState() {
        return this.nowState;
    }

    public MarkReadRequest(int i, long j, int i2) {
        this.awemeType = i;
        this.itemId = j;
        this.nowState = i2;
    }
}
