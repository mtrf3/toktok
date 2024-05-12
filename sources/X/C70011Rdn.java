package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.Rdn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70011Rdn implements Parcelable.Creator<ImageSelectData> {
    @Override // android.os.Parcelable.Creator
    public final ImageSelectData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ImageSelectData((Image) parcel.readParcelable(ImageSelectData.class.getClassLoader()), EnumC70012Rdo.valueOf(parcel.readString()), EnumC70107RfL.valueOf(parcel.readString()), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final ImageSelectData[] newArray(int i) {
        return new ImageSelectData[i];
    }
}
