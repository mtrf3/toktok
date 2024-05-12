package X;

/* loaded from: classes14.dex */
public final class UPU<T> implements InterfaceC64592gB {
    public static final UPU<T> LJLIL = new UPU<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        boolean z;
        C38306F1q c38306F1q;
        Throwable th = (Throwable) obj;
        if ((th instanceof C38333F2r) && (c38306F1q = (C38306F1q) th) != null && c38306F1q.getErrorCode() == 3002047) {
            z = true;
        } else {
            z = false;
        }
        new C243529h6("login_onboarding", "login", false, z, "facebook").LIZLLL(null);
    }
}
