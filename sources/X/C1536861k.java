package X;

import Y.ARunnableS21S0200000_2;
import android.animation.ValueAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.61k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1536861k extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLJ;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C82631Wbr LJLJJL;
    public ImageView LJLJJLL;
    public TextView LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C82631Wbr LJLJLLL;
    public final C82631Wbr LJLL;
    public ValueAnimator LJLLI;
    public final boolean LJLLILLLL;

    static {
        TBT tbt = new TBT(C1536861k.class, "editRootScene", "getEditRootScene()Lcom/ss/android/ugc/gamora/editor/rootscene/IEditRootScene;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C1536861k.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C1536861k.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C1536861k.class, "editExitHelper", "getEditExitHelper()Lcom/ss/android/ugc/gamora/editor/exit/IEditExitHelper;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return new WI1() { // from class: X.5tJ
            @Override // X.WI1
            public final int LJI() {
                return R.drawable.b3k;
            }

            @Override // X.WI1
            public final int LJII() {
                return R.string.q9s;
            }

            @Override // X.WI1
            public final WI0 LIZJ() {
                return new WI0(VLL.FIXED, -30, false, 4);
            }

            @Override // X.WI1
            public final C6MP LJIIIIZZ() {
                return C6MP.EDIT_SAVE_LOCAL;
            }
        };
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        if (C00F.LIZ(31744, 0, "studio_add_save_local_layout_type", true) == 0) {
            return false;
        }
        if ((C00F.LIZ(31744, 0, "studio_add_save_local_layout_type", true) == 1 && C151965xo.LIZJ(LJIIJ())) || !C1533860g.LIZ(LJIIJ())) {
            return false;
        }
        return true;
    }

    public final InterfaceC143655kP LJIIIZ() {
        return (InterfaceC143655kP) this.LJLJLLL.LIZ(this, LJLLJ[2]);
    }

    public final VideoPublishEditModel LJIIJ() {
        return (VideoPublishEditModel) this.LJLJLJ.LIZ(this, LJLLJ[1]);
    }

    @Override // X.WJB
    public final void LJFF() {
        InterfaceC150615vd interfaceC150615vd;
        InterfaceC163006aW publishService = C60903NvH.LJIIJJI().getPublishService();
        if (publishService.LJJIII(LJIIJ())) {
            if (H7R.LJJJJL(LJIIJ())) {
                InterfaceC143655kP LJIIIZ = LJIIIZ();
                if ((LJIIIZ instanceof InterfaceC150615vd) && (interfaceC150615vd = (InterfaceC150615vd) LJIIIZ) != null) {
                    interfaceC150615vd.L80().setValue(new ARunnableS21S0200000_2(publishService, this, 40));
                    return;
                }
                return;
            }
            C6F2 c6f2 = (C6F2) this.LJLJJL.LIZ(this, LJLLJ[0]);
            if (c6f2 == null) {
                return;
            }
            c6f2.LLJILJILJ(new Runnable() { // from class: X.61m
                @Override // java.lang.Runnable
                public final void run() {
                }
            }, new ARunnableS21S0200000_2(publishService, this, 41));
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    @Override // X.WJB
    public final void LJI(C1537261o registerEvent) {
        o.LJIIIZ(registerEvent, "registerEvent");
        ImageView imageView = registerEvent.LJLJI;
        this.LJLJJLL = imageView;
        this.LJLJL = registerEvent.LJLILLLLZI;
        if (!this.LJLLILLLL) {
            C60903NvH.LJIIJJI().getPublishService().LJJIJIL(this.LJLJI, new AqS184S0100000_2(this, 60));
            return;
        }
        if (imageView != null) {
            imageView.setAlpha(0.5f);
        }
        TextView textView = this.LJLJL;
        if (textView == null) {
            return;
        }
        textView.setAlpha(0.5f);
    }

    public C1536861k(LifecycleOwner lifecycleOwner, C82622Wbi diContainer, C148195rj config) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(config, "config");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = UCI.LJII(diContainer, C6F2.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJLLL = UCI.LJII(diContainer, InterfaceC143655kP.class, null);
        this.LJLL = UCI.LJII(diContainer, C6NA.class, null);
        this.LJLLILLLL = C60903NvH.LJIIJJI().getPublishService().LJJIFFI();
    }
}
