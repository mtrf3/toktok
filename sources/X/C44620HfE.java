package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.cutsame.prepare.VECompileBpsConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.HfE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44620HfE implements Parcelable.Creator<VECompileBpsConfig> {
    @Override // android.os.Parcelable.Creator
    public final VECompileBpsConfig createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new VECompileBpsConfig(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final VECompileBpsConfig[] newArray(int i) {
        return new VECompileBpsConfig[i];
    }
}
