package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PlatformPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PlatformPromotionItem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.RUw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69642RUw implements Parcelable.Creator<PlatformPromotion> {
    @Override // android.os.Parcelable.Creator
    public final PlatformPromotion createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        Image image = (Image) parcel.readParcelable(PlatformPromotion.class.getClassLoader());
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(PlatformPromotionItem.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new PlatformPromotion(image, readString, arrayList, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PlatformPromotion[] newArray(int i) {
        return new PlatformPromotion[i];
    }
}
