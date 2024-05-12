package X;

/* renamed from: X.BrF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30077BrF implements InterfaceC29879Bo3 {
    public boolean LIZ;
    public final /* synthetic */ C30076BrE LIZIZ;
    public final /* synthetic */ Class<Object> LIZJ;

    @Override // X.InterfaceC29879Bo3
    public final void invoke(Object obj) {
        if (!this.LIZ) {
            this.LIZ = true;
            this.LIZIZ.LIZ.load(this.LIZJ, new C30079BrH[]{new C30079BrH(obj)});
        }
    }

    public C30077BrF(C30076BrE c30076BrE, Class<Object> cls) {
        this.LIZIZ = c30076BrE;
        this.LIZJ = cls;
    }
}
