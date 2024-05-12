package X;

import android.os.IBinder;
import android.os.Parcel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

/* renamed from: X.X2i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84188X2i implements InterfaceC84230X3y {
    public final IBinder LJLIL;

    @Override // X.InterfaceC84230X3y
    public final boolean LJJLIIIIJ() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            boolean z = false;
            this.LJLIL.transact(24, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84230X3y
    public final void clearData() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            this.LJLIL.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84230X3y
    public final List<DownloadInfo> getAllDownloadInfo() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            this.LJLIL.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84230X3y
    public final boolean isDownloadCacheSyncSuccess() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            boolean z = false;
            this.LJLIL.transact(23, obtain, obtain2, 0);
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

    public C84188X2i(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.InterfaceC84230X3y
    public final boolean LJIIL(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            obtain.writeInt(i);
            boolean z = false;
            this.LJLIL.transact(11, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84230X3y
    public final void LJIILIIL(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            obtain.writeInt(i);
            this.LJLIL.transact(26, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84230X3y
    public final boolean LJIILJJIL(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
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

    @Override // X.InterfaceC84230X3y
    public final void LJIJ(DownloadInfo downloadInfo) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            obtain.writeInt(1);
            downloadInfo.writeToParcel(obtain, 0);
            this.LJLIL.transact(25, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84230X3y
    public final DownloadInfo LJJI(int i) {
        DownloadInfo downloadInfo;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            obtain.writeInt(i);
            this.LJLIL.transact(22, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84230X3y
    public final DownloadInfo LJJIJIIJI(int i) {
        DownloadInfo downloadInfo;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            obtain.writeInt(i);
            this.LJLIL.transact(21, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84230X3y
    public final DownloadInfo LJJIL(int i) {
        DownloadInfo downloadInfo;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            obtain.writeInt(i);
            this.LJLIL.transact(13, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84230X3y
    public final DownloadInfo LJJLIIIJJIZ(int i) {
        DownloadInfo downloadInfo;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            obtain.writeInt(i);
            this.LJLIL.transact(17, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84230X3y
    public final void LLIIIJ(boolean z) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            this.LJLIL.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84230X3y
    public final DownloadInfo getDownloadInfo(int i) {
        DownloadInfo downloadInfo;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            obtain.writeInt(i);
            this.LJLIL.transact(3, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84230X3y
    public final List<DownloadInfo> getDownloadInfoList(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            obtain.writeString(str);
            this.LJLIL.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84230X3y
    public final List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            obtain.writeString(str);
            this.LJLIL.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84230X3y
    public final List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            obtain.writeString(str);
            this.LJLIL.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84230X3y
    public final List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            obtain.writeString(str);
            this.LJLIL.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(DownloadInfo.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84230X3y
    public final void q0(InterfaceC84190X2k interfaceC84190X2k) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            if (interfaceC84190X2k == null) {
                iBinder = null;
            } else {
                iBinder = interfaceC84190X2k.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.LJLIL.transact(27, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // X.InterfaceC84230X3y
    public final boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            boolean z = true;
            if (downloadInfo != null) {
                obtain.writeInt(1);
                downloadInfo.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.LJLIL.transact(9, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84230X3y
    public final DownloadInfo LJJIJIL(int i, long j) {
        DownloadInfo downloadInfo;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            obtain.writeInt(i);
            obtain.writeLong(j);
            this.LJLIL.transact(19, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84230X3y
    public final DownloadInfo LJJJJLI(int i, long j) {
        DownloadInfo downloadInfo;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            obtain.writeInt(i);
            obtain.writeLong(j);
            this.LJLIL.transact(18, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84230X3y
    public final DownloadInfo LJJJLZIJ(int i, long j) {
        DownloadInfo downloadInfo;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            obtain.writeInt(i);
            obtain.writeLong(j);
            this.LJLIL.transact(16, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84230X3y
    public final DownloadInfo LJJLI(int i, long j) {
        DownloadInfo downloadInfo;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            obtain.writeInt(i);
            obtain.writeLong(j);
            this.LJLIL.transact(15, obtain, obtain2, 0);
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

    @Override // X.InterfaceC84230X3y
    public final DownloadInfo LJIL(int i, String str, String str2, long j) {
        DownloadInfo downloadInfo;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            obtain.writeInt(i);
            obtain.writeLong(j);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.LJLIL.transact(14, obtain, obtain2, 0);
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
}
