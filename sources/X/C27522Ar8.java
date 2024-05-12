package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBannerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RelateProduct;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ar8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27522Ar8 implements Parcelable.Creator<PromotionEntrance> {
    @Override // android.os.Parcelable.Creator
    public final PromotionEntrance createFromParcel(Parcel parcel) {
        Integer valueOf;
        Integer valueOf2;
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        EntranceBannerInfo entranceBannerInfo = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(RelateProduct.CREATOR, parcel, arrayList, i, 1);
            }
        }
        if (parcel.readInt() != 0) {
            entranceBannerInfo = EntranceBannerInfo.CREATOR.createFromParcel(parcel);
        }
        return new PromotionEntrance(readString, readString2, readString3, valueOf, valueOf2, readString4, readString5, readString6, arrayList, entranceBannerInfo, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PromotionEntrance[] newArray(int i) {
        return new PromotionEntrance[i];
    }
}
