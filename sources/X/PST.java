package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PST implements IInterface {
    public final IBinder LJLIL;

    public final String LJLJI() {
        Parcel obtain = Parcel.obtain();
        o.LJIIIIZZ(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        o.LJIIIIZZ(obtain2, "obtain()");
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.LJLIL.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void LLJI() {
        Parcel obtain = Parcel.obtain();
        o.LJIIIIZZ(obtain, "obtain()");
        Parcel obtain2 = Parcel.obtain();
        o.LJIIIIZZ(obtain2, "obtain()");
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            obtain.writeInt(1);
            this.LJLIL.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public PST(IBinder iBinder) {
        this.LJLIL = iBinder;
    }
}
