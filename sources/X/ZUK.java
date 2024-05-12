package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes19.dex */
public abstract class ZUK extends Binder implements ZU2 {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public ZUK() {
        attachInterface(this, "com.benchmark.IBXManager");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ZU3 zul;
        if (i != 1) {
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.benchmark.IBXManager");
                return true;
            }
            parcel.enforceInterface("com.benchmark.IBXManager");
            ((ZUT) this).LLZLL();
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("com.benchmark.IBXManager");
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zul = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.benchmark.IByteBenchCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof ZU3)) {
                zul = (ZU3) queryLocalInterface;
            } else {
                zul = new ZUL(readStrongBinder);
            }
        }
        ((ZUT) this).p0(readInt, readString, readString2, zul);
        parcel2.writeNoException();
        return true;
    }
}
