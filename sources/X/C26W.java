package X;

import kotlin.jvm.internal.o;

/* renamed from: X.26W, reason: invalid class name */
/* loaded from: classes.dex */
public final class C26W extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC44041o8> {
    public static final C26W INSTANCE = new C26W();

    public C26W() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final InterfaceC44041o8 invoke() {
        if (C16880lQ.LLJJJJ() != null) {
            return C529726b.LJLIL;
        }
        return new InterfaceC44041o8() { // from class: X.26X
            @Override // X.MBD
            public final InterfaceC48698J9i getKey() {
                return InterfaceC44041o8.LJJLIL;
            }

            @Override // X.MBD, X.MBA
            public final <E extends MBD> E get(InterfaceC48698J9i<E> key) {
                o.LJIIIZ(key, "key");
                return (E) MBC.LIZ(this, key);
            }

            @Override // X.MBA
            public final MBA minusKey(InterfaceC48698J9i<?> key) {
                o.LJIIIZ(key, "key");
                return MBC.LIZIZ(this, key);
            }

            @Override // X.MBA
            public final MBA plus(MBA context) {
                o.LJIIIZ(context, "context");
                return MBE.LIZ(this, context);
            }

            @Override // X.InterfaceC44041o8
            public final <R> Object LJIIJ(InterfaceC88472Yns<? super Long, ? extends R> interfaceC88472Yns, InterfaceC67352kd<? super R> interfaceC67352kd) {
                return XKX.LJI(C36636EZk.LIZ, new C2GO(interfaceC88472Yns, null), interfaceC67352kd);
            }

            @Override // X.MBA
            public final <R> R fold(R r, InterfaceC88471Ynr<? super R, ? super MBD, ? extends R> operation) {
                o.LJIIIZ(operation, "operation");
                return operation.invoke(r, this);
            }
        };
    }
}
