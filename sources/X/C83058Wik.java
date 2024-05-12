package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wik, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83058Wik implements InterfaceC135635Tz, InterfaceC42561Gn7 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLZ;
    public final LifecycleOwner LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final C83062Wio LJLJI;
    public final LiveData<VESize> LJLJJI;
    public final InterfaceC88472Yns<VEVideoTransformFilterParam, C76800UCe> LJLJJL;
    public final InterfaceC65784Pro<InterfaceC152085y0> LJLJJLL;
    public final /* synthetic */ LPI LJLJL;
    public volatile boolean LJLJLJ;
    public final C82632Wbs LJLJLLL;
    public final C82632Wbs LJLL;
    public boolean LJLLI;
    public VESize LJLLILLLL;
    public CanvasFilterParam LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;

    static {
        TBT tbt = new TBT(C83058Wik.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C83058Wik.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC42561Gn7
    public final InterfaceC42558Gn4 LIZ() {
        return this.LJLJL.LIZ();
    }

    public final InterfaceC143655kP LIZIZ() {
        return (InterfaceC143655kP) this.LJLJLLL.LIZ(this, LJLZ[0]);
    }

    public final VideoPublishEditModel LIZJ() {
        return (VideoPublishEditModel) this.LJLL.LIZ(this, LJLZ[1]);
    }

    public final C83059Wil LIZLLL() {
        return (C83059Wil) this.LJLLLL.getValue();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    public C83058Wik(C163096af lifecycleOwner, C82622Wbi diContainer, C83062Wio gestureAssist, MutableLiveData veSizeLiveData, C163106ag c163106ag, InterfaceC65784Pro gestureServiceProvider) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(gestureAssist, "gestureAssist");
        o.LJIIIZ(veSizeLiveData, "veSizeLiveData");
        o.LJIIIZ(gestureServiceProvider, "gestureServiceProvider");
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = gestureAssist;
        this.LJLJJI = veSizeLiveData;
        this.LJLJJL = c163106ag;
        this.LJLJJLL = gestureServiceProvider;
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
        this.LJLJL = new LPI(lifecycle);
        this.LJLJLLL = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJLL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 257));
        this.LJLLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 258));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 256));
    }
}
