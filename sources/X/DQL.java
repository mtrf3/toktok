package X;

import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* loaded from: classes7.dex */
public final class DQL extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DQL LJLIL = new DQL();

    public DQL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (!StrategyImpl.LIZIZ().LJJIJ() || ((!StrategyImpl.LIZIZ().LJIILL() && ((Number) DQN.LIZ.getValue()).intValue() != 2) || !C86801Y4v.LIZ())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
