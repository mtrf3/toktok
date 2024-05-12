package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.C279017q;
import X.InterfaceC65349Pkn;
import X.S63;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ImageListData implements Parcelable {
    public static final Parcelable.Creator<ImageListData> CREATOR = new S63();

    @InterfaceC65349Pkn("images_list")
    public final List<ImageItem> imageList;

    @InterfaceC65349Pkn("total")
    public final int total;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageListData)) {
            return false;
        }
        ImageListData imageListData = (ImageListData) obj;
        return o.LJ(this.imageList, imageListData.imageList) && this.total == imageListData.total;
    }

    public final int hashCode() {
        List<ImageItem> list = this.imageList;
        return ((list == null ? 0 : list.hashCode()) * 31) + this.total;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageListData(imageList=");
        LIZ.append(this.imageList);
        LIZ.append(", total=");
        return b0.LIZJ(LIZ, this.total, ')', LIZ);
    }

    public ImageListData(List<ImageItem> list, int i) {
        this.imageList = list;
        this.total = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        List<ImageItem> list = this.imageList;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((ImageItem) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeInt(this.total);
    }
}
