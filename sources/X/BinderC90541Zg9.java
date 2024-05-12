package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.Zg9, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class BinderC90541Zg9 extends Binder implements IInterface {
    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public BinderC90541Zg9() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        AbstractBinderC90819Zkd abstractBinderC90819Zkd = (AbstractBinderC90819Zkd) this;
        if (i != 1) {
            boolean z = false;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        String stringFlagValue = abstractBinderC90819Zkd.getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(stringFlagValue);
                        return true;
                    }
                    long longFlagValue = abstractBinderC90819Zkd.getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeLong(longFlagValue);
                    return true;
                }
                int intFlagValue = abstractBinderC90819Zkd.getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(intFlagValue);
                return true;
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            }
            boolean booleanFlagValue = abstractBinderC90819Zkd.getBooleanFlagValue(readString, z, parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(booleanFlagValue ? 1 : 0);
            return true;
        }
        abstractBinderC90819Zkd.init(AbstractBinderC68227Qq7.LLJI(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
