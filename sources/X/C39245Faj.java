package X;

import android.util.Pair;

/* renamed from: X.Faj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39245Faj extends C39246Fak {
    public final InterfaceC39244Fai LJLILLLLZI;

    @Override // X.C39246Fak
    public final String LLLLZIL() {
        return this.LJLILLLLZI.getCountry();
    }

    @Override // X.C39246Fak
    public final Pair<String, Boolean> LLLLZLLIL() {
        return this.LJLILLLLZI.LIZIZ();
    }

    @Override // X.C39246Fak
    public final String LLLLZLLLI() {
        return this.LJLILLLLZI.getNetworkOperator();
    }

    @Override // X.C39246Fak
    public final String LLLZ() {
        return this.LJLILLLLZI.LIZ();
    }

    @Override // X.C39246Fak
    public final String LLLZI() {
        return this.LJLILLLLZI.LIZJ();
    }

    public C39245Faj(InterfaceC39244Fai interfaceC39244Fai) {
        this.LJLILLLLZI = interfaceC39244Fai;
    }
}
