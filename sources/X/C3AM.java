package X;

/* renamed from: X.3AM, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3AM extends TBS implements InterfaceC65784Pro<Long> {
    public static final C3AM LJLIL = new C3AM();

    public C3AM() {
        super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
