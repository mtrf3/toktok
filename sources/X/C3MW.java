package X;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* renamed from: X.3MW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3MW extends AbstractC65781Prl implements InterfaceC65784Pro<AbstractC73946T0k> {
    public static final C3MW LJLIL = new C3MW();

    public C3MW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final AbstractC73946T0k invoke() {
        Object value = C771431a.LIZ().LJZL.getValue();
        o.LJIIIIZZ(value, "<get-singleThreadExecutor>(...)");
        return new C73950T0o((Executor) value);
    }
}
