package X;

import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* loaded from: classes7.dex */
public final class DOE extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DOE LJLIL = new DOE();

    public DOE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (StrategyImpl.LIZIZ().LJIILL()) {
            i = -1;
        } else {
            i = C34580Dhg.LIZ().getInt("initinflate_task_opt", 0);
        }
        return Integer.valueOf(i);
    }
}
