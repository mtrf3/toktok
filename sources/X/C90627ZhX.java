package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.ZhX, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90627ZhX extends C90232ZbA implements InterfaceC90109ZYb {
    @Override // X.InterfaceC90109ZYb
    public final InterfaceC68163Qp5 LIZJ() {
        Parcel LLJI = LLJI(LJLJI(), 1);
        InterfaceC68163Qp5 LLJI2 = AbstractBinderC68227Qq7.LLJI(LLJI.readStrongBinder());
        LLJI.recycle();
        return LLJI2;
    }

    @Override // X.InterfaceC90109ZYb
    public final int LJ() {
        Parcel LLJI = LLJI(LJLJI(), 17);
        int readInt = LLJI.readInt();
        LLJI.recycle();
        return readInt;
    }

    @Override // X.InterfaceC90109ZYb
    public final int LJIIIIZZ() {
        Parcel LLJI = LLJI(LJLJI(), 18);
        int readInt = LLJI.readInt();
        LLJI.recycle();
        return readInt;
    }

    @Override // X.InterfaceC90109ZYb
    public final boolean LJJIII() {
        boolean z;
        Parcel LLJI = LLJI(LJLJI(), 5);
        if (LLJI.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        LLJI.recycle();
        return z;
    }

    @Override // X.InterfaceC90109ZYb
    public final boolean LJJIJIIJIL() {
        boolean z;
        Parcel LLJI = LLJI(LJLJI(), 9);
        if (LLJI.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        LLJI.recycle();
        return z;
    }

    public C90627ZhX(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    @Override // X.InterfaceC90109ZYb
    public final void LJJ(int i) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeInt(2153);
        LLJJIII(LJLJI, 15);
    }

    @Override // X.InterfaceC90109ZYb
    public final void LJJIIJ(int i) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeInt(2151);
        LLJJIII(LJLJI, 12);
    }

    @Override // X.InterfaceC90109ZYb
    public final void LJLLILLLL(int i) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeInt(i);
        LLJJIII(LJLJI, 13);
    }
}
