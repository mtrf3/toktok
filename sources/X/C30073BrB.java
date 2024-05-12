package X;

/* renamed from: X.BrB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30073BrB implements InterfaceC29879Bo3 {
    public boolean LIZ;
    public final /* synthetic */ C30076BrE LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ Class<Object> LIZLLL;

    @Override // X.InterfaceC29879Bo3
    public final void invoke(Object obj) {
        if (!this.LIZ) {
            this.LIZ = true;
            this.LIZIZ.LIZ.load(this.LIZJ, this.LIZLLL, false, new C30079BrH[]{new C30079BrH(obj)});
        }
    }

    public C30073BrB(C30076BrE c30076BrE, int i, Class<Object> cls) {
        this.LIZIZ = c30076BrE;
        this.LIZJ = i;
        this.LIZLLL = cls;
    }
}
