package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I3L implements WSH, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public final C82622Wbi LJLIL;
    public final boolean LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C82632Wbs LJLJJI;
    public final C82631Wbr LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C45946I1m LJLJLJ;
    public final C82632Wbs LJLJLLL;

    static {
        TBT tbt = new TBT(I3L.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(I3L.class, "permissionComponent", "getPermissionComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I3L.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(I3L.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0, c65351Pkp), C61845OOz.LIZJ(I3L.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0, c65351Pkp)};
    }

    @Override // X.WSH
    public final boolean enable() {
        return true;
    }

    @Override // X.WSH
    public final WT3 provideScene() {
        return (WT3) this.LJLJI.getValue();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.WSH
    public final WSF createBottomTabItem(C45850Hz4 c45850Hz4) {
        I38 i38 = I38.NEW_BOTTOM_STORY;
        return new WSF(C78688UuS.LJJJI(i38.getNameResId()), i38.getTag(), "fast_shoot", this.LJLILLLLZI, new I3M(this));
    }

    @Override // X.WSH
    public final void initialize(C45850Hz4 c45850Hz4) {
        ((I3X) this.LJLJLLL.LIZ(this, LJLL[4])).Dd(HU0.class, new C43833HIf(this.LJLJLJ, (ActivityC45651qj) this.LJLIL.LJ(ActivityC45651qj.class, null), (WRQ) this.LJLIL.LJ(WRQ.class, null), (I9X) this.LJLIL.LJ(I9Z.class, null), c45850Hz4.LIZLLL(), (H9R) this.LJLIL.LJ(H9R.class, null), (I0N) this.LJLIL.LJIIIIZZ(null, I0N.class), (InterfaceC45999I3n) this.LJLIL.LJ(InterfaceC45999I3n.class, null), (WRP) this.LJLIL.LJIIIIZZ(null, WRP.class), (I37) this.LJLIL.LJIIIIZZ(null, I37.class), this.LJLIL));
    }

    public I3L(C82622Wbi diContainer, boolean z) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = z;
        this.LJLJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 703));
        this.LJLJJI = UCI.LJI(diContainer, InterfaceC82086WJm.class, null);
        this.LJLJJL = UCI.LJII(diContainer, I8W.class, null);
        this.LJLJJLL = UCI.LJI(diContainer, ShortVideoContext.class, null);
        this.LJLJL = UCI.LJI(diContainer, WLB.class, null);
        this.LJLJLJ = (C45946I1m) diContainer.LJIIIIZZ(null, C45946I1m.class);
        this.LJLJLLL = UCI.LJI(diContainer, I3X.class, null);
    }
}
