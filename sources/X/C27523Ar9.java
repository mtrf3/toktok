package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RelateProduct;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ar9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27523Ar9 implements Parcelable.Creator<RelateProduct> {
    @Override // android.os.Parcelable.Creator
    public final RelateProduct createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C5YW.LIZ(RelateProduct.class, parcel, arrayList, i, 1);
            }
        }
        return new RelateProduct(readString, readString2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final RelateProduct[] newArray(int i) {
        return new RelateProduct[i];
    }
}
