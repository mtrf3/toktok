package com.ss.android.ugc.aweme.mediachoose.helper;

import X.X1D;
import bytedance.io.BdMediaItem;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class BdMediaItemCompat extends BdMediaItem {
    public String absolutePath;

    public BdMediaItemCompat() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BdMediaItemCompat) && o.LJ(this.absolutePath, ((BdMediaItemCompat) obj).absolutePath);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.absolutePath;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // bytedance.io.BdMediaItem
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BdMediaItemCompat(absolutePath=");
        LIZ.append(this.absolutePath);
        LIZ.append("), super=");
        LIZ.append(super.toString());
        return X1D.LIZIZ(LIZ);
    }

    public BdMediaItemCompat(int i) {
        this.absolutePath = null;
    }
}
