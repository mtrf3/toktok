package X;

/* renamed from: X.39C, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C39C extends TBS implements InterfaceC88472Yns<Long, Boolean> {
    public static final C39C LJLIL = new C39C();

    public C39C() {
        super(1, C36L.class, "isSelf", "isSelf(Ljava/lang/Long;)Z", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Long l) {
        boolean z;
        if (C36L.LIZIZ() == l.longValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
