package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.summary.SubBillItemData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Aja, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27054Aja implements Parcelable.Creator<SubBillItemData> {
    @Override // android.os.Parcelable.Creator
    public final SubBillItemData createFromParcel(Parcel parcel) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString3 = parcel.readString();
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
        String readString4 = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(BillItem.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new SubBillItemData(readString, readString2, valueOf, readString3, valueOf2, valueOf3, readString4, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final SubBillItemData[] newArray(int i) {
        return new SubBillItemData[i];
    }
}
