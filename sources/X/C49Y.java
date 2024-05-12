package X;

/* renamed from: X.49Y, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C49Y extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C49Y LJLIL = new C49Y();

    public C49Y() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(C47Y.LIZ().getBoolean("key_has_swipe_for_reply", false));
    }
}
