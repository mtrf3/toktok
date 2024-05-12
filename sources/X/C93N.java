package X;

/* renamed from: X.93N, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C93N extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C93N LJLIL = new C93N();

    public C93N() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C93Q.LIZ() & 512) == 0 && (C93Q.LIZ() & 256) == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
