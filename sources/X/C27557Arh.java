package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PhoneContact;
import kotlin.jvm.internal.o;

/* renamed from: X.Arh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27557Arh implements Parcelable.Creator<PhoneContact> {
    @Override // android.os.Parcelable.Creator
    public final PhoneContact createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        return new PhoneContact(readString, readString2, readString3, readString4, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final PhoneContact[] newArray(int i) {
        return new PhoneContact[i];
    }
}
