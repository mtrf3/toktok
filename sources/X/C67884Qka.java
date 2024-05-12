package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.Qka, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C67884Qka implements IInterface {
    public final IBinder LJLIL;
    public final String LJLILLLLZI;

    public C67884Qka(IBinder iBinder, String str) {
        this.LJLIL = iBinder;
        this.LJLILLLLZI = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public final Parcel LLJI() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.LJLILLLLZI);
        return obtain;
    }

    public final Parcel LJLJI(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.LJLIL.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}
