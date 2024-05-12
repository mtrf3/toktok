package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3Bc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC79763Bc<S, T> extends AbstractC79813Bh<T> {
    public final InterfaceC65462ha<S> LJLIL;

    public abstract Object LIZLLL(InterfaceC64672gJ<? super T> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd);

    @Override // X.AbstractC79813Bh
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append(" -> ");
        LIZ.append(super.toString());
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC79813Bh, X.InterfaceC65462ha
    public final Object collect(final InterfaceC64672gJ<? super T> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        if (this.capacity == -3) {
            MBA context = interfaceC67352kd.getContext();
            MBA plus = context.plus(this.context);
            if (o.LJ(plus, context)) {
                Object LIZLLL = LIZLLL(interfaceC64672gJ, interfaceC67352kd);
                if (LIZLLL == EnumC58928NAu.COROUTINE_SUSPENDED) {
                    return LIZLLL;
                }
                return C76800UCe.LIZ;
            }
            C3CR c3cr = C3CQ.LJJIJLIJ;
            if (o.LJ(plus.get(c3cr), context.get(c3cr))) {
                final MBA context2 = interfaceC67352kd.getContext();
                if (!(interfaceC64672gJ instanceof C79873Bn) && !(interfaceC64672gJ instanceof C79773Bd)) {
                    interfaceC64672gJ = new InterfaceC64672gJ<T>(interfaceC64672gJ, context2) { // from class: X.2hY
                        public final MBA LJLIL;
                        public final Object LJLILLLLZI;
                        public final C65432hX LJLJI;

                        {
                            this.LJLIL = context2;
                            this.LJLILLLLZI = XLG.LIZIZ(context2);
                            this.LJLJI = new C65432hX(interfaceC64672gJ, null);
                        }

                        @Override // X.InterfaceC64672gJ
                        public final Object emit(T t, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd2) {
                            Object LJIIIIZZ = C1RF.LJIIIIZZ(this.LJLIL, t, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd2);
                            if (LJIIIIZZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
                                return LJIIIIZZ;
                            }
                            return C76800UCe.LIZ;
                        }
                    };
                }
                Object LJIIIIZZ = C1RF.LJIIIIZZ(plus, interfaceC64672gJ, XLG.LIZIZ(plus), new C65452hZ(this, null), interfaceC67352kd);
                EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
                if (LJIIIIZZ != enumC58928NAu) {
                    LJIIIIZZ = C76800UCe.LIZ;
                }
                if (LJIIIIZZ == enumC58928NAu) {
                    return LJIIIIZZ;
                }
                return C76800UCe.LIZ;
            }
        }
        Object collect = super.collect(interfaceC64672gJ, interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.AbstractC79813Bh
    public final Object collectTo(C3CK<? super T> c3ck, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LIZLLL = LIZLLL(new C79873Bn(c3ck), interfaceC67352kd);
        if (LIZLLL == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZLLL;
        }
        return C76800UCe.LIZ;
    }

    public AbstractC79763Bc(int i, MBA mba, XKI xki, InterfaceC65462ha interfaceC65462ha) {
        super(mba, i, xki);
        this.LJLIL = interfaceC65462ha;
    }
}
