package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.Qkr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C67901Qkr implements IInterface {
    public final IBinder LJLIL;
    public final String LJLILLLLZI;

    public C67901Qkr(IBinder iBinder, String str) {
        this.LJLIL = iBinder;
        this.LJLILLLLZI = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
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
