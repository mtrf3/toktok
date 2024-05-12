package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.FwT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C40593FwT implements IInterface {
    public final IBinder LJLIL;
    public final String LJLILLLLZI;

    public C40593FwT(IBinder iBinder, String str) {
        this.LJLIL = iBinder;
        this.LJLILLLLZI = str;
    }

    public final Parcel LJLJI() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.LJLILLLLZI);
        return obtain;
    }

    public final void LLJI(Parcel parcel, int i) {
        try {
            this.LJLIL.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }
}
