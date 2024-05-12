package X;

/* loaded from: classes5.dex */
public final class A2W extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final A2W LJLIL = new A2W();

    public A2W() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[popupEnterOfflineModeBottomToast] ");
        LIZ.append(C252329vI.LIZIZ.getEffectiveConnectionType());
        return X1D.LIZIZ(LIZ);
    }
}
