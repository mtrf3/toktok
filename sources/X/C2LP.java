package X;

/* renamed from: X.2LP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2LP extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C2LP LJLIL = new C2LP();

    public C2LP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Boolean) C2LQ.LIZLLL.getValue()).booleanValue() || ((Boolean) C2LQ.LJ.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
