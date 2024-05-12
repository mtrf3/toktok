package X;

import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* loaded from: classes7.dex */
public final class DPF extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DPF LJLIL = new DPF();

    public DPF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (StrategyImpl.LIZIZ().LJIILL()) {
            i = 2;
        } else {
            i = 0;
            try {
                FFL.LJIIIZ().getClass();
                i = FFL.LJIIJ(31744, 0, "olduser_gecko_opt", true);
            } catch (Exception unused) {
            }
        }
        return Integer.valueOf(i);
    }
}
