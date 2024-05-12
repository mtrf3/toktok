package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* loaded from: classes7.dex */
public final class FO9 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final FO9 LJLIL = new FO9();

    public FO9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = FFL.LJIIIZ().LJIIJJI(ClientExpManager.penetration_rate_inbox(), "penetration_rate_inbox");
        } catch (Throwable th) {
            C78983UzD.LJIJ(th, "ExtendedSceneStatisticExp");
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
