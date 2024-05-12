package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.cutsame.prepare.FeatureConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.HfD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44619HfD implements Parcelable.Creator<FeatureConfig> {
    @Override // android.os.Parcelable.Creator
    public final FeatureConfig createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new FeatureConfig(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final FeatureConfig[] newArray(int i) {
        return new FeatureConfig[i];
    }
}
