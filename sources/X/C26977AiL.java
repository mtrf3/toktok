package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticsDescription;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.AiL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26977AiL implements Parcelable.Creator<LogisticsDescription> {
    @Override // android.os.Parcelable.Creator
    public final LogisticsDescription createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        LogisticLinkRichText createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        LogisticLinkRichText logisticLinkRichText = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(LogisticLinkRichText.CREATOR, parcel, arrayList, i, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = LogisticLinkRichText.CREATOR.createFromParcel(parcel);
        }
        LogisticLinkRichText logisticLinkRichText2 = createFromParcel;
        if (parcel.readInt() != 0) {
            logisticLinkRichText = LogisticLinkRichText.CREATOR.createFromParcel(parcel);
        }
        return new LogisticsDescription(readString, arrayList, logisticLinkRichText2, logisticLinkRichText, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final LogisticsDescription[] newArray(int i) {
        return new LogisticsDescription[i];
    }
}
