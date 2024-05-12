package X;

/* renamed from: X.Lm4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55236Lm4 implements InterfaceC55235Lm3 {
    public final Object LJLIL;
    public final C55237Lm5 LJLILLLLZI = new C55237Lm5(this);
    public final String LJLJI = "Default_Scope_Key";

    @Override // X.InterfaceC55235Lm3
    public final Object getHost() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC55235Lm3
    public final String getKey() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC55235Lm3
    public final C55252LmK getTree() {
        return this.LJLILLLLZI;
    }

    public C55236Lm4(Object obj) {
        this.LJLIL = obj;
    }
}
