package X;

/* renamed from: X.SMi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71968SMi extends C71985SMz {
    public final /* synthetic */ C71966SMg LIZJ;

    @Override // X.C71985SMz, X.InterfaceC71919SKl
    public final boolean isEnabled() {
        if (this.LIZJ.LJLLL || super.isEnabled()) {
            return true;
        }
        return false;
    }

    @Override // X.C71985SMz, X.InterfaceC71919SKl
    public final boolean isVisible() {
        if (this.LIZJ.LJLLL || (super.isVisible() && this.LIZJ.LJLLJ)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71968SMi(C71966SMg c71966SMg) {
        super(c71966SMg, false);
        this.LIZJ = c71966SMg;
    }
}
