package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.service.model.UserVideoModel;
import kotlin.jvm.internal.o;

/* renamed from: X.UyW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78940UyW implements Parcelable.Creator<UserVideoModel> {
    @Override // android.os.Parcelable.Creator
    public final UserVideoModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        return new UserVideoModel(readString, readString2, parcel.readString(), readInt, readInt2, parcel.createStringArrayList(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final UserVideoModel[] newArray(int i) {
        return new UserVideoModel[i];
    }
}
