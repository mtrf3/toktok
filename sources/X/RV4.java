package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSaleReminderButton;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RV4 implements Parcelable.Creator<FlashSaleReminderButton> {
    @Override // android.os.Parcelable.Creator
    public final FlashSaleReminderButton createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new FlashSaleReminderButton(valueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final FlashSaleReminderButton[] newArray(int i) {
        return new FlashSaleReminderButton[i];
    }
}
