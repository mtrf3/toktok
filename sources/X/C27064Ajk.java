package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticItem;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPromotion;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ajk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27064Ajk implements Parcelable.Creator<LogisticPromotion> {
    @Override // android.os.Parcelable.Creator
    public final LogisticPromotion createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(LogisticItem.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new LogisticPromotion(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final LogisticPromotion[] newArray(int i) {
        return new LogisticPromotion[i];
    }
}
