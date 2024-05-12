package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NavButton;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RXH implements Parcelable.Creator<NavButton> {
    @Override // android.os.Parcelable.Creator
    public final NavButton createFromParcel(Parcel parcel) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        Integer num = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
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
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new NavButton(readString, readString2, readString3, valueOf, valueOf2, valueOf3, num, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final NavButton[] newArray(int i) {
        return new NavButton[i];
    }
}
