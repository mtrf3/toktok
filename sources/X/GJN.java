package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectDoneInitState;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GJN implements Parcelable.Creator<EffectDoneInitState> {
    @Override // android.os.Parcelable.Creator
    public final EffectDoneInitState createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new EffectDoneInitState(parcel.readString(), parcel.readString(), (UrlModel) parcel.readSerializable(), (android.net.Uri) parcel.readParcelable(EffectDoneInitState.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final EffectDoneInitState[] newArray(int i) {
        return new EffectDoneInitState[i];
    }
}
