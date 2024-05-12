package X;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.aZX, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93975aZX {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C93975aZX.class.getClassLoader();
    }

    public static void LIZ(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
