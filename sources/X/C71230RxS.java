package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.ShortTouch;
import kotlin.jvm.internal.o;

/* renamed from: X.RxS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71230RxS implements Parcelable.Creator<ShortTouch> {
    @Override // android.os.Parcelable.Creator
    public final ShortTouch createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new ShortTouch();
    }

    @Override // android.os.Parcelable.Creator
    public final ShortTouch[] newArray(int i) {
        return new ShortTouch[i];
    }
}
