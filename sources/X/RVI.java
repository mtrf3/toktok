package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVI implements Parcelable.Creator<InstallmentPlan> {
    @Override // android.os.Parcelable.Creator
    public final InstallmentPlan createFromParcel(Parcel parcel) {
        Amount createFromParcel;
        Amount createFromParcel2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Amount amount = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Amount.CREATOR.createFromParcel(parcel);
        }
        Amount amount2 = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = Amount.CREATOR.createFromParcel(parcel);
        }
        Amount amount3 = createFromParcel2;
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        if (parcel.readInt() != 0) {
            amount = Amount.CREATOR.createFromParcel(parcel);
        }
        return new InstallmentPlan(readString, readString2, amount2, amount3, readString3, readString4, readString5, readString6, amount);
    }

    @Override // android.os.Parcelable.Creator
    public final InstallmentPlan[] newArray(int i) {
        return new InstallmentPlan[i];
    }
}
