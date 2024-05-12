package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModuleMeta;
import kotlin.jvm.internal.o;

/* renamed from: X.AlB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27153AlB implements Parcelable.Creator<PDPShippingModuleMeta> {
    @Override // android.os.Parcelable.Creator
    public final PDPShippingModuleMeta createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new PDPShippingModuleMeta(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PDPShippingModuleMeta[] newArray(int i) {
        return new PDPShippingModuleMeta[i];
    }
}
