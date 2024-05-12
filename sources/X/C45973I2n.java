package X;

import kotlin.jvm.internal.o;

/* renamed from: X.I2n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45973I2n implements WSH, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final C82622Wbi LJLJJL;
    public InterfaceC82086WJm LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final I0N LJLJLLL;

    static {
        TBT tbt = new TBT(C45973I2n.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C45973I2n.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0, c65351Pkp)};
    }

    @Override // X.WSH
    public final boolean enable() {
        return true;
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
        return new WSF(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, new C45972I2m(c45850Hz4, this));
    }

    @Override // X.WSH
    public final void initialize(C45850Hz4 c45850Hz4) {
        this.LJLJJLL = c45850Hz4.LIZIZ();
    }

    public C45973I2n(String str, String tag, String str2, boolean z, C82622Wbi diContainer) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = str;
        this.LJLILLLLZI = tag;
        this.LJLJI = str2;
        this.LJLJJI = z;
        this.LJLJJL = diContainer;
        this.LJLJL = UCI.LJI(diContainer, InterfaceC45999I3n.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, InterfaceC45979I2t.class, null);
        this.LJLJLLL = (I0N) diContainer.LJIIIIZZ(null, I0N.class);
    }
}
