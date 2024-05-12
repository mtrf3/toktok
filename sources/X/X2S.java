package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes16.dex */
public abstract class X2S extends Binder implements InterfaceC84196X2q {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public X2S() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                    return true;
                }
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                int[] o0 = ((BinderC84193X2n) this).o0();
                parcel2.writeNoException();
                parcel2.writeIntArray(o0);
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
            String eventPage = ((BinderC84193X2n) this).getEventPage();
            parcel2.writeNoException();
            parcel2.writeString(eventPage);
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
        ((BinderC84193X2n) this).G(parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
