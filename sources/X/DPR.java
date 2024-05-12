package X;

/* loaded from: classes7.dex */
public final class DPR extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DPR LJLIL = new DPR();

    public DPR() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Boolean bool;
        try {
            FFL.LJIIIZ().getClass();
            Boolean valueOf = Boolean.valueOf(FFL.LJFF(2, "applog_terminate_immediately", true, false));
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
