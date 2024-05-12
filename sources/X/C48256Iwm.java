package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.CouponCache;
import kotlin.jvm.internal.o;

/* renamed from: X.Iwm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48256Iwm implements Parcelable.Creator<CouponCache> {
    @Override // android.os.Parcelable.Creator
    public final CouponCache createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new CouponCache(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final CouponCache[] newArray(int i) {
        return new CouponCache[i];
    }
}
