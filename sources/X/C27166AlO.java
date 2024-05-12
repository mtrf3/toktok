package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.CheckoutLink;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.PolicyItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ReturnPolicyBizData;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.AlO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27166AlO implements Parcelable.Creator<ReturnPolicyBizData> {
    @Override // android.os.Parcelable.Creator
    public final ReturnPolicyBizData createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        CheckoutLink createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        boolean z = false;
        Boolean bool = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(PolicyItem.CREATOR, parcel, arrayList, i, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = CheckoutLink.CREATOR.createFromParcel(parcel);
        }
        CheckoutLink checkoutLink = createFromParcel;
        if (parcel.readInt() != 0) {
            if (parcel.readInt() != 0) {
                z = true;
            }
            bool = Boolean.valueOf(z);
        }
        return new ReturnPolicyBizData(readString, readString2, arrayList, checkoutLink, bool);
    }

    @Override // android.os.Parcelable.Creator
    public final ReturnPolicyBizData[] newArray(int i) {
        return new ReturnPolicyBizData[i];
    }
}
