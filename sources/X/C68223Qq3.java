package X;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Qq3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68223Qq3 {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C68223Qq3.class.getClassLoader();
    }

    public static void LIZ(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
        } else {
            throw new BadParcelableException(C64.LIZIZ("Parcel data not fully consumed, unread size: ", dataAvail));
        }
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
