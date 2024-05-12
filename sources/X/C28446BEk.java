package X;

/* renamed from: X.BEk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28446BEk<T> implements InterfaceC64592gB {
    public static final C28446BEk<T> LJLIL = new C28446BEk<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C29401Dk c29401Dk;
        String prompt;
        Throwable th = (Throwable) obj;
        if ((th instanceof C29401Dk) && (c29401Dk = (C29401Dk) th) != null && (prompt = c29401Dk.getPrompt()) != null && prompt.length() > 0) {
            C30868C9o.LJI(prompt);
        }
    }
}
