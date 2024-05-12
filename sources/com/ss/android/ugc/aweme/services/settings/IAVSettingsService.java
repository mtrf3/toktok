package com.ss.android.ugc.aweme.services.settings;

import X.HLX;
import com.google.gson.m;

/* loaded from: classes8.dex */
public interface IAVSettingsService {
    HLX<Boolean> bubbleGuideShown();

    boolean clickAnchorLandingAlbumDirectly();

    boolean downloadEffectOrMusicAfterEnterCamera();

    boolean enableFeedbackLog();

    boolean enableFrontFlash();

    boolean enableLightningPrivacySetting();

    boolean enableModelFileOnlyEnv();

    boolean enableNowsSelfieWindowGoldenRatio();

    boolean enableOpenAlbumExcludeNewUser();

    boolean enableOpenAlbumForAll();

    boolean enableOpenStopVideoPlayerOpti();

    boolean enableQaSticker();

    boolean enableReeditPostedDraftInSharePanel();

    boolean enableReleaseVideoPlayerOpt();

    boolean enableSaveDraftAfterPosting();

    boolean enableSaveOwnVideoWithoutWatermask();

    boolean enableSaveUploadVideo();

    boolean enableSharePanelTuxDialogRefactor();

    boolean enableShowCutsameAnchor();

    boolean enableShowMvAnchor();

    boolean enableStitch();

    boolean enableTaskDegradationOpti();

    boolean enableUploadSyncIns();

    boolean enableUploadSyncInsStory();

    boolean enableUploadSyncTwitter();

    String getEffectVersion();

    boolean getLongVideoPermittedValue();

    boolean getMvThemeRecordMode();

    boolean getPublishProgressOptimize();

    String[] getSharePostEffectIds();

    boolean getShieldTemplateExp();

    String getStickerArtistIconUrl();

    String getVESDKVersion();

    boolean isDuetAutoApplyEffectEnabled();

    boolean isEnableGetThumbsWithEffect();

    boolean isEnableUseVEGetThumbs();

    boolean isEnableVideoEditActivityUploadSpeedProbe();

    boolean isLongVideoPermitted();

    boolean isPhotoEditEnabled();

    boolean isPrivateAvailable();

    long longVideoThresholdWithTolerance();

    boolean needLoginBeforeRecord();

    boolean optPermission();

    long progressBarThreshold();

    void setDefaultFilterForCamera(int i, int i2);

    boolean shareVideo2GifEditable();

    boolean showDuetWithReact();

    boolean showMvThemeRecordMode();

    void updateABTestModel(m mVar);
}
