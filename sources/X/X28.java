package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes16.dex */
public abstract class X28 extends Binder implements X29 {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public X28() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
        android.net.Uri K = ((X2A) this).K(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        if (K != null) {
            parcel2.writeInt(1);
            K.writeToParcel(parcel2, 1);
        } else {
            parcel2.writeInt(0);
        }
        return true;
    }
}
