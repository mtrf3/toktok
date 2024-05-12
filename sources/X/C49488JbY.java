package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.JbY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49488JbY implements Parcelable.Creator<OptimizeAbility> {
    @Override // android.os.Parcelable.Creator
    public final OptimizeAbility createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new OptimizeAbility(z, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final OptimizeAbility[] newArray(int i) {
        return new OptimizeAbility[i];
    }
}
