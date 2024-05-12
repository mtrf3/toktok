package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _UserGrade_ProtoDecoder implements InterfaceC31105CIr<UserGrade> {
    public static UserGrade LIZIZ(Q9H q9h) {
        UserGrade userGrade = new UserGrade();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        userGrade.nickName = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        userGrade.defaultGradeBadge = _BadgeStruct_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        userGrade.opacityBadge = _BadgeStruct_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        userGrade.currentScore = q9h.LJIIJJI();
                        break;
                    case 5:
                        userGrade.currentGrade = q9h.LJIIJ();
                        break;
                    case 6:
                        userGrade.gradeMode = q9h.LJIIJ();
                        break;
                    case 7:
                        userGrade.timeToSleep = q9h.LJIIJ();
                        break;
                    case 8:
                        userGrade.gradeScoreRule = _GradeScoreRule_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        userGrade.version = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return userGrade;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UserGrade LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
