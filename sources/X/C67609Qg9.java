package X;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Qg9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67609Qg9 {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C67609Qg9.class.getClassLoader();
    }

    public static <T extends Parcelable> T LIZ(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void LIZIZ(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
