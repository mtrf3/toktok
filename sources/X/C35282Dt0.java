package X;

/* renamed from: X.Dt0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35282Dt0 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35282Dt0 LJLIL = new C35282Dt0();

    public C35282Dt0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(C35274Dss.LIZ.getBoolean("optimize_runfocustasks", true));
    }
}
