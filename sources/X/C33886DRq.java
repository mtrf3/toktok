package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* renamed from: X.DRq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33886DRq extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C33886DRq LJLIL = new C33886DRq();

    public C33886DRq() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = FFL.LJIIIZ().LJIIJJI(ClientExpManager.old_user_login_experience_opt(), "old_user_login_experience_opt");
        } catch (Exception unused) {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
