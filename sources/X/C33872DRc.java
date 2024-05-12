package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* renamed from: X.DRc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33872DRc extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C33872DRc LJLIL = new C33872DRc();

    public C33872DRc() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Integer num;
        try {
            Integer valueOf = Integer.valueOf(FFL.LJIIIZ().LJIIJJI(ClientExpManager.newuser_gecko_high_priority_opt(), "newuser_gecko_high_priority_opt"));
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
