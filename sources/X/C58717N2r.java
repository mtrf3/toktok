package X;

import java.lang.reflect.Method;

/* renamed from: X.N2r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58717N2r extends AbstractC65781Prl implements InterfaceC65784Pro<Method> {
    public static final C58717N2r LJLIL = new C58717N2r();

    public C58717N2r() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Method invoke() {
        try {
            return C58716N2q.LIZ.getMethod("currentThreadTimeMicro", new Class[0]);
        } catch (Throwable unused) {
            return null;
        }
    }
}
