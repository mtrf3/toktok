package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RW5 implements Parcelable.Creator<PdpBottomAreaElem> {
    @Override // android.os.Parcelable.Creator
    public final PdpBottomAreaElem createFromParcel(Parcel parcel) {
        LinkRichText createFromParcel;
        LinkRichText createFromParcel2;
        o.LJIIIZ(parcel, "parcel");
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
        }
        LinkRichText linkRichText = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = LinkRichText.CREATOR.createFromParcel(parcel);
        }
        LinkRichText linkRichText2 = createFromParcel2;
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(PdpButton.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new PdpBottomAreaElem(linkRichText, linkRichText2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final PdpBottomAreaElem[] newArray(int i) {
        return new PdpBottomAreaElem[i];
    }
}
