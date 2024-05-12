package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.Qti, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68450Qti extends C67884Qka implements InterfaceC68455Qtn {
    @Override // X.InterfaceC68455Qtn
    public final int LIZIZ() {
        Parcel LJLJI = LJLJI(LLJI(), 2);
        int readInt = LJLJI.readInt();
        LJLJI.recycle();
        return readInt;
    }

    @Override // X.InterfaceC68455Qtn
    public final InterfaceC68163Qp5 LIZLLL() {
        Parcel LJLJI = LJLJI(LLJI(), 1);
        InterfaceC68163Qp5 LLJI = AbstractBinderC68227Qq7.LLJI(LJLJI.readStrongBinder());
        LJLJI.recycle();
        return LLJI;
    }

    public C68450Qti(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }
}
