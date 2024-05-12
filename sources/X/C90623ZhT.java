package X;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.ZhT, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90623ZhT extends C90232ZbA implements InterfaceC90108ZYa {
    @Override // X.InterfaceC90108ZYa
    public final void LIZJ() {
        LLJJIII(LJLJI(), 1);
    }

    @Override // X.InterfaceC90108ZYa
    public final void LJI() {
        LLJJIII(LJLJI(), 4);
    }

    public C90623ZhT(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    @Override // X.InterfaceC90108ZYa
    public final IBinder LLLIIL(Intent intent) {
        Parcel LJLJI = LJLJI();
        C90257ZbZ.LIZIZ(LJLJI, intent);
        Parcel LLJI = LLJI(LJLJI, 3);
        IBinder readStrongBinder = LLJI.readStrongBinder();
        LLJI.recycle();
        return readStrongBinder;
    }

    @Override // X.InterfaceC90108ZYa
    public final int T(int i, int i2, Intent intent) {
        Parcel LJLJI = LJLJI();
        C90257ZbZ.LIZIZ(LJLJI, intent);
        LJLJI.writeInt(i);
        LJLJI.writeInt(i2);
        Parcel LLJI = LLJI(LJLJI, 2);
        int readInt = LLJI.readInt();
        LLJI.recycle();
        return readInt;
    }
}
