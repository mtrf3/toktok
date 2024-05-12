package com.ss.android.ugc.aweme.tools.draft.entity;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class DraftOperationInfo extends F9E {

    @InterfaceC65349Pkn("free_up_space")
    public long freeUpSpace;

    @InterfaceC65349Pkn("is_need_show")
    public boolean isNeedShow;

    @InterfaceC65349Pkn("is_update_sticker")
    public boolean isUpdateSticker;

    @InterfaceC65349Pkn("type")
    public int type;

    /* JADX WARN: Multi-variable type inference failed */
    public DraftOperationInfo() {
        this(0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 15, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.type), Boolean.valueOf(this.isNeedShow), Long.valueOf(this.freeUpSpace), Boolean.valueOf(this.isUpdateSticker)};
    }

    public DraftOperationInfo(int i, boolean z, long j, boolean z2) {
        this.type = i;
        this.isNeedShow = z;
        this.freeUpSpace = j;
        this.isUpdateSticker = z2;
    }

    public /* synthetic */ DraftOperationInfo(int i, boolean z, long j, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? false : z2);
    }
}
