package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.AdditionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductDescBizData;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.At7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27645At7 implements Parcelable.Creator<ProductDescBizData> {
    @Override // android.os.Parcelable.Creator
    public final ProductDescBizData createFromParcel(Parcel parcel) {
        Video createFromParcel;
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        ArrayList arrayList2 = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Video.CREATOR.createFromParcel(parcel);
        }
        Video video = createFromParcel;
        String readString = parcel.readString();
        int i = 0;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 != readInt) {
                i2 = C279117r.LIZIZ(Specification.CREATOR, parcel, arrayList, i2, 1);
            }
        }
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = C279117r.LIZIZ(AdditionInfo.CREATOR, parcel, arrayList2, i, 1);
            }
        }
        return new ProductDescBizData(video, readString, arrayList, arrayList2, (Image) parcel.readParcelable(ProductDescBizData.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final ProductDescBizData[] newArray(int i) {
        return new ProductDescBizData[i];
    }
}
