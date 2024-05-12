package X;

/* renamed from: X.3AI, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3AI extends TBS implements InterfaceC65784Pro<Long> {
    public static final C3AI LJLIL = new C3AI();

    public C3AI() {
        super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
