package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.X1w, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractBinderC84176X1w extends Binder implements X20 {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC84176X1w() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC84172X1s c84171X1r;
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c84171X1r = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC84172X1s)) {
                c84171X1r = (InterfaceC84172X1s) queryLocalInterface;
            } else {
                c84171X1r = new C84171X1r(readStrongBinder);
            }
        }
        boolean LLLFZ = ((BinderC84178X1y) this).LLLFZ(readLong, readLong2, c84171X1r);
        parcel2.writeNoException();
        parcel2.writeInt(LLLFZ ? 1 : 0);
        return true;
    }
}
