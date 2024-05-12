package X;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ZbZ, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90257ZbZ {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C90257ZbZ.class.getClassLoader();
    }

    public static <T extends Parcelable> T LIZ(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void LIZIZ(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void LIZJ(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
