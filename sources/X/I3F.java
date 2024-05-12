package X;

import android.app.Activity;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.detail.panel.DuetModeCameraServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I3F implements WSH, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLZ;
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final C82622Wbi LJLJJL;
    public final C82631Wbr LJLJJLL;
    public final C82631Wbr LJLJL;
    public final C82631Wbr LJLJLJ;
    public final C82631Wbr LJLJLLL;
    public final C82631Wbr LJLL;
    public final C82631Wbr LJLLI;
    public final C82631Wbr LJLLILLLL;
    public final C82631Wbr LJLLJ;
    public ShortVideoContextViewModel LJLLL;
    public C45850Hz4 LJLLLL;
    public final C62822Ol8 LJLLLLLL;

    @Override // X.WSH
    public final boolean enable() {
        return true;
    }

    static {
        TBT tbt = new TBT(I3F.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(I3F.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I3F.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I3F.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I3F.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I3F.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I3F.class, "recordModeApiComponent", "getRecordModeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I3F.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp)};
    }

    public final InterfaceC82086WJm LIZ() {
        return (InterfaceC82086WJm) this.LJLJJLL.LIZ(this, LJLZ[0]);
    }

    @Override // X.WSH
    public final WT3 provideScene() {
        return (WT3) this.LJLLLLLL.getValue();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJL;
    }

    public I3F(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = "Duet";
        this.LJLILLLLZI = "record_mode_duet";
        this.LJLJI = "duet";
        this.LJLJJI = false;
        this.LJLJJL = diContainer;
        this.LJLJJLL = UCI.LJII(diContainer, InterfaceC82086WJm.class, null);
        this.LJLJL = UCI.LJII(diContainer, InterfaceC45999I3n.class, null);
        this.LJLJLJ = UCI.LJII(diContainer, I3K.class, null);
        this.LJLJLLL = UCI.LJII(diContainer, InterfaceC45979I2t.class, null);
        this.LJLL = UCI.LJII(diContainer, WRP.class, null);
        this.LJLLI = UCI.LJII(diContainer, I37.class, null);
        this.LJLLILLLL = UCI.LJII(diContainer, HYQ.class, null);
        this.LJLLJ = UCI.LJII(diContainer, I0N.class, null);
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 702));
    }

    @Override // X.WSH
    public final WSF createBottomTabItem(C45850Hz4 c45850Hz4) {
        return new WSF(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, new I3E(this, c45850Hz4));
    }

    @Override // X.WSH
    public final void initialize(C45850Hz4 c45850Hz4) {
        this.LJLLLL = c45850Hz4;
        this.LJLLL = (ShortVideoContextViewModel) ((ViewModelProvider) this.LJLJJL.LJ(ViewModelProvider.class, null)).get(ShortVideoContextViewModel.class);
        DuetModeCameraServiceImpl.LJ().LIZIZ(new I3H(this));
    }

    public final void LIZIZ(Activity activity, Aweme aweme, String str) {
        String str2;
        CameraComponentModel zZ;
        DuetModeCameraServiceImpl.LJ().LIZ(new I3G(this));
        ShareDependService.LIZ.getClass();
        ShareDependService LIZ = C44498HdG.LIZ();
        InterfaceC82086WJm LIZ2 = LIZ();
        if (LIZ2 == null || (zZ = LIZ2.zZ()) == null || (str2 = zZ.creationId) == null) {
            str2 = "";
        }
        LIZ.LJJIJIL(str2, aweme, activity, "from_duet_mode", E2C.LIZJ("duet_mode_type", str), false, false);
        long currentTimeMillis = System.currentTimeMillis();
        C41015G7v.LIZIZ = currentTimeMillis;
        C41015G7v.LIZ(currentTimeMillis, "duet_mode_discover", "shoot");
    }
}
