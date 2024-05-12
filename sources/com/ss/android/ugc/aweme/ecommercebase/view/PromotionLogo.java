package com.ss.android.ugc.aweme.ecommercebase.view;

import X.C69858RbK;
import X.C69859RbL;
import X.C75792yF;
import X.C78857UxB;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.q;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PromotionLogo implements Parcelable {
    public static final Parcelable.Creator<PromotionLogo> CREATOR = new C69858RbK();

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;
    public transient HashMap<String, String> daInfoInMap;

    @InterfaceC65349Pkn("dark_mode_image")
    public final Image darkModeImage;

    @InterfaceC65349Pkn("image")
    public final Image image;

    @InterfaceC65349Pkn("promotion_id")
    public final String promotionId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionLogo)) {
            return false;
        }
        PromotionLogo promotionLogo = (PromotionLogo) obj;
        return o.LJ(this.image, promotionLogo.image) && o.LJ(this.darkModeImage, promotionLogo.darkModeImage) && o.LJ(this.promotionId, promotionLogo.promotionId) && o.LJ(this.daInfo, promotionLogo.daInfo);
    }

    public final int hashCode() {
        Image image = this.image;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.darkModeImage;
        int hashCode2 = (hashCode + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str = this.promotionId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.daInfo;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Image image = this.image;
        if (image == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            image.writeToParcel(out, i);
        }
        Image image2 = this.darkModeImage;
        if (image2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            image2.writeToParcel(out, i);
        }
        out.writeString(this.promotionId);
        out.writeString(this.daInfo);
    }

    public final HashMap<String, String> LIZ() {
        HashMap<String, String> hashMap = this.daInfoInMap;
        if (hashMap == null) {
            hashMap = null;
            if (C78857UxB.LJJJIL(this.daInfo)) {
                try {
                    hashMap = (HashMap) C75792yF.LIZIZ().LJII(this.daInfo, new C69859RbL().getType());
                } catch (Exception unused) {
                }
            }
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            this.daInfoInMap = hashMap;
        }
        return hashMap;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PromotionLogo(image=");
        LIZ.append(this.image);
        LIZ.append(", darkModeImage=");
        LIZ.append(this.darkModeImage);
        LIZ.append(", promotionId=");
        LIZ.append(this.promotionId);
        LIZ.append(", daInfo=");
        return q.LIZIZ(LIZ, this.daInfo, ')', LIZ);
    }

    public PromotionLogo(Image image, Image image2, String str, String str2) {
        this.image = image;
        this.darkModeImage = image2;
        this.promotionId = str;
        this.daInfo = str2;
    }
}
