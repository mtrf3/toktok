package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FirstNotice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ThirdParty;
import kotlin.jvm.internal.o;

/* renamed from: X.RUj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69629RUj implements Parcelable.Creator<ThirdParty> {
    @Override // android.os.Parcelable.Creator
    public final ThirdParty createFromParcel(Parcel parcel) {
        FirstNotice createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = FirstNotice.CREATOR.createFromParcel(parcel);
        }
        return new ThirdParty(readString, readString2, readString3, readString4, readString5, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final ThirdParty[] newArray(int i) {
        return new ThirdParty[i];
    }
}
