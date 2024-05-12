package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.anchor.AddAnchorParam;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A6W implements Parcelable.Creator<AddAnchorParam> {
    @Override // android.os.Parcelable.Creator
    public final AddAnchorParam createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new AddAnchorParam(parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final AddAnchorParam[] newArray(int i) {
        return new AddAnchorParam[i];
    }
}
