package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.QuickForwardResolver$resolve$job$1$downloadCanvasStyleTask$1", f = "QuickForwardResolver.kt", l = {132}, m = "invokeSuspend")
/* renamed from: X.GXn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41683GXn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C41688GXs>, Object> {
    public int LJLIL;

    public C41683GXn(InterfaceC67352kd<? super C41683GXn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41683GXn(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C41690GXu c41690GXu = new C41690GXu();
            C41685GXp c41685GXp = new C41685GXp(!C169656lF.LIZ);
            this.LJLIL = 1;
            obj = AbstractC41806Gaw.LIZ(c41690GXu, c41685GXp, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C41688GXs> interfaceC67352kd) {
        return new C41683GXn(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
