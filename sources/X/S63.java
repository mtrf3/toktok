package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageListData;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S63 implements Parcelable.Creator<ImageListData> {
    @Override // android.os.Parcelable.Creator
    public final ImageListData createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(ImageItem.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new ImageListData(arrayList, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final ImageListData[] newArray(int i) {
        return new ImageListData[i];
    }
}
