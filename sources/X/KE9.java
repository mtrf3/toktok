package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.search.result.pagermodel.VerticalPagerData;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KE9 implements Parcelable.Creator<VerticalPagerData> {
    @Override // android.os.Parcelable.Creator
    public final VerticalPagerData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new VerticalPagerData(KAK.valueOf(parcel.readString()), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final VerticalPagerData[] newArray(int i) {
        return new VerticalPagerData[i];
    }
}
