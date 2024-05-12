package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes16.dex */
public abstract class X22 extends Binder implements X25 {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public X22() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
        long LJJII = ((X24) this).LJJII(parcel.readInt(), parcel.readInt());
        parcel2.writeNoException();
        parcel2.writeLong(LJJII);
        return true;
    }
}
