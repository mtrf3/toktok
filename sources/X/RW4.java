package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomArea;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RW4 implements Parcelable.Creator<PdpBottomArea> {
    @Override // android.os.Parcelable.Creator
    public final PdpBottomArea createFromParcel(Parcel parcel) {
        LinkedHashMap linkedHashMap;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        LinkRichText linkRichText = null;
        if (parcel.readInt() == 0) {
            linkedHashMap = null;
        } else {
            int readInt = parcel.readInt();
            linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), PdpBottomAreaElem.CREATOR.createFromParcel(parcel));
            }
        }
        if (parcel.readInt() != 0) {
            linkRichText = LinkRichText.CREATOR.createFromParcel(parcel);
        }
        return new PdpBottomArea(readString, linkedHashMap, linkRichText, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PdpBottomArea[] newArray(int i) {
        return new PdpBottomArea[i];
    }
}
