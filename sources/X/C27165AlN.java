package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.CheckoutLink;
import kotlin.jvm.internal.o;

/* renamed from: X.AlN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27165AlN implements Parcelable.Creator<CheckoutLink> {
    @Override // android.os.Parcelable.Creator
    public final CheckoutLink createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new CheckoutLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final CheckoutLink[] newArray(int i) {
        return new CheckoutLink[i];
    }
}
