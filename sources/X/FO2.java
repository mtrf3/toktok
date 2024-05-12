package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* loaded from: classes7.dex */
public final class FO2 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final FO2 LJLIL = new FO2();

    public FO2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = FFL.LJIIIZ().LJIIJJI(ClientExpManager.player_new_user_opt_exp(), "player_new_user_opt_exp");
        } catch (Exception unused) {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
