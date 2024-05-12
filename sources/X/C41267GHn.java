package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.UserModel;
import kotlin.jvm.internal.o;

/* renamed from: X.GHn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41267GHn implements Parcelable.Creator<UserModel> {
    @Override // android.os.Parcelable.Creator
    public final UserModel createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new UserModel(in.readString(), in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final UserModel[] newArray(int i) {
        return new UserModel[i];
    }
}
