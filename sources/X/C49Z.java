package X;

/* renamed from: X.49Z, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C49Z extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C49Z LJLIL = new C49Z();

    public C49Z() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(C47Y.LIZ().getInt("key_last_play_time", 0));
    }
}
