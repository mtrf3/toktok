package X;

import androidx.activity.OnBackPressedDispatcher;

/* renamed from: X.18E, reason: invalid class name */
/* loaded from: classes.dex */
public class C18E implements InterfaceC008001k {
    public final AbstractC008101l LJLIL;
    public final /* synthetic */ OnBackPressedDispatcher LJLILLLLZI;

    @Override // X.InterfaceC008001k
    public final void cancel() {
        this.LJLILLLLZI.LIZIZ.remove(this.LJLIL);
        this.LJLIL.LIZIZ.remove(this);
    }

    public C18E(OnBackPressedDispatcher onBackPressedDispatcher, AbstractC008101l abstractC008101l) {
        this.LJLILLLLZI = onBackPressedDispatcher;
        this.LJLIL = abstractC008101l;
    }
}
