package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UFG<T> implements InterfaceC64592gB {
    public static final UFG<T> LJLIL = new UFG<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof C29401Dk) {
            String prompt = ((C29401Dk) th).getPrompt();
            o.LJIIIIZZ(prompt, "prompt");
            if (!ujb.o.LJJJJJL(prompt)) {
                C30868C9o.LJI(prompt);
            }
        }
    }
}
