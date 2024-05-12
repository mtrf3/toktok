package X;

/* renamed from: X.V4r, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79153V4r implements InterfaceC79152V4q {
    public final /* synthetic */ InterfaceC79152V4q LJLIL;
    public final /* synthetic */ C83925Wwj LJLILLLLZI;

    @Override // X.InterfaceC79152V4q
    public final boolean LIZ() {
        return this.LJLIL.LIZ();
    }

    @Override // X.InterfaceC79152V4q
    public final boolean LIZJ() {
        return this.LJLIL.LIZJ();
    }

    @Override // X.InterfaceC79152V4q
    public final boolean LJ() {
        return this.LJLIL.LJ();
    }

    @Override // X.InterfaceC79152V4q
    public final String LJFF() {
        return this.LJLIL.LJFF();
    }

    @Override // X.InterfaceC79152V4q
    public final EnumC83605WrZ LJI() {
        return this.LJLIL.LJI();
    }

    @Override // X.InterfaceC79152V4q
    public final float LJII() {
        return this.LJLIL.LJII();
    }

    @Override // X.InterfaceC79152V4q
    public final float LIZIZ() {
        C83925Wwj c83925Wwj = this.LJLILLLLZI;
        Float f = c83925Wwj.LJLJJI.LJLL;
        if (f != null) {
            return f.floatValue();
        }
        return c83925Wwj.LJLJJL.LJJJJIZL().LIZIZ();
    }

    @Override // X.InterfaceC79152V4q
    public final int LIZLLL() {
        C83925Wwj c83925Wwj = this.LJLILLLLZI;
        Integer num = c83925Wwj.LJLJJI.LJLLI;
        if (num != null) {
            return num.intValue();
        }
        return c83925Wwj.LJLJJL.LJJJJIZL().LIZLLL();
    }

    public C79153V4r(C83925Wwj c83925Wwj) {
        this.LJLILLLLZI = c83925Wwj;
        this.LJLIL = c83925Wwj.LJLJJL.LJJJJIZL();
    }
}
