package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.Zhb, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90631Zhb extends C90232ZbA implements InterfaceC90111ZYd {
    @Override // X.InterfaceC90111ZYd
    public final InterfaceC68163Qp5 LIZJ() {
        Parcel LLJI = LLJI(LJLJI(), 7);
        InterfaceC68163Qp5 LLJI2 = AbstractBinderC68227Qq7.LLJI(LLJI.readStrongBinder());
        LLJI.recycle();
        return LLJI2;
    }

    @Override // X.InterfaceC90111ZYd
    public final InterfaceC68163Qp5 LJIIIIZZ() {
        Parcel LLJI = LLJI(LJLJI(), 1);
        InterfaceC68163Qp5 LLJI2 = AbstractBinderC68227Qq7.LLJI(LLJI.readStrongBinder());
        LLJI.recycle();
        return LLJI2;
    }

    public C90631Zhb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    @Override // X.InterfaceC90111ZYd
    public final void LJLJJL(BinderC90624ZhU binderC90624ZhU) {
        Parcel LJLJI = LJLJI();
        C90257ZbZ.LIZJ(LJLJI, binderC90624ZhU);
        LLJJIII(LJLJI, 5);
    }

    @Override // X.InterfaceC90111ZYd
    public final void LJLJLLL(boolean z) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeInt(1);
        LJLJI.writeInt(z ? 1 : 0);
        LLJJIII(LJLJI, 6);
    }

    @Override // X.InterfaceC90111ZYd
    public final void LLJ(BinderC90624ZhU binderC90624ZhU) {
        Parcel LJLJI = LJLJI();
        C90257ZbZ.LIZJ(LJLJI, binderC90624ZhU);
        LLJJIII(LJLJI, 4);
    }

    @Override // X.InterfaceC90111ZYd
    public final void P(BinderC90869ZlR binderC90869ZlR) {
        Parcel LJLJI = LJLJI();
        C90257ZbZ.LIZJ(LJLJI, binderC90869ZlR);
        LLJJIII(LJLJI, 2);
    }

    @Override // X.InterfaceC90111ZYd
    public final void s0(BinderC90869ZlR binderC90869ZlR) {
        Parcel LJLJI = LJLJI();
        C90257ZbZ.LIZJ(LJLJI, binderC90869ZlR);
        LLJJIII(LJLJI, 3);
    }
}
