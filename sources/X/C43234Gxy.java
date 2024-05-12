package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.draft.model.LighteningExtraInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Gxy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43234Gxy implements Parcelable.Creator<LighteningExtraInfo> {
    @Override // android.os.Parcelable.Creator
    public final LighteningExtraInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new LighteningExtraInfo(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final LighteningExtraInfo[] newArray(int i) {
        return new LighteningExtraInfo[i];
    }
}
