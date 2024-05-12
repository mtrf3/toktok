package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes16.dex */
public abstract class X2K extends Binder implements X2Z {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public X2K() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        DownloadInfo downloadInfo;
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
        BaseException baseException = null;
        if (parcel.readInt() != 0) {
            downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
        } else {
            downloadInfo = null;
        }
        if (parcel.readInt() != 0) {
            baseException = BaseException.CREATOR.createFromParcel(parcel);
        }
        ((X2Y) this).monitorLogSend(downloadInfo, baseException, parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
