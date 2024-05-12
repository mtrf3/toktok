package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.ExtraSession;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HB2 implements Parcelable.Creator<ExtraSession> {
    @Override // android.os.Parcelable.Creator
    public final ExtraSession createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ExtraSession(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ExtraSession[] newArray(int i) {
        return new ExtraSession[i];
    }
}
