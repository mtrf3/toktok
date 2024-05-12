package X;

import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* loaded from: classes7.dex */
public final class DOG extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DOG LJLIL = new DOG();

    public DOG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i = 0;
        if (!StrategyImpl.LIZIZ().LJIILL()) {
            i = C34580Dhg.LIZ().getInt("legacy_task_opt", 0);
        }
        return Integer.valueOf(i);
    }
}
