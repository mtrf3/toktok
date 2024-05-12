package android.support.v4.os;

import X.BinderC39741hC;
import X.InterfaceC007801i;
import Y.IDCreatorS45S0000000;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new IDCreatorS45S0000000(10);
    public InterfaceC007801i LJLIL;

    public void LIZ(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ResultReceiver(Parcel parcel) {
        InterfaceC007801i interfaceC007801i;
        final IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            interfaceC007801i = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC007801i)) {
                interfaceC007801i = (InterfaceC007801i) queryLocalInterface;
            } else {
                interfaceC007801i = new InterfaceC007801i(readStrongBinder) { // from class: X.18B
                    public final IBinder LJLIL;

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.LJLIL;
                    }

                    {
                        this.LJLIL = readStrongBinder;
                    }

                    @Override // X.InterfaceC007801i
                    public final void LLLLIIL(int i, Bundle bundle) {
                        Parcel obtain = Parcel.obtain();
                        try {
                            obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                            obtain.writeInt(i);
                            if (bundle == null) {
                                obtain.writeInt(0);
                            } else {
                                obtain.writeInt(1);
                                bundle.writeToParcel(obtain, 0);
                            }
                            this.LJLIL.transact(1, obtain, null, 1);
                        } finally {
                            obtain.recycle();
                        }
                    }
                };
            }
        }
        this.LJLIL = interfaceC007801i;
    }

    public final void LIZIZ(int i, Bundle bundle) {
        InterfaceC007801i interfaceC007801i = this.LJLIL;
        if (interfaceC007801i != null) {
            try {
                interfaceC007801i.LLLLIIL(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.LJLIL == null) {
                this.LJLIL = new BinderC39741hC(this);
            }
            parcel.writeStrongBinder(this.LJLIL.asBinder());
        }
    }
}
