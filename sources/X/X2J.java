package X;

import android.os.IBinder;
import android.os.Parcel;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes16.dex */
public class X2J implements X2Z {
    public final IBinder LJLIL;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public X2J(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.X2Z
    public final void monitorLogSend(DownloadInfo downloadInfo, BaseException baseException, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
            if (downloadInfo != null) {
                obtain.writeInt(1);
                downloadInfo.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (baseException == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                baseException.writeToParcel(obtain, 0);
            }
            obtain.writeInt(i);
            this.LJLIL.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
