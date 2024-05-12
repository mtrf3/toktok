package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.X1b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractBinderC84155X1b extends Binder implements X1B {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC84155X1b() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        X17 c84156X1c;
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c84156X1c = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof X17)) {
                c84156X1c = (X17) queryLocalInterface;
            } else {
                c84156X1c = new C84156X1c(readStrongBinder);
            }
        }
        boolean LLIZ = ((X1A) this).LLIZ(c84156X1c);
        parcel2.writeNoException();
        parcel2.writeInt(LLIZ ? 1 : 0);
        return true;
    }
}
