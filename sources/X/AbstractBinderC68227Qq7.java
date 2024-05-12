package X;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.Qq7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC68227Qq7 extends BinderC67896Qkm implements InterfaceC68163Qp5 {
    public AbstractBinderC68227Qq7() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static InterfaceC68163Qp5 LLJI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof InterfaceC68163Qp5) {
            return (InterfaceC68163Qp5) queryLocalInterface;
        }
        return new C68229Qq9(iBinder);
    }
}
