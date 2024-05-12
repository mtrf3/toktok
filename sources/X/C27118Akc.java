package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkText;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Akc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27118Akc implements Parcelable.Creator<LogisticLinkRichText> {
    @Override // android.os.Parcelable.Creator
    public final LogisticLinkRichText createFromParcel(Parcel parcel) {
        LinkedHashMap linkedHashMap;
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        Integer num = null;
        if (parcel.readInt() == 0) {
            linkedHashMap = null;
        } else {
            int readInt = parcel.readInt();
            linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), LogisticLinkText.CREATOR.createFromParcel(parcel));
            }
        }
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new LogisticLinkRichText(readString, linkedHashMap, readString2, readString3, valueOf, num);
    }

    @Override // android.os.Parcelable.Creator
    public final LogisticLinkRichText[] newArray(int i) {
        return new LogisticLinkRichText[i];
    }
}
