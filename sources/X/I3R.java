package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I3R implements WSH, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLILLLL;
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final C82622Wbi LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C82632Wbs LJLJLLL;
    public final C82631Wbr LJLL;
    public final C45946I1m LJLLI;

    static {
        TBT tbt = new TBT(I3R.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLILLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(I3R.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I3R.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I3R.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I3R.class, "nowsSwitcherApi", "getNowsSwitcherApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0, c65351Pkp)};
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
        return new WSF(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, new I3S(c45850Hz4, this));
    }

    @Override // X.WSH
    public final void initialize(C45850Hz4 c45850Hz4) {
        ((I3X) this.LJLJJLL.LIZ(this, LJLLILLLL[0])).Dd(HU0.class, new C43833HIf(this.LJLLI, (ActivityC45651qj) this.LJLJJL.LJ(ActivityC45651qj.class, null), (WRQ) this.LJLJJL.LJ(WRQ.class, null), (I9X) this.LJLJJL.LJ(I9Z.class, null), c45850Hz4.LIZLLL(), (H9R) this.LJLJJL.LJ(H9R.class, null), (I0N) this.LJLJJL.LJIIIIZZ(null, I0N.class), (InterfaceC45999I3n) this.LJLJJL.LJ(InterfaceC45999I3n.class, null), (WRP) this.LJLJJL.LJIIIIZZ(null, WRP.class), (I37) this.LJLJJL.LJIIIIZZ(null, I37.class), this.LJLJJL));
    }

    public I3R(String str, String tag, String str2, boolean z, C82622Wbi diContainer) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = str;
        this.LJLILLLLZI = tag;
        this.LJLJI = str2;
        this.LJLJJI = z;
        this.LJLJJL = diContainer;
        this.LJLJJLL = UCI.LJI(diContainer, I3X.class, null);
        this.LJLJL = UCI.LJI(diContainer, InterfaceC45999I3n.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, InterfaceC82086WJm.class, null);
        this.LJLJLLL = UCI.LJI(diContainer, InterfaceC45979I2t.class, null);
        this.LJLL = UCI.LJII(diContainer, InterfaceC82325WSr.class, null);
        this.LJLLI = (C45946I1m) diContainer.LJIIIIZZ(null, C45946I1m.class);
    }
}
