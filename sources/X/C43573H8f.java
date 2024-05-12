package X;

import android.os.Bundle;
import android.os.Parcel;
import kotlin.jvm.internal.o;

/* renamed from: X.H8f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43573H8f {
    public static final Bundle LIZ(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        o.LJIIIIZZ(obtain, "obtain()");
        bundle.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(C43573H8f.class.getClassLoader());
        if (readBundle != null) {
            obtain.recycle();
            return readBundle;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
