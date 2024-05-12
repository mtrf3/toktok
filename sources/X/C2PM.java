package X;

/* renamed from: X.2PM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2PM extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C2PM LJLIL = new C2PM();

    public C2PM() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Object obj;
        try {
            FFL.LJIIIZ().getClass();
            Object valueOf = Integer.valueOf(FFL.LJIIJ(31744, 0, "detail_page_demand_load_page_experiment", true));
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
