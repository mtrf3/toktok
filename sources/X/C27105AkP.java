package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LeadMessage;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDiscountView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.AkP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27105AkP implements Parcelable.Creator<LogisticTextDTO> {
    @Override // android.os.Parcelable.Creator
    public final LogisticTextDTO createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        LeadMessage leadMessage = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(LogisticDiscountView.CREATOR, parcel, arrayList, i, 1);
            }
        }
        if (parcel.readInt() != 0) {
            leadMessage = LeadMessage.CREATOR.createFromParcel(parcel);
        }
        return new LogisticTextDTO(readString, readString2, readString3, readString4, readString5, readString6, arrayList, leadMessage, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final LogisticTextDTO[] newArray(int i) {
        return new LogisticTextDTO[i];
    }
}
