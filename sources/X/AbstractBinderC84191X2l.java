package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.X2l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractBinderC84191X2l extends Binder implements InterfaceC84190X2k {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC84191X2l() {
        attachInterface(this, "com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
        ClassLoader classLoader = getClass().getClassLoader();
        ((X3V) this).LLFF(parcel.readHashMap(classLoader), parcel.readHashMap(classLoader), parcel.readHashMap(classLoader));
        parcel2.writeNoException();
        return true;
    }
}
