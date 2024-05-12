package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import kotlin.jvm.internal.o;

/* renamed from: X.Ahf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26935Ahf implements Parcelable.Creator<DeliveryData> {
    @Override // android.os.Parcelable.Creator
    public final DeliveryData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new DeliveryData();
    }

    @Override // android.os.Parcelable.Creator
    public final DeliveryData[] newArray(int i) {
        return new DeliveryData[i];
    }
}
