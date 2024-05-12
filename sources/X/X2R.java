package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes16.dex */
public abstract class X2R extends Binder implements X2W {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public X2R() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        DownloadInfo downloadInfo = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                    return true;
                }
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                if (parcel.readInt() != 0) {
                    downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                }
                boolean LLLLLILLIL = ((X2U) this).LLLLLILLIL(downloadInfo);
                parcel2.writeNoException();
                parcel2.writeInt(LLLLLILLIL ? 1 : 0);
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
            if (parcel.readInt() != 0) {
                downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
            }
            boolean LLIIZ = ((X2U) this).LLIIZ(downloadInfo);
            parcel2.writeNoException();
            parcel2.writeInt(LLIIZ ? 1 : 0);
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
        if (parcel.readInt() != 0) {
            downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
        }
        boolean N = ((X2U) this).N(downloadInfo);
        parcel2.writeNoException();
        parcel2.writeInt(N ? 1 : 0);
        return true;
    }
}
