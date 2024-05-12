package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.vr.dynamite.client.ILoadedInstanceCreator;
import com.google.vr.dynamite.client.INativeLibraryLoader;
import com.google.vr.dynamite.client.IObjectWrapper;

/* renamed from: X.agQ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94402agQ extends C93973aZV implements ILoadedInstanceCreator {
    public C94402agQ(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.ILoadedInstanceCreator");
    }

    @Override // com.google.vr.dynamite.client.ILoadedInstanceCreator
    public final INativeLibraryLoader newNativeLibraryLoader(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        INativeLibraryLoader c94403agR;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.LJLILLLLZI);
        C93975aZX.LIZ(obtain, iObjectWrapper);
        C93975aZX.LIZ(obtain, iObjectWrapper2);
        Parcel LJLJI = LJLJI(obtain, 1);
        IBinder readStrongBinder = LJLJI.readStrongBinder();
        if (readStrongBinder == null) {
            c94403agR = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.dynamite.client.INativeLibraryLoader");
            if (queryLocalInterface instanceof INativeLibraryLoader) {
                c94403agR = (INativeLibraryLoader) queryLocalInterface;
            } else {
                c94403agR = new C94403agR(readStrongBinder);
            }
        }
        LJLJI.recycle();
        return c94403agR;
    }
}
