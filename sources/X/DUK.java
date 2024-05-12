package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* loaded from: classes7.dex */
public final class DUK extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DUK LJLIL = new DUK();

    public DUK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = FFL.LJIIIZ().LJIIJJI(ClientExpManager.new_user_feed_consume_opt_nonuj(), "new_user_feed_consume_opt_nonuj");
        } catch (Exception unused) {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
