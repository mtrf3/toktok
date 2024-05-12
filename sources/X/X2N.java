package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes16.dex */
public abstract class X2N extends Binder implements InterfaceC84198X2s {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public X2N() {
        attachInterface(this, "com.ss.android.socialbase.downloader.model.DownloadAidlTask");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1598968902) {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    DownloadInfo N9 = ((X2Q) this).N9();
                    parcel2.writeNoException();
                    if (N9 != null) {
                        parcel2.writeInt(1);
                        N9.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    int W9 = ((X2Q) this).W9(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(W9);
                    return true;
                case 3:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    X32 Q9 = ((X2Q) this).Q9(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    if (Q9 != null) {
                        iBinder = (AbstractBinderC84192X2m) Q9;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 4:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    X32 X9 = ((X2Q) this).X9(parcel.readInt());
                    parcel2.writeNoException();
                    if (X9 != null) {
                        iBinder = (AbstractBinderC84192X2m) X9;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 5:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    X2X O9 = ((X2Q) this).O9();
                    parcel2.writeNoException();
                    if (O9 != null) {
                        iBinder = (X2P) O9;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 6:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    X2W V9 = ((X2Q) this).V9();
                    parcel2.writeNoException();
                    if (V9 != null) {
                        iBinder = (X2R) V9;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 7:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    InterfaceC84167X1n S9 = ((X2Q) this).S9();
                    parcel2.writeNoException();
                    if (S9 != null) {
                        iBinder = (AbstractBinderC84164X1k) S9;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 8:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    X2Z L9 = ((X2Q) this).L9();
                    parcel2.writeNoException();
                    if (L9 != null) {
                        iBinder = (X2K) L9;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 9:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    X1B M9 = ((X2Q) this).M9();
                    parcel2.writeNoException();
                    if (M9 != null) {
                        iBinder = (AbstractBinderC84155X1b) M9;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 10:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    X25 T9 = ((X2Q) this).T9();
                    parcel2.writeNoException();
                    if (T9 != null) {
                        iBinder = (X22) T9;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    X20 P9 = ((X2Q) this).P9();
                    parcel2.writeNoException();
                    if (P9 != null) {
                        iBinder = (AbstractBinderC84176X1w) P9;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 12:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    InterfaceC84196X2q LJJLIIIJLJLI = ((X2Q) this).LJJLIIIJLJLI();
                    parcel2.writeNoException();
                    if (LJJLIIIJLJLI != null) {
                        iBinder = (X2S) LJJLIIIJLJLI;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    X29 fileProvider = ((X2Q) this).getFileProvider();
                    parcel2.writeNoException();
                    if (fileProvider != null) {
                        iBinder = (X28) fileProvider;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 14:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    int R9 = ((X2Q) this).R9();
                    parcel2.writeNoException();
                    parcel2.writeInt(R9);
                    return true;
                case 15:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    InterfaceC84181X2b U9 = ((X2Q) this).U9(parcel.readInt());
                    parcel2.writeNoException();
                    if (U9 != null) {
                        iBinder = (X2H) U9;
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
        return true;
    }
}
