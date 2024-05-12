package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.aZV, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C93973aZV implements IInterface {
    public final IBinder LJLIL;
    public final String LJLILLLLZI;

    public C93973aZV(IBinder iBinder, String str) {
        this.LJLIL = iBinder;
        this.LJLILLLLZI = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
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
