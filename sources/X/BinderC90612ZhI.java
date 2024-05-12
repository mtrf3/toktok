package X;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: X.ZhI, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class BinderC90612ZhI extends BinderC90358ZdC {
    public final /* synthetic */ ZYW LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC90612ZhI(ZYW zyw) {
        super("com.google.android.gms.cast.framework.ISessionProvider");
        this.LJLIL = zyw;
    }

    @Override // X.BinderC90358ZdC
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC90109ZYb interfaceC90109ZYb;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    return true;
                }
                String str = this.LJLIL.LIZIZ;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            }
            boolean LIZIZ = this.LJLIL.LIZIZ();
            parcel2.writeNoException();
            parcel2.writeInt(LIZIZ ? 1 : 0);
            return true;
        }
        C90613ZhJ LIZ = this.LJLIL.LIZ(parcel.readString());
        InterfaceC68163Qp5 interfaceC68163Qp5 = null;
        if (LIZ != null && (interfaceC90109ZYb = LIZ.LIZ) != null) {
            try {
                interfaceC68163Qp5 = interfaceC90109ZYb.LIZJ();
            } catch (RemoteException unused) {
                C90469Zez c90469Zez = ZYQ.LIZIZ;
                C16880lQ.LJLLJ(InterfaceC90109ZYb.class);
                c90469Zez.getClass();
            }
        }
        parcel2.writeNoException();
        C90257ZbZ.LIZJ(parcel2, interfaceC68163Qp5);
        return true;
    }
}
