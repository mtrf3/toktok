package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2;

import X.C70011Rdn;
import X.EnumC70012Rdo;
import X.EnumC70107RfL;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ImageSelectData implements Parcelable {
    public static final Parcelable.Creator<ImageSelectData> CREATOR = new C70011Rdn();
    public final EnumC70012Rdo from;
    public final Image image;
    public final int index;
    public final EnumC70107RfL source;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageSelectData)) {
            return false;
        }
        ImageSelectData imageSelectData = (ImageSelectData) obj;
        return o.LJ(this.image, imageSelectData.image) && this.from == imageSelectData.from && this.source == imageSelectData.source && this.index == imageSelectData.index;
    }

    public final int hashCode() {
        Image image = this.image;
        return ((this.source.hashCode() + ((this.from.hashCode() + ((image == null ? 0 : image.hashCode()) * 31)) * 31)) * 31) + this.index;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.image, i);
        out.writeString(this.from.name());
        out.writeString(this.source.name());
        out.writeInt(this.index);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageSelectData(image=");
        LIZ.append(this.image);
        LIZ.append(", from=");
        LIZ.append(this.from);
        LIZ.append(", source=");
        LIZ.append(this.source);
        LIZ.append(", index=");
        return b0.LIZJ(LIZ, this.index, ')', LIZ);
    }

    public ImageSelectData(Image image, EnumC70012Rdo from, EnumC70107RfL source, int i) {
        o.LJIIIZ(from, "from");
        o.LJIIIZ(source, "source");
        this.image = image;
        this.from = from;
        this.source = source;
        this.index = i;
    }
}
