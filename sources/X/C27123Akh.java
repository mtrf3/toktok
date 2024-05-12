package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDiscountView;
import kotlin.jvm.internal.o;

/* renamed from: X.Akh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27123Akh implements Parcelable.Creator<LogisticDiscountView> {
    @Override // android.os.Parcelable.Creator
    public final LogisticDiscountView createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new LogisticDiscountView(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final LogisticDiscountView[] newArray(int i) {
        return new LogisticDiscountView[i];
    }
}
