package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.FxB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class BinderC40637FxB extends Binder implements IInterface {
    public BinderC40637FxB(String str) {
        attachInterface(this, str);
    }

    public boolean LJLJI(Parcel parcel, int i) {
        throw null;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return LJLJI(parcel, i);
    }
}
