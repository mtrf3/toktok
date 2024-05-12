package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class GiphyPaginationBean extends F9E {

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("next_offset")
    public final int nextOffset;

    /* JADX WARN: Multi-variable type inference failed */
    public GiphyPaginationBean() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.hasMore), Integer.valueOf(this.nextOffset)};
    }

    public GiphyPaginationBean(boolean z, int i) {
        this.hasMore = z;
        this.nextOffset = i;
    }

    public /* synthetic */ GiphyPaginationBean(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i);
    }
}
