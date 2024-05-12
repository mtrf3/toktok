package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictsData;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Aoh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27371Aoh implements Parcelable.Creator<SearchDistrictsData> {
    @Override // android.os.Parcelable.Creator
    public final SearchDistrictsData createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(District.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new SearchDistrictsData(arrayList, (ExceptionUX) parcel.readParcelable(SearchDistrictsData.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final SearchDistrictsData[] newArray(int i) {
        return new SearchDistrictsData[i];
    }
}
