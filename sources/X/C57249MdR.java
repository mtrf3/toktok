package X;

/* renamed from: X.MdR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57249MdR extends AbstractC65781Prl implements InterfaceC65784Pro<AbstractChoreographerFrameCallbackC57253MdV> {
    public static final C57249MdR LJLIL = new C57249MdR();

    public C57249MdR() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final AbstractChoreographerFrameCallbackC57253MdV invoke() {
        int intValue = ((Number) C91E.LIZ.getValue()).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return null;
            }
            return new C57251MdT();
        }
        return new C57254MdW(((Number) C52695KmB.LIZ.getValue()).intValue());
    }
}
