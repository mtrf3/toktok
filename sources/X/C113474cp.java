package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4cp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113474cp<T> implements InterfaceC73592SuS {
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LJLIL;
    public final /* synthetic */ C56412MCa<Object> LJLILLLLZI;

    public C113474cp(InterfaceC65784Pro<Boolean> interfaceC65784Pro, C56412MCa<Object> c56412MCa) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = c56412MCa;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object it) {
        o.LJIIIZ(it, "it");
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJLIL;
        if (interfaceC65784Pro != null) {
            this.LJLILLLLZI.getClass();
            return interfaceC65784Pro.invoke().booleanValue();
        }
        return true;
    }
}
