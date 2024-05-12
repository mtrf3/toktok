package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GradeConfig_ProtoDecoder implements InterfaceC31105CIr<GradeConfig> {
    public static GradeConfig LIZIZ(Q9H q9h) {
        GradeConfig gradeConfig = new GradeConfig();
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
                                gradeConfig.showConfig = _GradeShowConfig_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            gradeConfig.barrageEffect = _UpgradeBarrageEffectConfig_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        gradeConfig.upgradeEffect = _UpgradeEffectConfig_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    gradeConfig.gradeScore = _GradeScoreRule_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return gradeConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GradeConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
