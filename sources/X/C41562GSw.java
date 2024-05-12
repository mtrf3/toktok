package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.stitch.StitchUser;
import kotlin.jvm.internal.o;

/* renamed from: X.GSw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41562GSw implements Parcelable.Creator<StitchUser> {
    @Override // android.os.Parcelable.Creator
    public final StitchUser createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new StitchUser(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final StitchUser[] newArray(int i) {
        return new StitchUser[i];
    }
}
