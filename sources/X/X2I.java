package X;

import android.app.Notification;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

/* loaded from: classes16.dex */
public class X2I implements InterfaceC84202X2w {
    public final IBinder LJLIL;

    @Override // X.InterfaceC84202X2w
    public final boolean LJJIJLIJ() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            boolean z = false;
            this.LJLIL.transact(47, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84202X2w
    public final void clearData() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            this.LJLIL.transact(39, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final List<DownloadInfo> getAllDownloadInfo() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            this.LJLIL.transact(18, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final boolean isDownloadCacheSyncSuccess() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            boolean z = false;
            this.LJLIL.transact(33, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84202X2w
    public final void pauseAll() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            this.LJLIL.transact(7, obtain, obtain2, 0);
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

    public X2I(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.InterfaceC84202X2w
    public final boolean LJIIL(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            boolean z = false;
            this.LJLIL.transact(38, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84202X2w
    public final void LJIILIIL(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            this.LJLIL.transact(40, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final boolean LJIILJJIL(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            boolean z = false;
            this.LJLIL.transact(37, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84202X2w
    public final void LJJIIJZLJL(boolean z) {
        int i;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            this.LJLIL.transact(29, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final int LJJJJ(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            this.LJLIL.transact(35, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final void LLILLL(InterfaceC84160X1g interfaceC84160X1g) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            if (interfaceC84160X1g == null) {
                iBinder = null;
            } else {
                iBinder = interfaceC84160X1g.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.LJLIL.transact(41, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final void LLLJ(InterfaceC84198X2s interfaceC84198X2s) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            if (interfaceC84198X2s == null) {
                iBinder = null;
            } else {
                iBinder = interfaceC84198X2s.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.LJLIL.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final boolean canResume(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            boolean z = false;
            this.LJLIL.transact(4, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84202X2w
    public final void forceDownloadIngoreRecommendSize(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            this.LJLIL.transact(23, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final long getCurBytes(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            this.LJLIL.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readLong();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final X29 getDownloadFileUriProvider(int i) {
        X29 x2d;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            this.LJLIL.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
                if (queryLocalInterface != null && (queryLocalInterface instanceof X29)) {
                    x2d = (X29) queryLocalInterface;
                } else {
                    x2d = new X2D(readStrongBinder);
                }
            } else {
                x2d = null;
            }
            return x2d;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final DownloadInfo getDownloadInfo(int i) {
        DownloadInfo downloadInfo;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            this.LJLIL.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
            } else {
                downloadInfo = null;
            }
            return downloadInfo;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final List<DownloadInfo> getDownloadInfoList(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeString(str);
            this.LJLIL.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeString(str);
            this.LJLIL.transact(17, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final X2X getDownloadNotificationEventListener(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            this.LJLIL.transact(43, obtain, obtain2, 0);
            obtain2.readException();
            return X2P.LJLJI(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeString(str);
            this.LJLIL.transact(16, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final X2W getNotificationClickCallback(int i) {
        X2W x2g;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            this.LJLIL.transact(44, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof X2W)) {
                    x2g = (X2W) queryLocalInterface;
                } else {
                    x2g = new X2G(readStrongBinder);
                }
            } else {
                x2g = null;
            }
            return x2g;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final int getStatus(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            this.LJLIL.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeString(str);
            this.LJLIL.transact(15, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeString(str);
            this.LJLIL.transact(31, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            boolean z = true;
            if (downloadInfo != null) {
                obtain.writeInt(1);
                downloadInfo.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.LJLIL.transact(27, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84202X2w
    public final boolean isDownloading(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            boolean z = false;
            this.LJLIL.transact(10, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84202X2w
    public final void restart(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            this.LJLIL.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final void restartAllFailedDownloadTasks(List<String> list) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeStringList(list);
            this.LJLIL.transact(19, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeStringList(list);
            this.LJLIL.transact(20, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final void resume(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            this.LJLIL.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final void setLogLevel(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            this.LJLIL.transact(32, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            boolean z = true;
            if (downloadInfo != null) {
                obtain.writeInt(1);
                downloadInfo.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.LJLIL.transact(36, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84202X2w
    public final void LJJJI(int i, boolean z) {
        int i2;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            obtain.writeInt(i2);
            this.LJLIL.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final void LJJJJIZL(int i, boolean z) {
        int i2;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            obtain.writeInt(i2);
            this.LJLIL.transact(34, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final void LJJLIIIJJI(int i, Notification notification) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            if (notification == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            }
            this.LJLIL.transact(28, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final void LJJLIIIJLLLLLLLZ(int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.LJLIL.transact(42, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final void LLLF(int i, X2X x2x) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            if (x2x == null) {
                iBinder = null;
            } else {
                iBinder = x2x.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.LJLIL.transact(45, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final void cancel(int i, boolean z) {
        int i2;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            obtain.writeInt(i2);
            this.LJLIL.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final void LJJIFFI(int i, boolean z, boolean z2) {
        int i2;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            int i3 = 1;
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            obtain.writeInt(i2);
            if (!z2) {
                i3 = 0;
            }
            obtain.writeInt(i3);
            this.LJLIL.transact(21, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final void setThrottleNetSpeed(int i, long j, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            obtain.writeLong(j);
            obtain.writeInt(i2);
            this.LJLIL.transact(48, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final void LLJJL(int i, int i2, X32 x32, int i3, boolean z) {
        IBinder iBinder;
        int i4;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            if (x32 == null) {
                iBinder = null;
            } else {
                iBinder = x32.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            obtain.writeInt(i3);
            if (z) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            obtain.writeInt(i4);
            this.LJLIL.transact(25, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final void d0(int i, int i2, X32 x32, int i3, boolean z) {
        IBinder iBinder;
        int i4;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            if (x32 == null) {
                iBinder = null;
            } else {
                iBinder = x32.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            obtain.writeInt(i3);
            if (z) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            obtain.writeInt(i4);
            this.LJLIL.transact(24, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84202X2w
    public final void LLLLIILL(int i, int i2, X32 x32, int i3, boolean z, boolean z2) {
        IBinder iBinder;
        int i4;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            if (x32 == null) {
                iBinder = null;
            } else {
                iBinder = x32.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            obtain.writeInt(i3);
            int i5 = 1;
            if (z) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            obtain.writeInt(i4);
            if (!z2) {
                i5 = 0;
            }
            obtain.writeInt(i5);
            this.LJLIL.transact(26, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
