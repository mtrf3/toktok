package com.ss.android.ugc.aweme.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PhotoModeConfig {

    @InterfaceC65349Pkn("photos_ratio")
    public Float photosRatio;

    @InterfaceC65349Pkn("title_size")
    public Integer titleSize;

    /* JADX WARN: Multi-variable type inference failed */
    public PhotoModeConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoModeConfig)) {
            return false;
        }
        PhotoModeConfig photoModeConfig = (PhotoModeConfig) obj;
        return o.LJ(this.photosRatio, photoModeConfig.photosRatio) && o.LJ(this.titleSize, photoModeConfig.titleSize);
    }

    public final int hashCode() {
        Float f = this.photosRatio;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Integer num = this.titleSize;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhotoModeConfig(photosRatio=");
        LIZ.append(this.photosRatio);
        LIZ.append(", titleSize=");
        return s0.LIZJ(LIZ, this.titleSize, ')', LIZ);
    }

    public PhotoModeConfig(Float f, Integer num) {
        this.photosRatio = f;
        this.titleSize = num;
    }

    public /* synthetic */ PhotoModeConfig(Float f, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Float.valueOf(0.5625f) : f, (i & 2) != 0 ? 20 : num);
    }
}
