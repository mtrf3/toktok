package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class AnchorInfo {

    @InterfaceC65349Pkn("level")
    public long level;

    public final int hashCode() {
        long j = this.level;
        return (int) (j ^ (j >>> 32));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.level == ((AnchorInfo) obj).level) {
            return true;
        }
        return false;
    }
}
