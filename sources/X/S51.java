package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S51 implements Parcelable.Creator<RootData> {
    @Override // android.os.Parcelable.Creator
    public final RootData createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new RootData(parcel.readInt(), readString, z, readString2, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final RootData[] newArray(int i) {
        return new RootData[i];
    }
}
