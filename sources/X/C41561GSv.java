package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.duet.DuetUser;
import kotlin.jvm.internal.o;

/* renamed from: X.GSv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41561GSv implements Parcelable.Creator<DuetUser> {
    @Override // android.os.Parcelable.Creator
    public final DuetUser createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new DuetUser(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final DuetUser[] newArray(int i) {
        return new DuetUser[i];
    }
}
