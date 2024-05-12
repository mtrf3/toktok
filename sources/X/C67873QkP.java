package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: X.QkP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67873QkP implements InterfaceC67937QlR {
    public final IBinder LJLIL;

    public C67873QkP(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC67937QlR
    public final void q(BinderC67923QlD binderC67923QlD, GetServiceRequest getServiceRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(binderC67923QlD);
            obtain.writeInt(1);
            C67865QkH.LIZ(getServiceRequest, obtain, 0);
            this.LJLIL.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
