package X;

import android.os.Parcel;

/* renamed from: X.QmC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67984QmC implements InterfaceC67935QlP, InterfaceC153055zZ {
    public final Object LJLIL;

    @Override // X.InterfaceC153055zZ
    public final /* bridge */ /* synthetic */ Object a() {
        Object a = ((InterfaceC153055zZ) this.LJLIL).a();
        C40654FxS.LJI(a);
        return a;
    }

    public /* synthetic */ C67984QmC(Object obj) {
        this.LJLIL = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC67935QlP
    public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
        C67798QjC c67798QjC = (C67798QjC) this.LJLIL;
        c67798QjC.getClass();
        BinderC67955Qlj binderC67955Qlj = new BinderC67955Qlj((C67649Qgn) obj);
        C68000QmS c68000QmS = (C68000QmS) ((AbstractC67863QkF) interfaceC67836Qjo).LJJIIJ();
        String str = c67798QjC.LJIIJ;
        Parcel LJLJI = c68000QmS.LJLJI();
        C67988QmG.LIZLLL(LJLJI, binderC67955Qlj);
        LJLJI.writeString(str);
        c68000QmS.LLJI(LJLJI, 2);
    }
}
