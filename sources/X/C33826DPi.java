package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* renamed from: X.DPi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33826DPi extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C33826DPi LJLIL = new C33826DPi();

    public C33826DPi() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Integer num;
        int LJIIJJI;
        try {
            if (C2NW.LIZ().LJIILL()) {
                LJIIJJI = C2NW.LIZ().LJIJJLI();
            } else {
                LJIIJJI = FFL.LJIIIZ().LJIIJJI(ClientExpManager.new_user_lynxenv_init_opt(), "new_user_lynxenv_init_opt");
            }
            Integer valueOf = Integer.valueOf(LJIIJJI);
            C3C5.m7constructorimpl(valueOf);
            num = valueOf;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            num = LIZ;
        }
        if (C3C5.m10exceptionOrNullimpl(num) == null) {
            return num;
        }
        return 0;
    }
}
