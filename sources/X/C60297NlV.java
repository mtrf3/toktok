package X;

import java.util.Stack;
import java.util.WeakHashMap;

/* renamed from: X.NlV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60297NlV {
    public static final C60297NlV LIZLLL = new C60297NlV();
    public final Stack<C60498Nok> LIZ = new Stack<>();
    public final java.util.Map<InterfaceC60493Nof, C60498Nok> LIZIZ = new WeakHashMap();
    public final int LIZJ = Integer.MAX_VALUE;

    public final C60498Nok LIZ() {
        Stack<C60498Nok> stack = this.LIZ;
        if (stack != null && !stack.isEmpty()) {
            return this.LIZ.peek();
        }
        return null;
    }
}
