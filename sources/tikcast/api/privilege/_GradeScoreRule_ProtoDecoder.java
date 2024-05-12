package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GradeScoreRule_ProtoDecoder implements InterfaceC31105CIr<GradeScoreRule> {
    public static GradeScoreRule LIZIZ(Q9H q9h) {
        GradeScoreRule gradeScoreRule = new GradeScoreRule();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            gradeScoreRule.gradeMaxScore = q9h.LJIIJJI();
                        }
                    } else {
                        gradeScoreRule.gradeMinScore = q9h.LJIIJJI();
                    }
                } else {
                    gradeScoreRule.grade = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return gradeScoreRule;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GradeScoreRule LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
