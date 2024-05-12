package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.ProductDetailsEpt;
import kotlin.jvm.internal.o;

/* renamed from: X.Av7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27769Av7 implements Parcelable.Creator<ProductDetailsEpt> {
    @Override // android.os.Parcelable.Creator
    public final ProductDetailsEpt createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ProductDetailsEpt(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
    }

    @Override // android.os.Parcelable.Creator
    public final ProductDetailsEpt[] newArray(int i) {
        return new ProductDetailsEpt[i];
    }
}
