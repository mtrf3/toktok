package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SelectedSKCInfo;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVO implements Parcelable.Creator<SelectedSKCInfo> {
    @Override // android.os.Parcelable.Creator
    public final SelectedSKCInfo createFromParcel(Parcel parcel) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        o.LJIIIZ(parcel, "parcel");
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        Integer num = null;
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
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(parcel.readInt());
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new SelectedSKCInfo(createStringArrayList, valueOf, valueOf2, valueOf3, readString, readString2, num, (CartEntry) parcel.readParcelable(SelectedSKCInfo.class.getClassLoader()), (ExceptionUX) parcel.readParcelable(SelectedSKCInfo.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final SelectedSKCInfo[] newArray(int i) {
        return new SelectedSKCInfo[i];
    }
}
