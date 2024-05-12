package X;

/* renamed from: X.Iua, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48120Iua extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C48120Iua LJLIL = new C48120Iua();

    public C48120Iua() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Runtime.getRuntime().availableProcessors());
    }
}
