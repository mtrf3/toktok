package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes16.dex */
public abstract class X2P extends Binder implements X2X {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public X2P() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
    }

    public static X2X LJLJI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
        if (queryLocalInterface != null && (queryLocalInterface instanceof X2X)) {
            return (X2X) queryLocalInterface;
        }
        return new X2O(iBinder);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        DownloadInfo downloadInfo;
        boolean z;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    return true;
                }
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                String LLJJJIL = ((X2T) this).LLJJJIL();
                parcel2.writeNoException();
                parcel2.writeString(LLJJJIL);
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            boolean e = ((X2T) this).e(z);
            parcel2.writeNoException();
            parcel2.writeInt(e ? 1 : 0);
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
        int readInt = parcel.readInt();
        if (parcel.readInt() != 0) {
            downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
        } else {
            downloadInfo = null;
        }
        ((X2T) this).LLLLL(readInt, downloadInfo, parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
