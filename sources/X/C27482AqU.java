package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentAction;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentRichPopup;
import kotlin.jvm.internal.o;

/* renamed from: X.AqU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27482AqU implements Parcelable.Creator<ContentAction> {
    @Override // android.os.Parcelable.Creator
    public final ContentAction createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        ContentRichPopup contentRichPopup = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            contentRichPopup = ContentRichPopup.CREATOR.createFromParcel(parcel);
        }
        return new ContentAction(valueOf, contentRichPopup);
    }

    @Override // android.os.Parcelable.Creator
    public final ContentAction[] newArray(int i) {
        return new ContentAction[i];
    }
}
