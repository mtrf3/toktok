package X;

/* renamed from: X.1N6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1N6 implements C0UO, C0UZ {
    public final InterfaceC24760y8<C0UL> LIZ;
    public C0UY LIZIZ = C08250Ub.LIZ;

    public C1N6(InterfaceC35811ar interfaceC35811ar) {
        this.LIZ = interfaceC35811ar;
    }

    @Override // X.C0UZ
    public final void LIZIZ(float f) {
        C0UL value = this.LIZ.getValue();
        value.LIZ(this.LIZIZ, value.LJFF(f), 1);
    }

    @Override // X.C0UO
    public final Object LIZ(C0SF c0sf, InterfaceC88471Ynr<? super C0UZ, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LIZIZ = this.LIZ.getValue().LIZLLL.LIZIZ(c0sf, new C2DG(this, interfaceC88471Ynr, null), interfaceC67352kd);
        if (LIZIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZIZ;
        }
        return C76800UCe.LIZ;
    }
}
