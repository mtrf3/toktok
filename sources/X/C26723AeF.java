package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPropertyItem;
import kotlin.jvm.internal.o;

/* renamed from: X.AeF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26723AeF implements Parcelable.Creator<ProductPropertyItem> {
    @Override // android.os.Parcelable.Creator
    public final ProductPropertyItem createFromParcel(Parcel parcel) {
        Long valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        return new ProductPropertyItem(valueOf, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ProductPropertyItem[] newArray(int i) {
        return new ProductPropertyItem[i];
    }
}
