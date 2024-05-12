package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DeductibleVoucherReminder;
import kotlin.jvm.internal.o;

/* renamed from: X.RVw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69668RVw implements Parcelable.Creator<DeductibleVoucherReminder> {
    @Override // android.os.Parcelable.Creator
    public final DeductibleVoucherReminder createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new DeductibleVoucherReminder(parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final DeductibleVoucherReminder[] newArray(int i) {
        return new DeductibleVoucherReminder[i];
    }
}
