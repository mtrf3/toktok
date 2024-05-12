package com.ss.android.ugc.aweme.port.internal;

import X.HM6;
import X.HM7;
import X.HM8;

@HM6("VideoRecord")
/* loaded from: classes8.dex */
public interface IVideoRecordPreferences {
    @HM8("count_down_mode")
    int getCountDownMode(int i);

    @HM8("creative_tools_root_path")
    String getCreativeToolRootDir(String str);

    @HM8("interrupt_recover_path")
    String getInterruptRecoverPath(String str);

    @HM8("parallel_last_auto_recover_paths")
    String getLastAutoRecoverPaths(String str);

    @HM8("main_plus_clicked_time")
    long getMainPlusClickedTime(long j);

    @HM8("main_plus_show_bubble_time")
    long getMainPlusShowBubbleTime(long j);

    @HM8("publish_parallel_uploadRecoverPath")
    String getPublishParallelUploadRecoverPath(String str);

    @HM8("resources_version")
    int getResourcesVersion();

    @HM8("mention_video_guide_panel")
    boolean getShouldShowMentionVideoGuidePanel(boolean z);

    @HM8("ulikebeauty_blush_default")
    float getUlikeBeautyBlushDefault(float f);

    @HM8("ulikebeauty_blush_max")
    float getUlikeBeautyBlushMax(float f);

    @HM8("ulikebeauty_download_data")
    String getUlikeBeautyDownloadData(String str);

    @HM8("ulikebeauty_eye_max")
    float getUlikeBeautyEyeMax(float f);

    @HM8("ulikebeauty_lip_default")
    float getUlikeBeautyLipDefault(float f);

    @HM8("ulikebeauty_lip_max")
    float getUlikeBeautyLipMax(float f);

    @HM8("ulikebeauty_shape_default")
    float getUlikeBeautyShapeDefault(float f);

    @HM8("ulikebeauty_shape_max")
    float getUlikeBeautyShapeMax(float f);

    @HM8("ulikebeauty_sharp_default")
    float getUlikeBeautySharpDefault(float f);

    @HM8("ulikebeauty_sharp_max")
    float getUlikeBeautySharpMax(float f);

    @HM8("ulikebeauty_smooth_default")
    float getUlikeBeautySmoothDefault(float f);

    @HM8("ulikebeauty_smooth_max")
    float getUlikeBeautySmoothMax(float f);

    @HM8("ulikebeauty_eye_default")
    float getUlikeEyeDefault(float f);

    @HM8("uploadRecoverPath")
    String getUploadRecoverPath(String str);

    @HM8("ZT_Last_Insert_Time")
    long getZTLastInsertTime(long j);

    @HM8("has_click_blessing_tag")
    boolean isBlessingTagClicked(boolean z);

    @HM8("is_duration_mode_manually_change")
    boolean isDurationModeManuallyChange(boolean z);

    @HM8("is_first_enter_record_page")
    boolean isFirstEnterRecordPage(boolean z);

    @HM7("has_click_blessing_tag")
    void setBlessingTagClicked(boolean z);

    @HM7("count_down_mode")
    void setCountDownMode(int i);

    @HM7("creative_tools_root_path")
    void setCreativeToolRootDir(String str);

    @HM7("is_duration_mode_manually_change")
    void setDurationModeManuallyChange(boolean z);

    @HM7("is_first_enter_record_page")
    void setFirstEnterRecordPage(boolean z);

    @HM7("interrupt_recover_path")
    void setInterruptRecoverPath(String str);

    @HM7("parallel_last_auto_recover_paths")
    void setLastAutoRecoverPaths(String str);

    @HM7("main_plus_clicked_time")
    void setMainPlusClickedTime(long j);

    @HM7("main_plus_show_bubble_time")
    void setMainPlusHasShowBubble(long j);

    @HM7("publish_parallel_uploadRecoverPath")
    void setPublishParallelUploadRecoverPath(String str);

    @HM7("resources_version")
    void setResourcesVersion(int i);

    @HM7("count_down_new_tag")
    void setShouldShowCountDownNewTag(boolean z);

    @HM7("mention_video_guide_panel")
    void setShouldShowMentionVideoGuidePanel(boolean z);

    @HM7("ulikebeauty_blush_default")
    void setUlikeBeautyBlushDefault(float f);

    @HM7("ulikebeauty_blush_max")
    void setUlikeBeautyBlushMax(float f);

    @HM7("ulikebeauty_download_data")
    void setUlikeBeautyDownloadData(String str);

    @HM7("ulikebeauty_eye_default")
    void setUlikeBeautyEyeDefault(float f);

    @HM7("ulikebeauty_eye_max")
    void setUlikeBeautyEyeMax(float f);

    @HM7("ulikebeauty_lip_default")
    void setUlikeBeautyLipDefault(float f);

    @HM7("ulikebeauty_lip_max")
    void setUlikeBeautyLipMax(float f);

    @HM7("ulikebeauty_shape_default")
    void setUlikeBeautyShapeDefault(float f);

    @HM7("ulikebeauty_shape_max")
    void setUlikeBeautyShapeMax(float f);

    @HM7("ulikebeauty_sharp_default")
    void setUlikeBeautySharpDefault(float f);

    @HM7("ulikebeauty_sharp_max")
    void setUlikeBeautySharpMax(float f);

    @HM7("ulikebeauty_smooth_default")
    void setUlikeBeautySmoothDefault(float f);

    @HM7("ulikebeauty_smooth_max")
    void setUlikeBeautySmoothMax(float f);

    @HM7("uploadRecoverPath")
    void setUploadRecoverPath(String str);

    @HM7("ZT_Last_Insert_Time")
    void setZTLastInsertTime(long j);

    @HM8("count_down_new_tag")
    boolean shouldShowCountDownNewTag(boolean z);
}
