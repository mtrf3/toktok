package com.bytedance.android.livesdk.model;

import X.InterfaceC29384Bg4;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes16.dex */
public class AnchorLevel implements InterfaceC29384Bg4 {

    @InterfaceC65349Pkn("experience")
    public long experience;

    @InterfaceC65349Pkn("highest_experience_this_level")
    public long highestExperienceThisLevel;

    @InterfaceC65349Pkn("level")
    public int level;

    @InterfaceC65349Pkn("small_icon")
    public ImageModel levelIcon;

    @InterfaceC65349Pkn("lowest_experience_this_level")
    public long lowestExperienceThisLevel;

    @InterfaceC65349Pkn("profile_dialog_bg_back")
    public ImageModel profileDialogBackBg;

    @InterfaceC65349Pkn("profile_dialog_bg")
    public ImageModel profileDialogBg;

    @InterfaceC65349Pkn("stage_level")
    public ImageModel stageLevelIcon;

    @InterfaceC65349Pkn("task_decrease_experience")
    public long taskDecreaseExperience;

    @InterfaceC65349Pkn("task_end_time")
    public long taskEndTime;

    @InterfaceC65349Pkn("task_start_experience")
    public long taskStartExperience;

    @InterfaceC65349Pkn("task_start_time")
    public long taskStartTime;

    @InterfaceC65349Pkn("task_target_experience")
    public long taskTargetExperience;

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        ImageModel imageModel = this.levelIcon;
        int i5 = 0;
        if (imageModel != null) {
            i = imageModel.hashCode();
        } else {
            i = 0;
        }
        int i6 = ((i * 31) + this.level) * 31;
        long j = this.experience;
        int i7 = (i6 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.lowestExperienceThisLevel;
        int i8 = (i7 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.highestExperienceThisLevel;
        int i9 = (i8 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.taskStartExperience;
        int i10 = (i9 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.taskStartTime;
        int i11 = (i10 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.taskDecreaseExperience;
        int i12 = (i11 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.taskTargetExperience;
        int i13 = (i12 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.taskEndTime;
        int i14 = (i13 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        ImageModel imageModel2 = this.profileDialogBg;
        if (imageModel2 != null) {
            i2 = imageModel2.hashCode();
        } else {
            i2 = 0;
        }
        int i15 = (i14 + i2) * 31;
        ImageModel imageModel3 = this.profileDialogBackBg;
        if (imageModel3 != null) {
            i3 = imageModel3.hashCode();
        } else {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 31;
        ImageModel imageModel4 = this.stageLevelIcon;
        if (imageModel4 != null) {
            i4 = imageModel4.hashCode();
        } else {
            i4 = 0;
        }
        int i17 = (i16 + i4) * 31;
        ImageModel imageModel5 = this.levelIcon;
        if (imageModel5 != null) {
            i5 = imageModel5.hashCode();
        }
        return i17 + i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnchorLevel anchorLevel = (AnchorLevel) obj;
        if (this.level != anchorLevel.level || this.experience != anchorLevel.experience || this.lowestExperienceThisLevel != anchorLevel.lowestExperienceThisLevel || this.highestExperienceThisLevel != anchorLevel.highestExperienceThisLevel || this.taskStartExperience != anchorLevel.taskStartExperience || this.taskStartTime != anchorLevel.taskStartTime || this.taskDecreaseExperience != anchorLevel.taskDecreaseExperience || this.taskTargetExperience != anchorLevel.taskTargetExperience || this.taskEndTime != anchorLevel.taskEndTime) {
            return false;
        }
        ImageModel imageModel = this.profileDialogBg;
        if (imageModel == null ? anchorLevel.profileDialogBg != null : !imageModel.equals(anchorLevel.profileDialogBg)) {
            return false;
        }
        ImageModel imageModel2 = this.profileDialogBackBg;
        if (imageModel2 == null ? anchorLevel.profileDialogBackBg != null : !imageModel2.equals(anchorLevel.profileDialogBackBg)) {
            return false;
        }
        ImageModel imageModel3 = this.stageLevelIcon;
        if (imageModel3 == null ? anchorLevel.stageLevelIcon != null : !imageModel3.equals(anchorLevel.stageLevelIcon)) {
            return false;
        }
        ImageModel imageModel4 = this.levelIcon;
        ImageModel imageModel5 = anchorLevel.levelIcon;
        if (imageModel4 != null) {
            return imageModel4.equals(imageModel5);
        }
        if (imageModel5 == null) {
            return true;
        }
        return false;
    }
}
