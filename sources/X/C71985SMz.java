package X;

/* renamed from: X.SMz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C71985SMz implements InterfaceC71919SKl {
    public final boolean LIZ;
    public final /* synthetic */ AbstractC71980SMu LIZIZ;

    @Override // X.InterfaceC71919SKl
    public boolean isEnabled() {
        if (SN3.LIZJ(this.LIZIZ.LLIFFJFJJ()).LIZ && (!this.LIZ || !C78966Uyw.LJJIJL())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC71919SKl
    public boolean isVisible() {
        return SN3.LIZJ(this.LIZIZ.LLIFFJFJJ()).LIZIZ;
    }

    public C71985SMz(AbstractC71980SMu abstractC71980SMu, boolean z) {
        this.LIZIZ = abstractC71980SMu;
        this.LIZ = z;
    }
}
