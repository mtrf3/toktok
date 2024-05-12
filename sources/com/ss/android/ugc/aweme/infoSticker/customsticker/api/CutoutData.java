package com.ss.android.ugc.aweme.infoSticker.customsticker.api;

import X.AnonymousClass391;
import X.X1D;
import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate;
import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Location;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CutoutData {
    public List<? extends List<Coordinate>> contours;
    public File image;
    public Location location;

    /* JADX WARN: Multi-variable type inference failed */
    public CutoutData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CutoutData copy$default(CutoutData cutoutData, File file, List list, Location location, int i, Object obj) {
        if ((i & 1) != 0) {
            file = cutoutData.image;
        }
        if ((i & 2) != 0) {
            list = cutoutData.contours;
        }
        if ((i & 4) != 0) {
            location = cutoutData.location;
        }
        return cutoutData.copy(file, list, location);
    }

    public final CutoutData copy(File file, List<? extends List<Coordinate>> contours, Location location) {
        o.LJIIIZ(contours, "contours");
        return new CutoutData(file, contours, location);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutoutData)) {
            return false;
        }
        CutoutData cutoutData = (CutoutData) obj;
        return o.LJ(this.image, cutoutData.image) && o.LJ(this.contours, cutoutData.contours) && o.LJ(this.location, cutoutData.location);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CutoutData(image=");
        LIZ.append(this.image);
        LIZ.append(", contours=");
        LIZ.append(this.contours);
        LIZ.append(", location=");
        LIZ.append(this.location);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean checkData() {
        if (this.location != null && (!this.contours.isEmpty()) && this.image != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        File file = this.image;
        int i = 0;
        if (file == null) {
            hashCode = 0;
        } else {
            hashCode = file.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.contours, hashCode * 31, 31);
        Location location = this.location;
        if (location != null) {
            i = location.hashCode();
        }
        return LIZIZ + i;
    }

    public final List<List<Coordinate>> getContours() {
        return this.contours;
    }

    public final File getImage() {
        return this.image;
    }

    public final Location getLocation() {
        return this.location;
    }

    public final void setContours(List<? extends List<Coordinate>> list) {
        o.LJIIIZ(list, "<set-?>");
        this.contours = list;
    }

    public final void setImage(File file) {
        this.image = file;
    }

    public final void setLocation(Location location) {
        this.location = location;
    }

    public CutoutData(File file, List<? extends List<Coordinate>> contours, Location location) {
        o.LJIIIZ(contours, "contours");
        this.image = file;
        this.contours = contours;
        this.location = location;
    }

    public /* synthetic */ CutoutData(File file, List list, Location location, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : file, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? null : location);
    }
}
