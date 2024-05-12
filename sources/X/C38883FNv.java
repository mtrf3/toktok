package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* renamed from: X.FNv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38883FNv extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C38883FNv LJLIL = new C38883FNv();

    public C38883FNv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = FFL.LJIIIZ().LJIIJJI(ClientExpManager.fix_smartlock_memory_leak(), "fix_smartlock_memory_leak");
        } catch (Exception unused) {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
