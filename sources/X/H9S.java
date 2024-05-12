package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H9S implements Parcelable.Creator<DuetExtraInfo> {
    @Override // android.os.Parcelable.Creator
    public final DuetExtraInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new DuetExtraInfo(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final DuetExtraInfo[] newArray(int i) {
        return new DuetExtraInfo[i];
    }
}
