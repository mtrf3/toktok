package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.0Cf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC03610Cf extends Binder implements IInterface {
    public AbstractBinderC03610Cf() {
        attachInterface(this, "com.oppo.oiface.IOIfaceNotifier");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.oppo.oiface.IOIfaceNotifier");
            return true;
        }
        parcel.enforceInterface("com.oppo.oiface.IOIfaceNotifier");
        parcel.readString();
        ((C1DE) this).LJLIL.getClass();
        parcel2.writeNoException();
        return true;
    }
}
