package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes16.dex */
public class X2E implements InterfaceC84198X2s {
    public final IBinder LJLIL;

    @Override // X.InterfaceC84198X2s
    public final X2Z L9() {
        X2Z x2j;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            this.LJLIL.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
                if (queryLocalInterface != null && (queryLocalInterface instanceof X2Z)) {
                    x2j = (X2Z) queryLocalInterface;
                } else {
                    x2j = new X2J(readStrongBinder);
                }
            } else {
                x2j = null;
            }
            return x2j;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84198X2s
    public final InterfaceC84196X2q LJJLIIIJLJLI() {
        InterfaceC84196X2q x2m;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            this.LJLIL.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC84196X2q)) {
                    x2m = (InterfaceC84196X2q) queryLocalInterface;
                } else {
                    x2m = new X2M(readStrongBinder);
                }
            } else {
                x2m = null;
            }
            return x2m;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84198X2s
    public final X1B M9() {
        X1B c84157X1d;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            this.LJLIL.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                if (queryLocalInterface != null && (queryLocalInterface instanceof X1B)) {
                    c84157X1d = (X1B) queryLocalInterface;
                } else {
                    c84157X1d = new C84157X1d(readStrongBinder);
                }
            } else {
                c84157X1d = null;
            }
            return c84157X1d;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84198X2s
    public final DownloadInfo N9() {
        DownloadInfo downloadInfo;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            this.LJLIL.transact(1, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84198X2s
    public final X2X O9() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            this.LJLIL.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return X2P.LJLJI(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84198X2s
    public final X20 P9() {
        X20 c84177X1x;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            this.LJLIL.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                if (queryLocalInterface != null && (queryLocalInterface instanceof X20)) {
                    c84177X1x = (X20) queryLocalInterface;
                } else {
                    c84177X1x = new C84177X1x(readStrongBinder);
                }
            } else {
                c84177X1x = null;
            }
            return c84177X1x;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84198X2s
    public final int R9() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            this.LJLIL.transact(14, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84198X2s
    public final InterfaceC84167X1n S9() {
        InterfaceC84167X1n c84165X1l;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            this.LJLIL.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC84167X1n)) {
                    c84165X1l = (InterfaceC84167X1n) queryLocalInterface;
                } else {
                    c84165X1l = new C84165X1l(readStrongBinder);
                }
            } else {
                c84165X1l = null;
            }
            return c84165X1l;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84198X2s
    public final X25 T9() {
        X25 x23;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            this.LJLIL.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                if (queryLocalInterface != null && (queryLocalInterface instanceof X25)) {
                    x23 = (X25) queryLocalInterface;
                } else {
                    x23 = new X23(readStrongBinder);
                }
            } else {
                x23 = null;
            }
            return x23;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84198X2s
    public final X2W V9() {
        X2W x2g;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            this.LJLIL.transact(6, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84198X2s
    public final X29 getFileProvider() {
        X29 x2d;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            this.LJLIL.transact(13, obtain, obtain2, 0);
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public X2E(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.InterfaceC84198X2s
    public final InterfaceC84181X2b U9(int i) {
        InterfaceC84181X2b x2f;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            obtain.writeInt(i);
            this.LJLIL.transact(15, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC84181X2b)) {
                    x2f = (InterfaceC84181X2b) queryLocalInterface;
                } else {
                    x2f = new X2F(readStrongBinder);
                }
            } else {
                x2f = null;
            }
            return x2f;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84198X2s
    public final int W9(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            obtain.writeInt(i);
            this.LJLIL.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84198X2s
    public final X32 X9(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            obtain.writeInt(i);
            this.LJLIL.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return AbstractBinderC84192X2m.LJLJI(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84198X2s
    public final X32 Q9(int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.LJLIL.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return AbstractBinderC84192X2m.LJLJI(obtain2.readStrongBinder());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
