package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.Qzl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68825Qzl extends C68811QzX implements InterfaceC68838Qzy {
    @Override // X.InterfaceC68838Qzy
    public final int LJII() {
        Parcel LJLJI = LJLJI(LLJI(), 18);
        int readInt = LJLJI.readInt();
        LJLJI.recycle();
        return readInt;
    }

    @Override // X.InterfaceC68838Qzy
    public final void LJIILLIIL() {
        LLJJIII(LLJI(), 1);
    }

    public C68825Qzl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    @Override // X.InterfaceC68838Qzy
    public final boolean LLFFF(InterfaceC68838Qzy interfaceC68838Qzy) {
        boolean z;
        Parcel LLJI = LLJI();
        C68223Qq3.LIZJ(LLJI, interfaceC68838Qzy);
        Parcel LJLJI = LJLJI(LLJI, 17);
        if (LJLJI.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        LJLJI.recycle();
        return z;
    }
}
