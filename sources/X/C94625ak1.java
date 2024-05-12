package X;

import android.view.View;

/* renamed from: X.ak1, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94625ak1 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ View.OnFocusChangeListener LJLIL;
    public final /* synthetic */ C94459ahL LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94625ak1(View.OnFocusChangeListener onFocusChangeListener, C94459ahL c94459ahL, boolean z) {
        super(0);
        this.LJLIL = onFocusChangeListener;
        this.LJLILLLLZI = c94459ahL;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.onFocusChange(this.LJLILLLLZI, this.LJLJI);
        return C76800UCe.LIZ;
    }
}
