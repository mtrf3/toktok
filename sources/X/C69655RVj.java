package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecallBox;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RemindBox;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VoucherBox;
import kotlin.jvm.internal.o;

/* renamed from: X.RVj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69655RVj implements Parcelable.Creator<RecallBox> {
    @Override // android.os.Parcelable.Creator
    public final RecallBox createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        Integer valueOf;
        Long valueOf2;
        VoucherBox createFromParcel2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        RemindBox remindBox = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon = createFromParcel;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = VoucherBox.CREATOR.createFromParcel(parcel);
        }
        VoucherBox voucherBox = createFromParcel2;
        if (parcel.readInt() != 0) {
            remindBox = RemindBox.CREATOR.createFromParcel(parcel);
        }
        return new RecallBox(readString, icon, valueOf, valueOf2, voucherBox, remindBox, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final RecallBox[] newArray(int i) {
        return new RecallBox[i];
    }
}
