package X;

import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* loaded from: classes7.dex */
public final class DPL extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DPL LJLIL = new DPL();

    public DPL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (StrategyImpl.LIZIZ().LJIILL()) {
            i = -1;
        } else {
            i = KevaImpl.getRepo("ab_repo_cold_boot_muti", 1).getInt("push_start_opt_strategy", 0);
        }
        return Integer.valueOf(i);
    }
}
