package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ModelFigure;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ModelInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Aqu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27508Aqu implements Parcelable.Creator<ModelInfo> {
    @Override // android.os.Parcelable.Creator
    public final ModelInfo createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        Image image = (Image) parcel.readParcelable(ModelInfo.class.getClassLoader());
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(ModelFigure.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new ModelInfo(image, readString, arrayList, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ModelInfo[] newArray(int i) {
        return new ModelInfo[i];
    }
}
