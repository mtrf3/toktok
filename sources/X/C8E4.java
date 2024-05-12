package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8E4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8E4 extends AbstractC65781Prl implements InterfaceC88472Yns<C8E3, C8E3> {
    public static final C8E4 LJLIL = new C8E4();

    public C8E4() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C8E3 invoke(C8E3 c8e3) {
        C8E3 setStateImmediate = c8e3;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        C43I c43i = new C43I(C76800UCe.LIZ);
        C8E0 page = setStateImmediate.LJLIL;
        o.LJIIIZ(page, "page");
        return new C8E3(page, c43i);
    }
}
