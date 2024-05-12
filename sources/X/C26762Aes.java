package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOnOrderStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Aes, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26762Aes implements Parcelable.Creator<ChangeOnOrderStruct> {
    @Override // android.os.Parcelable.Creator
    public final ChangeOnOrderStruct createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new ChangeOnOrderStruct(valueOf, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ChangeOnOrderStruct[] newArray(int i) {
        return new ChangeOnOrderStruct[i];
    }
}
