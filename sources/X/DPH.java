package X;

import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* loaded from: classes7.dex */
public final class DPH extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DPH LJLIL = new DPH();

    public DPH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (StrategyImpl.LIZIZ().LJJIJ() && DPI.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
