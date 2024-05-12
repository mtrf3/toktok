package X;

/* loaded from: classes14.dex */
public final class TS3 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public TS3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean LIZLLL = C44432HcC.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("attach_base");
        LIZ.append(", canPreJoinChannel = ");
        LIZ.append(LIZLLL);
        C0NB.LJIIIZ("MultiHostService", X1D.LIZIZ(LIZ));
        return Boolean.valueOf(C44432HcC.LIZLLL());
    }
}
