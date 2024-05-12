package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductProperty;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPropertyItem;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.AeG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26724AeG implements Parcelable.Creator<ProductProperty> {
    @Override // android.os.Parcelable.Creator
    public final ProductProperty createFromParcel(Parcel parcel) {
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
                i = C279117r.LIZIZ(ProductPropertyItem.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new ProductProperty(readString, readString2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final ProductProperty[] newArray(int i) {
        return new ProductProperty[i];
    }
}
