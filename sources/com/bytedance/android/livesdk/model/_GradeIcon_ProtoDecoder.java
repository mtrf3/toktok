package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes16.dex */
public final class _GradeIcon_ProtoDecoder implements InterfaceC31105CIr<GradeIcon> {
    public static GradeIcon LIZIZ(Q9H q9h) {
        GradeIcon gradeIcon = new GradeIcon();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                gradeIcon.levelStr = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            gradeIcon.level = (int) q9h.LJIIJJI();
                        }
                    } else {
                        gradeIcon.iconDiamond = (int) q9h.LJIIJJI();
                    }
                } else {
                    gradeIcon.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return gradeIcon;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GradeIcon LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
