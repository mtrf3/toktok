package X;

/* renamed from: X.2SA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2SA extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C2SA LJLIL = new C2SA();

    public C2SA() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Object obj;
        try {
            FFL.LJIIIZ().getClass();
            Object valueOf = Integer.valueOf(FFL.LJIIJ(31744, 0, "assem_lifecycle_callback_scatter_experiment", true));
            C3C5.m7constructorimpl(valueOf);
            obj = valueOf;
        } catch (Throwable th) {
            Object LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            obj = LIZ;
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(obj);
        Integer num = obj;
        if (m10exceptionOrNullimpl != null) {
            num = 0;
        }
        num.intValue();
        return num;
    }
}
