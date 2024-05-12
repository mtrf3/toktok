package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.QlX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67943QlX {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C67943QlX.class.getClassLoader();
    }

    public static Parcelable LIZ(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void LIZIZ(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
