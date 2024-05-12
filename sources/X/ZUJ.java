package X;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes19.dex */
public class ZUJ implements ZU2 {
    public final IBinder LJLIL;

    @Override // X.ZU2
    public final void LLZLL() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.benchmark.IBXManager");
            this.LJLIL.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public ZUJ(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.ZU2
    public final void p0(int i, String str, String str2, ZU3 zu3) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.benchmark.IBXManager");
            obtain.writeInt(i);
            obtain.writeString(str);
            obtain.writeString(str2);
            if (zu3 == null) {
                iBinder = null;
            } else {
                iBinder = zu3.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.LJLIL.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
