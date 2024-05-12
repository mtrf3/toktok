package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreRegVisitorTag;
import kotlin.jvm.internal.o;

/* renamed from: X.PSb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64473PSb implements Parcelable.Creator<StoreRegVisitorTag> {
    @Override // android.os.Parcelable.Creator
    public final StoreRegVisitorTag createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new StoreRegVisitorTag(valueOf, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final StoreRegVisitorTag[] newArray(int i) {
        return new StoreRegVisitorTag[i];
    }
}
