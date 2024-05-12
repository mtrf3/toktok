package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.AjZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27053AjZ implements Parcelable.Creator<BillItem> {
    @Override // android.os.Parcelable.Creator
    public final BillItem createFromParcel(Parcel parcel) {
        Integer valueOf;
        Price createFromParcel;
        Icon createFromParcel2;
        Integer valueOf2;
        Integer valueOf3;
        o.LJIIIZ(parcel, "parcel");
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Price.CREATOR.createFromParcel(parcel);
        }
        Price price = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon = createFromParcel2;
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(parcel.readInt());
        }
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(BillItem.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new BillItem(valueOf, readString, price, icon, valueOf2, valueOf3, readString2, arrayList, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final BillItem[] newArray(int i) {
        return new BillItem[i];
    }
}
