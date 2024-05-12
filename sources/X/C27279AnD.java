package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.MapLocateEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.AnD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27279AnD implements Parcelable.Creator<MapLocateEvent> {
    @Override // android.os.Parcelable.Creator
    public final MapLocateEvent createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new MapLocateEvent(readInt, valueOf, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final MapLocateEvent[] newArray(int i) {
        return new MapLocateEvent[i];
    }
}
