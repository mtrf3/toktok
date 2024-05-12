package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.AVAweme;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.surveyafterpost.DistributeAuthorSurveyInfoModel;
import com.ss.android.ugc.aweme.shortvideo.subtitle.FeedbackBody;
import com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleApi;
import com.ss.android.ugc.aweme.sticker.data.AutocaptionType;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GVW implements InterfaceC41605GUn<CreateBaseAwemeResponse>, InterfaceC41602GUk {
    public final int LJLIL;
    public Object LJLILLLLZI;
    public final CountDownLatch LJLJI;

    @Override // X.InterfaceC41605GUn
    public final void J6(String str) {
    }

    @Override // X.InterfaceC41605GUn
    public final void U9(int i, boolean z) {
    }

    @Override // X.InterfaceC41605GUn
    public final void w8() {
    }

    public GVW(int i, BaseShortVideoContext args) {
        o.LJIIIZ(args, "args");
        this.LJLIL = i;
        this.LJLILLLLZI = args;
        this.LJLJI = new CountDownLatch(2);
    }

    @Override // X.InterfaceC41605GUn
    public final void Z3(C41759GaB e, PublishModel publishModel) {
        o.LJIIIZ(e, "e");
        if (publishModel != null) {
            this.LJLILLLLZI = publishModel.editModel;
        }
        C41025G8f.LIZ("normal").LIZIZ(1);
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 11) {
                C151345wo.LIZIZ();
            }
        } else {
            Object obj = this.LJLILLLLZI;
            if (!(obj instanceof VideoPublishEditModel) || obj == null) {
                return;
            }
        }
        GVX gvx = GVX.LIZ;
        GVX.LIZJ = false;
        GVX.LJFF = false;
        gvx.LIZJ(false);
        C60903NvH.LJIIJJI().getPublishService().LJIILIIL();
        C41958GdO.LJII();
    }

    @Override // X.InterfaceC41605GUn
    public final void K6(CreateBaseAwemeResponse response, boolean z, PublishModel publishModel) {
        String str;
        BaseShortVideoContext baseShortVideoContext;
        VideoPublishEditModel videoPublishEditModel;
        boolean z2;
        String localSilentSharePath;
        AVUploadSaveModel saveModel;
        VideoPublishEditModel videoPublishEditModel2;
        String str2;
        InteractStickerStruct interactStickerStruct;
        CaptionStruct captionStruct;
        BaseShortVideoContext baseShortVideoContext2;
        int i;
        String imageModeCoverPath;
        List<String> imageModeLocalPaths;
        o.LJIIIZ(response, "response");
        if (publishModel != null) {
            this.LJLILLLLZI = publishModel.editModel;
        }
        if (publishModel != null) {
            str = publishModel.creationId;
        } else {
            str = null;
        }
        response.creationId = str;
        if (publishModel != null) {
            baseShortVideoContext = publishModel.editModel;
        } else {
            baseShortVideoContext = null;
        }
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
        } else {
            videoPublishEditModel = null;
        }
        if (videoPublishEditModel != null) {
            z2 = videoPublishEditModel.isSaveLocalWithWaterMark();
        } else {
            z2 = false;
        }
        response.isSaveLocalWithWatermark = z2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("args is ");
        LIZ.append(this.LJLILLLLZI);
        C36922EeM.LJ(X1D.LIZIZ(LIZ));
        int i2 = this.LJLIL;
        if (i2 == 0 || i2 == 11) {
            Object obj = this.LJLILLLLZI;
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            VideoPublishEditModel videoPublishEditModel3 = (VideoPublishEditModel) obj;
            localSilentSharePath = videoPublishEditModel3.getLocalSilentSharePath();
            if (localSilentSharePath == null) {
                localSilentSharePath = "";
            }
            saveModel = videoPublishEditModel3.getSaveModel();
        } else {
            saveModel = null;
            localSilentSharePath = null;
        }
        if (!TextUtils.isEmpty(localSilentSharePath) || (saveModel != null && (((imageModeCoverPath = saveModel.getImageModeCoverPath()) != null && !ujb.o.LJJJJJL(imageModeCoverPath)) || ((imageModeLocalPaths = saveModel.getImageModeLocalPaths()) != null && !imageModeLocalPaths.isEmpty())))) {
            response.mSaveModel = saveModel;
            C39579Fg7.LJIJJLI(C43075GvP.LJII);
        }
        if (((Boolean) C42537Gmj.LIZ.getValue()).booleanValue()) {
            VEUtils.clearCacheDiskDir(false);
        }
        int i3 = this.LJLIL;
        if (i3 != 0 && i3 != 11) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("ShortVideoPublishCallback", "unknown video type");
        } else {
            Object obj2 = this.LJLILLLLZI;
            if (!(obj2 instanceof VideoPublishEditModel) || (videoPublishEditModel2 = (VideoPublishEditModel) obj2) == null) {
                return;
            }
            InterfaceC41417GNh LJFF = C1DG.LJFF();
            CreativeInfo creativeInfo = videoPublishEditModel2.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "videoContext.creativeInfo");
            AwemeDraft LJ = LJFF.LJ(new C41363GLf(creativeInfo, false));
            if (LJ == null) {
                return;
            }
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C41464GPc(this, videoPublishEditModel2, response, LJ, publishModel, null), 3);
            C44172HVg.LJIJJ.getClass();
            AVAweme lambda$getAVConverter$1 = AVServiceProxyImpl.lambda$getAVConverter$1(response);
            if (lambda$getAVConverter$1 != null) {
                List<InteractStickerStruct> LJI = C164826dS.LJI(videoPublishEditModel2.getMainBusinessContext(), 11, EnumC164816dR.TRACK_PAGE_EDIT);
                CaptionStruct captionStruct2 = lambda$getAVConverter$1.captionStruct;
                if (captionStruct2 != null) {
                    String str3 = response.materialId;
                    if (str3 == null) {
                        str3 = "";
                    }
                    List<Utterance> utterances = captionStruct2.getUtterances();
                    if (utterances == null) {
                        utterances = C61878OQg.INSTANCE;
                    }
                    FeedbackBody feedbackBody = new FeedbackBody(str3, utterances);
                    if (LJI == null || (interactStickerStruct = (InteractStickerStruct) ORZ.LJLLLLLL(0, LJI)) == null || (captionStruct = interactStickerStruct.getCaptionStruct()) == null || (str2 = captionStruct.getTaskId()) == null) {
                        str2 = "";
                    }
                    InterfaceC36395EQd networkService = C60903NvH.LJIIJJI().getNetworkService();
                    String LIZ2 = AVApiImpl.LIZJ().LIZ();
                    o.LJIIIIZZ(LIZ2, "get().getService(AVApi::…s.java).apI_URL_PREFIX_SI");
                    SubtitleApi subtitleApi = (SubtitleApi) networkService.createRetrofit(LIZ2, true, SubtitleApi.class);
                    String str4 = response.materialId;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = lambda$getAVConverter$1.aid;
                    o.LJIIIIZZ(str5, "aweme.aid");
                    subtitleApi.feedback(str4, str5, str2, feedbackBody);
                    if (captionStruct2.getUtterances() != null) {
                        String LJIL = C5YW.LIZIZ().LJIL(HB7.LIZ, "");
                        new File(LJIL).mkdirs();
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(LJIL);
                        LIZ3.append(System.currentTimeMillis());
                        String LIZIZ = X1D.LIZIZ(LIZ3);
                        C39579Fg7.LJJI(LIZIZ, C75792yF.LIZJ(captionStruct2));
                        Context LIZ4 = C5L7.LIZ();
                        UrlModel urlModel = new UrlModel();
                        urlModel.setUrlList(C47261Igj.LJJIJIL(LIZIZ));
                        captionStruct2.setAutoCaptions(C47261Igj.LJJIJIL(new AutocaptionType(IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getCurrentI18nItem(LIZ4).LIZ(), urlModel)));
                    }
                }
            }
            C151345wo.LIZIZ();
        }
        Object obj3 = this.LJLILLLLZI;
        if (!(obj3 instanceof BaseShortVideoContext) || (baseShortVideoContext2 = (BaseShortVideoContext) obj3) == null) {
            return;
        }
        C268713r.LIZ();
        C41958GdO.LJIILJJIL(baseShortVideoContext2.getDraftPrimaryKey());
        GVX gvx = GVX.LIZ;
        GVX.LJFF = false;
        GVX.LIZJ = false;
        gvx.LIZJ(false);
        C41025G8f.LIZ("normal").LIZIZ(1);
        Aweme aweme = ((CreateAwemeResponse) response).aweme;
        o.LJIIIIZZ(aweme, "requireNotNull(response …reateAwemeResponse).aweme");
        DistributeAuthorSurveyInfoModel LIZ5 = GHS.LIZ();
        if (LIZ5 != null && (i = LIZ5.frequencyControlVersion) > GVY.LIZIZ().getInt("key_survey_config_version", -1)) {
            GVY.LIZIZ().clear();
            GVY.LIZIZ().storeInt("key_survey_config_version", i);
        }
        if (GHS.LIZ() == null) {
            return;
        }
        String LJ2 = GVY.LJ("key_latest_published_aweme_id");
        String LJ3 = GVY.LJ("key_latest_publish_time");
        String LJ4 = GVY.LJ("key_force_update_publish_time");
        long j = GVY.LIZIZ().getLong(LJ3, 0L);
        int LIZ6 = C00F.LIZ(31744, 0, "studio_distribute_author_survey", true);
        if (LIZ6 == 1 || LIZ6 == 2 || LIZ6 == 3 || LIZ6 == 4) {
            if (System.currentTimeMillis() - j >= r10.frequencyControlDays * 24 * 60 * 60 * 1000 || GVY.LIZIZ().getBoolean(LJ4, false)) {
                GVY.LIZIZ().storeLong(LJ3, System.currentTimeMillis());
                GVY.LIZIZ().storeBoolean(LJ4, false);
            }
            GVY.LIZIZ().storeString(LJ2, aweme.getAid());
            return;
        }
        GVY.LIZIZ().clear();
    }
}
