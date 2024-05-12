package X;

/* renamed from: X.DQi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33852DQi extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33852DQi LJLIL = new C33852DQi();

    public C33852DQi() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        long intValue = ((Number) C33850DQg.LIZIZ.getValue()).intValue();
        if (1 <= intValue && intValue < 10000000000L) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        valueOf.booleanValue();
        return valueOf;
    }
}
