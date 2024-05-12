package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.eventtrack.ToolsFluencyEventReport$start$2", f = "ToolsFluencyEventReport.kt", l = {59}, m = "invokeSuspend")
/* renamed from: X.Us7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78543Us7 extends AbstractC65782Prm implements InterfaceC88471Ynr<C76800UCe, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C78542Us6 LJLIL;
    public int LJLILLLLZI;

    public C78543Us7(InterfaceC67352kd<? super C78543Us7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C78543Us7(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C78542Us6 c78542Us6;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                c78542Us6 = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            c78542Us6 = C3B0.LIZ;
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C78544Us8 c78544Us8 = new C78544Us8(c78542Us6, null);
            this.LJLIL = c78542Us6;
            this.LJLILLLLZI = 1;
            if (XKX.LJI(abstractC78621UtN, c78544Us8, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C78540Us4.LJJ(c78542Us6);
        C78542Us6 c78542Us62 = C3B0.LIZ;
        c78542Us62.LJIILLIIL = null;
        c78542Us62.LJIIZILJ = null;
        c78542Us62.LJIJ = null;
        c78542Us62.LJIJI = null;
        c78542Us62.LJIJJ = null;
        c78542Us62.LJIJJLI = null;
        c78542Us62.LJIL = null;
        c78542Us62.LJJ = null;
        c78542Us62.LJJI = null;
        c78542Us62.LJJIFFI = null;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C76800UCe c76800UCe, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C78543Us7(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
