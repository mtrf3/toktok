package X;

import Y.AObserverS70S0100000_2;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5t0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148985t0 extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLI;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C148195rj LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C148505sE LJLJLJ;
    public final C82632Wbs LJLJLLL;
    public AqS152S0100000_2 LJLL;

    static {
        TBT tbt = new TBT(C148985t0.class, "cropApi", "getCropApi()Lcom/ss/android/ugc/aweme/image/crop/ImageCropApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C148985t0.class, "imageProgressApi", "getImageProgressApi()Lcom/ss/android/ugc/aweme/image/progressbar/ImageProgressApi;", 0, c65351Pkp), C61845OOz.LIZJ(C148985t0.class, "imagePresenter", "getImagePresenter()Lcom/ss/android/ugc/aweme/image/preview/ImagePresenter;", 0, c65351Pkp), C61845OOz.LIZJ(C148985t0.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return new WI1() { // from class: X.5t1
            public final C6MP LJIIIZ = C6MP.IMAGE_CROP;

            @Override // X.WI1
            public final int LJI() {
                return R.drawable.b88;
            }

            @Override // X.WI1
            public final int LJII() {
                return R.string.pde;
            }

            @Override // X.WI1
            public final WI0 LIZJ() {
                return new WI0(null, 180, false, 5);
            }

            @Override // X.WI1
            public final C6MP LJIIIIZZ() {
                return this.LJIIIZ;
            }
        };
    }

    @Override // X.WJB
    public final void LIZLLL() {
        ((C6XL) this.LJLJL.LIZ(this, LJLLI[1])).jR().observe(this.LJLJI, new AObserverS70S0100000_2(this, 215));
    }

    @Override // X.WJB
    public final void LJFF() {
        C152175y9 invoke = this.LJLJJL.LIZLLL.invoke();
        if (invoke != null && invoke.LLILL) {
            this.LJLL = new AqS152S0100000_2(this, 680);
            return;
        }
        C148505sE c148505sE = this.LJLJLJ;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLLI;
        C151065wM c151065wM = (C151065wM) c148505sE.LIZ(this, interfaceC74236TBoArr[2]);
        if (c151065wM != null) {
            c151065wM.LIZJ(new AqS152S0100000_2(this, 681));
        }
        H8F.LJJ((VideoPublishEditModel) this.LJLJLLL.LIZ(this, interfaceC74236TBoArr[3]));
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        return C151965xo.LIZJ((VideoPublishEditModel) this.LJLJLLL.LIZ(this, LJLLI[3]));
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public C148985t0(LifecycleOwner lifecycleOwner, C82622Wbi diContainer, C148195rj config) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(config, "config");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = config;
        this.LJLJJLL = UCI.LJI(diContainer, InterfaceC148975sz.class, null);
        this.LJLJL = UCI.LJI(diContainer, C6XL.class, null);
        this.LJLJLJ = new C148505sE(this);
        this.LJLJLLL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
    }
}
