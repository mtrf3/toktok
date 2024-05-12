package com.bytedance.android.livesdk.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* loaded from: classes16.dex */
public final class _GradeIcon_ProtoEncoder implements InterfaceC64604PXc<GradeIcon> {
    public static int LIZJ(GradeIcon gradeIcon) {
        return C30957CCz.LJIIL(4, gradeIcon.levelStr) + C30957CCz.LJIIIZ(3, gradeIcon.level) + C30957CCz.LJIIIZ(2, gradeIcon.iconDiamond) + _ImageModel_ProtoEncoder.LJ(1, gradeIcon.icon);
    }

    public static void LIZIZ(CD6 cd6, GradeIcon gradeIcon) {
        _ImageModel_ProtoEncoder.LIZJ(cd6, 1, gradeIcon.icon);
        long j = gradeIcon.iconDiamond;
        cd6.LIZLLL(2, 0);
        cd6.LJFF(j);
        long j2 = gradeIcon.level;
        cd6.LIZLLL(3, 0);
        cd6.LJFF(j2);
        C30957CCz.LIZLLL(cd6, 4, gradeIcon.levelStr);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, GradeIcon gradeIcon) {
        LIZIZ(cd6, gradeIcon);
    }
}
