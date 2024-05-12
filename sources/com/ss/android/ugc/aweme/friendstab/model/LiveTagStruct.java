package com.ss.android.ugc.aweme.friendstab.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes7.dex */
public final class LiveTagStruct extends F9E {

    @InterfaceC65349Pkn("count")
    public final int count;

    @InterfaceC65349Pkn("group")
    public final int group;

    public static /* synthetic */ LiveTagStruct copy$default(LiveTagStruct liveTagStruct, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = liveTagStruct.group;
        }
        if ((i3 & 2) != 0) {
            i2 = liveTagStruct.count;
        }
        return liveTagStruct.copy(i, i2);
    }

    public final LiveTagStruct copy(int i, int i2) {
        return new LiveTagStruct(i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.group), Integer.valueOf(this.count)};
    }

    public final int getCount() {
        return this.count;
    }

    public final int getGroup() {
        return this.group;
    }

    public LiveTagStruct(int i, int i2) {
        this.group = i;
        this.count = i2;
    }
}
