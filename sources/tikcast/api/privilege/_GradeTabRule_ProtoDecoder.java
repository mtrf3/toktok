package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _GradeTabRule_ProtoDecoder implements InterfaceC31105CIr<GradeTabRule> {
    public static GradeTabRule LIZIZ(Q9H q9h) {
        GradeTabRule gradeTabRule = new GradeTabRule();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        gradeTabRule.tab = q9h.LJIIJ();
                        break;
                    case 2:
                        gradeTabRule.minGrade = q9h.LJIIJ();
                        break;
                    case 3:
                        gradeTabRule.maxGrade = q9h.LJIIJ();
                        break;
                    case 4:
                        gradeTabRule.background = _Background_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        gradeTabRule.bigTabIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        gradeTabRule.smallTabIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return gradeTabRule;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GradeTabRule LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
