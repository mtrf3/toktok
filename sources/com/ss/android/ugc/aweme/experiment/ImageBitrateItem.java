package com.ss.android.ugc.aweme.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ImageBitrateItem {

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("network_lower")
    public final int networkLowerKbps;

    @InterfaceC65349Pkn("network_upper")
    public final int networkUpperKbps;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ImageBitrateItem() {
        /*
            r6 = this;
            r1 = 0
            r2 = 0
            r4 = 7
            r0 = r6
            r3 = r2
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.experiment.ImageBitrateItem.<init>():void");
    }

    public static /* synthetic */ ImageBitrateItem copy$default(ImageBitrateItem imageBitrateItem, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = imageBitrateItem.name;
        }
        if ((i3 & 2) != 0) {
            i = imageBitrateItem.networkLowerKbps;
        }
        if ((i3 & 4) != 0) {
            i2 = imageBitrateItem.networkUpperKbps;
        }
        return imageBitrateItem.copy(str, i, i2);
    }

    public final ImageBitrateItem copy(String str, int i, int i2) {
        return new ImageBitrateItem(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageBitrateItem)) {
            return false;
        }
        ImageBitrateItem imageBitrateItem = (ImageBitrateItem) obj;
        return o.LJ(this.name, imageBitrateItem.name) && this.networkLowerKbps == imageBitrateItem.networkLowerKbps && this.networkUpperKbps == imageBitrateItem.networkUpperKbps;
    }

    public int hashCode() {
        String str = this.name;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.networkLowerKbps) * 31) + this.networkUpperKbps;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageBitrateItem(name=");
        LIZ.append(this.name);
        LIZ.append(", networkLowerKbps=");
        LIZ.append(this.networkLowerKbps);
        LIZ.append(", networkUpperKbps=");
        return b0.LIZJ(LIZ, this.networkUpperKbps, ')', LIZ);
    }

    public final String getName() {
        return this.name;
    }

    public final int getNetworkLowerKbps() {
        return this.networkLowerKbps;
    }

    public final int getNetworkUpperKbps() {
        return this.networkUpperKbps;
    }

    public ImageBitrateItem(String str, int i, int i2) {
        this.name = str;
        this.networkLowerKbps = i;
        this.networkUpperKbps = i2;
    }

    public /* synthetic */ ImageBitrateItem(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
