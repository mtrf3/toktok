package com.ss.android.ugc.aweme.port.internal;

import X.HLF;
import X.HM5;

/* loaded from: classes8.dex */
public final class IVideoRecordPreferences_CukaieClosetAdapter extends HLF implements IVideoRecordPreferences {
    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public int getResourcesVersion() {
        return getStore().getInt("resources_version", 0);
    }

    public IVideoRecordPreferences_CukaieClosetAdapter(HM5 hm5) {
        super(hm5);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public int getCountDownMode(int i) {
        return getStore().getInt("count_down_mode", i);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public String getCreativeToolRootDir(String str) {
        return getStore().getString("creative_tools_root_path", str);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public String getInterruptRecoverPath(String str) {
        return getStore().getString("interrupt_recover_path", str);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public String getLastAutoRecoverPaths(String str) {
        return getStore().getString("parallel_last_auto_recover_paths", str);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public long getMainPlusClickedTime(long j) {
        return getStore().getLong("main_plus_clicked_time", j);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public long getMainPlusShowBubbleTime(long j) {
        return getStore().getLong("main_plus_show_bubble_time", j);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public String getPublishParallelUploadRecoverPath(String str) {
        return getStore().getString("publish_parallel_uploadRecoverPath", str);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public boolean getShouldShowMentionVideoGuidePanel(boolean z) {
        return getStore().getBoolean("mention_video_guide_panel", z);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public float getUlikeBeautyBlushDefault(float f) {
        return getStore().getFloat("ulikebeauty_blush_default", f);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public float getUlikeBeautyBlushMax(float f) {
        return getStore().getFloat("ulikebeauty_blush_max", f);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public String getUlikeBeautyDownloadData(String str) {
        return getStore().getString("ulikebeauty_download_data", str);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public float getUlikeBeautyEyeMax(float f) {
        return getStore().getFloat("ulikebeauty_eye_max", f);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public float getUlikeBeautyLipDefault(float f) {
        return getStore().getFloat("ulikebeauty_lip_default", f);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public float getUlikeBeautyLipMax(float f) {
        return getStore().getFloat("ulikebeauty_lip_max", f);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public float getUlikeBeautyShapeDefault(float f) {
        return getStore().getFloat("ulikebeauty_shape_default", f);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public float getUlikeBeautyShapeMax(float f) {
        return getStore().getFloat("ulikebeauty_shape_max", f);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public float getUlikeBeautySharpDefault(float f) {
        return getStore().getFloat("ulikebeauty_sharp_default", f);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public float getUlikeBeautySharpMax(float f) {
        return getStore().getFloat("ulikebeauty_sharp_max", f);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public float getUlikeBeautySmoothDefault(float f) {
        return getStore().getFloat("ulikebeauty_smooth_default", f);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public float getUlikeBeautySmoothMax(float f) {
        return getStore().getFloat("ulikebeauty_smooth_max", f);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public float getUlikeEyeDefault(float f) {
        return getStore().getFloat("ulikebeauty_eye_default", f);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public String getUploadRecoverPath(String str) {
        return getStore().getString("uploadRecoverPath", str);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public long getZTLastInsertTime(long j) {
        return getStore().getLong("ZT_Last_Insert_Time", j);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public boolean isBlessingTagClicked(boolean z) {
        return getStore().getBoolean("has_click_blessing_tag", z);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public boolean isDurationModeManuallyChange(boolean z) {
        return getStore().getBoolean("is_duration_mode_manually_change", z);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public boolean isFirstEnterRecordPage(boolean z) {
        return getStore().getBoolean("is_first_enter_record_page", z);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setBlessingTagClicked(boolean z) {
        getStore().LIZIZ("has_click_blessing_tag", z);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setCountDownMode(int i) {
        getStore().LJ(i, "count_down_mode");
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setCreativeToolRootDir(String str) {
        getStore().LIZJ("creative_tools_root_path", str);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setDurationModeManuallyChange(boolean z) {
        getStore().LIZIZ("is_duration_mode_manually_change", z);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setFirstEnterRecordPage(boolean z) {
        getStore().LIZIZ("is_first_enter_record_page", z);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setInterruptRecoverPath(String str) {
        getStore().LIZJ("interrupt_recover_path", str);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setLastAutoRecoverPaths(String str) {
        getStore().LIZJ("parallel_last_auto_recover_paths", str);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setMainPlusClickedTime(long j) {
        getStore().LIZ(j, "main_plus_clicked_time");
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setMainPlusHasShowBubble(long j) {
        getStore().LIZ(j, "main_plus_show_bubble_time");
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setPublishParallelUploadRecoverPath(String str) {
        getStore().LIZJ("publish_parallel_uploadRecoverPath", str);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setResourcesVersion(int i) {
        getStore().LJ(i, "resources_version");
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setShouldShowCountDownNewTag(boolean z) {
        getStore().LIZIZ("count_down_new_tag", z);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setShouldShowMentionVideoGuidePanel(boolean z) {
        getStore().LIZIZ("mention_video_guide_panel", z);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setUlikeBeautyBlushDefault(float f) {
        getStore().LJII(f, "ulikebeauty_blush_default");
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setUlikeBeautyBlushMax(float f) {
        getStore().LJII(f, "ulikebeauty_blush_max");
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setUlikeBeautyDownloadData(String str) {
        getStore().LIZJ("ulikebeauty_download_data", str);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setUlikeBeautyEyeDefault(float f) {
        getStore().LJII(f, "ulikebeauty_eye_default");
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setUlikeBeautyEyeMax(float f) {
        getStore().LJII(f, "ulikebeauty_eye_max");
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setUlikeBeautyLipDefault(float f) {
        getStore().LJII(f, "ulikebeauty_lip_default");
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setUlikeBeautyLipMax(float f) {
        getStore().LJII(f, "ulikebeauty_lip_max");
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setUlikeBeautyShapeDefault(float f) {
        getStore().LJII(f, "ulikebeauty_shape_default");
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setUlikeBeautyShapeMax(float f) {
        getStore().LJII(f, "ulikebeauty_shape_max");
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setUlikeBeautySharpDefault(float f) {
        getStore().LJII(f, "ulikebeauty_sharp_default");
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setUlikeBeautySharpMax(float f) {
        getStore().LJII(f, "ulikebeauty_sharp_max");
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setUlikeBeautySmoothDefault(float f) {
        getStore().LJII(f, "ulikebeauty_smooth_default");
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setUlikeBeautySmoothMax(float f) {
        getStore().LJII(f, "ulikebeauty_smooth_max");
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setUploadRecoverPath(String str) {
        getStore().LIZJ("uploadRecoverPath", str);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public void setZTLastInsertTime(long j) {
        getStore().LIZ(j, "ZT_Last_Insert_Time");
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public boolean shouldShowCountDownNewTag(boolean z) {
        return getStore().getBoolean("count_down_new_tag", z);
    }
}
