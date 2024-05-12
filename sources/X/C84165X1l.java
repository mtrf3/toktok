package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.X1l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84165X1l implements InterfaceC84167X1n {
    public final IBinder LJLIL;

    @Override // X.InterfaceC84167X1n
    public final boolean LJIIIZ() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public C84165X1l(IBinder iBinder) {
        this.LJLIL = iBinder;
    }
}
