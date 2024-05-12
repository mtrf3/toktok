package X;

import android.view.View;

/* renamed from: X.19B, reason: invalid class name */
/* loaded from: classes.dex */
public class C19B implements InterfaceC16660l4 {
    public boolean LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ AnonymousClass031 LJLJI;

    @Override // X.InterfaceC16660l4
    public final void LIZ() {
        if (this.LJLIL) {
            return;
        }
        AnonymousClass031 anonymousClass031 = this.LJLJI;
        anonymousClass031.LJLJJLL = null;
        super/*android.view.ViewGroup*/.setVisibility(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC16660l4
    public final void LJIIJ() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.LJLIL = false;
    }

    public C19B(AnonymousClass031 anonymousClass031) {
        this.LJLJI = anonymousClass031;
    }

    @Override // X.InterfaceC16660l4
    public final void LJIIIIZZ(View view) {
        this.LJLIL = true;
    }
}
