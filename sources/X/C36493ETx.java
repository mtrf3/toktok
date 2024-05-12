package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ETx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36493ETx {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C36493ETx.class.getClassLoader();
    }

    public static <T extends Parcelable> T LIZ(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }
}
