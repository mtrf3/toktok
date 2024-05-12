package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ReturnPolicyBizExtra;
import kotlin.jvm.internal.o;

/* renamed from: X.AuX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27733AuX implements Parcelable.Creator<ReturnPolicyBizExtra> {
    @Override // android.os.Parcelable.Creator
    public final ReturnPolicyBizExtra createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ReturnPolicyBizExtra(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ReturnPolicyBizExtra[] newArray(int i) {
        return new ReturnPolicyBizExtra[i];
    }
}
