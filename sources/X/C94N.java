package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* renamed from: X.94N, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C94N extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C94N LJLIL = new C94N();

    public C94N() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = FFL.LJIIIZ().LJIIJJI(ClientExpManager.new_user_feed_network_deterioration(), "new_user_feed_network_deterioration");
        } catch (Exception unused) {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
