package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHintWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.ERx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36441ERx implements Parcelable.Creator<EffectHintWrapper> {
    @Override // android.os.Parcelable.Creator
    public final EffectHintWrapper createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new EffectHintWrapper(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final EffectHintWrapper[] newArray(int i) {
        return new EffectHintWrapper[i];
    }
}
