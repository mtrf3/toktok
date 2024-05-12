package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.X2m, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractBinderC84192X2m extends Binder implements X32 {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC84192X2m() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
    }

    public static X32 LJLJI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
        if (queryLocalInterface != null && (queryLocalInterface instanceof X32)) {
            return (X32) queryLocalInterface;
        }
        return new X2L(iBinder);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        DownloadInfo downloadInfo;
        DownloadInfo downloadInfo2;
        DownloadInfo downloadInfo3;
        if (i != 1598968902) {
            DownloadInfo downloadInfo4 = null;
            DownloadInfo downloadInfo5 = null;
            BaseException baseException = null;
            BaseException baseException2 = null;
            DownloadInfo downloadInfo6 = null;
            DownloadInfo downloadInfo7 = null;
            DownloadInfo downloadInfo8 = null;
            BaseException baseException3 = null;
            DownloadInfo downloadInfo9 = null;
            DownloadInfo downloadInfo10 = null;
            DownloadInfo downloadInfo11 = null;
            DownloadInfo downloadInfo12 = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    int LJLI = ((BinderC84205X2z) this).LJLI();
                    parcel2.writeNoException();
                    parcel2.writeInt(LJLI);
                    return true;
                case 2:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfo4 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC84205X2z) this).onPrepare(downloadInfo4);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfo12 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC84205X2z) this).onStart(downloadInfo12);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfo11 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC84205X2z) this).onProgress(downloadInfo11);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfo10 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC84205X2z) this).onPause(downloadInfo10);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfo9 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC84205X2z) this).onSuccessed(downloadInfo9);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                    } else {
                        downloadInfo = null;
                    }
                    if (parcel.readInt() != 0) {
                        baseException3 = BaseException.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC84205X2z) this).onFailed(downloadInfo, baseException3);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfo8 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC84205X2z) this).onCanceled(downloadInfo8);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfo7 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC84205X2z) this).onFirstStart(downloadInfo7);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfo6 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC84205X2z) this).onFirstSuccess(downloadInfo6);
                    parcel2.writeNoException();
                    return true;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfo2 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    } else {
                        downloadInfo2 = null;
                    }
                    if (parcel.readInt() != 0) {
                        baseException2 = BaseException.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC84205X2z) this).onRetry(downloadInfo2, baseException2);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfo3 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    } else {
                        downloadInfo3 = null;
                    }
                    if (parcel.readInt() != 0) {
                        baseException = BaseException.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC84205X2z) this).onRetryDelay(downloadInfo3, baseException);
                    parcel2.writeNoException();
                    return true;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (parcel.readInt() != 0) {
                        downloadInfo5 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC84205X2z) this).LJJJJL(downloadInfo5);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
        return true;
    }
}
