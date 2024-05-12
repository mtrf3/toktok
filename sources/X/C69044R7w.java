package X;

/* renamed from: X.R7w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69044R7w<T> implements InterfaceC73518StG {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ java.util.Map<String, String> LJ;

    public C69044R7w(int i, InterfaceC69056R8i interfaceC69056R8i, String str, String str2, java.util.Map map) {
        this.LIZ = interfaceC69056R8i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = map;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        R8L r8l = new R8L(this.LIZ, c73516StE);
        this.LIZ.bi(r8l);
        this.LIZ.r9().LJ(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, r8l);
    }
}
