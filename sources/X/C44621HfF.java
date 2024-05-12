package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.cutsame.prepare.VEConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.HfF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44621HfF implements Parcelable.Creator<VEConfig> {
    @Override // android.os.Parcelable.Creator
    public final VEConfig createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new VEConfig(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final VEConfig[] newArray(int i) {
        return new VEConfig[i];
    }
}
