package X;

/* renamed from: X.AUh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26311AUh extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C26311AUh INSTANCE = new C26311AUh();

    public C26311AUh() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        C62822Ol8 c62822Ol8 = C26312AUi.LIZ;
        boolean z = true;
        if (((Number) c62822Ol8.getValue()).intValue() != 1 && (((Number) c62822Ol8.getValue()).intValue() != 2 || !C16880lQ.LLLZLL())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
