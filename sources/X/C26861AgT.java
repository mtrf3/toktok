package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentPopup;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.Icon;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.AgT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26861AgT implements Parcelable.Creator<WarehouseTag> {
    @Override // android.os.Parcelable.Creator
    public final WarehouseTag createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        HashMap hashMap;
        o.LJIIIZ(parcel, "parcel");
        ContentPopup contentPopup = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon = createFromParcel;
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            hashMap = null;
        } else {
            int readInt = parcel.readInt();
            hashMap = new HashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                hashMap.put(parcel.readString(), parcel.readString());
            }
        }
        if (parcel.readInt() != 0) {
            contentPopup = ContentPopup.CREATOR.createFromParcel(parcel);
        }
        return new WarehouseTag(icon, readString, hashMap, contentPopup, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final WarehouseTag[] newArray(int i) {
        return new WarehouseTag[i];
    }
}
