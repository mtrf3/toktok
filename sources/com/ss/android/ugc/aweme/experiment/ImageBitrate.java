package com.ss.android.ugc.aweme.experiment;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ImageBitrate {

    @InterfaceC65349Pkn("default_gear")
    public final String defaultGear;

    @InterfaceC65349Pkn("gears")
    public final List<ImageBitrateItem> gears;

    /* JADX WARN: Multi-variable type inference failed */
    public ImageBitrate() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageBitrate copy$default(ImageBitrate imageBitrate, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageBitrate.defaultGear;
        }
        if ((i & 2) != 0) {
            list = imageBitrate.gears;
        }
        return imageBitrate.copy(str, list);
    }

    public final ImageBitrate copy(String str, List<ImageBitrateItem> list) {
        return new ImageBitrate(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageBitrate)) {
            return false;
        }
        ImageBitrate imageBitrate = (ImageBitrate) obj;
        return o.LJ(this.defaultGear, imageBitrate.defaultGear) && o.LJ(this.gears, imageBitrate.gears);
    }

    public int hashCode() {
        String str = this.defaultGear;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ImageBitrateItem> list = this.gears;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageBitrate(defaultGear=");
        LIZ.append(this.defaultGear);
        LIZ.append(", gears=");
        return C1NE.LIZIZ(LIZ, this.gears, ')', LIZ);
    }

    public final String getDefaultGear() {
        return this.defaultGear;
    }

    public final List<ImageBitrateItem> getGears() {
        return this.gears;
    }

    public ImageBitrate(String str, List<ImageBitrateItem> list) {
        this.defaultGear = str;
        this.gears = list;
    }

    public /* synthetic */ ImageBitrate(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
