package X;

/* renamed from: X.3Bn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79873Bn<T> implements InterfaceC64672gJ<T> {
    public final C3T4<T> LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C79873Bn(C3T4<? super T> c3t4) {
        this.LJLIL = c3t4;
    }

    @Override // X.InterfaceC64672gJ
    public final Object emit(T t, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJIIIZ = this.LJLIL.LJIIIZ(t, interfaceC67352kd);
        if (LJIIIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJIIIZ;
        }
        return C76800UCe.LIZ;
    }
}
