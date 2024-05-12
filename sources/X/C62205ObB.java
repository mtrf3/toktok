package X;

import android.content.Intent;

/* renamed from: X.ObB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62205ObB implements InterfaceC60176NjY {
    public final /* synthetic */ AbstractC62203Ob9 LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    @Override // X.InterfaceC60176NjY
    public final void LIZIZ(O15 o15) {
    }

    @Override // X.InterfaceC60176NjY
    public final void LIZJ() {
    }

    public C62205ObB(C62202Ob8 c62202Ob8, boolean z) {
        this.LJLIL = c62202Ob8;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC60176NjY
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.LJLIL.LIZ(i, i2, intent, true, this.LJLILLLLZI);
    }
}
