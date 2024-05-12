package X;

/* renamed from: X.BAk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28342BAk<T> implements InterfaceC64592gB {
    public static final C28342BAk<T> LJLIL = new C28342BAk<>();

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
