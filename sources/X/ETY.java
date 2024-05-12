package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.HeaderBizExtra;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ETY implements Parcelable.Creator<HeaderBizExtra> {
    @Override // android.os.Parcelable.Creator
    public final HeaderBizExtra createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new HeaderBizExtra(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final HeaderBizExtra[] newArray(int i) {
        return new HeaderBizExtra[i];
    }
}
