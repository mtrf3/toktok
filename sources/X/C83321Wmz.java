package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.asve.wrap.ASSimpleFaceInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Wmz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83321Wmz implements Parcelable.Creator<ASSimpleFaceInfo> {
    @Override // android.os.Parcelable.Creator
    public final ASSimpleFaceInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ASSimpleFaceInfo(parcel.readFloat());
    }

    @Override // android.os.Parcelable.Creator
    public final ASSimpleFaceInfo[] newArray(int i) {
        return new ASSimpleFaceInfo[i];
    }
}
