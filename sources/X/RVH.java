package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVH implements Parcelable.Creator<InstallmentInfo> {
    @Override // android.os.Parcelable.Creator
    public final InstallmentInfo createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Amount amount = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(InstallmentPlan.CREATOR, parcel, arrayList, i, 1);
            }
        }
        if (parcel.readInt() != 0) {
            amount = Amount.CREATOR.createFromParcel(parcel);
        }
        return new InstallmentInfo(readString, readString2, arrayList, amount, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final InstallmentInfo[] newArray(int i) {
        return new InstallmentInfo[i];
    }
}
