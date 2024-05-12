package X;

import java.util.List;

/* loaded from: classes10.dex */
public final class L9K implements L9M {
    public final ActivityC45651qj LJLIL;

    public L9K(ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
    }

    @Override // X.L9M
    public final void G(List<? extends InterfaceC54080LKi> list, List<? extends InterfaceC54080LKi> list2) {
        AbstractC53892LDc abstractC53892LDc;
        ActivityC45651qj activityC45651qj = this.LJLIL;
        if (activityC45651qj == null) {
            return;
        }
        AbstractC53895LDf rv0 = com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj).rv0("page_feed");
        if (!(rv0 instanceof AbstractC53892LDc) || (abstractC53892LDc = (AbstractC53892LDc) rv0) == null) {
            return;
        }
        L9H.LIZIZ(activityC45651qj, abstractC53892LDc, list, list2);
    }
}
