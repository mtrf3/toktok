package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopupPrompt;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RTJ implements Parcelable.Creator<PurchaseNotice> {
    @Override // android.os.Parcelable.Creator
    public final PurchaseNotice createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        PopupPrompt popupPrompt = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            popupPrompt = PopupPrompt.CREATOR.createFromParcel(parcel);
        }
        return new PurchaseNotice(readString, valueOf, popupPrompt);
    }

    @Override // android.os.Parcelable.Creator
    public final PurchaseNotice[] newArray(int i) {
        return new PurchaseNotice[i];
    }
}
