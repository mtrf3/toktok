package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* renamed from: X.FNb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38863FNb extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C38863FNb LJLIL = new C38863FNb();

    public C38863FNb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = FFL.LJIIIZ().LJIIJJI(ClientExpManager.bootfinish_msg_aggre_opt(), "bootfinish_msg_aggre_opt");
        } catch (Exception unused) {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
