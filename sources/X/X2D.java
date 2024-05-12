package X;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes16.dex */
public class X2D implements X29 {
    public final IBinder LJLIL;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public X2D(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.X29
    public final android.net.Uri K(String str, String str2) {
        android.net.Uri uri;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.LJLIL.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                uri = (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(obtain2);
            } else {
                uri = null;
            }
            return uri;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
