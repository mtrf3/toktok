package X;

/* renamed from: X.Png, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum C65528Png extends EnumC65527Pnf {
    public C65528Png() {
        super("INTERFACE_ONLY", 1);
    }

    @Override // X.InterfaceC65503PnH
    public final boolean apply(AbstractC65516PnU<?> abstractC65516PnU) {
        return abstractC65516PnU.getRawType().isInterface();
    }
}
