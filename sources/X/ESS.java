package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effectcreator.models.EffectObjectDataWrapper;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ESS implements Parcelable.Creator<EffectObjectDataWrapper> {
    @Override // android.os.Parcelable.Creator
    public final EffectObjectDataWrapper createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new EffectObjectDataWrapper(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
    }

    @Override // android.os.Parcelable.Creator
    public final EffectObjectDataWrapper[] newArray(int i) {
        return new EffectObjectDataWrapper[i];
    }
}
