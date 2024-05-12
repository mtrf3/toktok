package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9OY, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9OY extends AbstractC65781Prl implements InterfaceC88472Yns<C9OZ, C9OZ> {
    public static final C9OY LJLIL = new C9OY();

    public C9OY() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C9OZ invoke(C9OZ c9oz) {
        C9OZ receiver = c9oz;
        o.LJIIIZ(receiver, "$receiver");
        C236019Ob c236019Ob = new C236019Ob(System.currentTimeMillis(), C2MW.LIZ().LJ(5));
        C236029Oc loginModel = receiver.LJLILLLLZI;
        o.LJIIIZ(loginModel, "loginModel");
        return new C9OZ(c236019Ob, loginModel);
    }
}
