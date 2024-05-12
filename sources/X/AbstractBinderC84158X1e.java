package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.X1e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractBinderC84158X1e extends Binder implements InterfaceC84160X1g {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC84158X1e() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
        ((BinderC84161X1h) this).LJJJIL(parcel.readInt(), parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
