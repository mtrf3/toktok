package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShipFromInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Aks, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27134Aks implements Parcelable.Creator<ShipFromInfo> {
    @Override // android.os.Parcelable.Creator
    public final ShipFromInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ShipFromInfo(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ShipFromInfo[] newArray(int i) {
        return new ShipFromInfo[i];
    }
}
