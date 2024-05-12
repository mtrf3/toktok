package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2F1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2F1 extends AbstractC517321h implements InterfaceC39651h3<InterfaceC14650hp>, InterfaceC14650hp {
    public InterfaceC14670hr LJLJJI;
    public OSZ<C10390ax, ? extends InterfaceC79150V4o> LJLJJL;
    public OSZ<C10390ax, ? extends InterfaceC79150V4o> LJLJJLL;

    @Override // X.InterfaceC39651h3
    public final InterfaceC14650hp getValue() {
        return this;
    }

    @Override // X.InterfaceC39651h3
    public final C17R<InterfaceC14650hp> getKey() {
        return C14640ho.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2F1(C33651Tt defaultParent) {
        super(defaultParent);
        o.LJIIIZ(defaultParent, "defaultParent");
    }

    @Override // X.InterfaceC14650hp
    public final Object LIZ(InterfaceC274415w interfaceC274415w, InterfaceC65784Pro<C10390ax> interfaceC65784Pro, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJI = C48841JEv.LJI(new C2F0(this, interfaceC274415w, interfaceC65784Pro, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    public static final Object LIZIZ(C2F1 c2f1, OSZ osz, InterfaceC274415w interfaceC274415w, InterfaceC67352kd interfaceC67352kd) {
        c2f1.LJLJJLL = osz;
        C10390ax c10390ax = (C10390ax) osz.getFirst();
        InterfaceC14670hr interfaceC14670hr = c2f1.LJLJJI;
        if (interfaceC14670hr != null) {
            Object LJI = C48841JEv.LJI(new C2F3(c2f1, interfaceC274415w, c10390ax, interfaceC14670hr.LIZIZ(c10390ax), null), interfaceC67352kd);
            if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return LJI;
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("responder");
        throw null;
    }
}
