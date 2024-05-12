package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RW6 implements Parcelable.Creator<PdpButton> {
    @Override // android.os.Parcelable.Creator
    public final PdpButton createFromParcel(Parcel parcel) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
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
        return new PdpButton(readString, readString2, readString3, readString4, valueOf, valueOf2, valueOf3, num);
    }

    @Override // android.os.Parcelable.Creator
    public final PdpButton[] newArray(int i) {
        return new PdpButton[i];
    }
}
