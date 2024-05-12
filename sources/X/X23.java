package X;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes16.dex */
public class X23 implements X25 {
    public final IBinder LJLIL;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public X23(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.X25
    public final long LJJII(int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.LJLIL.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readLong();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
