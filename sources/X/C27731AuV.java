package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.LogisticBizExtra;
import kotlin.jvm.internal.o;

/* renamed from: X.AuV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27731AuV implements Parcelable.Creator<LogisticBizExtra> {
    @Override // android.os.Parcelable.Creator
    public final LogisticBizExtra createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new LogisticBizExtra(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final LogisticBizExtra[] newArray(int i) {
        return new LogisticBizExtra[i];
    }
}
