package X;

import Y.ARunnableS38S0100000_2;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.publish.publishcheck.CheckManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.GKo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41346GKo extends AbstractC29891Fh<InterfaceC159266Mw> implements InterfaceC159266Mw, InterfaceC135635Tz {
    public static final C41351GKt LJLLILLLL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLJ;
    public final C82622Wbi LJLIL;
    public final InterfaceC159266Mw LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public boolean LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final C5H3 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final InterfaceC115514g7 LJLLI;

    static {
        TBT tbt = new TBT(C41346GKo.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLJ = new InterfaceC74236TBo[]{tbt, new TBT(C41346GKo.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new TBT(C41346GKo.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new TBT(C41346GKo.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0), new TBT(C41346GKo.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new TBT(C41346GKo.class, "editAudioCopyrightDetectApi", "getEditAudioCopyrightDetectApi()Lcom/ss/android/ugc/gamora/editor/audio/copyrightdetect/EditAudioCopyrightDetectApi;", 0), new TBT(C41346GKo.class, "lighteningBottomApiComponent", "getLighteningBottomApiComponent()Lcom/ss/android/ugc/gamora/editor/lightening/bottom/LighteningBottomApiComponent;", 0)};
        LJLLILLLL = new C41351GKt();
    }

    private final void LJLJJL() {
        LJLJLJ(LJJLIIIJJIZ());
        G5C LJIIIIZZ = C78934UyQ.LJLIL.LJIIIIZZ();
        AbstractC42651GoZ LJJLJ = LJJLJ();
        VideoPublishEditModel LJJLIIIJJIZ = LJJLIIIJJIZ();
        ActivityC45651qj activity = getActivity();
        C6E7 LJJLIIJ = LJJLIIJ();
        AbstractC42152GgW<?> abstractC42152GgW = null;
        if (LJJLIIJ != null) {
            abstractC42152GgW = LJJLIIJ.GE(null, false);
        }
        LJIIIIZZ.LIZ(new G65(LJJLJ, this, LJJLIIIJJIZ, activity, abstractC42152GgW, LJJLIIIJJI().Cn(), LJJLIIIJJI().YQ(), new AqS157S0100000_7(this, 347)));
    }

    public final void LJJLJLI() {
        LJJZZI(false);
        Intent intent = new Intent();
        intent.putExtra("new_uri", LJJLIIIJJIZ().creativeModel.changeAvatarModel.avatarStruct.getNewAvatarUri());
        intent.putExtra("new_url", LJJLIIIJJIZ().creativeModel.changeAvatarModel.newAvatarUrl);
        LJJLJ().LLJLLL(9, intent);
        LJJLJ().LLJJI();
    }

    public final void LJLLILLLL() {
        C78857UxB.LJJIIZ().LIZIZ(1);
        LJJZZI(true);
        LJLZ();
    }

    private final InterfaceC143385jy LJJLIIIIJ() {
        return (InterfaceC143385jy) this.LJLL.LIZ(this, LJLLJ[5]);
    }

    private final InterfaceC143655kP LJJLIIIJILLIZJL() {
        return (InterfaceC143655kP) this.LJLJLJ.LIZ(this, LJLLJ[4]);
    }

    private final InterfaceC149245tQ LJJLIIIJJI() {
        return (InterfaceC149245tQ) this.LJLLI.LIZ(this, LJLLJ[6]);
    }

    private final InterfaceC145495nN LJJLIIIJLLLLLLLZ() {
        return (InterfaceC145495nN) this.LJLJJLL.LIZ(this, LJLLJ[3]);
    }

    private final C6E7 LJJLIIJ() {
        return (C6E7) this.LJLJLLL.getValue();
    }

    private final AbstractC42651GoZ LJJLJ() {
        return (AbstractC42651GoZ) this.LJLJI.LIZ(this, LJLLJ[0]);
    }

    private final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LJLJJI.LIZ(this, LJLLJ[1]);
    }

    public final VideoPublishEditModel LJJLIIIJJIZ() {
        return (VideoPublishEditModel) this.LJLJJL.LIZ(this, LJLLJ[2]);
    }

    private final void LJLIIL() {
        AbstractC42152GgW<?> abstractC42152GgW;
        if (!H7R.LJJJJZI(LJJLIIIJJIZ()) && !C151965xo.LIZLLL(LJJLIIIJJIZ())) {
            return;
        }
        C42149GgT LIZIZ = CheckManager.LIZIZ(getActivity(), "EditPageLightningPublishChecker");
        LIZIZ.LIZ(new G64(LJJLJ()));
        LIZIZ.LIZ(new G8K(getActivity(), LJJLIIIJJIZ()));
        C6E7 LJJLIIJ = LJJLIIJ();
        if (LJJLIIJ != null) {
            abstractC42152GgW = LJJLIIJ.GE(new AqS157S0100000_7(this, 345), true);
        } else {
            abstractC42152GgW = null;
        }
        LIZIZ.LIZ(abstractC42152GgW);
        LIZIZ.LIZJ(new AqS157S0100000_7(this, 346));
        LIZIZ.LJI();
    }

    private final boolean LJLJJLL() {
        if (LJJLIIIJJIZ().creativeModel.quickPostOnEditPageModel.LIZ && C44384HbQ.LJJIJIL(LJJLIIIJJIZ())) {
            return true;
        }
        return false;
    }

    public final void LJJLI() {
        boolean z;
        if (LJJLIIIJJIZ().isPrivate() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (C78555UsJ.LJJJ(getActivity(), LJJLIIIJJIZ())) {
            LJJZZIII();
            return;
        }
        if (z || !G8L.LIZ() || !a.LJFF().LJJII(getActivity())) {
            if (!C78555UsJ.LJJIZ(getActivity(), LJJLIIIJJIZ())) {
                LJJZZIII();
                return;
            }
        }
        this.LJLJL = false;
        a.LJFF().LJJIFFI(getActivity(), getActivity().getString(R.string.tvj), "video_edit_page", new AqS157S0100000_7(this, 343), C41352GKu.LJLIL);
    }

    public final void LJJZZIII() {
        C6E7 LJJLIIJ;
        if (LJJLIIIJJIZ().isPrivate == -1 && (LJJLIIJ = LJJLIIJ()) != null) {
            this.LJLJL = false;
            LJJLIIIJJIZ().creativeModel.transientPostPageModel.LJJIIJZLJL = "click_post";
            LJJLIIJ.wg(true, new C42907Gsh(this));
        } else {
            this.LJLJL = true;
            LJZI();
        }
    }

    public final void LJLZ() {
        Window window;
        View decorView;
        if (!C78555UsJ.LJJJ(getActivity(), LJJLIIIJJIZ())) {
            return;
        }
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getApplicationService().getClass();
        Activity findActivityInstance = C60903NvH.LJIIJJI().LJJIII().findActivityInstance(SplashActivity.class);
        if (findActivityInstance != null && (window = findActivityInstance.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.post(new ARunnableS38S0100000_2(findActivityInstance, 105));
        }
        a.LJFF().LJJIJIL(getActivity());
    }

    public final void LJZI() {
        boolean z;
        AbstractC41354GKw c41353GKv;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        InterfaceC142545ic interfaceC142545ic;
        if (C63081OpJ.LJJI(LJJLIIIJJIZ())) {
            InterfaceC143655kP LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
            if ((LJJLIIIJILLIZJL instanceof InterfaceC142545ic) && (interfaceC142545ic = (InterfaceC142545ic) LJJLIIIJILLIZJL) != null) {
                interfaceC142545ic.S60();
            }
        }
        VideoPublishEditModel LJJLIIIJJIZ = LJJLIIIJJIZ();
        if (LJLJJLL() && !H7R.LJJJJL(LJJLIIIJJIZ())) {
            z = true;
        } else {
            z = false;
        }
        if (!C151975xp.LIZ(LJJLIIIJJIZ)) {
            LJJLIIIJJIZ.isPrivate = 0;
            LJJLIIIJJIZ.commentSetting = 0;
        }
        LJJLIIIJJIZ.setTitle(null);
        LJJLIIIJJIZ.setStructList(null);
        LJJLIIIJJIZ.challenges = null;
        LJJLIIIJJIZ.resetCompileProbeResult();
        LJJLIIIJJIZ.resetStrategiesResult();
        LJJLIIIJJIZ.allowAutoCaptionSetting = 0;
        LJJLIIIJJIZ.autoCaptionLang = null;
        LJJLIIIJJIZ.allowDownloadSetting = 0;
        LJJLIIIJJIZ.microAppId = null;
        LJJLIIIJJIZ.microAppModel = null;
        LJJLIIIJJIZ.setChain(null);
        LJJLIIIJJIZ.setDisableDeleteChain(false);
        LJJLIIIJJIZ.geofencingSetting = null;
        LJJLIIIJJIZ.excludeUserList = null;
        LJJLIIIJJIZ.allowRecommend = 0;
        LJJLIIIJJIZ.setDraftMusicIllegal(false);
        LJJLIIIJJIZ.playlist_id = null;
        LJJLIIIJJIZ.playlist_name = null;
        AudioRecorderParam audioRecorderParam = LJJLIIIJJIZ.veAudioRecorderParam;
        if (audioRecorderParam != null) {
            audioRecorderParam.setAudioRecordIndex(-1);
        }
        PostPageModel postPageModel = LJJLIIIJJIZ.creativeModel.postPageModel;
        CaptionModel captionModel = new CaptionModel();
        postPageModel.getClass();
        postPageModel.captionModel = captionModel;
        LJJLIIIJJIZ.creativeModel.postPageModel.markupCaption = "";
        if (!z) {
            LJJLIIIJJIZ.commerceData = null;
            LJJLIIIJJIZ.mVideoCoverStartTm = 0.0f;
            CoverPublishModel coverPublishModel = new CoverPublishModel();
            coverPublishModel.setNeedExpandCompiledSize(LJJLIIIJJIZ.getCoverPublishModel().getNeedExpandCompiledSize());
            LJJLIIIJJIZ.setCoverPublishModel(coverPublishModel);
        }
        String str = LJJLIIIJJIZ().mStickerID;
        if ((str == null || str.length() == 0) && C00F.LIZ(31744, 0, "use_back_camera_experiment", true) == 2) {
            ((Keva) C40978G6k.LIZ.getValue()).storeInt("camera_publish_facing", C60903NvH.LJIIJJI().LJJIL().getCameraPosition(0));
        }
        if (!LJLJJLL() && H7R.LJJJJL(LJJLIIIJJIZ()) && (imageAlbumData = LJJLIIIJJIZ().getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null && imageList.size() > 1) {
            c41353GKv = new C41347GKp(getActivity(), LJJLIIIJJIZ(), LJJLIIIJLLLLLLLZ().y3(), new AqS157S0100000_7(this, 348));
        } else {
            c41353GKv = new C41353GKv(LJJLIIIJJIZ(), new AqS189S0100000_7(this, 19));
        }
        C41384GMa.LJII(c41353GKv);
    }

    @Override // X.InterfaceC159266Mw
    public void LLJZ() {
        C41859Gbn LIZIZ = C1I0.LIZIZ();
        String creationId = LJJLIIIJJIZ().getCreationId();
        o.LJIIIIZZ(creationId, "model.creationId");
        LIZIZ.getClass();
        C42970Gti.LIZJ("", creationId);
        if (LJLJJLL()) {
            LJLJJL();
            return;
        }
        if (C60903NvH.LJIIJJI().getPublishService().LJJII(true)) {
            LJLIIL();
            return;
        }
        if ((!H7R.LJJJJZI(LJJLIIIJJIZ()) && !C151965xo.LIZLLL(LJJLIIIJJIZ())) || this.LJLJL) {
            return;
        }
        this.LJLJL = true;
        if (!C1B8.LIZJ()) {
            LJJLL(new AqS157S0100000_7(this, 344));
        } else {
            LJJLI();
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC159266Mw getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C41346GKo(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = UCI.LJI(getDiContainer(), AbstractC42651GoZ.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), ActivityC45651qj.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), InterfaceC145495nN.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJLLL = C269113v.LIZIZ(this, C6E7.class);
        this.LJLL = UCI.LJII(getDiContainer(), InterfaceC143385jy.class, null);
        this.LJLLI = UCI.LJI(getDiContainer(), InterfaceC149245tQ.class, null);
    }

    private final void LJJLL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C60903NvH.LJIIJJI().getPublishService().LJI();
        GUT.LIZ(getActivity(), "lightning_open_login_page");
        C60903NvH.LJIIJJI().getAccountService().LIZ(getActivity(), "video_edit_page", "click_shoot", null, new C41348GKq(this, interfaceC65784Pro));
    }

    private final void LJJZZI(boolean z) {
        Bundle LIZ;
        if (LJLJJLL()) {
            LJLLL(LJJLIIIJJIZ());
            LIZ = C41045G8z.LIZIZ(LJJLIIIJJIZ());
        } else {
            LIZ = C41045G8z.LIZ(LJJLIIIJJIZ(), false);
        }
        if (!z) {
            LIZ.putBoolean("directly_publish_only", true);
        }
        AVExternalServiceImpl.LIZ().publishService().startPublish(getActivity(), LIZ);
        GJR.LIZ(C60903NvH.LJIIJJI().getPublishService().LJIJI(), getActivity(), LJJLIIIJJIZ(), LJJLIIIJLLLLLLLZ().y3(), H7R.LJJLIIIJILLIZJL(LJJLIIIJJIZ()), true, null, LJJLJ().mArguments, 32);
    }

    private final void LJLJLJ(VideoPublishEditModel videoPublishEditModel) {
        videoPublishEditModel.heading = null;
        videoPublishEditModel.title = null;
        videoPublishEditModel.setStructList(null);
        PostPageModel postPageModel = videoPublishEditModel.creativeModel.postPageModel;
        CaptionModel captionModel = new CaptionModel(null, null, null, false, 15, null);
        postPageModel.getClass();
        postPageModel.captionModel = captionModel;
        videoPublishEditModel.creativeModel.postPageModel.markupCaption = "";
    }

    private final void LJLLL(VideoPublishEditModel videoPublishEditModel) {
        videoPublishEditModel.reactDuetSetting = 1;
        videoPublishEditModel.stitchSetting = 1;
        videoPublishEditModel.creativeModel.privacySettingModel.allowCreateSticker = 2;
    }
}
