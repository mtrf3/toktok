package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.aweme.property.CreativeToolsEntranceReversalConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5nw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145845nw extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C82631Wbr LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C148105ra LJLJLJ;

    static {
        TBT tbt = new TBT(C145845nw.class, "editAudioEnhanceApi", "getEditAudioEnhanceApi()Lcom/ss/android/ugc/gamora/editor/audioenhance/EditAudioEnhanceApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C145845nw.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C145845nw.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/optimize/EditToolbarApiComponent;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LIZLLL() {
        ((InterfaceC153275zv) this.LJLJL.LIZ(this, LJLJLLL[2])).Ly(this.LJLJI, new AqS168S0100000_2(this, 395));
    }

    @Override // X.WJB
    public final void LJFF() {
        InterfaceC143845ki interfaceC143845ki = (InterfaceC143845ki) this.LJLJJL.LIZ(this, LJLJLLL[0]);
        if (interfaceC143845ki != null) {
            interfaceC143845ki.ft();
        }
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        C148585sM.LIZ.getClass();
        if (((CreativeToolsEntranceReversalConfig) C148585sM.LIZJ.getValue()).getHideNoiseReduceOnEditPage() || C79004UzY.LJJIJL(((VideoPublishEditModel) this.LJLJJLL.LIZ(this, LJLJLLL[1])).canvasVideoData) || !C5WT.LIZ() || CommerceToolsMusicService.LIZIZ(false).U40()) {
            return false;
        }
        return true;
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public C145845nw(LifecycleOwner lifecycleOwner, C82622Wbi diContainer, C148195rj config) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(config, "config");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = UCI.LJII(diContainer, InterfaceC143845ki.class, null);
        C82632Wbs LJI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJJLL = LJI;
        this.LJLJL = UCI.LJI(diContainer, C6MS.class, null);
        this.LJLJLJ = new C148105ra((VideoPublishEditModel) LJI.LIZ(this, LJLJLLL[1]));
    }
}
