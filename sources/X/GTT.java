package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.services.recording.NowsShootActivityArg;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GTT extends AbstractC29891Fh<GTW> implements GTW, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final ActivityC45651qj LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final C5H3 LJLJL;

    static {
        TBT tbt = new TBT(GTT.class, "creativeInfo", "getCreativeInfo()Lcom/ss/android/ugc/aweme/creative/CreativeInfo;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(GTT.class, "nowsShootModel", "getNowsShootModel()Lcom/ss/android/ugc/aweme/creative/model/NowsShootModel;", 0, c65351Pkp), C61845OOz.LIZJ(GTT.class, "enterShootParam", "getEnterShootParam()Lcom/ss/android/ugc/aweme/services/recording/NowsShootActivityArg;", 0, c65351Pkp), C61845OOz.LIZJ(GTT.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0, c65351Pkp)};
    }

    public GTW LJJLIIIIJ() {
        return this;
    }

    private final CreativeInfo LJJLIIIJILLIZJL() {
        return (CreativeInfo) this.LJLJI.LIZ(this, LJLJLJ[0]);
    }

    private final NowsShootActivityArg LJJLIIIJJI() {
        return (NowsShootActivityArg) this.LJLJJL.LIZ(this, LJLJLJ[2]);
    }

    private final NowsShootModel LJJLIIIJJIZ() {
        return (NowsShootModel) this.LJLJJI.LIZ(this, LJLJLJ[1]);
    }

    private final AbstractC42651GoZ LJJLIIIJLLLLLLLZ() {
        return (AbstractC42651GoZ) this.LJLJJLL.LIZ(this, LJLJLJ[3]);
    }

    private final VideoPublishEditModel QY() {
        return (VideoPublishEditModel) this.LJLJL.getValue();
    }

    public final VideoPublishEditModel LJJLI() {
        AVUploadSaveModel LIZIZ;
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.creativeInfo = LJJLIIIJILLIZJL();
        videoPublishEditModel.mOrigin = 1;
        videoPublishEditModel.mShootWay = LJJLIIIJJI().getShootWay();
        videoPublishEditModel.shootEnterMethod = LJJLIIIJJI().getEnterMethod();
        videoPublishEditModel.setPreviewInfo(new EditPreviewInfo(new ArrayList(), 0, 0, 0L, 0L, "", 30, null));
        videoPublishEditModel.mParallelUploadOutputFile = "";
        videoPublishEditModel.mOutputFile = "";
        LIZIZ = C60903NvH.LJIIJJI().getPublishService().LJIJI().LIZIZ(videoPublishEditModel, 0, false, GJP.LJLIL, false);
        if (LIZIZ != null) {
            LIZIZ.setImageModeCoverPath(LJJLIIIJJIZ().backImagePath);
        } else {
            LIZIZ = null;
        }
        videoPublishEditModel.setSaveModel(LIZIZ);
        CreativeFlowData creativeFlowData = videoPublishEditModel.creativeFlowData;
        ShootExtraData shootExtraData = new ShootExtraData(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        shootExtraData.setShootEnterFrom(((NowsShootActivityArg) getDiContainer().LJ(NowsShootActivityArg.class, null)).getEnterFrom());
        creativeFlowData.setShootExtraData(shootExtraData);
        LJJLIIIJJIZ().nowsExtra.isNowPublish = true;
        videoPublishEditModel.creativeModel.nowsShootModel = LJJLIIIJJIZ();
        return videoPublishEditModel;
    }

    public final void LJJLL() {
        if (C7NW.LIZ) {
            C41658GWo.LIZLLL().LJIIIIZZ(LJJLIIIJILLIZJL().getCreationId());
            C60903NvH.LJIIJJI().getPublishService().LJIJI();
            GSL.LJIILJJIL(new C41021G8b(QY(), new GLI("NowsPublishComponent", 1)), new GTU(this));
            return;
        }
        LJJLIIJ();
    }

    @Override // X.GTW
    public void LLJZ() {
        if (!C44172HVg.LJIJ.isLogin()) {
            C44172HVg.LJIJ.LIZ(this.LJLIL, "now_post_page", "click_shoot", null, new GTV(this));
        } else {
            LJJLJLI();
        }
    }

    public final void LJJLIIJ() {
        Bundle LIZ = AY4.LIZ(QY());
        LIZ.putBoolean("should_back_to_cur_page_after_publish", LJJLIIIJJI().getShouldBackToCurPageAfterPublish());
        LIZ.putBoolean("com.ss.android.ugc.aweme.intent.extra.EXTRA_NOW_PUBLISH", true);
        C60903NvH.LJIIJJI().getPublishService().LJIJI().LJIIL(this.LJLIL, LIZ);
    }

    public final void LJJLJ() {
        GJR.LIZ(C60903NvH.LJIIJJI().getPublishService().LJIJI(), this.LJLIL, QY(), 0, false, false, null, LJJLIIIJLLLLLLLZ().mArguments, 60);
    }

    public final void LJJLJLI() {
        C152165y8.LJII(QY(), new AqS157S0100000_7(this, 151));
    }

    @Override // X.GTW
    public void NA() {
        VideoPublishEditModel model = QY();
        o.LJIIIZ(model, "model");
        C60903NvH.LJIIJJI().getPublishService().LJIJI();
        GSL.LJIIJJI(model);
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ GTW getApiComponent() {
        LJJLIIIIJ();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    public GTT(ActivityC45651qj activity, C82622Wbi diContainer) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = activity;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = UCI.LJI(getDiContainer(), CreativeInfo.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), NowsShootModel.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), NowsShootActivityArg.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), AbstractC42651GoZ.class, null);
        this.LJLJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 152));
    }
}
