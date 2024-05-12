package X;

import android.graphics.Typeface;

/* renamed from: X.VeB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80227VeB extends QXX {
    public final Typeface LJLIL;
    public final InterfaceC80228VeC LJLILLLLZI;
    public boolean LJLJI;

    @Override // X.QXX
    public final void LLLF(int i) {
        Typeface typeface = this.LJLIL;
        if (!this.LJLJI) {
            this.LJLILLLLZI.LIZ(typeface);
        }
    }

    public C80227VeB(InterfaceC80228VeC interfaceC80228VeC, Typeface typeface) {
        super((Object) null);
        this.LJLIL = typeface;
        this.LJLILLLLZI = interfaceC80228VeC;
    }

    @Override // X.QXX
    public final void LLLFF(Typeface typeface, boolean z) {
        if (!this.LJLJI) {
            this.LJLILLLLZI.LIZ(typeface);
        }
    }
}
