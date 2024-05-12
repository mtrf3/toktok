package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.following.ui.FollowRelationTabArgs;
import kotlin.jvm.internal.o;

/* renamed from: X.A6i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25688A6i implements Parcelable.Creator<FollowRelationTabArgs> {
    @Override // android.os.Parcelable.Creator
    public final FollowRelationTabArgs createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new FollowRelationTabArgs(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final FollowRelationTabArgs[] newArray(int i) {
        return new FollowRelationTabArgs[i];
    }
}
