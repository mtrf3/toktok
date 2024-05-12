package X;

/* renamed from: X.1l9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42191l9 implements C1OH {
    public final XLL LIZ = C79853Bl.LIZ(0, 16, XKI.DROP_OLDEST, 1);

    @Override // X.C0X9
    public final /* bridge */ /* synthetic */ XLL LIZJ() {
        return this.LIZ;
    }

    @Override // X.C1OH
    public final boolean LIZ(C0X8 c0x8) {
        return this.LIZ.LIZIZ(c0x8);
    }

    @Override // X.C1OH
    public final Object LIZIZ(C0X8 c0x8, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object emit = this.LIZ.emit(c0x8, interfaceC67352kd);
        if (emit == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return emit;
        }
        return C76800UCe.LIZ;
    }
}
