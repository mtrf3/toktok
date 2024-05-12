package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.QfP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67563QfP implements InterfaceC67566QfS, IInterface {
    public final IBinder LJLIL;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public C67563QfP(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // X.InterfaceC67566QfS
    public final void v(Bundle bundle, BinderC67567QfT binderC67567QfT) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IIntegrityService");
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(binderC67567QfT);
        try {
            this.LJLIL.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
