package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _Answer_ProtoDecoder implements InterfaceC31105CIr<Answer> {
    public static Answer LIZIZ(Q9H q9h) {
        Answer answer = new Answer();
        answer.answers = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        answer.answers.add(Q9J.LIZIZ(q9h));
                    }
                } else {
                    answer.questionId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return answer;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Answer LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
