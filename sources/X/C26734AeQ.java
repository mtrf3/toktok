package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ChangeLocationData;
import kotlin.jvm.internal.o;

/* renamed from: X.AeQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26734AeQ implements Parcelable.Creator<ChangeLocationData> {
    @Override // android.os.Parcelable.Creator
    public final ChangeLocationData createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Integer num = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new ChangeLocationData(readString, readString2, valueOf, num);
    }

    @Override // android.os.Parcelable.Creator
    public final ChangeLocationData[] newArray(int i) {
        return new ChangeLocationData[i];
    }
}
