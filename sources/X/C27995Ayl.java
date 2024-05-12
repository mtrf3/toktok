package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Ayl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27995Ayl implements Parcelable.Creator<OrderSKUDTO> {
    @Override // android.os.Parcelable.Creator
    public final OrderSKUDTO createFromParcel(Parcel parcel) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        SkuCardStyleInfo skuCardStyleInfo = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString3 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        String readString9 = parcel.readString();
        String readString10 = parcel.readString();
        String readString11 = parcel.readString();
        String readString12 = parcel.readString();
        String readString13 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            skuCardStyleInfo = SkuCardStyleInfo.CREATOR.createFromParcel(parcel);
        }
        return new OrderSKUDTO(readString, readString2, valueOf, readString3, valueOf2, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, valueOf3, skuCardStyleInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final OrderSKUDTO[] newArray(int i) {
        return new OrderSKUDTO[i];
    }
}
