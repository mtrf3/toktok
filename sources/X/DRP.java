package X;

/* loaded from: classes7.dex */
public final class DRP extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DRP LJLIL = new DRP();

    public DRP() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Boolean bool;
        boolean z;
        try {
            if ((((Number) DRR.LIZ.getValue()).intValue() & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
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
