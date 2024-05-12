package com.bytedance.android.livesdk.model;

import X.InterfaceC29385Bg5;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* loaded from: classes16.dex */
public class UserHonor implements InterfaceC29385Bg5 {

    @InterfaceC65349Pkn("deprecated23")
    public long currentDiamond;

    @InterfaceC65349Pkn("icon")
    public ImageModel currentHonorIcon;

    @InterfaceC65349Pkn("diamond_icon")
    public ImageModel diamondIcon;

    @InterfaceC65349Pkn("grade_icon_list")
    public List<GradeIcon> gradeIconList;

    @InterfaceC65349Pkn("im_icon")
    public ImageModel imIcon;

    @InterfaceC65349Pkn("im_icon_with_level")
    public ImageModel imIconWithLevel;

    @InterfaceC65349Pkn("level")
    public int level;

    @InterfaceC65349Pkn("live_icon")
    public ImageModel liveIcon;

    @InterfaceC65349Pkn("new_im_icon_with_level")
    public ImageModel newImIconWithLevel;

    @InterfaceC65349Pkn("new_live_icon")
    public ImageModel newLiveIcon;

    @InterfaceC65349Pkn("next_icon")
    public ImageModel nextHonorIcon;

    @InterfaceC65349Pkn("background_back")
    public ImageModel profileDialogBackBg;

    @InterfaceC65349Pkn("background")
    public ImageModel profileDialogBg;

    @InterfaceC65349Pkn("score")
    public long score;

    @InterfaceC65349Pkn("screen_chat_type")
    public long screenChatType;

    @InterfaceC65349Pkn("deprecated25")
    public long thisGradeMaxDiamond;

    @InterfaceC65349Pkn("deprecated24")
    public long thisGradeMinDiamond;

    @InterfaceC65349Pkn("deprecated20")
    public long totalDiamond;

    @InterfaceC65349Pkn("upgrade_need_consume")
    public long upgradeNeedConsume;

    @InterfaceC65349Pkn("next_name")
    public String nextHonorName = "";

    @InterfaceC65349Pkn("name")
    public String currentHonorName = "";

    @InterfaceC65349Pkn("grade_describe")
    public String gradeDescribe = "";

    @InterfaceC65349Pkn("grade_banner")
    public String gradeBanner = "";

    @InterfaceC65349Pkn("next_privileges")
    public String nextPrivileges = "";

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        ImageModel imageModel = this.diamondIcon;
        int i14 = 0;
        if (imageModel != null) {
            i = imageModel.hashCode();
        } else {
            i = 0;
        }
        int i15 = i * 31;
        ImageModel imageModel2 = this.currentHonorIcon;
        if (imageModel2 != null) {
            i2 = imageModel2.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = (i15 + i2) * 31;
        ImageModel imageModel3 = this.nextHonorIcon;
        if (imageModel3 != null) {
            i3 = imageModel3.hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (i16 + i3) * 31;
        String str = this.nextHonorName;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i18 = (i17 + i4) * 31;
        String str2 = this.currentHonorName;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        long j = this.totalDiamond;
        int i19 = (((i18 + i5) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.currentDiamond;
        int i20 = (i19 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        ImageModel imageModel4 = this.imIcon;
        if (imageModel4 != null) {
            i6 = imageModel4.hashCode();
        } else {
            i6 = 0;
        }
        int i21 = (i20 + i6) * 31;
        ImageModel imageModel5 = this.imIconWithLevel;
        if (imageModel5 != null) {
            i7 = imageModel5.hashCode();
        } else {
            i7 = 0;
        }
        int i22 = (i21 + i7) * 31;
        ImageModel imageModel6 = this.newImIconWithLevel;
        if (imageModel6 != null) {
            i8 = imageModel6.hashCode();
        } else {
            i8 = 0;
        }
        int i23 = (i22 + i8) * 31;
        ImageModel imageModel7 = this.liveIcon;
        if (imageModel7 != null) {
            i9 = imageModel7.hashCode();
        } else {
            i9 = 0;
        }
        int i24 = (i23 + i9) * 31;
        ImageModel imageModel8 = this.newLiveIcon;
        if (imageModel8 != null) {
            i10 = imageModel8.hashCode();
        } else {
            i10 = 0;
        }
        int i25 = (((i24 + i10) * 31) + this.level) * 31;
        List<GradeIcon> list = this.gradeIconList;
        if (list != null) {
            i11 = list.hashCode();
        } else {
            i11 = 0;
        }
        int i26 = (i25 + i11) * 31;
        String str3 = this.gradeDescribe;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        long j3 = this.thisGradeMaxDiamond;
        int i27 = (((i26 + i12) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.thisGradeMinDiamond;
        int i28 = (i27 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        ImageModel imageModel9 = this.profileDialogBg;
        if (imageModel9 != null) {
            i13 = imageModel9.hashCode();
        } else {
            i13 = 0;
        }
        int i29 = (i28 + i13) * 31;
        ImageModel imageModel10 = this.profileDialogBackBg;
        if (imageModel10 != null) {
            i14 = imageModel10.hashCode();
        }
        return i29 + i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserHonor userHonor = (UserHonor) obj;
        if (this.totalDiamond != userHonor.totalDiamond || this.currentDiamond != userHonor.currentDiamond || this.level != userHonor.level) {
            return false;
        }
        ImageModel imageModel = this.diamondIcon;
        if (imageModel == null ? userHonor.diamondIcon != null : !imageModel.equals(userHonor.diamondIcon)) {
            return false;
        }
        ImageModel imageModel2 = this.currentHonorIcon;
        if (imageModel2 == null ? userHonor.currentHonorIcon != null : !imageModel2.equals(userHonor.currentHonorIcon)) {
            return false;
        }
        ImageModel imageModel3 = this.nextHonorIcon;
        if (imageModel3 == null ? userHonor.nextHonorIcon != null : !imageModel3.equals(userHonor.nextHonorIcon)) {
            return false;
        }
        String str = this.nextHonorName;
        if (str == null ? userHonor.nextHonorName != null : !str.equals(userHonor.nextHonorName)) {
            return false;
        }
        String str2 = this.currentHonorName;
        if (str2 == null ? userHonor.currentHonorName != null : !str2.equals(userHonor.currentHonorName)) {
            return false;
        }
        ImageModel imageModel4 = this.imIcon;
        if (imageModel4 == null ? userHonor.imIcon != null : !imageModel4.equals(userHonor.imIcon)) {
            return false;
        }
        ImageModel imageModel5 = this.imIconWithLevel;
        if (imageModel5 == null ? userHonor.imIconWithLevel != null : !imageModel5.equals(userHonor.imIconWithLevel)) {
            return false;
        }
        ImageModel imageModel6 = this.newImIconWithLevel;
        if (imageModel6 == null ? userHonor.newImIconWithLevel != null : !imageModel6.equals(userHonor.newImIconWithLevel)) {
            return false;
        }
        ImageModel imageModel7 = this.liveIcon;
        if (imageModel7 == null ? userHonor.liveIcon != null : !imageModel7.equals(userHonor.liveIcon)) {
            return false;
        }
        ImageModel imageModel8 = this.newLiveIcon;
        if (imageModel8 == null ? userHonor.newLiveIcon != null : !imageModel8.equals(userHonor.newLiveIcon)) {
            return false;
        }
        List<GradeIcon> list = this.gradeIconList;
        if (list == null ? userHonor.gradeIconList != null : !list.equals(userHonor.gradeIconList)) {
            return false;
        }
        if (this.thisGradeMinDiamond != userHonor.thisGradeMinDiamond || this.thisGradeMaxDiamond != userHonor.thisGradeMaxDiamond) {
            return false;
        }
        ImageModel imageModel9 = this.profileDialogBg;
        if (imageModel9 == null ? userHonor.profileDialogBg != null : !imageModel9.equals(userHonor.profileDialogBg)) {
            return false;
        }
        ImageModel imageModel10 = this.profileDialogBackBg;
        if (imageModel10 == null ? userHonor.profileDialogBackBg != null : !imageModel10.equals(userHonor.profileDialogBackBg)) {
            return false;
        }
        String str3 = this.gradeDescribe;
        String str4 = userHonor.gradeDescribe;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 == null) {
            return true;
        }
        return false;
    }
}
