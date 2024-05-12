package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.X1r, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84171X1r implements InterfaceC84172X1s {
    public final IBinder LJLIL;

    @Override // X.InterfaceC84172X1s
    public final void LJJIJ() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
            this.LJLIL.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public C84171X1r(IBinder iBinder) {
        this.LJLIL = iBinder;
    }
}
