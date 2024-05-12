package X;

/* renamed from: X.SMf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71965SMf extends C71985SMz {
    public final /* synthetic */ C71963SMd LIZJ;

    @Override // X.C71985SMz, X.InterfaceC71919SKl
    public final boolean isEnabled() {
        if (this.LIZJ.LJLLJ || super.isEnabled()) {
            return true;
        }
        return false;
    }

    @Override // X.C71985SMz, X.InterfaceC71919SKl
    public final boolean isVisible() {
        if (this.LIZJ.LJLLJ || super.isVisible()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71965SMf(C71963SMd c71963SMd) {
        super(c71963SMd, false);
        this.LIZJ = c71963SMd;
    }
}
