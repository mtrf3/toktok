package com.ss.android.ugc.aweme.property;

import X.HM6;
import X.HM7;
import X.HM8;

@HM6("av_settings.xml")
/* loaded from: classes8.dex */
public interface AVPreferences {
    @HM8("ai_caption_switch")
    boolean getAICaptionSwitch(boolean z);

    @HM8("user_changed_allow_create_sticker")
    boolean getAllowCreateStickerChanged(boolean z);

    @HM8("allow_create_sticker")
    int getAllowCreateStickerCurrent(int i);

    @HM8("back_camera_filter")
    int getBackCameraFilter(int i);

    @HM8("back_camera_filter_v2")
    int getBackCameraFilterV2(int i);

    @HM8("beautification_mode")
    int getBeautificationMode(int i);

    @HM8("setting_bubble_guide_shown")
    boolean getBubbleGuideShown(boolean z);

    @HM8("camera_position")
    int getCameraPosition(int i);

    @HM8("show_combine_shoot_mode_tip")
    boolean getCombinedShootModeTipShown(boolean z);

    @HM8("disable_filter")
    boolean getDisableFilter(boolean z);

    @HM8("duration_mode")
    boolean getDurationMode(boolean z);

    @HM8("show_commerce_unlock_sticker_collect_tips")
    boolean getEnableCommerceUnlockStickerCollectTips(boolean z);

    @HM8("enable_pre_upload")
    boolean getEnablePreUpload(boolean z);

    @HM8("enable_pre_upload_by_user")
    boolean getEnablePreUploadByUser(boolean z);

    @HM8("front_camera_filter")
    int getFrontCameraFilter(int i);

    @HM8("front_camera_filter_v2")
    int getFrontCameraFilterV2(int i);

    @HM8("male_prob_threshold")
    float getMaleProbThreshold(float f);

    @HM8("pre_upload_encryption_mode")
    int getPreUploadEncryptionMode(int i);

    @HM8("publish_permission_dialog_public_qna")
    boolean getPublishPermissionDialogPublicQNA(boolean z);

    @HM8("user_changed_setting")
    boolean getReactDuetSettingChanged(boolean z);

    @HM8("react_duet_setting")
    int getReactDuetSettingCurrent(int i);

    @HM8("reaction_tip_show")
    boolean getReactionTipShow(boolean z);

    @HM8("record_use_success_camera_type")
    int getRecordUseSuccessCameraType(int i);

    @HM8("record_use_success_hardware_profile")
    int getRecordUseSuccessRecordProfile(int i);

    @HM8("sdk_v4_auth_key")
    String getSdkV4AuthKey(String str);

    @HM8("speed_panel_open")
    boolean getSpeedPanelOpen(boolean z);

    @HM8("user_changed_stitch_setting")
    boolean getStitchSettingChanged(boolean z);

    @HM8("stitch_setting")
    int getStitchSettingCurrent(int i);

    @HM8("storage_monitor_local_switch")
    boolean getStorageMonitorLocalSwitch(boolean z);

    @HM8("ulike_beauty_model_copied")
    boolean getUlikeBeautyCopied(boolean z);

    @HM8("user_big_eye_level")
    int getUserBigEyeLevel(int i);

    @HM8("user_blush_level")
    int getUserBlushLevel(int i);

    @HM8("user_change_big_eye_level")
    boolean getUserChangeBigEyeLevel(boolean z);

    @HM8("user_change_blush_level")
    boolean getUserChangeBlushLevel(boolean z);

    @HM8("user_change_lip_level")
    boolean getUserChangeLipLevel(boolean z);

    @HM8("user_change_shape_level")
    boolean getUserChangeShapeLevel(boolean z);

    @HM8("user_change_smooth_skin_level")
    boolean getUserChangeSkinLevel(boolean z);

    @HM8("user_lip_level")
    int getUserLipLevel(int i);

    @HM8("user_shape_level")
    int getUserShapeLevel(int i);

    @HM8("user_smooth_skin_level")
    int getUserSmoothSkinLevel(int i);

    @HM8("use_watermark_hardcode")
    boolean getWatermarkHardcode(boolean z);

    @HM7("ai_caption_switch")
    void setAICaptionSwitch(boolean z);

    @HM7("user_changed_allow_create_sticker")
    void setAllowCreateStickerChanged(boolean z);

    @HM7("allow_create_sticker")
    void setAllowCreateStickerCurrent(int i);

    @HM7("back_camera_filter")
    void setBackCameraFilter(int i);

    @HM7("back_camera_filter_v2")
    void setBackCameraFilterV2(int i);

    @HM7("beautification_mode")
    void setBeautificationMode(int i);

    @HM7("setting_bubble_guide_shown")
    void setBubbleGuideShown(boolean z);

    @HM7("camera_position")
    void setCameraPosition(int i);

    @HM7("show_combine_shoot_mode_tip")
    void setCombinedShootModeTipShown(boolean z);

    @HM7("disable_filter")
    void setDisableFilter(boolean z);

    @HM7("duration_mode")
    void setDurationMode(boolean z);

    @HM7("show_commerce_unlock_sticker_collect_tips")
    void setEnableCommerceUnlockStickerCollectTips(boolean z);

    @HM7("enable_pre_upload")
    void setEnablePreUpload(boolean z);

    @HM7("enable_pre_upload_by_user")
    void setEnablePreUploadByUser(boolean z);

    @HM7("front_camera_filter")
    void setFrontCameraFilter(int i);

    @HM7("front_camera_filter_v2")
    void setFrontCameraFilterV2(int i);

    @HM7("male_prob_threshold")
    void setMaleProbThreshold(float f);

    @HM7("pre_upload_encryption_mode")
    void setPreUploadEncryptionMode(int i);

    @HM7("publish_permission_dialog_public_qna")
    void setPublishPermissionDialogPublicQNA(boolean z);

    @HM7("user_changed_setting")
    void setReactDuetSettingChanged(boolean z);

    @HM7("react_duet_setting")
    void setReactDuetSettingCurrent(int i);

    @HM7("reaction_tip_show")
    void setReactionTipShow(boolean z);

    @HM7("record_use_success_camera_type")
    void setRecordUseSuccessCameraType(int i);

    @HM7("record_use_success_hardware_profile")
    void setRecordUseSuccessRecordProfile(int i);

    @HM7("sdk_v4_auth_key")
    void setSdkV4AuthKey(String str);

    @HM7("speed_panel_open")
    void setSpeedPanelOpen(boolean z);

    @HM7("user_changed_stitch_setting")
    void setStitchSettingChanged(boolean z);

    @HM7("stitch_setting")
    void setStitchSettingCurrent(int i);

    @HM7("storage_monitor_local_switch")
    void setStorageMonitorLocalSwitch(boolean z);

    @HM7("ulike_beauty_model_copied")
    void setUlikeBeautyCopied(boolean z);

    @HM7("user_big_eye_level")
    void setUserBigEyeLevel(int i);

    @HM7("user_blush_level")
    void setUserBlushLevel(int i);

    @HM7("user_change_big_eye_level")
    void setUserChangeBigEyeLevel(boolean z);

    @HM7("user_change_blush_level")
    void setUserChangeBlushLevel(boolean z);

    @HM7("user_change_lip_level")
    void setUserChangeLipLevel(boolean z);

    @HM7("user_change_shape_level")
    void setUserChangeShapeLevel(boolean z);

    @HM7("user_change_smooth_skin_level")
    void setUserChangeSkinLevel(boolean z);

    @HM7("user_lip_level")
    void setUserLipLevel(int i);

    @HM7("user_shape_level")
    void setUserShapeLevel(int i);

    @HM7("user_smooth_skin_level")
    void setUserSmoothSkinLevel(int i);

    @HM7("use_watermark_hardcode")
    void setWatermarkHardcode(boolean z);
}
