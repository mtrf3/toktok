package X;

/* renamed from: X.3AK, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3AK extends TBS implements InterfaceC65784Pro<Long> {
    public static final C3AK LJLIL = new C3AK();

    public C3AK() {
        super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
