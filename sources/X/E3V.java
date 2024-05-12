package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* loaded from: classes7.dex */
public final class E3V extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final E3V LJLIL = new E3V();

    public E3V() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = FFL.LJIIIZ().LJIIJJI(ClientExpManager.weak_net_country_traffic_opt(), "weak_net_country_traffic_opt");
        } catch (Exception unused) {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
