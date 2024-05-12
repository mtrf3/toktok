package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* loaded from: classes7.dex */
public final class DS2 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DS2 LJLIL = new DS2();

    public DS2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = FFL.LJIIIZ().LJIIJJI(ClientExpManager.new_user_low_end_opt_aggregation(), "new_user_low_end_opt_aggregation");
        } catch (Exception unused) {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
