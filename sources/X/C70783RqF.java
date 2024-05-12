package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpReviewClickEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.RqF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70783RqF implements Parcelable.Creator<PdpReviewClickEvent> {
    @Override // android.os.Parcelable.Creator
    public final PdpReviewClickEvent createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new PdpReviewClickEvent(readString, readString2, readString3, readString4, valueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final PdpReviewClickEvent[] newArray(int i) {
        return new PdpReviewClickEvent[i];
    }
}
