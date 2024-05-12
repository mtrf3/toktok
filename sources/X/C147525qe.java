package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.CommerceToolsMissionService;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5qe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147525qe extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLILLLL;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C148195rj LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C82632Wbs LJLJLLL;
    public final C5H3 LJLL;
    public final C62822Ol8 LJLLI;

    static {
        TBT tbt = new TBT(C147525qe.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLILLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C147525qe.class, "activity", "getActivity()Landroid/app/Activity;", 0, c65351Pkp), C61845OOz.LIZJ(C147525qe.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C147525qe.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return new C148165rg();
    }

    @Override // X.WJB
    public final void LJFF() {
        ICommerceToolsMissionService LJIIJ = CommerceToolsMissionService.LJIIJ();
        C82632Wbs c82632Wbs = this.LJLJL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLLILLLL;
        LJIIJ.LJIIIZ((Activity) c82632Wbs.LIZ(this, interfaceC74236TBoArr[1]), (VideoPublishEditModel) this.LJLJJLL.LIZ(this, interfaceC74236TBoArr[0]));
        H8F.LJJIII(6, (VideoPublishEditModel) this.LJLJJLL.LIZ(this, interfaceC74236TBoArr[0]), null);
        if (C44384HbQ.LJJIFFI()) {
            ((InterfaceC153275zv) this.LJLJLLL.LIZ(this, interfaceC74236TBoArr[3])).p9(1, false);
            C78934UyQ.LJLIL.getMusicService().LJIIZILJ();
            InterfaceC145325n6 interfaceC145325n6 = (InterfaceC145325n6) this.LJLL.getValue();
            if (interfaceC145325n6 != null) {
                interfaceC145325n6.show(true);
            }
            ((InterfaceC143655kP) this.LJLJLJ.LIZ(this, interfaceC74236TBoArr[2])).U2(false, false, false);
            return;
        }
        ((InterfaceC143655kP) this.LJLJLJ.LIZ(this, interfaceC74236TBoArr[2])).DM().setValue(C5MM.LIZJ());
        ((InterfaceC145495nN) this.LJLLI.getValue()).r3();
        H8F.LJIL((VideoPublishEditModel) this.LJLJJLL.LIZ(this, interfaceC74236TBoArr[0]));
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public C147525qe(LifecycleOwner lifecycleOwner, C82622Wbi diContainer, C148195rj config) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(config, "config");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = config;
        this.LJLJJLL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJL = UCI.LJI(diContainer, Activity.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, InterfaceC150615vd.class, null);
        this.LJLJLLL = UCI.LJI(diContainer, InterfaceC153275zv.class, null);
        this.LJLL = C269113v.LIZIZ(this, InterfaceC145325n6.class);
        this.LJLLI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 677));
    }
}
