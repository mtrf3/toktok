package X;

/* renamed from: X.Yi3, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88111Yi3 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88111Yi3 LJLIL = new C88111Yi3();

    public C88111Yi3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C88109Yi1.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
