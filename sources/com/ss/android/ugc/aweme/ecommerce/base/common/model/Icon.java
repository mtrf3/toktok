package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C26862AgU;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Icon implements Parcelable {
    public static final Parcelable.Creator<Icon> CREATOR = new C26862AgU();

    @InterfaceC65349Pkn("icon")
    public final Image icon;

    @InterfaceC65349Pkn("icon_dark")
    public final Image iconDark;

    @InterfaceC65349Pkn("link")
    public final String link;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Icon)) {
            return false;
        }
        Icon icon = (Icon) obj;
        return o.LJ(this.icon, icon.icon) && o.LJ(this.iconDark, icon.iconDark) && o.LJ(this.link, icon.link);
    }

    public final int hashCode() {
        Image image = this.icon;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.iconDark;
        int hashCode2 = (hashCode + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str = this.link;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.icon, i);
        out.writeParcelable(this.iconDark, i);
        out.writeString(this.link);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Icon(icon=");
        LIZ.append(this.icon);
        LIZ.append(", iconDark=");
        LIZ.append(this.iconDark);
        LIZ.append(", link=");
        return q.LIZIZ(LIZ, this.link, ')', LIZ);
    }

    public Icon(Image image, Image image2, String str) {
        this.icon = image;
        this.iconDark = image2;
        this.link = str;
    }
}
