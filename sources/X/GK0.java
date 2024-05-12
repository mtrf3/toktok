package X;

import com.ss.android.ugc.aweme.publish.publishcheck.CheckManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes8.dex */
public final class GK0 extends AbstractC29891Fh<InterfaceC159276Mx> implements InterfaceC159276Mx, InterfaceC135635Tz {
    public static final GK2 LJLJL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final C82622Wbi LJLIL;
    public final InterfaceC159276Mx LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public boolean LJLJJLL;

    static {
        TBT tbt = new TBT(GK0.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt, new TBT(GK0.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0), new TBT(GK0.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};
        LJLJL = new GK2();
    }

    private final void LJJLIIJ(String str) {
    }

    private final VideoPublishEditModel LJJLIIIIJ() {
        return (VideoPublishEditModel) this.LJLJJL.LIZ(this, LJLJLJ[2]);
    }

    private final void LJJLIIIJLLLLLLLZ() {
        C42149GgT LIZIZ = CheckManager.LIZIZ(this, "quick publish checker");
        LIZIZ.LIZ(new G64(LJJLIIIJILLIZJL()));
        LIZIZ.LIZ(new G8K(getActivity(), LJJLIIIIJ()));
        LIZIZ.LIZJ(new AqS157S0100000_7(this, 353));
        LIZIZ.LJI();
    }

    private final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LJLJI.LIZ(this, LJLJLJ[0]);
    }

    public final AbstractC42651GoZ LJJLIIIJILLIZJL() {
        return (AbstractC42651GoZ) this.LJLJJI.LIZ(this, LJLJLJ[1]);
    }

    public final void LJJLI() {
        boolean z;
        if (LJJLIIIIJ().isPrivate() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (C78555UsJ.LJJJ(getActivity(), LJJLIIIIJ())) {
            LJJLIIIJJIZ();
            return;
        }
        if (z || !G8L.LIZ() || !a.LJFF().LJJII(getActivity())) {
            if (!C78555UsJ.LJJIZ(getActivity(), LJJLIIIIJ())) {
                LJJLIIIJJIZ();
                return;
            }
        }
        this.LJLJJLL = false;
        a.LJFF().LJJIFFI(getActivity(), getActivity().getString(R.string.tvj), "video_edit_page", new AqS157S0100000_7(this, 349), GK3.LJLIL);
    }

    public final void LJJLIIIJJIZ() {
        LJJLIIIIJ().reactDuetSetting = 0;
        LJJLIIIIJ().stitchSetting = 0;
        GJR.LIZ(C60903NvH.LJIIJJI().getPublishService().LJIJI(), getActivity(), LJJLIIIIJ(), 0, false, false, null, LJJLIIIJILLIZJL().mArguments, 60);
        C41384GMa.LJII(new GK4(getActivity(), LJJLIIIIJ(), new AqS157S0100000_7(this, 350), new AqS157S0100000_7(this, 351)));
    }

    @Override // X.InterfaceC159276Mx
    public void Wo0() {
        if (C60903NvH.LJIIJJI().getPublishService().LJJII(false)) {
            LJJLIIIJLLLLLLLZ();
            return;
        }
        if (this.LJLJJLL) {
            return;
        }
        this.LJLJJLL = true;
        if (!C1B8.LIZJ()) {
            LJJLIIIJJI(new AqS157S0100000_7(this, 352));
        } else {
            LJJLI();
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC159276Mx getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public GK0(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = UCI.LJI(getDiContainer(), ActivityC45651qj.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), AbstractC42651GoZ.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
    }

    private final void LJJLIIIJJI(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C60903NvH.LJIIJJI().getPublishService().LJI();
        GUT.LIZ(getActivity(), "lightning_open_login_page");
        C60903NvH.LJIIJJI().getAccountService().LIZ(getActivity(), "video_edit_page", "click_shoot", null, new GK1(this, interfaceC65784Pro));
    }
}
