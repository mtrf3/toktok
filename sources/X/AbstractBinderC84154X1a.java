package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.X1a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractBinderC84154X1a extends Binder implements X17 {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC84154X1a() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
            boolean LJJLIIIJL = ((X16) this).LJJLIIIJL();
            parcel2.writeNoException();
            parcel2.writeInt(LJJLIIIJL ? 1 : 0);
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
        ((X16) this).LJJJJZI(parcel.createStringArrayList());
        parcel2.writeNoException();
        return true;
    }
}
