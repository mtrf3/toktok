package X;

/* renamed from: X.TFx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74349TFx implements InterfaceC64672gJ<Object> {
    public final /* synthetic */ C76732zl LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ InterfaceC64672gJ LJLJI;

    @Override // X.InterfaceC64672gJ
    public final Object emit(Object obj, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C76732zl c76732zl = this.LJLIL;
        int i = c76732zl.element + 1;
        c76732zl.element = i;
        if (i < this.LJLILLLLZI) {
            Object emit = this.LJLJI.emit(obj, interfaceC67352kd);
            if (emit == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return emit;
            }
        } else {
            EnumC58928NAu LJIIIZ = C74347TFv.LJIIIZ(this.LJLJI, obj, interfaceC67352kd);
            if (LJIIIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return LJIIIZ;
            }
        }
        return C76800UCe.LIZ;
    }

    public C74349TFx(C76732zl c76732zl, int i, InterfaceC64672gJ interfaceC64672gJ) {
        this.LJLIL = c76732zl;
        this.LJLILLLLZI = i;
        this.LJLJI = interfaceC64672gJ;
    }
}
