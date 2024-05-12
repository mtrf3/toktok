package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* loaded from: classes10.dex */
public final class MPB {
    public static void LIZ(int i) {
        if (i == C56702MNe.LIZ) {
            C54362LVe.LIZ(LVG.Normal, 13, 1000, C56702MNe.LIZ, 3, 44, 84, 26, 37);
            C76800UCe c76800UCe = C76800UCe.LIZ;
            if ((!INB.LIZIZ()) && c76800UCe != null) {
                C54362LVe.LIZIZ(260);
                return;
            }
            return;
        }
        if (i == 37) {
            if (C53363Kwx.LIZJ()) {
                return;
            }
            C54362LVe.LIZ(LVG.Normal, i);
            return;
        }
        C54362LVe.LIZ(LVG.Normal, i);
    }

    public static void LIZIZ(InterfaceC56771MPv interfaceC56771MPv, BaseNotice baseNotice, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String str;
        if (baseNotice == null || (str = baseNotice.nid) == null || str.length() == 0 || interfaceC56771MPv.cJ().contains(baseNotice.nid)) {
            return;
        }
        interfaceC56771MPv.cJ().add(baseNotice.nid);
        interfaceC65784Pro.invoke();
    }
}
