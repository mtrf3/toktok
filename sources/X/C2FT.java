package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2FT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super InterfaceC79150V4o>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ InterfaceC37501da LJLILLLLZI;
    public final /* synthetic */ InterfaceC18630oF LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2FT(InterfaceC37501da interfaceC37501da, InterfaceC18630oF interfaceC18630oF, InterfaceC67352kd<? super C2FT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC37501da;
        this.LJLJI = interfaceC18630oF;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2FT c2ft = new C2FT(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c2ft.LJLIL = obj;
        return c2ft;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        XKX.LIZLLL(interfaceC70422pa, null, null, new C2FR(this.LJLILLLLZI, this.LJLJI, null), 3);
        return XKX.LIZLLL(interfaceC70422pa, null, null, new C2FS(this.LJLILLLLZI, this.LJLJI, null), 3);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super InterfaceC79150V4o> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
