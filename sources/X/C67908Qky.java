package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.Qky, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67908Qky implements IInterface {
    public final IBinder LJLIL;
    public final String LJLILLLLZI = "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public C67908Qky(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    public final void LJLJI(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.LJLIL.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
