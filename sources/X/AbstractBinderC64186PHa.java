package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.PHa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC64186PHa extends Binder implements PHW {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC64186PHa() {
        attachInterface(this, "com.bytedance.apm6.traffic.ITrafficTransportInterface");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i != 1598968902) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.bytedance.apm6.traffic.ITrafficTransportInterface");
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ((PHS) this).LJJJLIIL(readString, z);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.bytedance.apm6.traffic.ITrafficTransportInterface");
                    ((PHS) this).LJJJJJ(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.bytedance.apm6.traffic.ITrafficTransportInterface");
                    ((PHS) this).LJJIZ(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.bytedance.apm6.traffic.ITrafficTransportInterface");
                    ((PHS) this).LLJJLIIIJLLLLLLLZ(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.bytedance.apm6.traffic.ITrafficTransportInterface");
                    ((PHS) this).LJJLL(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.bytedance.apm6.traffic.ITrafficTransportInterface");
                    ((PHS) this).LLJILJILJ(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString("com.bytedance.apm6.traffic.ITrafficTransportInterface");
        return true;
    }
}
