package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import kotlin.jvm.internal.o;

/* renamed from: X.RUl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69631RUl implements Parcelable.Creator<ProductPrice> {
    @Override // android.os.Parcelable.Creator
    public final ProductPrice createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        boolean z2;
        Boolean valueOf2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        boolean z3 = false;
        Boolean bool = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf = Boolean.valueOf(z);
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            valueOf2 = Boolean.valueOf(z2);
        }
        if (parcel.readInt() != 0) {
            if (parcel.readInt() != 0) {
                z3 = true;
            }
            bool = Boolean.valueOf(z3);
        }
        return new ProductPrice(readString, readString2, readString3, valueOf, valueOf2, bool, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ProductPrice[] newArray(int i) {
        return new ProductPrice[i];
    }
}
