package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.QkY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67882QkY implements InterfaceC67969Qlx, IInterface {
    public final IBinder LJLIL;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public C67882QkY(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.InterfaceC67969Qlx
    public final void D(BinderC67956Qlk binderC67956Qlk) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        obtain.writeStrongBinder(binderC67956Qlk);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.LJLIL.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
