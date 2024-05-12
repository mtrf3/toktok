package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectHint;
import kotlin.jvm.internal.o;

/* renamed from: X.aRP, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C93471aRP implements Parcelable.Creator<EffectHint> {
    @Override // android.os.Parcelable.Creator
    public final EffectHint createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new EffectHint(in.readString(), in.readString(), in.readString(), in.readString(), in.readString(), in.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final EffectHint[] newArray(int i) {
        return new EffectHint[i];
    }
}
