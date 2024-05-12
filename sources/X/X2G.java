package X;

import android.os.IBinder;
import android.os.Parcel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes16.dex */
public class X2G implements X2W {
    public final IBinder LJLIL;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public X2G(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.X2W
    public final boolean LLIIZ(DownloadInfo downloadInfo) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
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

    @Override // X.X2W
    public final boolean LLLLLILLIL(DownloadInfo downloadInfo) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
            boolean z = true;
            if (downloadInfo != null) {
                obtain.writeInt(1);
                downloadInfo.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.LJLIL.transact(3, obtain, obtain2, 0);
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

    @Override // X.X2W
    public final boolean N(DownloadInfo downloadInfo) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
            boolean z = true;
            if (downloadInfo != null) {
                obtain.writeInt(1);
                downloadInfo.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.LJLIL.transact(1, obtain, obtain2, 0);
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
