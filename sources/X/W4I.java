package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W4I implements W4L, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final C82622Wbi LJLIL;
    public final boolean LJLILLLLZI;
    public final InterfaceC65784Pro<C6FB> LJLJI;
    public final C82632Wbs LJLJJI;
    public final C82631Wbr LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public Boolean LJLJLJ;

    static {
        TBT tbt = new TBT(W4I.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(W4I.class, "switcherApi", "getSwitcherApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0, c65351Pkp)};
    }

    public final boolean LIZIZ() {
        EnumC45994I3i enumC45994I3i;
        C0IB<C81644W2m> zx;
        C81644W2m LIZ;
        C82631Wbr c82631Wbr = this.LJLJJL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLJLLL;
        InterfaceC82325WSr interfaceC82325WSr = (InterfaceC82325WSr) c82631Wbr.LIZ(this, interfaceC74236TBoArr[1]);
        if (interfaceC82325WSr != null && (zx = interfaceC82325WSr.zx()) != null && (LIZ = zx.LIZ()) != null) {
            enumC45994I3i = LIZ.LIZ;
        } else {
            enumC45994I3i = null;
        }
        if (enumC45994I3i != null) {
            if (enumC45994I3i == EnumC45994I3i.NOWS) {
                return true;
            }
            return false;
        }
        return V16.LJJ((ShortVideoContext) this.LJLJJI.LIZ(this, interfaceC74236TBoArr[0]));
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public W4I(C82622Wbi diContainer, boolean z, InterfaceC65784Pro<? extends C6FB> interfaceC65784Pro) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = z;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = UCI.LJI(diContainer, ShortVideoContext.class, null);
        this.LJLJJL = UCI.LJII(diContainer, InterfaceC82325WSr.class, null);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 195));
        this.LJLJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 196));
    }

    @Override // X.W4L
    public final boolean LIZ(View surfaceView, View surfaceContainer, boolean z) {
        boolean z2;
        o.LJIIIZ(surfaceView, "surfaceView");
        o.LJIIIZ(surfaceContainer, "surfaceContainer");
        boolean LIZIZ = LIZIZ();
        if (z || !o.LJ(Boolean.valueOf(LIZIZ), this.LJLJLJ)) {
            if (LIZIZ) {
                ((W4H) this.LJLJL.getValue()).LIZ(surfaceView, surfaceContainer, false);
            } else {
                ((W4J) this.LJLJJLL.getValue()).LIZ(surfaceView, surfaceContainer, false);
            }
            z2 = !o.LJ(Boolean.valueOf(LIZIZ), this.LJLJLJ);
            this.LJLJLJ = Boolean.valueOf(LIZIZ);
        } else {
            z2 = false;
        }
        H78.LIZ("SurfaceSizeAdapterProxy:onResetSurfaceSize,currentMode:" + LIZIZ() + ",lastMode:" + this.LJLJLJ + ",forceRefresh:" + z + ",result:" + z2);
        return z2;
    }
}
