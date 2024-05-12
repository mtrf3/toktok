package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* loaded from: classes7.dex */
public final class E1K extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final E1K LJLIL = new E1K();

    public E1K() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = FFL.LJIIIZ().LJIIJJI(ClientExpManager.newuser_start_watching_below_10_opt(), "newuser_start_watching_below_10_opt");
        } catch (Exception unused) {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
