package X;

/* renamed from: X.Ngg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59998Ngg implements InterfaceC60000Ngi {
    public static C59998Ngg LJFF;
    public float LIZ;
    public final C39557Ffl LIZIZ;
    public final C73994T2g LIZJ;
    public C60013Ngv LIZLLL;
    public C60023Nh5 LJ;

    public C59998Ngg(C39557Ffl c39557Ffl, C73994T2g c73994T2g) {
        this.LIZIZ = c39557Ffl;
        this.LIZJ = c73994T2g;
    }

    public static C59998Ngg LIZ() {
        if (LJFF == null) {
            LJFF = new C59998Ngg(new C39557Ffl(), new C73994T2g());
        }
        return LJFF;
    }
}
