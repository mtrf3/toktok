package X;

import kotlin.jvm.internal.o;

/* renamed from: X.I2y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45984I2y implements WSH, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final C82622Wbi LJLJJL;
    public final C82632Wbs LJLJJLL;

    static {
        TBT tbt = new TBT(C45984I2y.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.WSH
    public final boolean enable() {
        return true;
    }

    @Override // X.WSH
    public final void initialize(C45850Hz4 c45850Hz4) {
    }

    @Override // X.WSH
    public final WT3 provideScene() {
        return null;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJL;
    }

    @Override // X.WSH
    public final WSF createBottomTabItem(C45850Hz4 c45850Hz4) {
        return new WSF(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, new C45985I2z(this));
    }

    public C45984I2y(String str, String tag, boolean z, C82622Wbi diContainer) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = str;
        this.LJLILLLLZI = tag;
        this.LJLJI = "quick";
        this.LJLJJI = z;
        this.LJLJJL = diContainer;
        this.LJLJJLL = UCI.LJI(diContainer, InterfaceC45979I2t.class, null);
    }
}
