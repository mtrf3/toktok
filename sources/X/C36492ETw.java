package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ETw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36492ETw {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C36492ETw.class.getClassLoader();
    }

    public static <T extends Parcelable> T LIZ(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }
}
