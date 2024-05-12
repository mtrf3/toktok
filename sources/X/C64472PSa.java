package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreFreqBoughtTag;
import kotlin.jvm.internal.o;

/* renamed from: X.PSa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64472PSa implements Parcelable.Creator<StoreFreqBoughtTag> {
    @Override // android.os.Parcelable.Creator
    public final StoreFreqBoughtTag createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new StoreFreqBoughtTag(valueOf, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final StoreFreqBoughtTag[] newArray(int i) {
        return new StoreFreqBoughtTag[i];
    }
}
