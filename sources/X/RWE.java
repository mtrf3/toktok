package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.StandardSaleProps;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RWE implements Parcelable.Creator<StandardSaleProps> {
    @Override // android.os.Parcelable.Creator
    public final StandardSaleProps createFromParcel(Parcel parcel) {
        LinkedHashMap linkedHashMap;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            linkedHashMap = null;
        } else {
            int readInt = parcel.readInt();
            linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), SaleProp.CREATOR.createFromParcel(parcel));
            }
        }
        return new StandardSaleProps(readString, linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final StandardSaleProps[] newArray(int i) {
        return new StandardSaleProps[i];
    }
}
