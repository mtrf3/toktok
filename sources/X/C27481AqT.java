package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentPlaceholderRichText;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentPopupButton;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ContentRichPopup;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.AqT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27481AqT implements Parcelable.Creator<ContentRichPopup> {
    @Override // android.os.Parcelable.Creator
    public final ContentRichPopup createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        int i = 0;
        ArrayList arrayList2 = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 != readInt) {
                i2 = C279117r.LIZIZ(ContentPlaceholderRichText.CREATOR, parcel, arrayList, i2, 1);
            }
        }
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = C279117r.LIZIZ(ContentPopupButton.CREATOR, parcel, arrayList2, i, 1);
            }
        }
        return new ContentRichPopup(readString, arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final ContentRichPopup[] newArray(int i) {
        return new ContentRichPopup[i];
    }
}
