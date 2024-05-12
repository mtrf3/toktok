package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.model.RepaymentArg;
import kotlin.jvm.internal.o;

/* renamed from: X.a0H, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91789a0H implements Parcelable.Creator<RepaymentArg> {
    @Override // android.os.Parcelable.Creator
    public final RepaymentArg createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        long readLong = parcel.readLong();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new RepaymentArg(readString, readString2, readString3, z, readString4, readString5, readString6, readLong, z2, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final RepaymentArg[] newArray(int i) {
        return new RepaymentArg[i];
    }
}
