package X;

/* renamed from: X.3Cx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80233Cx extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C80233Cx INSTANCE = new C80233Cx();

    public C80233Cx() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
