package X;

/* renamed from: X.R8h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69055R8h<T> implements InterfaceC73518StG {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ boolean LIZIZ = false;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ java.util.Map<String, String> LIZLLL;

    public C69055R8h(InterfaceC69056R8i interfaceC69056R8i, String str, java.util.Map map) {
        this.LIZ = interfaceC69056R8i;
        this.LIZJ = str;
        this.LIZLLL = map;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        C69053R8f c69053R8f = new C69053R8f(this.LIZ, c73516StE);
        this.LIZ.bi(c69053R8f);
        if (this.LIZIZ) {
            this.LIZ.S9().LIZ(this.LIZJ, this.LIZLLL, c69053R8f);
        } else {
            this.LIZ.S9().LIZIZ(this.LIZJ, this.LIZLLL, c69053R8f);
        }
    }
}
