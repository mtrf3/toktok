package X;

import android.os.Parcel;

/* renamed from: X.Qt4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68410Qt4 implements InterfaceC67935QlP {
    public final Object LJLIL;

    public /* synthetic */ C68410Qt4(C67801QjF c67801QjF) {
        this.LJLIL = c67801QjF;
    }

    public C68410Qt4(int i) {
        if (i != 2) {
            this.LJLIL = new C58317Muf(true, " ", 21);
        } else {
            this.LJLIL = new FY6(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC67935QlP
    public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
        BinderC68420QtE binderC68420QtE = new BinderC68420QtE((C67649Qgn) obj);
        C67908Qky c67908Qky = (C67908Qky) ((AbstractC67863QkF) interfaceC67836Qjo).LJJIIJ();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(c67908Qky.LJLILLLLZI);
        obtain.writeStrongBinder(binderC68420QtE);
        c67908Qky.LJLJI(obtain, 11);
    }
}
