package X;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.Zkd, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractBinderC90819Zkd extends BinderC90541Zg9 implements InterfaceC90465Zev {
    public static InterfaceC90465Zev asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof InterfaceC90465Zev) {
            return (InterfaceC90465Zev) queryLocalInterface;
        }
        return new C90818Zkc(iBinder);
    }
}
