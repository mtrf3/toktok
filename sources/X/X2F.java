package X;

import android.os.IBinder;
import android.os.Parcel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes16.dex */
public class X2F implements InterfaceC84181X2b {
    public final IBinder LJLIL;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public X2F(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.InterfaceC84181X2b
    public final void LJJJJZ(DownloadInfo downloadInfo) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
            if (downloadInfo == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                downloadInfo.writeToParcel(obtain, 0);
            }
            this.LJLIL.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84181X2b
    public final boolean LJJJLL(DownloadInfo downloadInfo) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
            boolean z = true;
            if (downloadInfo != null) {
                obtain.writeInt(1);
                downloadInfo.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.LJLIL.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
