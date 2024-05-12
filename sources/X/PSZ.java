package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SKUPanelBottomText;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PSZ implements Parcelable.Creator<SKUPanelBottomText> {
    @Override // android.os.Parcelable.Creator
    public final SKUPanelBottomText createFromParcel(Parcel parcel) {
        LinkedHashMap linkedHashMap;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            linkedHashMap = null;
        } else {
            int readInt = parcel.readInt();
            linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
        }
        return new SKUPanelBottomText(readString, linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final SKUPanelBottomText[] newArray(int i) {
        return new SKUPanelBottomText[i];
    }
}
