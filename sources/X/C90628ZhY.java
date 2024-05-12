package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.ZhY, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90628ZhY extends C90232ZbA implements InterfaceC90110ZYc {
    @Override // X.InterfaceC90110ZYc
    public final InterfaceC90111ZYd LIZJ() {
        InterfaceC90111ZYd c90631Zhb;
        Parcel LLJI = LLJI(LJLJI(), 5);
        IBinder readStrongBinder = LLJI.readStrongBinder();
        if (readStrongBinder == null) {
            c90631Zhb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            if (queryLocalInterface instanceof InterfaceC90111ZYd) {
                c90631Zhb = (InterfaceC90111ZYd) queryLocalInterface;
            } else {
                c90631Zhb = new C90631Zhb(readStrongBinder);
            }
        }
        LLJI.recycle();
        return c90631Zhb;
    }

    @Override // X.InterfaceC90110ZYc
    public final Bundle LJ() {
        Parcel LLJI = LLJI(LJLJI(), 1);
        Bundle bundle = (Bundle) C90257ZbZ.LIZ(LLJI, Bundle.CREATOR);
        LLJI.recycle();
        return bundle;
    }

    @Override // X.InterfaceC90110ZYc
    public final boolean LJII() {
        boolean z;
        Parcel LLJI = LLJI(LJLJI(), 12);
        if (LLJI.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        LLJI.recycle();
        return z;
    }

    @Override // X.InterfaceC90110ZYc
    public final ZYY LJIIIIZZ() {
        ZYY c90620ZhQ;
        Parcel LLJI = LLJI(LJLJI(), 6);
        IBinder readStrongBinder = LLJI.readStrongBinder();
        if (readStrongBinder == null) {
            c90620ZhQ = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            if (queryLocalInterface instanceof ZYY) {
                c90620ZhQ = (ZYY) queryLocalInterface;
            } else {
                c90620ZhQ = new C90620ZhQ(readStrongBinder);
            }
        }
        LLJI.recycle();
        return c90620ZhQ;
    }

    public C90628ZhY(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }
}
