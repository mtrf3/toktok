package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.XLLinkRichText;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Asg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27618Asg implements Parcelable.Creator<XLLinkRichText> {
    @Override // android.os.Parcelable.Creator
    public final XLLinkRichText createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(LogisticLinkRichText.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new XLLinkRichText(valueOf, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final XLLinkRichText[] newArray(int i) {
        return new XLLinkRichText[i];
    }
}
