package X;

/* renamed from: X.Dfd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34453Dfd extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34453Dfd LJLIL = new C34453Dfd();

    public C34453Dfd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C34454Dfe.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
