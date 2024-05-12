package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DescDetailV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RichBlock;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Asi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27620Asi implements Parcelable.Creator<DescDetailV2> {
    @Override // android.os.Parcelable.Creator
    public final DescDetailV2 createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(RichBlock.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new DescDetailV2(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final DescDetailV2[] newArray(int i) {
        return new DescDetailV2[i];
    }
}
