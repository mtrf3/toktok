package X;

/* renamed from: X.MwR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58427MwR extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58427MwR LJLIL = new C58427MwR();

    public C58427MwR() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        int intValue = ((Number) C58424MwO.LIZ.getValue()).intValue();
        boolean z = true;
        if (1 > intValue || intValue >= 100) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
