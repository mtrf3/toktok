package X;

import android.os.IBinder;
import android.os.Parcel;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes16.dex */
public class X2L implements X32 {
    public final IBinder LJLIL;

    @Override // X.X32
    public final int LJLI() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
            this.LJLIL.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public X2L(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.X32
    public final void LJJJJL(DownloadInfo downloadInfo) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
            if (downloadInfo == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                downloadInfo.writeToParcel(obtain, 0);
            }
            this.LJLIL.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.X32
    public final void onCanceled(DownloadInfo downloadInfo) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
            if (downloadInfo == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                downloadInfo.writeToParcel(obtain, 0);
            }
            this.LJLIL.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.X32
    public final void onFirstStart(DownloadInfo downloadInfo) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
            if (downloadInfo == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                downloadInfo.writeToParcel(obtain, 0);
            }
            this.LJLIL.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.X32
    public final void onFirstSuccess(DownloadInfo downloadInfo) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
            if (downloadInfo == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                downloadInfo.writeToParcel(obtain, 0);
            }
            this.LJLIL.transact(10, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.X32
    public final void onPause(DownloadInfo downloadInfo) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
            if (downloadInfo == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                downloadInfo.writeToParcel(obtain, 0);
            }
            this.LJLIL.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.X32
    public final void onPrepare(DownloadInfo downloadInfo) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
            if (downloadInfo == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                downloadInfo.writeToParcel(obtain, 0);
            }
            this.LJLIL.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.X32
    public final void onProgress(DownloadInfo downloadInfo) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
            if (downloadInfo == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                downloadInfo.writeToParcel(obtain, 0);
            }
            this.LJLIL.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.X32
    public final void onStart(DownloadInfo downloadInfo) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
            if (downloadInfo == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                downloadInfo.writeToParcel(obtain, 0);
            }
            this.LJLIL.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.X32
    public final void onSuccessed(DownloadInfo downloadInfo) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
            if (downloadInfo == null) {
                obtain.writeInt(0);
            } else {
                obtain.writeInt(1);
                downloadInfo.writeToParcel(obtain, 0);
            }
            this.LJLIL.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.X32
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
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
            this.LJLIL.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.X32
    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
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
            this.LJLIL.transact(11, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.X32
    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
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
            this.LJLIL.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
