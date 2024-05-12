package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* loaded from: classes7.dex */
public final class FO8 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final FO8 LJLIL = new FO8();

    public FO8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = FFL.LJIIIZ().LJIIJJI(ClientExpManager.penetration_rate_follow(), "penetration_rate_follow");
        } catch (Throwable th) {
            C78983UzD.LJIJ(th, "ExtendedSceneStatisticExp");
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
