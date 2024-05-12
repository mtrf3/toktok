package com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto;

import X.C26863AgV;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Icon implements Parcelable {
    public static final Parcelable.Creator<Icon> CREATOR = new C26863AgV();

    @InterfaceC65349Pkn("icon")
    public final Image icon;

    @InterfaceC65349Pkn("icon_dark")
    public final Image iconDark;

    public static /* synthetic */ Icon copy$default(Icon icon, Image image, Image image2, int i, Object obj) {
        if ((i & 1) != 0) {
            image = icon.icon;
        }
        if ((i & 2) != 0) {
            image2 = icon.iconDark;
        }
        return icon.copy(image, image2);
    }

    public final Icon copy(Image image, Image image2) {
        return new Icon(image, image2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Icon)) {
            return false;
        }
        Icon icon = (Icon) obj;
        return o.LJ(this.icon, icon.icon) && o.LJ(this.iconDark, icon.iconDark);
    }

    public int hashCode() {
        Image image = this.icon;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.iconDark;
        return hashCode + (image2 != null ? image2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Icon(icon=");
        LIZ.append(this.icon);
        LIZ.append(", iconDark=");
        LIZ.append(this.iconDark);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.icon, i);
        out.writeParcelable(this.iconDark, i);
    }

    public final Image getIcon() {
        return this.icon;
    }

    public final Image getIconDark() {
        return this.iconDark;
    }

    public Icon(Image image, Image image2) {
        this.icon = image;
        this.iconDark = image2;
    }
}
