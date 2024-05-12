package X;

/* renamed from: X.SMy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71984SMy implements InterfaceC71919SKl {
    public final /* synthetic */ SLA LIZ;
    public final /* synthetic */ Boolean LIZIZ;

    @Override // X.InterfaceC71919SKl
    public final boolean isEnabled() {
        return SN3.LIZJ(this.LIZ.LLII()).LIZ;
    }

    @Override // X.InterfaceC71919SKl
    public final boolean isVisible() {
        if (!this.LIZIZ.booleanValue()) {
            return false;
        }
        return SN3.LIZJ(this.LIZ.LLII()).LIZIZ;
    }

    public C71984SMy(SLA sla, Boolean bool) {
        this.LIZ = sla;
        this.LIZIZ = bool;
    }
}
