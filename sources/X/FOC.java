package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* loaded from: classes7.dex */
public final class FOC extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final FOC LJLIL = new FOC();

    public FOC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = FFL.LJIIIZ().LJIIJJI(ClientExpManager.penetration_rate_others(), "penetration_rate_others");
        } catch (Throwable th) {
            C78983UzD.LJIJ(th, "ExtendedSceneStatisticExp");
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
