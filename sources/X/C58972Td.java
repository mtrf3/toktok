package X;

/* renamed from: X.2Td, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58972Td extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C58972Td LJLIL = new C58972Td();

    public C58972Td() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Integer num;
        try {
            FFL.LJIIIZ().getClass();
            Integer valueOf = Integer.valueOf(FFL.LJIIJ(31744, 0, "tt_friends_tab_local_cache_enable", true));
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
