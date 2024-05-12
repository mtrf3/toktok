package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BlockPageInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RSX implements Parcelable.Creator<BlockPageInfo> {
    @Override // android.os.Parcelable.Creator
    public final BlockPageInfo createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new BlockPageInfo(valueOf, parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final BlockPageInfo[] newArray(int i) {
        return new BlockPageInfo[i];
    }
}
