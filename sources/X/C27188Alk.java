package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import kotlin.jvm.internal.o;

/* renamed from: X.Alk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27188Alk implements Parcelable.Creator<Specification> {
    @Override // android.os.Parcelable.Creator
    public final Specification createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new Specification(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Specification[] newArray(int i) {
        return new Specification[i];
    }
}
