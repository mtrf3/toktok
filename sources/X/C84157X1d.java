package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.X1d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84157X1d implements X1B {
    public final IBinder LJLIL;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public C84157X1d(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.X1B
    public final boolean LLIZ(X17 x17) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
            if (x17 == null) {
                iBinder = null;
            } else {
                iBinder = x17.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            boolean z = false;
            this.LJLIL.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
