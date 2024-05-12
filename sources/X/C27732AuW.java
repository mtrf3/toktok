package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductDescBizExtra;
import kotlin.jvm.internal.o;

/* renamed from: X.AuW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27732AuW implements Parcelable.Creator<ProductDescBizExtra> {
    @Override // android.os.Parcelable.Creator
    public final ProductDescBizExtra createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ProductDescBizExtra(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ProductDescBizExtra[] newArray(int i) {
        return new ProductDescBizExtra[i];
    }
}
