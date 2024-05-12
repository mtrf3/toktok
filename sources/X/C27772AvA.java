package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ConvenientSubmitOrder;
import kotlin.jvm.internal.o;

/* renamed from: X.AvA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27772AvA implements Parcelable.Creator<ConvenientSubmitOrder> {
    @Override // android.os.Parcelable.Creator
    public final ConvenientSubmitOrder createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ConvenientSubmitOrder(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ConvenientSubmitOrder[] newArray(int i) {
        return new ConvenientSubmitOrder[i];
    }
}
