package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C69626RUg;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ShareInfo implements Parcelable {
    public static final Parcelable.Creator<ShareInfo> CREATOR = new C69626RUg();

    @InterfaceC65349Pkn("can_share")
    public final Boolean canShare;

    @InterfaceC65349Pkn("share_cover")
    public final Image cover;

    @InterfaceC65349Pkn("share_deep_link")
    public final String deepLink;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareInfo)) {
            return false;
        }
        ShareInfo shareInfo = (ShareInfo) obj;
        return o.LJ(this.canShare, shareInfo.canShare) && o.LJ(this.deepLink, shareInfo.deepLink) && o.LJ(this.cover, shareInfo.cover);
    }

    public final int hashCode() {
        Boolean bool = this.canShare;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.deepLink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.cover;
        return hashCode2 + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShareInfo(canShare=");
        LIZ.append(this.canShare);
        LIZ.append(", deepLink=");
        LIZ.append(this.deepLink);
        LIZ.append(", cover=");
        LIZ.append(this.cover);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int i2;
        o.LJIIIZ(out, "out");
        Boolean bool = this.canShare;
        if (bool == null) {
            i2 = 0;
        } else {
            out.writeInt(1);
            i2 = bool.booleanValue();
        }
        out.writeInt(i2);
        out.writeString(this.deepLink);
        out.writeParcelable(this.cover, i);
    }

    public ShareInfo(Boolean bool, String str, Image image) {
        this.canShare = bool;
        this.deepLink = str;
        this.cover = image;
    }
}
