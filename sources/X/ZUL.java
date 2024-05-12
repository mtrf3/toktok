package X;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes19.dex */
public class ZUL implements ZU3 {
    public final IBinder LJLIL;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public ZUL(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.ZU3
    public final void LLZLLLL(int i, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.benchmark.IByteBenchCallback");
            obtain.writeInt(i);
            obtain.writeString(str);
            this.LJLIL.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.ZU3
    public final void onEvent(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.benchmark.IByteBenchCallback");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.LJLIL.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.ZU3
    public final void onError(int i, int i2, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.benchmark.IByteBenchCallback");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeString(str);
            this.LJLIL.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
