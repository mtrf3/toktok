package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effectcreator.models.EffectCommandDataWrapper;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ESR implements Parcelable.Creator<EffectCommandDataWrapper> {
    @Override // android.os.Parcelable.Creator
    public final EffectCommandDataWrapper createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new EffectCommandDataWrapper(z, parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.createStringArrayList());
    }

    @Override // android.os.Parcelable.Creator
    public final EffectCommandDataWrapper[] newArray(int i) {
        return new EffectCommandDataWrapper[i];
    }
}
