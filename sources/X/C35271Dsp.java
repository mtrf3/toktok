package X;

/* renamed from: X.Dsp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35271Dsp extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35271Dsp LJLIL = new C35271Dsp();

    public C35271Dsp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(C35274Dss.LIZ.getBoolean("optimize_focuslivedns", false));
    }
}
