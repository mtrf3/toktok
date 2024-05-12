package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.X1x, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84177X1x implements X20 {
    public final IBinder LJLIL;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public C84177X1x(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.X20
    public final boolean LLLFZ(long j, long j2, InterfaceC84172X1s interfaceC84172X1s) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
            obtain.writeLong(j);
            obtain.writeLong(j2);
            if (interfaceC84172X1s == null) {
                iBinder = null;
            } else {
                iBinder = interfaceC84172X1s.asBinder();
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
