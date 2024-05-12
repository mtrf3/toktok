package com.bytedance.android.livesdk.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes16.dex */
public final class _UserHonor_ProtoEncoder implements InterfaceC64604PXc<UserHonor> {
    public static int LIZJ(UserHonor userHonor) {
        int LIZ;
        int LJIIL = C30957CCz.LJIIL(13, userHonor.gradeDescribe) + C30957CCz.LJIIIZ(11, userHonor.thisGradeMaxDiamond) + C30957CCz.LJIIIZ(10, userHonor.thisGradeMinDiamond) + C30957CCz.LJIIIZ(9, userHonor.currentDiamond) + _ImageModel_ProtoEncoder.LJ(7, userHonor.nextHonorIcon) + C30957CCz.LJIIIZ(6, userHonor.level) + C30957CCz.LJIIL(5, userHonor.nextHonorName) + _ImageModel_ProtoEncoder.LJ(4, userHonor.currentHonorIcon) + C30957CCz.LJIIL(3, userHonor.currentHonorName) + _ImageModel_ProtoEncoder.LJ(2, userHonor.diamondIcon) + C30957CCz.LJIIIZ(1, userHonor.totalDiamond);
        List<GradeIcon> list = userHonor.gradeIconList;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < userHonor.gradeIconList.size(); i++) {
                GradeIcon gradeIcon = (GradeIcon) ListProtector.get(userHonor.gradeIconList, i);
                if (gradeIcon == null) {
                    LIZ = 0;
                } else {
                    int LIZJ = _GradeIcon_ProtoEncoder.LIZJ(gradeIcon);
                    LIZ = CD6.LIZ(14) + CD6.LIZIZ(LIZJ) + LIZJ;
                }
                LJIIL += LIZ;
            }
        }
        return C30957CCz.LJIIL(1001, userHonor.gradeBanner) + C30957CCz.LJIIIZ(25, userHonor.score) + _ImageModel_ProtoEncoder.LJ(24, userHonor.profileDialogBackBg) + _ImageModel_ProtoEncoder.LJ(23, userHonor.profileDialogBg) + C30957CCz.LJIIL(22, userHonor.nextPrivileges) + C30957CCz.LJIIIZ(21, userHonor.upgradeNeedConsume) + _ImageModel_ProtoEncoder.LJ(20, userHonor.newLiveIcon) + _ImageModel_ProtoEncoder.LJ(19, userHonor.newImIconWithLevel) + _ImageModel_ProtoEncoder.LJ(18, userHonor.liveIcon) + _ImageModel_ProtoEncoder.LJ(17, userHonor.imIconWithLevel) + _ImageModel_ProtoEncoder.LJ(16, userHonor.imIcon) + C30957CCz.LJIIIZ(15, userHonor.screenChatType) + LJIIL;
    }

    public static void LIZIZ(CD6 cd6, UserHonor userHonor) {
        long j = userHonor.totalDiamond;
        cd6.LIZLLL(1, 0);
        cd6.LJFF(j);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 2, userHonor.diamondIcon);
        C30957CCz.LIZLLL(cd6, 3, userHonor.currentHonorName);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 4, userHonor.currentHonorIcon);
        C30957CCz.LIZLLL(cd6, 5, userHonor.nextHonorName);
        long j2 = userHonor.level;
        cd6.LIZLLL(6, 0);
        cd6.LJFF(j2);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 7, userHonor.nextHonorIcon);
        long j3 = userHonor.currentDiamond;
        cd6.LIZLLL(9, 0);
        cd6.LJFF(j3);
        long j4 = userHonor.thisGradeMinDiamond;
        cd6.LIZLLL(10, 0);
        cd6.LJFF(j4);
        long j5 = userHonor.thisGradeMaxDiamond;
        cd6.LIZLLL(11, 0);
        cd6.LJFF(j5);
        C30957CCz.LIZLLL(cd6, 13, userHonor.gradeDescribe);
        List<GradeIcon> list = userHonor.gradeIconList;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < userHonor.gradeIconList.size(); i++) {
                GradeIcon gradeIcon = (GradeIcon) ListProtector.get(userHonor.gradeIconList, i);
                if (gradeIcon != null) {
                    cd6.LIZLLL(14, 2);
                    cd6.LJ(_GradeIcon_ProtoEncoder.LIZJ(gradeIcon));
                    _GradeIcon_ProtoEncoder.LIZIZ(cd6, gradeIcon);
                }
            }
        }
        long j6 = userHonor.screenChatType;
        cd6.LIZLLL(15, 0);
        cd6.LJFF(j6);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 16, userHonor.imIcon);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 17, userHonor.imIconWithLevel);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 18, userHonor.liveIcon);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 19, userHonor.newImIconWithLevel);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 20, userHonor.newLiveIcon);
        long j7 = userHonor.upgradeNeedConsume;
        cd6.LIZLLL(21, 0);
        cd6.LJFF(j7);
        C30957CCz.LIZLLL(cd6, 22, userHonor.nextPrivileges);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 23, userHonor.profileDialogBg);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 24, userHonor.profileDialogBackBg);
        long j8 = userHonor.score;
        cd6.LIZLLL(25, 0);
        cd6.LJFF(j8);
        C30957CCz.LIZLLL(cd6, 1001, userHonor.gradeBanner);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, UserHonor userHonor) {
        LIZIZ(cd6, userHonor);
    }
}
