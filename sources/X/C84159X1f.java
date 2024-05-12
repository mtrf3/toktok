package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.X1f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84159X1f implements InterfaceC84160X1g {
    public final IBinder LJLIL;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public C84159X1f(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.InterfaceC84160X1g
    public final void LJJJIL(int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.LJLIL.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
