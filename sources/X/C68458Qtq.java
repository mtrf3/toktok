package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.Qtq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68458Qtq extends C67884Qka {
    public C68458Qtq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final InterfaceC68163Qp5 LLJJIII(BinderC68153Qov binderC68153Qov, String str, int i) {
        Parcel LLJI = LLJI();
        C67609Qg9.LIZIZ(LLJI, binderC68153Qov);
        LLJI.writeString(str);
        LLJI.writeInt(i);
        Parcel LJLJI = LJLJI(LLJI, 2);
        InterfaceC68163Qp5 LLJI2 = AbstractBinderC68227Qq7.LLJI(LJLJI.readStrongBinder());
        LJLJI.recycle();
        return LLJI2;
    }

    public final InterfaceC68163Qp5 j(BinderC68153Qov binderC68153Qov, String str, int i) {
        Parcel LLJI = LLJI();
        C67609Qg9.LIZIZ(LLJI, binderC68153Qov);
        LLJI.writeString(str);
        LLJI.writeInt(i);
        Parcel LJLJI = LJLJI(LLJI, 4);
        InterfaceC68163Qp5 LLJI2 = AbstractBinderC68227Qq7.LLJI(LJLJI.readStrongBinder());
        LJLJI.recycle();
        return LLJI2;
    }

    public final InterfaceC68163Qp5 LLZZJLIL(BinderC68153Qov binderC68153Qov, String str, int i, BinderC68153Qov binderC68153Qov2) {
        Parcel LLJI = LLJI();
        C67609Qg9.LIZIZ(LLJI, binderC68153Qov);
        LLJI.writeString(str);
        LLJI.writeInt(i);
        C67609Qg9.LIZIZ(LLJI, binderC68153Qov2);
        Parcel LJLJI = LJLJI(LLJI, 8);
        InterfaceC68163Qp5 LLJI2 = AbstractBinderC68227Qq7.LLJI(LJLJI.readStrongBinder());
        LJLJI.recycle();
        return LLJI2;
    }

    public final InterfaceC68163Qp5 t(BinderC68153Qov binderC68153Qov, String str, boolean z, long j) {
        Parcel LLJI = LLJI();
        C67609Qg9.LIZIZ(LLJI, binderC68153Qov);
        LLJI.writeString(str);
        LLJI.writeInt(z ? 1 : 0);
        LLJI.writeLong(j);
        Parcel LJLJI = LJLJI(LLJI, 7);
        InterfaceC68163Qp5 LLJI2 = AbstractBinderC68227Qq7.LLJI(LJLJI.readStrongBinder());
        LJLJI.recycle();
        return LLJI2;
    }
}
