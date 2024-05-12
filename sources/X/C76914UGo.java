package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.UGo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76914UGo implements Parcelable.Creator<LiveEffect.LiveGoalExtra> {
    @Override // android.os.Parcelable.Creator
    public final LiveEffect.LiveGoalExtra createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        o.LJIIIZ(parcel, "parcel");
        boolean z3 = false;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (parcel.readInt() != 0) {
            z3 = true;
        }
        return new LiveEffect.LiveGoalExtra(z, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final LiveEffect.LiveGoalExtra[] newArray(int i) {
        return new LiveEffect.LiveGoalExtra[i];
    }
}
