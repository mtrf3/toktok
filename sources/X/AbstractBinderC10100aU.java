package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.0aU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC10100aU extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC10100aU() {
        attachInterface(this, "android.support.customtabs.IPostMessageService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Bundle bundle = null;
        if (i != 2) {
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("android.support.customtabs.IPostMessageService");
                return true;
            }
            parcel.enforceInterface("android.support.customtabs.IPostMessageService");
            InterfaceC10080aS LJLJI = AbstractBinderC32421Pa.LJLJI(parcel.readStrongBinder());
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
            }
            LJLJI.LLLLILI(bundle, readString);
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("android.support.customtabs.IPostMessageService");
        InterfaceC10080aS LJLJI2 = AbstractBinderC32421Pa.LJLJI(parcel.readStrongBinder());
        if (parcel.readInt() != 0) {
            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
        }
        LJLJI2.LLJLILLLLZIIL(bundle);
        parcel2.writeNoException();
        return true;
    }
}
