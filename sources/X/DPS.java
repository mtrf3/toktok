package X;

/* loaded from: classes7.dex */
public final class DPS extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DPS LJLIL = new DPS();

    public DPS() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Boolean bool;
        try {
            FFL.LJIIIZ().getClass();
            Boolean valueOf = Boolean.valueOf(FFL.LJFF(2, "open_sensitive_callback", true, false));
            C3C5.m7constructorimpl(valueOf);
            bool = valueOf;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            bool = LIZ;
        }
        if (C3C5.m10exceptionOrNullimpl(bool) == null) {
            return bool;
        }
        return Boolean.FALSE;
    }
}
