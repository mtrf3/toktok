package com.ss.android.ugc.aweme.property;

import X.HLF;
import X.HM5;

/* loaded from: classes8.dex */
public final class AVPreferences_CukaieClosetAdapter extends HLF implements AVPreferences {
    public AVPreferences_CukaieClosetAdapter(HM5 hm5) {
        super(hm5);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getAICaptionSwitch(boolean z) {
        return getStore().getBoolean("ai_caption_switch", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getAllowCreateStickerChanged(boolean z) {
        return getStore().getBoolean("user_changed_allow_create_sticker", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public int getAllowCreateStickerCurrent(int i) {
        return getStore().getInt("allow_create_sticker", i);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public int getBackCameraFilter(int i) {
        return getStore().getInt("back_camera_filter", i);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public int getBackCameraFilterV2(int i) {
        return getStore().getInt("back_camera_filter_v2", i);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public int getBeautificationMode(int i) {
        return getStore().getInt("beautification_mode", i);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getBubbleGuideShown(boolean z) {
        return getStore().getBoolean("setting_bubble_guide_shown", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public int getCameraPosition(int i) {
        return getStore().getInt("camera_position", i);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getCombinedShootModeTipShown(boolean z) {
        return getStore().getBoolean("show_combine_shoot_mode_tip", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getDisableFilter(boolean z) {
        return getStore().getBoolean("disable_filter", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getDurationMode(boolean z) {
        return getStore().getBoolean("duration_mode", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getEnableCommerceUnlockStickerCollectTips(boolean z) {
        return getStore().getBoolean("show_commerce_unlock_sticker_collect_tips", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getEnablePreUpload(boolean z) {
        return getStore().getBoolean("enable_pre_upload", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getEnablePreUploadByUser(boolean z) {
        return getStore().getBoolean("enable_pre_upload_by_user", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public int getFrontCameraFilter(int i) {
        return getStore().getInt("front_camera_filter", i);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public int getFrontCameraFilterV2(int i) {
        return getStore().getInt("front_camera_filter_v2", i);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public float getMaleProbThreshold(float f) {
        return getStore().getFloat("male_prob_threshold", f);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public int getPreUploadEncryptionMode(int i) {
        return getStore().getInt("pre_upload_encryption_mode", i);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getPublishPermissionDialogPublicQNA(boolean z) {
        return getStore().getBoolean("publish_permission_dialog_public_qna", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getReactDuetSettingChanged(boolean z) {
        return getStore().getBoolean("user_changed_setting", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public int getReactDuetSettingCurrent(int i) {
        return getStore().getInt("react_duet_setting", i);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getReactionTipShow(boolean z) {
        return getStore().getBoolean("reaction_tip_show", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public int getRecordUseSuccessCameraType(int i) {
        return getStore().getInt("record_use_success_camera_type", i);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public int getRecordUseSuccessRecordProfile(int i) {
        return getStore().getInt("record_use_success_hardware_profile", i);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public String getSdkV4AuthKey(String str) {
        return getStore().getString("sdk_v4_auth_key", str);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getSpeedPanelOpen(boolean z) {
        return getStore().getBoolean("speed_panel_open", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getStitchSettingChanged(boolean z) {
        return getStore().getBoolean("user_changed_stitch_setting", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public int getStitchSettingCurrent(int i) {
        return getStore().getInt("stitch_setting", i);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getStorageMonitorLocalSwitch(boolean z) {
        return getStore().getBoolean("storage_monitor_local_switch", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getUlikeBeautyCopied(boolean z) {
        return getStore().getBoolean("ulike_beauty_model_copied", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public int getUserBigEyeLevel(int i) {
        return getStore().getInt("user_big_eye_level", i);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public int getUserBlushLevel(int i) {
        return getStore().getInt("user_blush_level", i);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getUserChangeBigEyeLevel(boolean z) {
        return getStore().getBoolean("user_change_big_eye_level", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getUserChangeBlushLevel(boolean z) {
        return getStore().getBoolean("user_change_blush_level", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getUserChangeLipLevel(boolean z) {
        return getStore().getBoolean("user_change_lip_level", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getUserChangeShapeLevel(boolean z) {
        return getStore().getBoolean("user_change_shape_level", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getUserChangeSkinLevel(boolean z) {
        return getStore().getBoolean("user_change_smooth_skin_level", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public int getUserLipLevel(int i) {
        return getStore().getInt("user_lip_level", i);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public int getUserShapeLevel(int i) {
        return getStore().getInt("user_shape_level", i);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public int getUserSmoothSkinLevel(int i) {
        return getStore().getInt("user_smooth_skin_level", i);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public boolean getWatermarkHardcode(boolean z) {
        return getStore().getBoolean("use_watermark_hardcode", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setAICaptionSwitch(boolean z) {
        getStore().LIZIZ("ai_caption_switch", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setAllowCreateStickerChanged(boolean z) {
        getStore().LIZIZ("user_changed_allow_create_sticker", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setAllowCreateStickerCurrent(int i) {
        getStore().LJ(i, "allow_create_sticker");
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setBackCameraFilter(int i) {
        getStore().LJ(i, "back_camera_filter");
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setBackCameraFilterV2(int i) {
        getStore().LJ(i, "back_camera_filter_v2");
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setBeautificationMode(int i) {
        getStore().LJ(i, "beautification_mode");
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setBubbleGuideShown(boolean z) {
        getStore().LIZIZ("setting_bubble_guide_shown", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setCameraPosition(int i) {
        getStore().LJ(i, "camera_position");
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setCombinedShootModeTipShown(boolean z) {
        getStore().LIZIZ("show_combine_shoot_mode_tip", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setDisableFilter(boolean z) {
        getStore().LIZIZ("disable_filter", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setDurationMode(boolean z) {
        getStore().LIZIZ("duration_mode", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setEnableCommerceUnlockStickerCollectTips(boolean z) {
        getStore().LIZIZ("show_commerce_unlock_sticker_collect_tips", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setEnablePreUpload(boolean z) {
        getStore().LIZIZ("enable_pre_upload", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setEnablePreUploadByUser(boolean z) {
        getStore().LIZIZ("enable_pre_upload_by_user", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setFrontCameraFilter(int i) {
        getStore().LJ(i, "front_camera_filter");
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setFrontCameraFilterV2(int i) {
        getStore().LJ(i, "front_camera_filter_v2");
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setMaleProbThreshold(float f) {
        getStore().LJII(f, "male_prob_threshold");
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setPreUploadEncryptionMode(int i) {
        getStore().LJ(i, "pre_upload_encryption_mode");
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setPublishPermissionDialogPublicQNA(boolean z) {
        getStore().LIZIZ("publish_permission_dialog_public_qna", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setReactDuetSettingChanged(boolean z) {
        getStore().LIZIZ("user_changed_setting", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setReactDuetSettingCurrent(int i) {
        getStore().LJ(i, "react_duet_setting");
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setReactionTipShow(boolean z) {
        getStore().LIZIZ("reaction_tip_show", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setRecordUseSuccessCameraType(int i) {
        getStore().LJ(i, "record_use_success_camera_type");
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setRecordUseSuccessRecordProfile(int i) {
        getStore().LJ(i, "record_use_success_hardware_profile");
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setSdkV4AuthKey(String str) {
        getStore().LIZJ("sdk_v4_auth_key", str);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setSpeedPanelOpen(boolean z) {
        getStore().LIZIZ("speed_panel_open", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setStitchSettingChanged(boolean z) {
        getStore().LIZIZ("user_changed_stitch_setting", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setStitchSettingCurrent(int i) {
        getStore().LJ(i, "stitch_setting");
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setStorageMonitorLocalSwitch(boolean z) {
        getStore().LIZIZ("storage_monitor_local_switch", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setUlikeBeautyCopied(boolean z) {
        getStore().LIZIZ("ulike_beauty_model_copied", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setUserBigEyeLevel(int i) {
        getStore().LJ(i, "user_big_eye_level");
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setUserBlushLevel(int i) {
        getStore().LJ(i, "user_blush_level");
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setUserChangeBigEyeLevel(boolean z) {
        getStore().LIZIZ("user_change_big_eye_level", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setUserChangeBlushLevel(boolean z) {
        getStore().LIZIZ("user_change_blush_level", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setUserChangeLipLevel(boolean z) {
        getStore().LIZIZ("user_change_lip_level", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setUserChangeShapeLevel(boolean z) {
        getStore().LIZIZ("user_change_shape_level", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setUserChangeSkinLevel(boolean z) {
        getStore().LIZIZ("user_change_smooth_skin_level", z);
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setUserLipLevel(int i) {
        getStore().LJ(i, "user_lip_level");
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setUserShapeLevel(int i) {
        getStore().LJ(i, "user_shape_level");
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setUserSmoothSkinLevel(int i) {
        getStore().LJ(i, "user_smooth_skin_level");
    }

    @Override // com.ss.android.ugc.aweme.property.AVPreferences
    public void setWatermarkHardcode(boolean z) {
        getStore().LIZIZ("use_watermark_hardcode", z);
    }
}
