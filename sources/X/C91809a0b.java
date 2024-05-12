package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpRouteArg;
import kotlin.jvm.internal.o;

/* renamed from: X.a0b, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91809a0b implements Parcelable.Creator<OtpRouteArg> {
    @Override // android.os.Parcelable.Creator
    public final OtpRouteArg createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new OtpRouteArg(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final OtpRouteArg[] newArray(int i) {
        return new OtpRouteArg[i];
    }
}
