package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GradeShowConfig_ProtoDecoder implements InterfaceC31105CIr<GradeShowConfig> {
    public static GradeShowConfig LIZIZ(Q9H q9h) {
        GradeShowConfig gradeShowConfig = new GradeShowConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            gradeShowConfig.avatarBorderColor = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        gradeShowConfig.badgeIconLite = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    gradeShowConfig.grade = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return gradeShowConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GradeShowConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
