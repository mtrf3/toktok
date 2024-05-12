package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Glq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42482Glq implements Parcelable.Creator<InteractiveBrandedEffectInfo> {
    @Override // android.os.Parcelable.Creator
    public final InteractiveBrandedEffectInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new InteractiveBrandedEffectInfo();
    }

    @Override // android.os.Parcelable.Creator
    public final InteractiveBrandedEffectInfo[] newArray(int i) {
        return new InteractiveBrandedEffectInfo[i];
    }
}
