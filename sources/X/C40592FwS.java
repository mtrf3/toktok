package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.FwS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C40592FwS implements IInterface {
    public final IBinder LJLIL;

    public C40592FwS(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }

    public static Parcel LJLJI() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        return obtain;
    }

    public final Parcel LLJI(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.LJLIL.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}
