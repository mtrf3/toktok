package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes19.dex */
public abstract class ZUM extends Binder implements ZU3 {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public ZUM() {
        attachInterface(this, "com.benchmark.IByteBenchCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 1598968902) {
                            return super.onTransact(i, parcel, parcel2, i2);
                        }
                        parcel2.writeString("com.benchmark.IByteBenchCallback");
                        return true;
                    }
                    parcel.enforceInterface("com.benchmark.IByteBenchCallback");
                    ((ZUS) this).onError(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface("com.benchmark.IByteBenchCallback");
                ((ZUS) this).LLZLLLL(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface("com.benchmark.IByteBenchCallback");
            C38891fp.LJJIII(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("com.benchmark.IByteBenchCallback");
        String readString = parcel.readString();
        C47261Igj.LJIILJJIL("ByteBenchServiceManager");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onException: ");
        LIZ.append(readString);
        X1D.LIZIZ(LIZ);
        C47261Igj.LJIILJJIL("ByteBench SladarCenter");
        InterfaceC12340e6 interfaceC12340e6 = C38901fq.LJLIL;
        if (interfaceC12340e6 != null) {
            interfaceC12340e6.onException(new RuntimeException(readString));
        } else {
            C47261Igj.LJJJJZ("ByteBench SladarCenter");
        }
        parcel2.writeNoException();
        return true;
    }
}
