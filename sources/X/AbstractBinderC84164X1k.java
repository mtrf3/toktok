package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.X1k, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractBinderC84164X1k extends Binder implements InterfaceC84167X1n {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC84164X1k() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
        boolean LJIIIZ = ((BinderC84166X1m) this).LJIIIZ();
        parcel2.writeNoException();
        parcel2.writeInt(LJIIIZ ? 1 : 0);
        return true;
    }
}
