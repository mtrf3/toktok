package X;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

/* renamed from: X.X2t, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractBinderC84199X2t extends Binder implements InterfaceC84202X2w {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC84199X2t() {
        attachInterface(this, "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (i != 1598968902) {
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            int LJIILIIL = 0;
            boolean z10 = false;
            boolean z11 = false;
            int i3 = 0;
            X28 x28 = null;
            InterfaceC84198X2s x2e = null;
            DownloadInfo downloadInfo = null;
            DownloadInfo downloadInfo2 = null;
            Notification notification = null;
            DownloadInfo downloadInfo3 = null;
            InterfaceC84160X1g c84159X1f = null;
            X2P x2p = null;
            X2R x2r = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC84198X2s)) {
                            x2e = (InterfaceC84198X2s) queryLocalInterface;
                        } else {
                            x2e = new X2E(readStrongBinder);
                        }
                    }
                    ((BinderC84200X2u) this).LLLJ(x2e);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int readInt = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z8 = true;
                    }
                    ((BinderC84200X2u) this).LJJJI(readInt, z8);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int readInt2 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z9 = true;
                    }
                    ((BinderC84200X2u) this).cancel(readInt2, z9);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean canResume = ((BinderC84200X2u) this).canResume(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(canResume ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((BinderC84200X2u) this).resume(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((BinderC84200X2u) this).restart(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((BinderC84200X2u) this).pauseAll();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    long curBytes = ((BinderC84200X2u) this).getCurBytes(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeLong(curBytes);
                    return true;
                case 9:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int status = ((BinderC84200X2u) this).getStatus(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(status);
                    return true;
                case 10:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean isDownloading = ((BinderC84200X2u) this).isDownloading(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(isDownloading ? 1 : 0);
                    return true;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    DownloadInfo downloadInfo4 = ((BinderC84200X2u) this).getDownloadInfo(parcel.readInt());
                    parcel2.writeNoException();
                    if (downloadInfo4 != null) {
                        parcel2.writeInt(1);
                        downloadInfo4.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 12:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    List<DownloadInfo> downloadInfoList = ((BinderC84200X2u) this).getDownloadInfoList(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(downloadInfoList);
                    return true;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    if (((BinderC84200X2u) this).LJLILLLLZI != null) {
                        LJIILIIL = C84212X3g.LJIILIIL(readString, readString2);
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(LJIILIIL);
                    return true;
                case 14:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    X38 x38 = ((BinderC84200X2u) this).LJLILLLLZI;
                    if (x38 != null) {
                        downloadInfo = x38.getDownloadInfo(C84212X3g.LJIILIIL(readString3, readString4));
                    }
                    parcel2.writeNoException();
                    if (downloadInfo != null) {
                        parcel2.writeInt(1);
                        downloadInfo.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 15:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    List<DownloadInfo> successedDownloadInfosWithMimeType = ((BinderC84200X2u) this).getSuccessedDownloadInfosWithMimeType(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(successedDownloadInfosWithMimeType);
                    return true;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    List<DownloadInfo> downloadingDownloadInfosWithMimeType = ((BinderC84200X2u) this).getDownloadingDownloadInfosWithMimeType(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(downloadingDownloadInfosWithMimeType);
                    return true;
                case 17:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    List<DownloadInfo> downloadInfosByFileExtension = ((BinderC84200X2u) this).getDownloadInfosByFileExtension(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(downloadInfosByFileExtension);
                    return true;
                case 18:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    List<DownloadInfo> allDownloadInfo = ((BinderC84200X2u) this).getAllDownloadInfo();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(allDownloadInfo);
                    return true;
                case 19:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((BinderC84200X2u) this).restartAllFailedDownloadTasks(parcel.createStringArrayList());
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((BinderC84200X2u) this).restartAllPauseReserveOnWifiDownloadTasks(parcel.createStringArrayList());
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int readInt3 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    }
                    ((BinderC84200X2u) this).LJJIFFI(readInt3, z6, z10);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int readInt4 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    X38 x382 = ((BinderC84200X2u) this).LJLILLLLZI;
                    if (x382 != null) {
                        x382.LJJIFFI(readInt4, z5, false);
                    }
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((BinderC84200X2u) this).forceDownloadIngoreRecommendSize(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int readInt5 = parcel.readInt();
                    int readInt6 = parcel.readInt();
                    X32 LJLJI = AbstractBinderC84192X2m.LJLJI(parcel.readStrongBinder());
                    int readInt7 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    ((BinderC84200X2u) this).d0(readInt5, readInt6, LJLJI, readInt7, z4);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int readInt8 = parcel.readInt();
                    int readInt9 = parcel.readInt();
                    X32 LJLJI2 = AbstractBinderC84192X2m.LJLJI(parcel.readStrongBinder());
                    int readInt10 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    ((BinderC84200X2u) this).LLJJL(readInt8, readInt9, LJLJI2, readInt10, z3);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int readInt11 = parcel.readInt();
                    int readInt12 = parcel.readInt();
                    X32 LJLJI3 = AbstractBinderC84192X2m.LJLJI(parcel.readStrongBinder());
                    int readInt13 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ((BinderC84200X2u) this).LLLLIILL(readInt11, readInt12, LJLJI3, readInt13, z, z2);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (parcel.readInt() != 0) {
                        downloadInfo2 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    boolean isDownloadSuccessAndFileNotExist = ((BinderC84200X2u) this).isDownloadSuccessAndFileNotExist(downloadInfo2);
                    parcel2.writeNoException();
                    parcel2.writeInt(isDownloadSuccessAndFileNotExist ? 1 : 0);
                    return true;
                case 28:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int readInt14 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        notification = (Notification) Notification.CREATOR.createFromParcel(parcel);
                    }
                    ((BinderC84200X2u) this).LJJLIIIJJI(readInt14, notification);
                    return true;
                case 29:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (parcel.readInt() != 0) {
                        z11 = true;
                    }
                    ((BinderC84200X2u) this).LJJIIJZLJL(z11);
                    return true;
                case 30:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (((BinderC84200X2u) this).LJLILLLLZI != null) {
                        synchronized (C84212X3g.class) {
                            i3 = C84212X3g.LJJIL;
                        }
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    return true;
                case 31:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    List<DownloadInfo> unCompletedDownloadInfosWithMimeType = ((BinderC84200X2u) this).getUnCompletedDownloadInfosWithMimeType(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(unCompletedDownloadInfosWithMimeType);
                    return true;
                case 32:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((BinderC84200X2u) this).setLogLevel(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 33:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean isDownloadCacheSyncSuccess = ((BinderC84200X2u) this).isDownloadCacheSyncSuccess();
                    parcel2.writeNoException();
                    parcel2.writeInt(isDownloadCacheSyncSuccess ? 1 : 0);
                    return true;
                case 34:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int readInt15 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z7 = true;
                    }
                    ((BinderC84200X2u) this).LJJJJIZL(readInt15, z7);
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int LJJJJ = ((BinderC84200X2u) this).LJJJJ(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(LJJJJ);
                    return true;
                case 36:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (parcel.readInt() != 0) {
                        downloadInfo3 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    boolean updateDownloadInfo = ((BinderC84200X2u) this).updateDownloadInfo(downloadInfo3);
                    parcel2.writeNoException();
                    parcel2.writeInt(updateDownloadInfo ? 1 : 0);
                    return true;
                case 37:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean LJIILJJIL = ((BinderC84200X2u) this).LJIILJJIL(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(LJIILJJIL ? 1 : 0);
                    return true;
                case 38:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean LJIIL = ((BinderC84200X2u) this).LJIIL(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(LJIIL ? 1 : 0);
                    return true;
                case 39:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((BinderC84200X2u) this).clearData();
                    parcel2.writeNoException();
                    return true;
                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((BinderC84200X2u) this).LJIILIIL(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                        if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof InterfaceC84160X1g)) {
                            c84159X1f = (InterfaceC84160X1g) queryLocalInterface2;
                        } else {
                            c84159X1f = new C84159X1f(readStrongBinder2);
                        }
                    }
                    ((BinderC84200X2u) this).LLILLL(c84159X1f);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((BinderC84200X2u) this).LJJLIIIJLLLLLLLZ(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    X2X downloadNotificationEventListener = ((BinderC84200X2u) this).getDownloadNotificationEventListener(parcel.readInt());
                    parcel2.writeNoException();
                    if (downloadNotificationEventListener != null) {
                        x2p = (X2P) downloadNotificationEventListener;
                    }
                    parcel2.writeStrongBinder(x2p);
                    return true;
                case 44:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    X2W notificationClickCallback = ((BinderC84200X2u) this).getNotificationClickCallback(parcel.readInt());
                    parcel2.writeNoException();
                    if (notificationClickCallback != null) {
                        x2r = (X2R) notificationClickCallback;
                    }
                    parcel2.writeStrongBinder(x2r);
                    return true;
                case 45:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((BinderC84200X2u) this).LLLF(parcel.readInt(), X2P.LJLJI(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 46:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    X29 downloadFileUriProvider = ((BinderC84200X2u) this).getDownloadFileUriProvider(parcel.readInt());
                    parcel2.writeNoException();
                    if (downloadFileUriProvider != null) {
                        x28 = (X28) downloadFileUriProvider;
                    }
                    parcel2.writeStrongBinder(x28);
                    return true;
                case 47:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean LJJIJLIJ = ((BinderC84200X2u) this).LJJIJLIJ();
                    parcel2.writeNoException();
                    parcel2.writeInt(LJJIJLIJ ? 1 : 0);
                    return true;
                case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((BinderC84200X2u) this).setThrottleNetSpeed(parcel.readInt(), parcel.readLong(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
        return true;
    }
}
