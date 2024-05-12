package X;

import com.bytedance.keva.Keva;

/* loaded from: classes9.dex */
public final class IR2 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final IR2 LJLIL = new IR2();

    public IR2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Keva LIZ = C46597IQn.LIZ();
        int i = LIZ.getInt("expand_limit_times", 0);
        if (i >= IR3.LIZ().limitTimes) {
            return Boolean.TRUE;
        }
        if (System.currentTimeMillis() - LIZ.getLong("expand_limit_start", 0L) < IR3.LIZ().limitDays * 86400000) {
            return Boolean.TRUE;
        }
        if (LIZ.getInt("expand_times", 0) >= IR3.LIZ().triggerTimes) {
            LIZ.storeLong("expand_limit_start", System.currentTimeMillis());
            LIZ.storeInt("expand_times", 0);
            LIZ.storeInt("expand_limit_times", i + 1);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
