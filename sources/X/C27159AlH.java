package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticItem;
import kotlin.jvm.internal.o;

/* renamed from: X.AlH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27159AlH implements Parcelable.Creator<LogisticItem> {
    @Override // android.os.Parcelable.Creator
    public final LogisticItem createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new LogisticItem(valueOf, parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final LogisticItem[] newArray(int i) {
        return new LogisticItem[i];
    }
}
