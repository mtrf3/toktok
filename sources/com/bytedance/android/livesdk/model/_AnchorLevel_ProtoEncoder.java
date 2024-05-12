package com.bytedance.android.livesdk.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* loaded from: classes16.dex */
public final class _AnchorLevel_ProtoEncoder implements InterfaceC64604PXc<AnchorLevel> {
    public static int LIZJ(AnchorLevel anchorLevel) {
        return _ImageModel_ProtoEncoder.LJ(13, anchorLevel.levelIcon) + _ImageModel_ProtoEncoder.LJ(12, anchorLevel.stageLevelIcon) + _ImageModel_ProtoEncoder.LJ(11, anchorLevel.profileDialogBackBg) + _ImageModel_ProtoEncoder.LJ(10, anchorLevel.profileDialogBg) + C30957CCz.LJIIIZ(9, anchorLevel.taskEndTime) + C30957CCz.LJIIIZ(8, anchorLevel.taskTargetExperience) + C30957CCz.LJIIIZ(7, anchorLevel.taskDecreaseExperience) + C30957CCz.LJIIIZ(6, anchorLevel.taskStartTime) + C30957CCz.LJIIIZ(5, anchorLevel.taskStartExperience) + C30957CCz.LJIIIZ(4, anchorLevel.highestExperienceThisLevel) + C30957CCz.LJIIIZ(3, anchorLevel.lowestExperienceThisLevel) + C30957CCz.LJIIIZ(2, anchorLevel.experience) + C30957CCz.LJIIIZ(1, anchorLevel.level);
    }

    public static void LIZIZ(CD6 cd6, AnchorLevel anchorLevel) {
        long j = anchorLevel.level;
        cd6.LIZLLL(1, 0);
        cd6.LJFF(j);
        long j2 = anchorLevel.experience;
        cd6.LIZLLL(2, 0);
        cd6.LJFF(j2);
        long j3 = anchorLevel.lowestExperienceThisLevel;
        cd6.LIZLLL(3, 0);
        cd6.LJFF(j3);
        long j4 = anchorLevel.highestExperienceThisLevel;
        cd6.LIZLLL(4, 0);
        cd6.LJFF(j4);
        long j5 = anchorLevel.taskStartExperience;
        cd6.LIZLLL(5, 0);
        cd6.LJFF(j5);
        long j6 = anchorLevel.taskStartTime;
        cd6.LIZLLL(6, 0);
        cd6.LJFF(j6);
        long j7 = anchorLevel.taskDecreaseExperience;
        cd6.LIZLLL(7, 0);
        cd6.LJFF(j7);
        long j8 = anchorLevel.taskTargetExperience;
        cd6.LIZLLL(8, 0);
        cd6.LJFF(j8);
        long j9 = anchorLevel.taskEndTime;
        cd6.LIZLLL(9, 0);
        cd6.LJFF(j9);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 10, anchorLevel.profileDialogBg);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 11, anchorLevel.profileDialogBackBg);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 12, anchorLevel.stageLevelIcon);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 13, anchorLevel.levelIcon);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, AnchorLevel anchorLevel) {
        LIZIZ(cd6, anchorLevel);
    }
}
