package X;

/* renamed from: X.OiU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62658OiU extends AbstractC65781Prl implements InterfaceC65784Pro<Object> {
    public static final C62658OiU LJLIL = new C62658OiU();

    public C62658OiU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        Class cls = (Class) C62657OiT.LIZ.getValue();
        if (cls == null) {
            return null;
        }
        return cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
    }
}
