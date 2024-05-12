package X;

/* renamed from: X.W5a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81710W5a extends C81729W5t<AbstractC81686W4c> {
    public final /* synthetic */ W5G LIZJ;

    @Override // X.C81729W5t
    public final AbstractC81686W4c LIZIZ() {
        if (!this.LIZJ.isInEditMode()) {
            if (W5G.sDraweecontrollerbuildersupplier == null) {
                C32151Nz.LJIIIIZZ(W5G.sIDraweecontrollerbuildersupplier, "SimpleDraweeView was not initialized!");
                C32151Nz.LJIIIIZZ(((C81721W5l) W5G.sIDraweecontrollerbuildersupplier).LIZ(), "SimpleDraweeView was not initialized!");
                W5G.sDraweecontrollerbuildersupplier = ((C81721W5l) W5G.sIDraweecontrollerbuildersupplier).LIZ();
            }
            return W5G.sDraweecontrollerbuildersupplier.get();
        }
        return null;
    }

    public C81710W5a(W5G w5g) {
        this.LIZJ = w5g;
    }
}
