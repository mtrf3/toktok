package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* loaded from: classes7.dex */
public final class DPO extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DPO LJLIL = new DPO();

    public DPO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = FFL.LJIIIZ().LJIIJJI(ClientExpManager.newuser_gecko_opt(), "newuser_gecko_opt");
        } catch (Exception unused) {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
