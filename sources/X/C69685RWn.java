package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuQuantityProperty;
import kotlin.jvm.internal.o;

/* renamed from: X.RWn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69685RWn implements Parcelable.Creator<SkuQuantityProperty> {
    @Override // android.os.Parcelable.Creator
    public final SkuQuantityProperty createFromParcel(Parcel parcel) {
        Integer valueOf;
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        Boolean bool = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        }
        return new SkuQuantityProperty(valueOf, bool);
    }

    @Override // android.os.Parcelable.Creator
    public final SkuQuantityProperty[] newArray(int i) {
        return new SkuQuantityProperty[i];
    }
}
