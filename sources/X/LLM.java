package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LLM extends LLN {
    public final ActivityC45651qj LIZIZ;
    public final LLO LIZJ;

    public LLM(ActivityC45651qj activity, LLO scrollBasicChecker) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(scrollBasicChecker, "scrollBasicChecker");
        this.LIZIZ = activity;
        this.LIZJ = scrollBasicChecker;
    }

    @Override // X.LLN, X.InterfaceC208778Hh
    public final boolean LIZJ(float f, int i) {
        if (!this.LIZJ.LIZJ(f, i)) {
            return false;
        }
        if (i == -1) {
            return KNV.LJFF(this.LIZIZ, "page_discover");
        }
        return true;
    }
}
