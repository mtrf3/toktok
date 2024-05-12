package X;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Qga, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67636Qga {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C67636Qga.class.getClassLoader();
    }

    public static void LIZIZ(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
        } else {
            throw new BadParcelableException(KMP.LJ("Parcel data not fully consumed, unread size: ", dataAvail));
        }
    }

    public static Parcelable LIZ(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
