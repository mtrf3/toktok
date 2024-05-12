package X;

/* renamed from: X.2XZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2XZ extends AbstractC65781Prl implements InterfaceC65784Pro<EnumC61802bg> {
    public static final C2XZ LJLIL = new C2XZ();

    public C2XZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final EnumC61802bg invoke() {
        int intValue = ((Number) C2XX.LIZIZ.getValue()).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return EnumC61802bg.NO_CACHE;
            }
            return EnumC61802bg.DO_FRAME;
        }
        return EnumC61802bg.SAME_MESSAGE;
    }
}
