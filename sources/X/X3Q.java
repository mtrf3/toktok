package X;

import android.content.ContentValues;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

/* loaded from: classes16.dex */
public abstract class X3Q extends Binder implements InterfaceC84230X3y {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public X3Q() {
        attachInterface(this, "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1598968902) {
            boolean z = false;
            r1 = 0;
            int i3 = 0;
            DownloadInfo downloadInfo = null;
            InterfaceC84190X2k c84189X2j = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    ((X4A) this).LLIIIJ(z);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    try {
                        if (((X4A) this).getDownloadInfo(parcel.readInt()) != null) {
                            i3 = 1;
                        }
                    } catch (Throwable unused) {
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    return true;
                case 3:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    DownloadInfo downloadInfo2 = ((X4A) this).getDownloadInfo(parcel.readInt());
                    parcel2.writeNoException();
                    if (downloadInfo2 != null) {
                        parcel2.writeInt(1);
                        downloadInfo2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 4:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    List<DownloadInfo> downloadInfoList = ((X4A) this).getDownloadInfoList(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(downloadInfoList);
                    return true;
                case 5:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    List<DownloadInfo> successedDownloadInfosWithMimeType = ((X4A) this).getSuccessedDownloadInfosWithMimeType(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(successedDownloadInfosWithMimeType);
                    return true;
                case 6:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    List<DownloadInfo> unCompletedDownloadInfosWithMimeType = ((X4A) this).getUnCompletedDownloadInfosWithMimeType(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(unCompletedDownloadInfosWithMimeType);
                    return true;
                case 7:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    List<DownloadInfo> downloadInfosByFileExtension = ((X4A) this).getDownloadInfosByFileExtension(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(downloadInfosByFileExtension);
                    return true;
                case 8:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    List<DownloadInfo> allDownloadInfo = ((X4A) this).getAllDownloadInfo();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(allDownloadInfo);
                    return true;
                case 9:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (parcel.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    boolean updateDownloadInfo = ((X4A) this).updateDownloadInfo(downloadInfo);
                    parcel2.writeNoException();
                    parcel2.writeInt(updateDownloadInfo ? 1 : 0);
                    return true;
                case 10:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    ((X4A) this).LJIILJJIL(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    return true;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    ((X4A) this).LJIIL(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    return true;
                case 12:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    ((X4A) this).clearData();
                    parcel2.writeNoException();
                    return true;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    parcel.readInt();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 14:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    X4A x4a = (X4A) this;
                    x4a.LJIL(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 15:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    ((X4A) this).LJJLI(parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    ((X4A) this).LJJJLZIJ(parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 17:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    ((X4A) this).LJJLIIIJJIZ(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 18:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    ((X4A) this).LJJJJLI(parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 19:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    ((X4A) this).LJJIJIL(parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 20:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    int readInt = parcel.readInt();
                    long readLong = parcel.readLong();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("status", (Integer) (-4));
                    contentValues.put("curBytes", Long.valueOf(readLong));
                    ((X4A) this).H0(readInt, contentValues);
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 21:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    ((X4A) this).LJJIJIIJI(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 22:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    ((X4A) this).LJJI(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 23:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    boolean z2 = ((X4A) this).LJLJJI;
                    parcel2.writeNoException();
                    parcel2.writeInt(z2 ? 1 : 0);
                    return true;
                case 24:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 25:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (parcel.readInt() != 0) {
                        DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    parcel.readInt();
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC84190X2k)) {
                            c84189X2j = (InterfaceC84190X2k) queryLocalInterface;
                        } else {
                            c84189X2j = new C84189X2j(readStrongBinder);
                        }
                    }
                    ((X4A) this).LJLJJL = c84189X2j;
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
        return true;
    }
}
