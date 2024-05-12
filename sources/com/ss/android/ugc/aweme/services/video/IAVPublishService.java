package com.ss.android.ugc.aweme.services.video;

import X.ActivityC45651qj;
import X.C41359GLb;
import X.C41759GaB;
import X.C8R4;
import X.GSX;
import X.GVH;
import X.InterfaceC224558rb;
import X.InterfaceC41605GUn;
import X.InterfaceC42037Gef;
import X.InterfaceC42527GmZ;
import X.InterfaceC88472Yns;
import X.OSZ;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse;
import com.ss.android.ugc.aweme.creative.model.PaidContentVideoModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.editpost.BizExpiration;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.PublishFailMsg;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public interface IAVPublishService {

    /* loaded from: classes8.dex */
    public interface PublishProgressController {
        boolean initHide();
    }

    /* loaded from: classes8.dex */
    public interface PublishProgressFragment {
        void dismissAllowingStateLossNow();

        void hide();

        void setArguments(Bundle bundle);

        void setIsChangeAvatar(boolean z);

        void setPublishBinder(InterfaceC42037Gef interfaceC42037Gef);

        void setPublishId(String str);

        void show(FragmentManager fragmentManager, String str);

        void show(boolean z);

        void showInSpecificId(FragmentManager fragmentManager, String str, int i, boolean z);
    }

    void addAVChallenges(List<AVChallenge> list);

    void addAllPublishProgress(ActivityC45651qj activityC45651qj, int i, boolean z, boolean z2);

    void addChallenge(Challenge challenge);

    void addMusic(MusicModel musicModel, int i);

    void addPublishCallback(InterfaceC41605GUn<CreateBaseAwemeResponse> interfaceC41605GUn, String str);

    void addPublishPreviewCallback(String str, InterfaceC42527GmZ interfaceC42527GmZ);

    void addPublishProgressToActivity(ActivityC45651qj activityC45651qj, boolean z, int i, int i2, boolean z2, PublishProgressController publishProgressController, boolean z3);

    boolean canAutoRetry();

    void cancelPublish(String str, C41359GLb c41359GLb);

    boolean cancelPublishByClickCover(String str);

    void cancelRestoreOnMain();

    void cancelRestoreOnMain(Activity activity);

    void cancelSynthesis(Context context, String str);

    void changeIntentToHighlightIfNeed(ActivityC45651qj activityC45651qj, Intent intent, BaseShortVideoContext baseShortVideoContext);

    void checkAndAutoRetryIfNeed(ActivityC45651qj activityC45651qj);

    boolean checkIfCache(String str);

    boolean checkIsAlreadyPublished(Context context);

    void clearCurChallenge();

    boolean containEmoji(String str);

    View createCoverMaskView(Context context, View view);

    boolean enableCacheOptimize();

    boolean enableEffectWatermark();

    boolean enableFloatingProgress();

    boolean enablePreviewPublishVideo();

    boolean enablePublishAsTemplate();

    boolean enableSaveLocalInLegacyScenario();

    void finishAllCreativeActivity(ActivityC45651qj activityC45651qj);

    List<PublishModel> getAllProgressValidPublishModel();

    int getAllProgressValidPublishSize();

    ArrayList<Aweme> getAllPublishAwemes();

    List<PublishModel> getAllPublishModel();

    String getAwemeType();

    List<File> getCacheFileListWithOutPublishing();

    Bitmap getCover(PublishModel publishModel);

    AVChallenge getCurChallenge();

    String getCurrentPublishTaskId();

    String getCurrentSecUid();

    String getCurrentUserId();

    BizExpiration[] getEditPostBizExPiration();

    String getErrorHintWhenDisableDuetOrStitch(int i);

    String getErrorMsg(Context context, C41759GaB c41759GaB, String str);

    List<String> getLastPublishedVids();

    List<File> getNotCleanableFileList();

    int[] getOutputMediaSize(BaseShortVideoContext baseShortVideoContext);

    PaidContentVideoModel getPaidContentVideoModel(PublishModel publishModel);

    int getParallelPublishTaskSize();

    InterfaceC41605GUn<CreateBaseAwemeResponse> getParallelPublishUICallBack(PublishProgressFragment publishProgressFragment, String str, PublishModel publishModel);

    OSZ<InterfaceC41605GUn<CreateBaseAwemeResponse>, Boolean> getParallelPublishUICallBackPair(PublishProgressFragment publishProgressFragment, String str, PublishModel publishModel);

    Object getPublishMetaData(Object obj);

    PublishModel getPublishModel(String str);

    InterfaceC224558rb getPublishPreviewmanager();

    PublishProgressFragment getPublishProgressFragment(boolean z);

    String getPublisherEventAsJSON();

    String getShootWay();

    C8R4 getSurveyAfterPostService();

    String getVideoTitle(PublishModel publishModel);

    void giveupNowsPublish();

    int globalProgressExpValue();

    boolean hasECCommerceAnchor();

    void hideProgress(ActivityC45651qj activityC45651qj);

    void hideUploadRecoverWindow(Context context, boolean z, boolean z2);

    boolean inPublishPage();

    boolean inPublishPage(Context context);

    boolean isAfterPost();

    boolean isAutoRetry();

    boolean isCoverOptimizationEnable();

    boolean isCreativeToolsActivity(Activity activity);

    boolean isEnableChangeShareToCell();

    boolean isEnableCombineCDS();

    boolean isEnablePutSettingsIntoMoreOption();

    boolean isImageMode(String str);

    boolean isInShoutout();

    boolean isMainCameraPublishingOrStoryCameraPublishing();

    boolean isMultiTaskRecover();

    boolean isParallelPublishContinue();

    boolean isParallelPublishDialogFragment(PublishProgressFragment publishProgressFragment);

    boolean isParallelPublishTaskFinished();

    boolean isPublishDialogFragment(PublishProgressFragment publishProgressFragment);

    boolean isPublishServiceRunning(Context context);

    boolean isPublishing();

    boolean isReturnCaptionEnabled();

    boolean isStory(String str);

    boolean isSubOnlyVideo();

    void log(String str, String str2);

    void moveProgress(int i, int i2);

    boolean needPauseFeed();

    boolean needRestore();

    boolean needShowAnim();

    void onSaveLocalTimeoutEvent(String str);

    long passedDaysAfterPost(long j);

    boolean processMainActivityCallback(ActivityC45651qj activityC45651qj, String str, boolean z, boolean z2, Boolean bool);

    boolean processPublish(ActivityC45651qj activityC45651qj, Intent intent, Boolean bool);

    void recoverNowsPublish(ActivityC45651qj activityC45651qj);

    void registerPublishProgressCallback(Activity activity, GVH gvh);

    void removeProgress(ActivityC45651qj activityC45651qj);

    void removePublishCallback(InterfaceC41605GUn<CreateBaseAwemeResponse> interfaceC41605GUn);

    void reportQuitAutoUploadingEvent(Object obj, String str);

    void reportQuitAutoUploadingShowEvent(Object obj);

    void resetNewCreateWay();

    List<String> resolveHashtagNamesInCaption(BaseShortVideoContext baseShortVideoContext);

    boolean returnMentionVideoRespose(Activity activity, VideoInfoFromURLResponse videoInfoFromURLResponse, String str);

    void saveLocalByUniqueURI(String str);

    void setChainInfo(Activity activity, GSX gsx);

    void setCurMusic(MusicModel musicModel, int i);

    void setCurMusic(MusicModel musicModel, Boolean bool, int i);

    void setECCommerceAnchor(boolean z);

    void setHashTagRegex(String str);

    void setKitManageRegister(boolean z);

    void setMentionVideoSubType(Activity activity, int i);

    void setMultiTaskRecover(boolean z);

    void setMusicChooseType(int i);

    void setNeedShowAnim(boolean z);

    void setPopWindowStillExists(boolean z);

    void setPublishStatus(int i);

    boolean shouldDisableDuetOrStitch(int i, int i2);

    boolean shouldShowAddToMixWithinSheet();

    void showMentionVideoLoading(Activity activity);

    void showPhotoCoverWhenPreview(Aweme aweme, SmartImageView smartImageView, View view);

    void showProgress(ActivityC45651qj activityC45651qj, boolean z);

    void showPublishRecoverViewForCCPublish(ActivityC45651qj activityC45651qj, String str, PublishFailMsg publishFailMsg);

    Dialog showRestoreWorkDialog(Activity activity, String str);

    void showUploadRecoverIfNeed(PublishFailureReason publishFailureReason, ActivityC45651qj activityC45651qj, PublishModel publishModel, String str);

    void startEditPostPublishPage(Activity activity, Aweme aweme, int i, String str);

    String startPublish(ActivityC45651qj activityC45651qj, Bundle bundle);

    boolean tryRegisterHomePageUICallback(Activity activity, String str);

    void tryRestorePublish(ActivityC45651qj activityC45651qj, InterfaceC88472Yns<Boolean, Void> interfaceC88472Yns);

    boolean turnOffSaveLocalAfterModeration();

    boolean turnOffSaveLocalOptionByDefault();

    void updateShowPromptTimes();

    void uploadRecoverPopViewSetVisibility(boolean z);

    List<String> viralEffectIds();
}
