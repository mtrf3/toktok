package com.ss.android.ugc.aweme.services;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C00F;
import X.C05L;
import X.C10I;
import X.C10K;
import X.C141375gj;
import X.C142955jH;
import X.C142975jJ;
import X.C142985jK;
import X.C145995oB;
import X.C16880lQ;
import X.C170666ms;
import X.C173636rf;
import X.C173786ru;
import X.C1DG;
import X.C1I0;
import X.C235779Nd;
import X.C268813s;
import X.C32I;
import X.C33768DNc;
import X.C40976G6i;
import X.C40977G6j;
import X.C40981G6n;
import X.C40985G6r;
import X.C41359GLb;
import X.C41363GLf;
import X.C41474GPm;
import X.C41555GSp;
import X.C41604GUm;
import X.C41620GVc;
import X.C41627GVj;
import X.C41634GVq;
import X.C41637GVt;
import X.C41643GVz;
import X.C41658GWo;
import X.C41732GZk;
import X.C41743GZv;
import X.C41750Ga2;
import X.C41759GaB;
import X.C41792Gai;
import X.C41802Gas;
import X.C41859Gbn;
import X.C41958GdO;
import X.C41981Gdl;
import X.C42041Gej;
import X.C42524GmW;
import X.C42970Gti;
import X.C43147GwZ;
import X.C43542H7a;
import X.C44172HVg;
import X.C44423Hc3;
import X.C44432HcC;
import X.C44526Hdi;
import X.C57042Ls;
import X.C5DA;
import X.C5DB;
import X.C5S1;
import X.C60903NvH;
import X.C6EZ;
import X.C6QQ;
import X.C73030SlO;
import X.C73454SsE;
import X.C73969T1h;
import X.C77339UWx;
import X.C78605Ut7;
import X.C78685UuP;
import X.C78963Uyt;
import X.C78983UzD;
import X.C79004UzY;
import X.C7MY;
import X.C8IC;
import X.C8R4;
import X.FKM;
import X.FMX;
import X.G6X;
import X.G8X;
import X.G9Z;
import X.GA2;
import X.GB7;
import X.GHN;
import X.GHP;
import X.GHQ;
import X.GHS;
import X.GSX;
import X.GTM;
import X.GTO;
import X.GUH;
import X.GUI;
import X.GUL;
import X.GUO;
import X.GUQ;
import X.GUT;
import X.GUU;
import X.GUX;
import X.GV5;
import X.GVA;
import X.GVB;
import X.GVC;
import X.GVD;
import X.GVE;
import X.GVF;
import X.GVH;
import X.GVM;
import X.GVN;
import X.GVP;
import X.GVX;
import X.GVY;
import X.GWG;
import X.GWJ;
import X.H49;
import X.H78;
import X.H7B;
import X.H7R;
import X.HB4;
import X.HI3;
import X.HI5;
import X.I9T;
import X.InterfaceC224558rb;
import X.InterfaceC36571c5;
import X.InterfaceC41605GUn;
import X.InterfaceC41630GVm;
import X.InterfaceC42527GmZ;
import X.InterfaceC55643Lsd;
import X.InterfaceC64592gB;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.OSZ;
import X.T16;
import X.WM7;
import X.X1D;
import Y.ACallableS42S0000000_7;
import Y.AgS124S0100000_7;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.PaidContentVideoModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editpost.BizExpiration;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.internal.MainActivityCallback;
import com.ss.android.ugc.aweme.services.external.IGetPublishDraftCallback;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.PublishFailMsg;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.surveyafterpost.DistributeAuthorSurveyInfoModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.ParallelPublishDialogFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishDialogFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.SaveLocalHelper;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS37S0100100_7;
import kotlin.jvm.internal.AqS45S1000000_7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AVPublishServiceImpl implements IAVPublishService {
    public static final Companion Companion = new Companion();
    public static AVPublishServiceImpl sInstance;
    public boolean isRecoverNowPublish;
    public boolean isRecoverPhotoModePublish;
    public Dialog mShoutOutsUploadRecoverDialog;
    public GVB mUploadRecoverPopView;

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AVPublishServiceImpl getInstance() {
            if (AVPublishServiceImpl.sInstance == null) {
                if (NewPublishServiceLock.INSTANCE.isEnable()) {
                    synchronized (AVPublishServiceImpl.class) {
                        if (AVPublishServiceImpl.sInstance == null) {
                            AVPublishServiceImpl.sInstance = new AVPublishServiceImpl();
                        }
                    }
                } else {
                    synchronized (C41981Gdl.class) {
                        if (AVPublishServiceImpl.sInstance == null) {
                            AVPublishServiceImpl.sInstance = new AVPublishServiceImpl();
                        }
                    }
                }
            }
            return AVPublishServiceImpl.sInstance;
        }

        public Companion() {
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void addChallenge(Challenge challenge) {
        o.LJIIIZ(challenge, "challenge");
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean enableEffectWatermark() {
        return e1.LIZ(31744, "studio_viral_effect_watermark", true, false);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isEnableChangeShareToCell() {
        return e1.LIZ(31744, "studio_enable_share_to_cell", true, false);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isMainCameraPublishingOrStoryCameraPublishing() {
        return GUH.LJIJI(null);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isParallelPublishContinue() {
        return C41637GVt.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isPublishing() {
        return GUH.LJIJI(null);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void recoverNowsPublish(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setKitManageRegister(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean turnOffSaveLocalOptionByDefault() {
        return e1.LIZ(31744, "studio_save_local_turn_off", true, false);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean canAutoRetry() {
        return ((Boolean) C41792Gai.LIZIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean enableCacheOptimize() {
        if (C00F.LIZ(31744, 0, "enable_cache_optimize", true) <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean enableSaveLocalInLegacyScenario() {
        Integer LIZ = C235779Nd.LIZ.LIZIZ().LIZ();
        o.LJIIIIZZ(LIZ, "inst().autoSendType.cache");
        if (LIZ.intValue() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public ArrayList<Aweme> getAllPublishAwemes() {
        C42524GmW.LIZLLL.clear();
        C42524GmW.LIZJ.clear();
        List<PublishModel> LJIIJ = GUH.LJIIJ();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LJIIJ).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            PublishModel publishModel = (PublishModel) next;
            if (publishModel != null && !publishModel.isStoryPublish) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            PublishModel publishModel2 = (PublishModel) it2.next();
            if (publishModel2 != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PublishPreviewManager -> getAllPublishAwemes -> it.isPhotoMode() = ");
                LIZ.append(C78963Uyt.LJJIIZI(publishModel2));
                H7B.LIZ(X1D.LIZIZ(LIZ));
                if (C78963Uyt.LJJIIZI(publishModel2)) {
                    C42524GmW.LIZLLL.add(C78963Uyt.LJJJIL(publishModel2));
                    C42524GmW.LIZJ.add(C78963Uyt.LJJJIL(publishModel2).LJLJI);
                } else {
                    C42524GmW.LIZLLL.add(C78963Uyt.LJJJJ(publishModel2));
                    C42524GmW.LIZJ.add(C78963Uyt.LJJJJ(publishModel2).LJLJI);
                }
            }
        }
        return C42524GmW.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public String getAwemeType() {
        Integer num;
        GVN gvn = G9Z.LIZ;
        if (gvn != null && (num = gvn.LIZLLL) != null) {
            return num.toString();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public String getCurrentSecUid() {
        return C44172HVg.LJIJ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public String getCurrentUserId() {
        return C44172HVg.LJIJ.getCurrentUserID();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public BizExpiration[] getEditPostBizExPiration() {
        return (BizExpiration[]) GA2.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public String getPublisherEventAsJSON() {
        String string = ((Keva) C42970Gti.LIZ.getValue()).getString("db_event", "Unknown");
        o.LJIIIIZZ(string, "repo.getString(KEY_PUBLISHER_EVENT, \"Unknown\")");
        return string;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public C8R4 getSurveyAfterPostService() {
        return new C8R4() { // from class: com.ss.android.ugc.aweme.services.AVPublishServiceImpl$getSurveyAfterPostService$1
            @Override // X.C8R4
            public boolean isCurrentTheLastTimeSurveyBannerShown() {
                DistributeAuthorSurveyInfoModel LIZ = GHS.LIZ();
                if (LIZ == null) {
                    return false;
                }
                GVY.LIZIZ().getLong(GVY.LJ("key_survey_closed_timestamp"), 0L);
                System.currentTimeMillis();
                if (GVY.LIZIZ().getInt(GVY.LJ("key_survey_closed_times"), 0) != LIZ.surveyDistributionMaxShowTime - 1) {
                    return false;
                }
                return true;
            }

            @Override // X.C8R4
            public void onSurveyClosedManually() {
                long currentTimeMillis = System.currentTimeMillis();
                GVY.LIZIZ().storeLong(GVY.LJ("key_survey_closed_timestamp"), currentTimeMillis);
                String LJ = GVY.LJ("key_survey_closed_times");
                GVY.LIZIZ().storeInt(LJ, GVY.LIZIZ().getInt(LJ, 0) + 1);
            }

            @Override // X.C8R4
            public String getLatestPublishedAwemeId() {
                return GVY.LIZ();
            }

            @Override // X.C8R4
            public DistributeAuthorSurveyInfoModel getSurveyConfiguration() {
                return GHS.LIZ();
            }

            @Override // X.C8R4
            public boolean isPositiveQuestionSet() {
                return GHP.LIZ();
            }

            @Override // X.C8R4
            public boolean shouldShowAuthorSurveyInProfile() {
                DistributeAuthorSurveyInfoModel LIZ = GHS.LIZ();
                if (LIZ == null) {
                    return false;
                }
                long currentTimeMillis = System.currentTimeMillis() - GVY.LIZIZ().getLong(GVY.LJ("key_latest_publish_time"), -1L);
                C57042Ls c57042Ls = new C57042Ls("ProfileCondition", AVPublishServiceImpl$getSurveyAfterPostService$1$shouldShowAuthorSurveyInProfile$1.INSTANCE);
                c57042Ls.LIZ("experiment", AVPublishServiceImpl$getSurveyAfterPostService$1$shouldShowAuthorSurveyInProfile$2.INSTANCE);
                c57042Ls.LIZ("intervalStart", new AqS37S0100100_7(currentTimeMillis, LIZ, 0));
                c57042Ls.LIZ("intervalEnd", new AqS37S0100100_7(currentTimeMillis, LIZ, 1));
                c57042Ls.LIZ("notHitCloseFrequency", AVPublishServiceImpl$getSurveyAfterPostService$1$shouldShowAuthorSurveyInProfile$5.INSTANCE);
                c57042Ls.LIZ("notSubmit", AVPublishServiceImpl$getSurveyAfterPostService$1$shouldShowAuthorSurveyInProfile$6.INSTANCE);
                c57042Ls.LIZ("notClosedBefore", AVPublishServiceImpl$getSurveyAfterPostService$1$shouldShowAuthorSurveyInProfile$7.INSTANCE);
                return C57042Ls.LIZIZ(c57042Ls);
            }

            @Override // X.C8R4
            public void onSurveyBannerClosedManually(String groupId) {
                o.LJIIIZ(groupId, "groupId");
                long currentTimeMillis = System.currentTimeMillis();
                GVY.LIZIZ().storeLong(GVY.LIZLLL(GVY.LJ("key_survey_banner_closed_timestamp"), groupId), currentTimeMillis);
                if (groupId.length() > 0) {
                    GVY.LIZIZ().storeBoolean(GVY.LJ(GVY.LIZLLL("key_video_player_banner_banned", groupId)), true);
                    GVY.LIZIZ().storeBoolean(GVY.LJ("key_force_update_publish_time"), true);
                }
            }

            @Override // X.C8R4
            public void onSurveySubmit(String groupId) {
                o.LJIIIZ(groupId, "groupId");
                long currentTimeMillis = System.currentTimeMillis();
                GVY.LIZIZ().storeLong(GVY.LJ("key_survey_submit_timestamp"), currentTimeMillis);
                if (groupId.length() > 0) {
                    String LJ = GVY.LJ("key_survey_closed_times");
                    GVY.LIZIZ().storeInt(LJ, GVY.LIZIZ().getInt(LJ, 0) + 1);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    GVY.LIZIZ().storeLong(GVY.LJ("key_survey_closed_timestamp"), currentTimeMillis2);
                }
            }

            @Override // X.C8R4
            public boolean shouldShowAuthorSurveyInVideoPlayer(String awemeId) {
                o.LJIIIZ(awemeId, "awemeId");
                DistributeAuthorSurveyInfoModel LIZ = GHS.LIZ();
                if (LIZ == null) {
                    return false;
                }
                long currentTimeMillis = System.currentTimeMillis() - GVY.LIZIZ().getLong(GVY.LJ("key_latest_publish_time"), -1L);
                C57042Ls c57042Ls = new C57042Ls("VideoPlayerCondition", new AqS45S1000000_7(awemeId, 3));
                c57042Ls.LIZ("experiment", AVPublishServiceImpl$getSurveyAfterPostService$1$shouldShowAuthorSurveyInVideoPlayer$2.INSTANCE);
                c57042Ls.LIZ("intervalStart", new AqS37S0100100_7(currentTimeMillis, LIZ, 2));
                c57042Ls.LIZ("intervalEnd", new AqS37S0100100_7(currentTimeMillis, LIZ, 3));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("equalAwemeId(latest=");
                LIZ2.append(GVY.LIZ());
                LIZ2.append(')');
                c57042Ls.LIZ(X1D.LIZIZ(LIZ2), new AqS45S1000000_7(awemeId, 4));
                c57042Ls.LIZ("notHitCloseFrequency", AVPublishServiceImpl$getSurveyAfterPostService$1$shouldShowAuthorSurveyInVideoPlayer$6.INSTANCE);
                c57042Ls.LIZ("notBannedInVideoPlayer", new AqS45S1000000_7(awemeId, 5));
                return C57042Ls.LIZIZ(c57042Ls);
            }

            @Override // X.C8R4
            public void showAuthorSurvey(Bundle bundle, ActivityC45651qj activity) {
                o.LJIIIZ(bundle, "bundle");
                o.LJIIIZ(activity, "activity");
                GHN.LIZ(bundle, activity);
            }

            @Override // X.C8R4
            public void showSurveyBannerInProfilePage(InterfaceC55643Lsd scene, ViewStub viewStub, int i, ActivityC45651qj activity) {
                o.LJIIIZ(scene, "scene");
                o.LJIIIZ(activity, "activity");
                PopupManager.LJIIL(new GHQ(scene, viewStub, i, activity));
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public int globalProgressExpValue() {
        return C00F.LIZ(31744, 0, "studio_global_publish_progress", true);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isAfterPost() {
        if (G9Z.LIZ != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isAutoRetry() {
        if (GVX.LJ > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean needPauseFeed() {
        return C44172HVg.LJJ.LJIIJ().LJFF();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean needRestore() {
        return C44172HVg.LJJ.LJIIJ().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public List<String> viralEffectIds() {
        return ORZ.LLJI((HashSet) H49.LIZ.getValue());
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void cancelRestoreOnMain() {
        RecordScene LIZIZ = HB4.LIZIZ();
        CreativeInfo creativeInfo = LIZIZ.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "recordScene.creativeInfo");
        C173786ru.LIZLLL(creativeInfo);
        C41658GWo.LIZLLL().getClass();
        C41658GWo.LIZLLL().getClass();
        C41658GWo.LJI(LIZIZ);
        HB4.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void clearCurChallenge() {
        ((ArrayList) C41658GWo.LIZLLL().LIZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean enableFloatingProgress() {
        return GTO.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean enablePreviewPublishVideo() {
        return GUO.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean enablePublishAsTemplate() {
        return C141375gj.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public List<PublishModel> getAllProgressValidPublishModel() {
        return GUH.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public int getAllProgressValidPublishSize() {
        return GUH.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public List<PublishModel> getAllPublishModel() {
        return GUH.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public List<File> getCacheFileListWithOutPublishing() {
        String str;
        List<File> LJIIL = C60903NvH.LJIIJJI().LJJIJL().getPathService().LJIIL();
        ArrayList arrayList = new ArrayList();
        for (File file : LJIIL) {
            File file2 = file;
            List<PublishModel> LJIIJ = GUH.LJIIJ();
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJIIJ, 10));
            for (PublishModel publishModel : LJIIJ) {
                if (publishModel != null) {
                    str = publishModel.creationId;
                } else {
                    str = null;
                }
                arrayList2.add(str);
            }
            if (!arrayList2.contains(file2.getName())) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public AVChallenge getCurChallenge() {
        if (C79004UzY.LJJIFFI(C41658GWo.LIZLLL().LIZ)) {
            return null;
        }
        return (AVChallenge) ListProtector.get(C41658GWo.LIZLLL().LIZ, 0);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public String getCurrentPublishTaskId() {
        return GUH.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public List<String> getLastPublishedVids() {
        return HI5.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public List<File> getNotCleanableFileList() {
        String str;
        List<File> LJIIL = C60903NvH.LJIIJJI().LJJIJL().getPathService().LJIIL();
        ArrayList arrayList = new ArrayList();
        for (File file : LJIIL) {
            File file2 = file;
            List<PublishModel> LJIIJ = GUH.LJIIJ();
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJIIJ, 10));
            for (PublishModel publishModel : LJIIJ) {
                if (publishModel != null) {
                    str = publishModel.creationId;
                } else {
                    str = null;
                }
                arrayList2.add(str);
            }
            if (arrayList2.contains(file2.getName())) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public int getParallelPublishTaskSize() {
        return C60903NvH.LJIIJJI().getPublishService().LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public String getShootWay() {
        return C41658GWo.LIZLLL().LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean hasECCommerceAnchor() {
        Boolean bool = C41658GWo.LIZLLL().LIZLLL;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean inPublishPage() {
        C41658GWo.LIZLLL().getClass();
        return C41658GWo.LJ();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isCoverOptimizationEnable() {
        if (C142975jJ.LIZ() || C142985jK.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isEnableCombineCDS() {
        return G6X.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isEnablePutSettingsIntoMoreOption() {
        return C40981G6n.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isInShoutout() {
        Boolean bool = C41658GWo.LIZLLL().LJ;
        o.LJIIIIZZ(bool, "inst().isInShoutout");
        return bool.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isParallelPublishTaskFinished() {
        if (GUH.LJIILJJIL() <= 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isReturnCaptionEnabled() {
        return C40976G6i.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isSubOnlyVideo() {
        if (C6EZ.LIZ() && C41658GWo.LIZLLL().LJFF) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void resetNewCreateWay() {
        C41658GWo.LIZLLL().LJ = Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean shouldShowAddToMixWithinSheet() {
        if (G6X.LIZIZ() && C40977G6j.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean turnOffSaveLocalAfterModeration() {
        return C40985G6r.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void updateShowPromptTimes() {
        String LIZJ = C77339UWx.LIZJ();
        int LJJJJJ = C78685UuP.LJJJJJ() + 1;
        if (LJJJJJ > 3) {
            return;
        }
        Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeInt(LIZJ, LJJJJJ);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public InterfaceC224558rb getPublishPreviewmanager() {
        return C42524GmW.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void giveupNowsPublish() {
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isMultiTaskRecover() {
        return GVX.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean needShowAnim() {
        return GVX.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void addAVChallenges(List<? extends AVChallenge> challenges) {
        o.LJIIIZ(challenges, "challenges");
        ((ArrayList) C41658GWo.LIZLLL().LIZ).addAll(challenges);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean cancelPublishByClickCover(String publishId) {
        o.LJIIIZ(publishId, "publishId");
        return GUH.LJII(publishId);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void cancelRestoreOnMain(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C44172HVg.LJJ.LJIIJ().LIZJ(activity);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void checkAndAutoRetryIfNeed(final ActivityC45651qj ctx) {
        o.LJIIIZ(ctx, "ctx");
        List<String> LIZJ = C60903NvH.LJIIJJI().getPublishService().LJIILIIL().LIZJ();
        if (LIZJ.isEmpty() || TextUtils.isEmpty((CharSequence) ListProtector.get(LIZJ, 0))) {
            return;
        }
        final String str = (String) ListProtector.get(LIZJ, 0);
        C10K.LIZIZ(new Callable() { // from class: com.ss.android.ugc.aweme.services.AVPublishServiceImpl$checkAndAutoRetryIfNeed$1
            @Override // java.util.concurrent.Callable
            public final AwemeDraft call() {
                return C1DG.LJFF().LJ(new C41363GLf(new CreativeInfo(str, 0, null, 6, null), true));
            }
        }, GUL.LIZ, null).LJ(new C10I() { // from class: com.ss.android.ugc.aweme.services.AVPublishServiceImpl$checkAndAutoRetryIfNeed$2
            @Override // X.C10I
            public final Object then(C10K<AwemeDraft> task) {
                o.LJIIIZ(task, "task");
                AwemeDraft LJIIJJI = task.LJIIJJI();
                if (LJIIJJI != null && GVA.LIZIZ(ActivityC45651qj.this, LJIIJJI)) {
                    new C268813s(ActivityC45651qj.this, LJIIJJI).LIZ();
                    return null;
                }
                return null;
            }
        }, C10K.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean checkIfCache(String path) {
        o.LJIIIZ(path, "path");
        long j = 1024;
        return C41743GZv.LIZ((CommonFeedServiceImpl.LJJIJLIJ().LJIJJLI(FKM.LIZ()) / j) / j, path);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean checkIsAlreadyPublished(Context context) {
        o.LJIIIZ(context, "context");
        C41658GWo.LIZLLL().getClass();
        return C41658GWo.LIZJ(context);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean containEmoji(String str) {
        o.LJIIIZ(str, "str");
        return PatternProtector.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?|[\\u200d\\uFE0F?])").matcher(str).find();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void finishAllCreativeActivity(ActivityC45651qj activityC45651qj) {
        Activity[] activityStack = ActivityStack.getActivityStack();
        int length = activityStack.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                Activity act = activityStack[length];
                o.LJIIIIZZ(act, "act");
                if (isCreativeToolsActivity(act) && !act.isFinishing() && !o.LJ(act, activityC45651qj)) {
                    act.finish();
                }
                if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
        }
        if (activityC45651qj != null) {
            activityC45651qj.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public Bitmap getCover(PublishModel publishModel) {
        o.LJIIIZ(publishModel, "publishModel");
        return GUH.LJIIJJI(publishModel);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public String getErrorHintWhenDisableDuetOrStitch(int i) {
        return GWJ.LIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public int[] getOutputMediaSize(BaseShortVideoContext editModel) {
        o.LJIIIZ(editModel, "editModel");
        if (editModel instanceof VideoPublishEditModel) {
            return C44526Hdi.LIZJ((VideoPublishEditModel) editModel);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public PaidContentVideoModel getPaidContentVideoModel(PublishModel publishModel) {
        o.LJIIIZ(publishModel, "publishModel");
        BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
        o.LJII(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        return ((VideoPublishEditModel) baseShortVideoContext).creativeModel.paidContentModel;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public Object getPublishMetaData(Object videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
        if (videoPublishEditModel instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) videoPublishEditModel;
            return HI3.LIZ(videoPublishEditModel2, C43147GwZ.LIZIZ(videoPublishEditModel2));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public PublishModel getPublishModel(String str) {
        return GUH.LJIILLIIL(str);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public IAVPublishService.PublishProgressFragment getPublishProgressFragment(boolean z) {
        if (z) {
            return new ParallelPublishDialogFragment();
        }
        return new PublishDialogFragment();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public String getVideoTitle(PublishModel publishModel) {
        o.LJIIIZ(publishModel, "publishModel");
        C60903NvH.LJIIJJI().getPublishService().LJIIJ();
        BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
        o.LJII(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        if (G8X.LIZ((VideoPublishEditModel) baseShortVideoContext)) {
            BaseShortVideoContext baseShortVideoContext2 = publishModel.editModel;
            o.LJII(baseShortVideoContext2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            String str = ((VideoPublishEditModel) baseShortVideoContext2).creativeModel.postPageModel.captionModel.markupText;
            if (str != null) {
                return str;
            }
        } else {
            BaseShortVideoContext baseShortVideoContext3 = publishModel.editModel;
            o.LJII(baseShortVideoContext3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            String str2 = ((VideoPublishEditModel) baseShortVideoContext3).creativeModel.postPageModel.markupCaption;
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void hideProgress(ActivityC45651qj activityC45651qj) {
        C42041Gej c42041Gej;
        if (GVE.LIZ()) {
            return;
        }
        if (GTO.LIZ()) {
            C42041Gej c42041Gej2 = C41620GVc.LIZLLL;
            if (c42041Gej2 == null || c42041Gej2.getParent() == null || (c42041Gej = C41620GVc.LIZLLL) == null) {
                return;
            }
            c42041Gej.LIZJ();
            return;
        }
        if (activityC45651qj == null) {
            return;
        }
        InterfaceC36571c5 LJJJIL = activityC45651qj.getSupportFragmentManager().LJJJIL("publish");
        if (!(LJJJIL instanceof IAVPublishService.PublishProgressFragment)) {
            return;
        }
        ((IAVPublishService.PublishProgressFragment) LJJJIL).hide();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean inPublishPage(Context context) {
        o.LJIIIZ(context, "context");
        C41658GWo.LIZLLL().getClass();
        return C41658GWo.LJ();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isCreativeToolsActivity(Activity activity) {
        o.LJIIIZ(activity, "activity");
        return activity instanceof GB7;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isImageMode(String str) {
        VideoPublishEditModel videoPublishEditModel;
        PublishModel LJIILLIIL = GUH.LJIILLIIL(str);
        BaseShortVideoContext baseShortVideoContext = null;
        if (LJIILLIIL != null) {
            baseShortVideoContext = LJIILLIIL.editModel;
        }
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null) {
            return H7R.LJJJJL(videoPublishEditModel);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isParallelPublishDialogFragment(IAVPublishService.PublishProgressFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return fragment instanceof ParallelPublishDialogFragment;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isPublishDialogFragment(IAVPublishService.PublishProgressFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return fragment instanceof PublishDialogFragment;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isPublishServiceRunning(Context context) {
        o.LJIIIZ(context, "context");
        return GUH.LJIJI(null);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean isStory(String str) {
        VideoPublishEditModel videoPublishEditModel;
        PublishModel LJIILLIIL = GUH.LJIILLIIL(str);
        BaseShortVideoContext baseShortVideoContext = null;
        if (LJIILLIIL != null) {
            baseShortVideoContext = LJIILLIIL.editModel;
        }
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null) {
            return H7R.LJJLIIIJILLIZJL(videoPublishEditModel);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void onSaveLocalTimeoutEvent(String vframeUri) {
        o.LJIIIZ(vframeUri, "vframeUri");
        SaveLocalHelper.LIZLLL(vframeUri);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public long passedDaysAfterPost(long j) {
        return C44432HcC.LJ(j);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void removeProgress(ActivityC45651qj activityC45651qj) {
        C41620GVc.LIZLLL(activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void removePublishCallback(InterfaceC41605GUn<CreateBaseAwemeResponse> callback) {
        o.LJIIIZ(callback, "callback");
        GUH.LJJ(callback);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void reportQuitAutoUploadingShowEvent(Object args) {
        o.LJIIIZ(args, "args");
        GVM.LIZIZ(args);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public List<String> resolveHashtagNamesInCaption(BaseShortVideoContext editModel) {
        VideoPublishEditModel videoPublishEditModel;
        List<AVTextExtraStruct> structList;
        o.LJIIIZ(editModel, "editModel");
        ArrayList arrayList = new ArrayList();
        if (!(editModel instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) editModel) == null || (structList = videoPublishEditModel.getStructList()) == null) {
            return arrayList;
        }
        for (AVTextExtraStruct aVTextExtraStruct : structList) {
            if (aVTextExtraStruct.type == 1) {
                arrayList.add(String.valueOf(aVTextExtraStruct.hashTagName));
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void saveLocalByUniqueURI(String message) {
        o.LJIIIZ(message, "message");
        SaveLocalHelper.LJI(message, false);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setECCommerceAnchor(boolean z) {
        C41658GWo.LIZLLL().LIZLLL = Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setHashTagRegex(String str) {
        o.LJIIIZ(str, "str");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C73030SlO.LJLIL = str;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setMultiTaskRecover(boolean z) {
        GVX.LIZLLL = z;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setMusicChooseType(int i) {
        C41658GWo.LIZLLL().LIZJ = i;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setNeedShowAnim(boolean z) {
        GVX.LIZIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setPopWindowStillExists(boolean z) {
        GVX.LJI = z;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setPublishStatus(int i) {
        C41658GWo.LIZLLL().LJII(i);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void showMentionVideoLoading(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (activity instanceof MentionVideoActivity) {
            C8IC c8ic = ((MentionVideoActivity) activity).LJLJJL;
            if (c8ic != null) {
                c8ic.setVisibility(0);
            } else {
                o.LJIJI("loadingView");
                throw null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void uploadRecoverPopViewSetVisibility(final boolean z) {
        ActivityC45651qj activity;
        GVB gvb;
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            GVB gvb2 = this.mUploadRecoverPopView;
            if (gvb2 != null && gvb2.isShowing() && (gvb = this.mUploadRecoverPopView) != null) {
                gvb.setVisibility(z);
                return;
            }
            return;
        }
        GVB gvb3 = this.mUploadRecoverPopView;
        if (gvb3 == null || (activity = gvb3.getActivity()) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.ss.android.ugc.aweme.services.AVPublishServiceImpl$uploadRecoverPopViewSetVisibility$1
            @Override // java.lang.Runnable
            public final void run() {
                com_ss_android_ugc_aweme_services_AVPublishServiceImpl$uploadRecoverPopViewSetVisibility$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public final void com_ss_android_ugc_aweme_services_AVPublishServiceImpl$uploadRecoverPopViewSetVisibility$1__run$___twin___() {
                GVB gvb4;
                GVB gvb5 = AVPublishServiceImpl.this.mUploadRecoverPopView;
                if (gvb5 != null && gvb5.isShowing() && (gvb4 = AVPublishServiceImpl.this.mUploadRecoverPopView) != null) {
                    gvb4.setVisibility(z);
                }
            }

            public static void com_ss_android_ugc_aweme_services_AVPublishServiceImpl$uploadRecoverPopViewSetVisibility$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AVPublishServiceImpl$uploadRecoverPopViewSetVisibility$1 aVPublishServiceImpl$uploadRecoverPopViewSetVisibility$1) {
                boolean LIZ;
                try {
                    aVPublishServiceImpl$uploadRecoverPopViewSetVisibility$1.com_ss_android_ugc_aweme_services_AVPublishServiceImpl$uploadRecoverPopViewSetVisibility$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void addMusic(MusicModel musicModel, int i) {
        o.LJIIIZ(musicModel, "musicModel");
        I9T.LJFF(C44172HVg.LJI.transformMusicModel(musicModel));
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void addPublishCallback(InterfaceC41605GUn<CreateBaseAwemeResponse> callback, String str) {
        o.LJIIIZ(callback, "callback");
        if (GUH.LJIILLIIL(str) != null) {
            GUH.LIZ(str, new C41604GUm(callback));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void addPublishPreviewCallback(String key, InterfaceC42527GmZ callback) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(callback, "callback");
        C42524GmW.LIZ.LIZJ(key, callback);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void cancelPublish(String publishId, C41359GLb cancelCause) {
        String str;
        o.LJIIIZ(publishId, "publishId");
        o.LJIIIZ(cancelCause, "cancelCause");
        GUI gui = GUH.LIZJ;
        synchronized (gui) {
            List<GUU> mPublishRecordList = gui.LIZ;
            o.LJIIIIZZ(mPublishRecordList, "mPublishRecordList");
            for (GUU guu : mPublishRecordList) {
                if (o.LJ(guu.LIZIZ, publishId)) {
                    if (guu.LJI == null) {
                        GUQ guq = new GUQ(new C41750Ga2(), GUH.LIZIZ, guu, GUH.LIZJ, GUH.LIZLLL);
                        guu.LJI = guq;
                        List LLJI = ORZ.LLJI(guu.LIZJ);
                        guu.LIZJ.clear();
                        Iterator it = LLJI.iterator();
                        while (it.hasNext()) {
                            guq.LIZ((GUX) it.next());
                        }
                    }
                    GUQ guq2 = guu.LJI;
                    if (guq2 != null) {
                        BaseShortVideoContext baseShortVideoContext = guq2.LJLJJL.LIZ.editModel;
                        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || baseShortVideoContext == null || (str = baseShortVideoContext.getCreationId()) == null) {
                            str = "";
                        }
                        guq2.LIZIZ(cancelCause);
                        C60903NvH.LJIIJJI().getPublishService().LJIILIIL();
                        C41958GdO.LJIILJJIL(str);
                        C41958GdO.LJIILIIL(str);
                        C41958GdO.LJII();
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void cancelSynthesis(Context context, String scene) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(scene, "scene");
        C60903NvH.LJIIJJI().getPublishService().LJI();
        GUT.LIZ(context, scene);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public View createCoverMaskView(Context context, View rootView) {
        ViewGroup viewGroup;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(rootView, "rootView");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.aba, C16880lQ.LLZIL(context), null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        if ((rootView instanceof ViewGroup) && (viewGroup = (ViewGroup) rootView) != null) {
            viewGroup.addView(LLLZIIL, layoutParams);
        }
        LLLZIIL.setVisibility(8);
        return LLLZIIL;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void log(String stage, String message) {
        o.LJIIIZ(stage, "stage");
        o.LJIIIZ(message, "message");
        C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ(stage, message);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void moveProgress(int i, int i2) {
        C41634GVq c41634GVq;
        ValueAnimator valueAnimator;
        if (GVE.LIZ() || (c41634GVq = C41620GVc.LIZ) == null) {
            return;
        }
        if (i != -1) {
            WindowManager.LayoutParams layoutParams = c41634GVq.LJIIJ;
            if (C173636rf.LIZIZ(c41634GVq.LIZ)) {
                int LIZIZ = C7MY.LIZIZ(50);
                int i3 = c41634GVq.LJII;
                if (c41634GVq.LIZIZ.getMeasuredWidth() > 0) {
                    LIZIZ = c41634GVq.LIZIZ.getMeasuredWidth();
                }
                i = (i3 - LIZIZ) - i;
            }
            layoutParams.x = i;
        }
        if (i2 != -1) {
            c41634GVq.LJIIJ.y = i2;
        }
        if (c41634GVq.LIZIZ.getParent() == null || c41634GVq.LJIILIIL == 0) {
            return;
        }
        ValueAnimator valueAnimator2 = c41634GVq.LJIJ;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = c41634GVq.LJIJ) != null) {
            valueAnimator.cancel();
        }
        c41634GVq.LIZIZ.setAlpha(1.0f);
        WindowManager windowManager = c41634GVq.LJIIJJI;
        if (windowManager == null) {
            return;
        }
        windowManager.updateViewLayout(c41634GVq.LIZIZ, c41634GVq.LJIIJ);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void registerPublishProgressCallback(Activity activity, GVH callback) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(callback, "callback");
        C41620GVc.LJI.put(activity, callback);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void reportQuitAutoUploadingEvent(Object args, String actionType) {
        o.LJIIIZ(args, "args");
        o.LJIIIZ(actionType, "actionType");
        GVM.LIZ(args, actionType);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setChainInfo(Activity activity, GSX chainInfo) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(chainInfo, "chainInfo");
        if (activity instanceof MentionVideoActivity) {
            MentionVideoActivity mentionVideoActivity = (MentionVideoActivity) activity;
            Intent intent = new Intent();
            intent.putExtra("chainInfo", chainInfo);
            mentionVideoActivity.setResult(-1, intent);
            mentionVideoActivity.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setCurMusic(MusicModel musicModel, int i) {
        I9T.LJFF(C44172HVg.LJI.transformMusicModel(musicModel));
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void setMentionVideoSubType(Activity activity, int i) {
        o.LJIIIZ(activity, "activity");
        if (activity instanceof MentionVideoActivity) {
            ((MentionVideoActivity) activity).LJLL = i;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean shouldDisableDuetOrStitch(int i, int i2) {
        return GWJ.LIZIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void showProgress(ActivityC45651qj activityC45651qj, boolean z) {
        C41620GVc.LJFF(activityC45651qj, z);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public Dialog showRestoreWorkDialog(Activity activity, String enterFrom) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(enterFrom, "enterFrom");
        return C44172HVg.LJJ.LJIIJ().showRestoreWorkDialog(activity, enterFrom);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public String startPublish(ActivityC45651qj activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(bundle, "bundle");
        return GTM.LJII(activity, bundle);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean tryRegisterHomePageUICallback(Activity activity, String str) {
        o.LJIIIZ(activity, "activity");
        WeakHashMap<Activity, Set<String>> weakHashMap = GVD.LIZ;
        Set<String> set = weakHashMap.get(activity);
        if (set == null) {
            set = new HashSet<>();
        }
        if (set.contains(str)) {
            return false;
        }
        set.add(str);
        weakHashMap.put(activity, set);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void tryRestorePublish(final ActivityC45651qj activity, final InterfaceC88472Yns<? super Boolean, Void> callback) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(callback, "callback");
        if (!isPublishing()) {
            if (isPublishServiceRunning(activity)) {
                C170666ms.LIZIZ("continue publish");
                H78.LJI("PublishServiceImpl continue publish");
                C142955jH.LIZ("AVPublishServiceImpl !isPublishing() isPublishServiceRunning");
                C44172HVg.LIZJ.getClass();
                new MainActivityCallback(activity, null, false);
                return;
            }
            C10K.LIZIZ(new Callable() { // from class: com.ss.android.ugc.aweme.services.AVPublishServiceImpl$tryRestorePublish$1
                @Override // java.util.concurrent.Callable
                public final Boolean call() {
                    if (C44172HVg.LJ()) {
                        return Boolean.FALSE;
                    }
                    return Boolean.valueOf(C44172HVg.LJJ.LJIIJ().LJIIL(ActivityC45651qj.this));
                }
            }, GUL.LIZ, null).LJ(new C10I() { // from class: com.ss.android.ugc.aweme.services.AVPublishServiceImpl$tryRestorePublish$2
                @Override // X.C10I
                public final Void then(C10K<Boolean> task) {
                    o.LJIIIZ(task, "task");
                    InterfaceC88472Yns<Boolean, Void> interfaceC88472Yns = callback;
                    Boolean LJIIJJI = task.LJIIJJI();
                    o.LJIIIIZZ(LJIIJJI, "task.result");
                    interfaceC88472Yns.invoke(LJIIJJI);
                    return null;
                }

                @Override // X.C10I
                public /* bridge */ /* synthetic */ Object then(C10K c10k) {
                    return then((C10K<Boolean>) c10k);
                }
            }, C10K.LJIIIIZZ, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void changeIntentToHighlightIfNeed(ActivityC45651qj activity, Intent intent, BaseShortVideoContext baseShortVideoContext) {
        VideoPublishEditModel videoPublishEditModel;
        o.LJIIIZ(activity, "activity");
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
        } else {
            videoPublishEditModel = null;
        }
        GTM.LIZ(activity, intent, videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public String getErrorMsg(Context context, C41759GaB exception, String defaultMsg) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(exception, "exception");
        o.LJIIIZ(defaultMsg, "defaultMsg");
        OSZ<Boolean, String> retrieveServerErrorInfo = exception.retrieveServerErrorInfo();
        Boolean first = retrieveServerErrorInfo.getFirst();
        String second = retrieveServerErrorInfo.getSecond();
        o.LJIIIIZZ(first, "first");
        if (!first.booleanValue()) {
            second = "";
        }
        if (exception.isCauseByNoSpaceLeft()) {
            second = context.getString(R.string.rr4);
        } else if (exception.isUserNetworkBad()) {
            second = context.getString(R.string.rr1);
        }
        if (!TextUtils.isEmpty(second)) {
            defaultMsg = second;
        }
        if (defaultMsg != null) {
            return defaultMsg;
        }
        "Has judge message null before".toString();
        throw new IllegalArgumentException("Has judge message null before");
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public InterfaceC41605GUn<CreateBaseAwemeResponse> getParallelPublishUICallBack(IAVPublishService.PublishProgressFragment fragment, String publishId, PublishModel publishModel) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(publishId, "publishId");
        o.LJIIIZ(publishModel, "publishModel");
        if (fragment instanceof ParallelPublishDialogFragment) {
            return GVC.LIZ((InterfaceC41630GVm) fragment, publishId, publishModel);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public OSZ<InterfaceC41605GUn<CreateBaseAwemeResponse>, Boolean> getParallelPublishUICallBackPair(IAVPublishService.PublishProgressFragment fragment, String publishId, PublishModel publishModel) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(publishId, "publishId");
        o.LJIIIZ(publishModel, "publishModel");
        if (fragment instanceof ParallelPublishDialogFragment) {
            C41627GVj LIZ = GVC.LIZ((InterfaceC41630GVm) fragment, publishId, publishModel);
            return new OSZ<>(LIZ, Boolean.valueOf(LIZ.LJLJJI));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void hideUploadRecoverWindow(Context context, boolean z, boolean z2) {
        int i;
        o.LJIIIZ(context, "context");
        Dialog dialog = this.mShoutOutsUploadRecoverDialog;
        if (dialog != null && dialog.isShowing()) {
            C60903NvH.LJIIJJI().getPublishService().LJIILIIL().LIZIZ();
            C41732GZk.LIZ();
            H78.LJI("Publish | remove recover path by dismiss panel so");
            Dialog dialog2 = this.mShoutOutsUploadRecoverDialog;
            o.LJI(dialog2);
            dialog2.dismiss();
            this.mShoutOutsUploadRecoverDialog = null;
        }
        GVB gvb = this.mUploadRecoverPopView;
        if (gvb != null && gvb.isShowing()) {
            if (z && !z2) {
                if (this.isRecoverPhotoModePublish) {
                    i = R.string.dwj;
                } else if (this.isRecoverNowPublish) {
                    i = R.string.j67;
                } else {
                    i = R.string.bze;
                }
                C05L.LIZLLL(context, i);
            }
            GVB gvb2 = this.mUploadRecoverPopView;
            if (gvb2 != null) {
                gvb2.LIZJ(z, z2);
            }
            this.mUploadRecoverPopView = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean processPublish(ActivityC45651qj activity, Intent intent, Boolean bool) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(intent, "intent");
        return C78605Ut7.LJIJJLI(activity, intent, bool);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean returnMentionVideoRespose(Activity activity, VideoInfoFromURLResponse response, String enterMethod) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(response, "response");
        o.LJIIIZ(enterMethod, "enterMethod");
        if (activity instanceof MentionVideoActivity) {
            MentionVideoActivity mentionVideoActivity = (MentionVideoActivity) activity;
            Intent intent = new Intent();
            int i = mentionVideoActivity.LJLL;
            if (i != 0) {
                intent.putExtra("mention_video_Info_with_subtype", new C41555GSp(response, i, enterMethod));
            }
            mentionVideoActivity.setResult(-1, intent);
            mentionVideoActivity.finish();
            return true;
        }
        return false;
    }

    public void setCurMusic(MusicModel musicModel, boolean z, int i) {
        o.LJIIIZ(musicModel, "musicModel");
        AVMusic transformMusicModel = C44172HVg.LJI.transformMusicModel(musicModel);
        ICommerceToolsMusicService LIZIZ = CommerceToolsMusicService.LIZIZ(false);
        o.LJIIIIZZ(LIZIZ, "get().getService(ICommer…MusicService::class.java)");
        LIZIZ.iq(transformMusicModel, null);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void showPhotoCoverWhenPreview(Aweme aweme, SmartImageView smartImageView, View view) {
        String str;
        boolean z;
        Video video;
        UrlModel cover;
        List<String> urlList;
        if (aweme == null || (video = aweme.getVideo()) == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null || (str = (String) ListProtector.get(urlList, 0)) == null) {
            str = "";
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedPhotosViewHolder -> bindCoverImage -> cachedBitmap != null: ");
        if (decodeFile != null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        H78.LIZJ(X1D.LIZIZ(LIZ));
        if (decodeFile != null) {
            if (smartImageView != null) {
                smartImageView.setVisibility(0);
                smartImageView.setImageBitmap(decodeFile);
            }
            if (view == null) {
                return;
            }
            view.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void showPublishRecoverViewForCCPublish(final ActivityC45651qj activity, String draftPrimaryKey, final PublishFailMsg msg) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(draftPrimaryKey, "draftPrimaryKey");
        o.LJIIIZ(msg, "msg");
        C10K.LIZIZ(new GV5(draftPrimaryKey, 1), GUL.LIZ, null).LJ(new AgS124S0100000_7(new IGetPublishDraftCallback() { // from class: com.ss.android.ugc.aweme.services.AVPublishServiceImpl$showPublishRecoverViewForCCPublish$1
            @Override // com.ss.android.ugc.aweme.services.external.IGetPublishDraftCallback
            public void onFail() {
            }

            @Override // com.ss.android.ugc.aweme.services.external.IGetPublishDraftCallback
            public void onSuccess(AwemeDraft draft) {
                o.LJIIIZ(draft, "draft");
                ActivityC45651qj ctx = ActivityC45651qj.this;
                PublishFailMsg msg2 = msg;
                o.LJIIIZ(ctx, "ctx");
                o.LJIIIZ(msg2, "msg");
                new GWG(ctx, new C41474GPm(draft, new PublishFailureReason(null, false, "cc_publish_failure", null)), false, false, msg2).LIZLLL();
            }
        }, 18), C10K.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public /* bridge */ /* synthetic */ void setCurMusic(MusicModel musicModel, Boolean bool, int i) {
        setCurMusic(musicModel, bool.booleanValue(), i);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void addAllPublishProgress(ActivityC45651qj activity, int i, boolean z, boolean z2) {
        ViewGroup viewGroup;
        ParallelPublishDialogFragment parallelPublishDialogFragment;
        o.LJIIIZ(activity, "activity");
        View view = C16880lQ.LLLZIIL(R.layout.c9b, C16880lQ.LLZIL(activity), null);
        o.LJIIIIZZ(view, "view");
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        if (activity.findViewById(R.id.ifl) == null && (viewGroup = (ViewGroup) activity.findViewById(i)) != null) {
            viewGroup.addView(view, layoutParams);
        }
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        List<PublishModel> LJIILIIL = GUH.LJIILIIL();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJIILIIL, 10));
        Iterator it = ((ArrayList) LJIILIIL).iterator();
        while (it.hasNext()) {
            arrayList.add(GUH.LJIILL((PublishModel) it.next()));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Fragment LJJJIL = supportFragmentManager.LJJJIL("publish");
        if (!(LJJJIL instanceof ParallelPublishDialogFragment) || (parallelPublishDialogFragment = (ParallelPublishDialogFragment) LJJJIL) == null) {
            parallelPublishDialogFragment = new ParallelPublishDialogFragment();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            Class<?> cls = activity.getClass();
            AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getApplicationService().getClass();
            if (o.LJ(cls, SplashActivity.class)) {
                GVF gvf = C44172HVg.LJIILL;
                Boolean bool = Boolean.TRUE;
                gvf.getClass();
                if (new MainActivityCallback(activity, str, false, bool).LJLJJL) {
                }
            }
            PublishModel LJIILLIIL = GUH.LJIILLIIL(str);
            if (LJIILLIIL != null) {
                C41627GVj LIZ = GVC.LIZ(parallelPublishDialogFragment, str, LJIILLIIL);
                if (LIZ.LJLJJI) {
                    GUH.LIZ(str, new C41604GUm(LIZ));
                }
            }
        }
        if (supportFragmentManager.LJJJIL("publish") == null) {
            parallelPublishDialogFragment.showInSpecificId(supportFragmentManager, "publish", R.id.kmk, z2);
            if (!z) {
                return;
            }
        } else if (!z) {
            parallelPublishDialogFragment.show(z2);
            return;
        }
        parallelPublishDialogFragment.hide();
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void showUploadRecoverIfNeed(final PublishFailureReason failureReason, final ActivityC45651qj activityC45651qj, PublishModel publishModel, final String str) {
        o.LJIIIZ(failureReason, "failureReason");
        GVB gvb = this.mUploadRecoverPopView;
        if (gvb != null && gvb.isShowing()) {
            HashMap hashMap = new HashMap(1);
            hashMap.put(WM7.SCENE_SERVICE, failureReason.scene);
            C78983UzD.LJIILLIIL("show multiple upload recover popup", hashMap);
        }
        if (publishModel != null && publishModel.storyGroupPublishModel != null) {
            if (activityC45651qj == null || activityC45651qj.isFinishing()) {
                return;
            }
            new C43542H7a("recover_panel");
            BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
            o.LJII(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            C41643GVz c41643GVz = new C41643GVz(activityC45651qj, new C41474GPm(C43542H7a.LIZLLL((VideoPublishEditModel) baseShortVideoContext), failureReason), publishModel);
            this.mUploadRecoverPopView = c41643GVz;
            c41643GVz.LIZLLL();
            return;
        }
        if (str != null) {
            C10K.LIZIZ(new GV5(str, 1), GUL.LIZ, null).LJ(new AgS124S0100000_7(new IGetPublishDraftCallback() { // from class: com.ss.android.ugc.aweme.services.AVPublishServiceImpl$showUploadRecoverIfNeed$1
                @Override // com.ss.android.ugc.aweme.services.external.IGetPublishDraftCallback
                public void onFail() {
                    C41859Gbn LIZIZ = C1I0.LIZIZ();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("showUploadRecoverIfNeed isServerException = ");
                    LIZ.append(failureReason.isServerException);
                    LIZ.append("  ");
                    LIZ.append(str);
                    LIZIZ.LIZJ("upload_recover", X1D.LIZIZ(LIZ));
                    if (failureReason.isServerException || !TextUtils.isEmpty(str)) {
                        C5S1 c5s1 = new C5S1(activityC45651qj);
                        c5s1.LIZJ(R.string.c9e);
                        c5s1.LJ();
                    }
                }

                @Override // com.ss.android.ugc.aweme.services.external.IGetPublishDraftCallback
                public void onSuccess(AwemeDraft draft) {
                    o.LJIIIZ(draft, "draft");
                    AVPublishServiceImpl.this.isRecoverPhotoModePublish = draft.LJIIIZ();
                    AVPublishServiceImpl.this.isRecoverNowPublish = C41802Gas.LJII(draft);
                    ShoutOutsData shoutOutsData = draft.LJJJJI.shoutOutsData;
                    if (shoutOutsData != null) {
                        Dialog dialog = null;
                        if (!o.LJ(shoutOutsData.getShoutOutsMode(), ShoutOutsData.MODE_POST)) {
                            if (o.LJ("AvApiFragmentObserver onAttach", failureReason.scene)) {
                                return;
                            }
                            C41474GPm c41474GPm = new C41474GPm(draft, failureReason);
                            AVPublishServiceImpl aVPublishServiceImpl = AVPublishServiceImpl.this;
                            ActivityC45651qj activityC45651qj2 = activityC45651qj;
                            if (activityC45651qj2 != null) {
                                dialog = GVA.LIZLLL(activityC45651qj2, c41474GPm);
                            }
                            aVPublishServiceImpl.mShoutOutsUploadRecoverDialog = dialog;
                            return;
                        }
                    }
                    final ActivityC45651qj activityC45651qj3 = activityC45651qj;
                    final PublishFailureReason publishFailureReason = failureReason;
                    final AVPublishServiceImpl aVPublishServiceImpl2 = AVPublishServiceImpl.this;
                    C5DB.LIZIZ(draft, new C5DA() { // from class: com.ss.android.ugc.aweme.services.AVPublishServiceImpl$showUploadRecoverIfNeed$1$onSuccess$2
                        @Override // X.C5DA
                        public void onFinish(final AwemeDraft awemeDraft) {
                            ActivityC45651qj activityC45651qj4 = ActivityC45651qj.this;
                            if (activityC45651qj4 == null || activityC45651qj4.isFinishing()) {
                                return;
                            }
                            final ActivityC45651qj activityC45651qj5 = ActivityC45651qj.this;
                            final PublishFailureReason publishFailureReason2 = publishFailureReason;
                            final AVPublishServiceImpl aVPublishServiceImpl3 = aVPublishServiceImpl2;
                            activityC45651qj5.runOnUiThread(new Runnable() { // from class: com.ss.android.ugc.aweme.services.AVPublishServiceImpl$showUploadRecoverIfNeed$1$onSuccess$2$onFinish$1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com_ss_android_ugc_aweme_services_AVPublishServiceImpl$showUploadRecoverIfNeed$1$onSuccess$2$onFinish$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                                }

                                public final void com_ss_android_ugc_aweme_services_AVPublishServiceImpl$showUploadRecoverIfNeed$1$onSuccess$2$onFinish$1__run$___twin___() {
                                    IExternalService LIZ = AVExternalServiceImpl.LIZ();
                                    final AwemeDraft awemeDraft2 = AwemeDraft.this;
                                    final PublishFailureReason publishFailureReason3 = publishFailureReason2;
                                    final AVPublishServiceImpl aVPublishServiceImpl4 = aVPublishServiceImpl3;
                                    final ActivityC45651qj activityC45651qj6 = activityC45651qj5;
                                    LIZ.asyncServiceWithOutPanel("AVPublishServiceImpl", new SimpleServiceLoadCallback() { // from class: com.ss.android.ugc.aweme.services.AVPublishServiceImpl$showUploadRecoverIfNeed$1$onSuccess$2$onFinish$1.1
                                        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                                        public void onLoad(AsyncAVService service, long j) {
                                            String str2;
                                            o.LJIIIZ(service, "service");
                                            AwemeDraft awemeDraft3 = AwemeDraft.this;
                                            o.LJI(awemeDraft3);
                                            C41474GPm c41474GPm2 = new C41474GPm(awemeDraft3, publishFailureReason3);
                                            aVPublishServiceImpl4.mUploadRecoverPopView = GVA.LIZ(activityC45651qj6, c41474GPm2, true);
                                            if (aVPublishServiceImpl4.mUploadRecoverPopView != null) {
                                                if (!TextUtils.isEmpty(publishFailureReason3.errorMsg)) {
                                                    GVB gvb2 = aVPublishServiceImpl4.mUploadRecoverPopView;
                                                    if (gvb2 != null) {
                                                        String str3 = publishFailureReason3.errorMsg;
                                                        if (str3 == null) {
                                                            str3 = "";
                                                        }
                                                        gvb2.setText(str3);
                                                    }
                                                    C145995oB c145995oB = new C145995oB();
                                                    c145995oB.LJI("enter_from", "video_post_page");
                                                    c145995oB.LJI("creation_id", AwemeDraft.this.LIZ());
                                                    C44423Hc3 currentUser = C44172HVg.LJIJ.getCurrentUser();
                                                    if (currentUser != null) {
                                                        str2 = currentUser.getUid();
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    c145995oB.LJI("user_id", str2);
                                                    FMX.LJIIL("show_publish_unavailable_sound_toast", c145995oB.LIZ);
                                                }
                                                GVB gvb3 = aVPublishServiceImpl4.mUploadRecoverPopView;
                                                if (gvb3 != null) {
                                                    gvb3.LIZLLL();
                                                }
                                            }
                                        }
                                    });
                                }

                                public static void com_ss_android_ugc_aweme_services_AVPublishServiceImpl$showUploadRecoverIfNeed$1$onSuccess$2$onFinish$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AVPublishServiceImpl$showUploadRecoverIfNeed$1$onSuccess$2$onFinish$1 aVPublishServiceImpl$showUploadRecoverIfNeed$1$onSuccess$2$onFinish$1) {
                                    boolean LIZ;
                                    try {
                                        aVPublishServiceImpl$showUploadRecoverIfNeed$1$onSuccess$2$onFinish$1.com_ss_android_ugc_aweme_services_AVPublishServiceImpl$showUploadRecoverIfNeed$1$onSuccess$2$onFinish$1__run$___twin___();
                                    } finally {
                                        if (LIZ) {
                                        }
                                    }
                                }
                            });
                        }
                    });
                }
            }, 18), C10K.LJIIIIZZ, null);
        } else {
            C10K.LIZIZ(new ACallableS42S0000000_7(1), GUL.LIZ, null).LJ(new AgS124S0100000_7(new IGetPublishDraftCallback() { // from class: com.ss.android.ugc.aweme.services.AVPublishServiceImpl$showUploadRecoverIfNeed$2
                @Override // com.ss.android.ugc.aweme.services.external.IGetPublishDraftCallback
                public void onFail() {
                    if (((Boolean) C33768DNc.LIZLLL.getValue()).booleanValue()) {
                        C73454SsE LJJJ = AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: com.ss.android.ugc.aweme.services.AVPublishServiceImpl$showUploadRecoverIfNeed$2$onFail$1
                            @Override // X.InterfaceC86003Zc
                            public final void subscribe(InterfaceC73573Su9<List<String>> it) {
                                o.LJIIIZ(it, "it");
                                it.onNext(C60903NvH.LJIIJJI().getPublishService().LJIILIIL().LIZJ());
                                it.onComplete();
                            }
                        }).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
                        final PublishFailureReason publishFailureReason = failureReason;
                        final ActivityC45651qj activityC45651qj2 = activityC45651qj;
                        LJJJ.LJJJJZI(new InterfaceC64592gB() { // from class: com.ss.android.ugc.aweme.services.AVPublishServiceImpl$showUploadRecoverIfNeed$2$onFail$2
                            @Override // X.InterfaceC64592gB
                            public final void accept(List<String> recoverableList) {
                                o.LJIIIZ(recoverableList, "recoverableList");
                                if (!recoverableList.isEmpty()) {
                                    String str2 = (String) ListProtector.get(recoverableList, 0);
                                    C41859Gbn LIZIZ = C1I0.LIZIZ();
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append("showUploadRecoverIfNeed isServerException = ");
                                    LIZ.append(PublishFailureReason.this.isServerException);
                                    LIZ.append("  ");
                                    LIZ.append(str2);
                                    LIZIZ.LIZJ("upload_recover", X1D.LIZIZ(LIZ));
                                    if (PublishFailureReason.this.isServerException || !TextUtils.isEmpty(str2)) {
                                        C60903NvH.LJIIJJI().getPublishService().LJIILIIL();
                                        C41958GdO.LJIILJJIL(str2);
                                        C5S1 c5s1 = new C5S1(activityC45651qj2);
                                        c5s1.LIZJ(R.string.c9e);
                                        c5s1.LJ();
                                    }
                                }
                            }
                        });
                        return;
                    }
                    List<String> LIZJ = C60903NvH.LJIIJJI().getPublishService().LJIILIIL().LIZJ();
                    if (LIZJ.isEmpty()) {
                        return;
                    }
                    String str2 = (String) ListProtector.get(LIZJ, 0);
                    C41859Gbn LIZIZ = C1I0.LIZIZ();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("showUploadRecoverIfNeed isServerException = ");
                    LIZ.append(failureReason.isServerException);
                    LIZ.append("  ");
                    LIZ.append(str2);
                    LIZIZ.LIZJ("upload_recover", X1D.LIZIZ(LIZ));
                    if (!failureReason.isServerException && TextUtils.isEmpty(str2)) {
                        return;
                    }
                    C60903NvH.LJIIJJI().getPublishService().LJIILIIL();
                    C41958GdO.LJIILJJIL(str2);
                    C5S1 c5s1 = new C5S1(activityC45651qj);
                    c5s1.LIZJ(R.string.c9e);
                    c5s1.LJ();
                }

                @Override // com.ss.android.ugc.aweme.services.external.IGetPublishDraftCallback
                public void onSuccess(AwemeDraft draft) {
                    o.LJIIIZ(draft, "draft");
                    AVPublishServiceImpl.this.isRecoverPhotoModePublish = draft.LJIIIZ();
                    AVPublishServiceImpl.this.isRecoverNowPublish = C41802Gas.LJII(draft);
                    ShoutOutsData shoutOutsData = draft.LJJJJI.shoutOutsData;
                    if (shoutOutsData != null) {
                        Dialog dialog = null;
                        if (!TextUtils.equals(shoutOutsData.getShoutOutsMode(), ShoutOutsData.MODE_POST)) {
                            if (o.LJ("AvApiFragmentObserver onAttach", failureReason.scene)) {
                                return;
                            }
                            C41474GPm c41474GPm = new C41474GPm(draft, failureReason);
                            AVPublishServiceImpl aVPublishServiceImpl = AVPublishServiceImpl.this;
                            ActivityC45651qj activityC45651qj2 = activityC45651qj;
                            if (activityC45651qj2 != null) {
                                dialog = GVA.LIZLLL(activityC45651qj2, c41474GPm);
                            }
                            aVPublishServiceImpl.mShoutOutsUploadRecoverDialog = dialog;
                            return;
                        }
                    }
                    final ActivityC45651qj activityC45651qj3 = activityC45651qj;
                    final String str2 = str;
                    final PublishFailureReason publishFailureReason = failureReason;
                    final AVPublishServiceImpl aVPublishServiceImpl2 = AVPublishServiceImpl.this;
                    C5DB.LIZIZ(draft, new C5DA() { // from class: com.ss.android.ugc.aweme.services.AVPublishServiceImpl$showUploadRecoverIfNeed$2$onSuccess$2
                        @Override // X.C5DA
                        public void onFinish(final AwemeDraft awemeDraft) {
                            ActivityC45651qj activityC45651qj4 = ActivityC45651qj.this;
                            if (activityC45651qj4 == null || activityC45651qj4.isFinishing()) {
                                return;
                            }
                            final ActivityC45651qj activityC45651qj5 = ActivityC45651qj.this;
                            final String str3 = str2;
                            final PublishFailureReason publishFailureReason2 = publishFailureReason;
                            final AVPublishServiceImpl aVPublishServiceImpl3 = aVPublishServiceImpl2;
                            activityC45651qj5.runOnUiThread(new Runnable() { // from class: com.ss.android.ugc.aweme.services.AVPublishServiceImpl$showUploadRecoverIfNeed$2$onSuccess$2$onFinish$1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com_ss_android_ugc_aweme_services_AVPublishServiceImpl$showUploadRecoverIfNeed$2$onSuccess$2$onFinish$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                                }

                                public final void com_ss_android_ugc_aweme_services_AVPublishServiceImpl$showUploadRecoverIfNeed$2$onSuccess$2$onFinish$1__run$___twin___() {
                                    IExternalService LIZ = AVExternalServiceImpl.LIZ();
                                    final String str4 = str3;
                                    final AwemeDraft awemeDraft2 = awemeDraft;
                                    final PublishFailureReason publishFailureReason3 = publishFailureReason2;
                                    final AVPublishServiceImpl aVPublishServiceImpl4 = aVPublishServiceImpl3;
                                    final ActivityC45651qj activityC45651qj6 = activityC45651qj5;
                                    LIZ.asyncServiceWithOutPanel("AVPublishServiceImpl", new SimpleServiceLoadCallback() { // from class: com.ss.android.ugc.aweme.services.AVPublishServiceImpl$showUploadRecoverIfNeed$2$onSuccess$2$onFinish$1.1
                                        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                                        public void onLoad(AsyncAVService service, long j) {
                                            String str5;
                                            o.LJIIIZ(service, "service");
                                            if (str4 == null) {
                                                GVA.LIZ = true;
                                            }
                                            AwemeDraft awemeDraft3 = awemeDraft2;
                                            if (awemeDraft3 != null) {
                                                C41474GPm c41474GPm2 = new C41474GPm(awemeDraft3, publishFailureReason3);
                                                aVPublishServiceImpl4.mUploadRecoverPopView = GVA.LIZ(activityC45651qj6, c41474GPm2, false);
                                                if (aVPublishServiceImpl4.mUploadRecoverPopView != null) {
                                                    if (!TextUtils.isEmpty(publishFailureReason3.errorMsg)) {
                                                        GVB gvb2 = aVPublishServiceImpl4.mUploadRecoverPopView;
                                                        if (gvb2 != null) {
                                                            String str6 = publishFailureReason3.errorMsg;
                                                            if (str6 == null) {
                                                                str6 = "";
                                                            }
                                                            gvb2.setText(str6);
                                                        }
                                                        C145995oB c145995oB = new C145995oB();
                                                        c145995oB.LJI("enter_from", "video_post_page");
                                                        c145995oB.LJI("creation_id", awemeDraft2.LIZ());
                                                        C44423Hc3 currentUser = C44172HVg.LJIJ.getCurrentUser();
                                                        if (currentUser != null) {
                                                            str5 = currentUser.getUid();
                                                        } else {
                                                            str5 = null;
                                                        }
                                                        c145995oB.LJI("user_id", str5);
                                                        FMX.LJIIL("show_publish_unavailable_sound_toast", c145995oB.LIZ);
                                                    }
                                                    GVB gvb3 = aVPublishServiceImpl4.mUploadRecoverPopView;
                                                    if (gvb3 != null) {
                                                        gvb3.LIZLLL();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            "Required value was null.".toString();
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                    });
                                }

                                public static void com_ss_android_ugc_aweme_services_AVPublishServiceImpl$showUploadRecoverIfNeed$2$onSuccess$2$onFinish$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AVPublishServiceImpl$showUploadRecoverIfNeed$2$onSuccess$2$onFinish$1 aVPublishServiceImpl$showUploadRecoverIfNeed$2$onSuccess$2$onFinish$1) {
                                    boolean LIZ;
                                    try {
                                        aVPublishServiceImpl$showUploadRecoverIfNeed$2$onSuccess$2$onFinish$1.com_ss_android_ugc_aweme_services_AVPublishServiceImpl$showUploadRecoverIfNeed$2$onSuccess$2$onFinish$1__run$___twin___();
                                    } finally {
                                        if (LIZ) {
                                        }
                                    }
                                }
                            });
                        }
                    });
                }
            }, 19), C10K.LJIIIIZZ, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x06eb  */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.ss.android.ugc.aweme.creative.model.EditPostModel] */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.ss.android.ugc.aweme.poi.PoiData] */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void startEditPostPublishPage(android.app.Activity r39, com.ss.android.ugc.aweme.feed.model.Aweme r40, int r41, java.lang.String r42) {
        /*
            Method dump skipped, instructions count: 2104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.AVPublishServiceImpl.startEditPostPublishPage(android.app.Activity, com.ss.android.ugc.aweme.feed.model.Aweme, int, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public boolean processMainActivityCallback(ActivityC45651qj activityC45651qj, String str, boolean z, boolean z2, Boolean bool) {
        C44172HVg.LJIILL.getClass();
        return new MainActivityCallback(activityC45651qj, str, z, bool).LJLJJL;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService
    public void addPublishProgressToActivity(ActivityC45651qj activity, boolean z, int i, int i2, boolean z2, IAVPublishService.PublishProgressController publishProgressController, boolean z3) {
        o.LJIIIZ(activity, "activity");
        C6QQ.LIZ(new GVP(i, i2, activity, new AqS157S0100000_7(publishProgressController, 167), z2, z, z3));
    }
}
