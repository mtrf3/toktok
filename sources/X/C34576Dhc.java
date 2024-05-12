package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* renamed from: X.Dhc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34576Dhc extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34576Dhc LJLIL = new C34576Dhc();

    public C34576Dhc() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = FFL.LJIIIZ().LJIIJJI(ClientExpManager.newuser_start_watching_opt(), "newuser_start_watching_opt");
        } catch (Exception unused) {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
