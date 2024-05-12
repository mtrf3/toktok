package X;

/* renamed from: X.Ygm, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88032Ygm extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88032Ygm LJLIL = new C88032Ygm();

    public C88032Ygm() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88034Ygo.LIZ() & 256) == 256) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
