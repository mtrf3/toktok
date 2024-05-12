package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchFrom;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.Icon;
import kotlin.jvm.internal.o;

/* renamed from: X.Aeu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26764Aeu implements Parcelable.Creator<DispatchFrom> {
    @Override // android.os.Parcelable.Creator
    public final DispatchFrom createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        Icon createFromParcel2;
        o.LJIIIZ(parcel, "parcel");
        WarehouseTag warehouseTag = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon = createFromParcel;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon2 = createFromParcel2;
        if (parcel.readInt() != 0) {
            warehouseTag = WarehouseTag.CREATOR.createFromParcel(parcel);
        }
        return new DispatchFrom(icon, readString, readString2, icon2, warehouseTag);
    }

    @Override // android.os.Parcelable.Creator
    public final DispatchFrom[] newArray(int i) {
        return new DispatchFrom[i];
    }
}
