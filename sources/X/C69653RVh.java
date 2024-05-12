package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VoucherBox;
import kotlin.jvm.internal.o;

/* renamed from: X.RVh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69653RVh implements Parcelable.Creator<VoucherBox> {
    @Override // android.os.Parcelable.Creator
    public final VoucherBox createFromParcel(Parcel parcel) {
        Long valueOf;
        Icon createFromParcel;
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        Boolean bool = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon = createFromParcel;
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        if (parcel.readInt() != 0) {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        }
        return new VoucherBox(readString, readString2, readString3, readString4, valueOf, icon, readString5, readString6, bool);
    }

    @Override // android.os.Parcelable.Creator
    public final VoucherBox[] newArray(int i) {
        return new VoucherBox[i];
    }
}
