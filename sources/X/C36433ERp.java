package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.GreenScreenInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.ERp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36433ERp implements Parcelable.Creator<GreenScreenInfo> {
    @Override // android.os.Parcelable.Creator
    public final GreenScreenInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new GreenScreenInfo(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final GreenScreenInfo[] newArray(int i) {
        return new GreenScreenInfo[i];
    }
}
