package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.UGp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76915UGp implements Parcelable.Creator<LiveEffect.AudioGraphBean> {
    @Override // android.os.Parcelable.Creator
    public final LiveEffect.AudioGraphBean createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        Boolean valueOf;
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
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z3 = true;
            }
            valueOf = Boolean.valueOf(z3);
        }
        return new LiveEffect.AudioGraphBean(z, z2, valueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final LiveEffect.AudioGraphBean[] newArray(int i) {
        return new LiveEffect.AudioGraphBean[i];
    }
}
