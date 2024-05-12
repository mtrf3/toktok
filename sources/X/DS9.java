package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* loaded from: classes7.dex */
public final class DS9 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DS9 LJLIL = new DS9();

    public DS9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = FFL.LJIIIZ().LJIIJJI(ClientExpManager.new_user_thread_priority_opt(), "new_user_thread_priority_opt");
        } catch (Exception unused) {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
