package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticMeta;
import kotlin.jvm.internal.o;

/* renamed from: X.AlA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27152AlA implements Parcelable.Creator<PDPLogisticMeta> {
    @Override // android.os.Parcelable.Creator
    public final PDPLogisticMeta createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new PDPLogisticMeta(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PDPLogisticMeta[] newArray(int i) {
        return new PDPLogisticMeta[i];
    }
}
