package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.sticker.core.StickerHelpBox$onStickerClick$2", f = "StickerHelpBox.kt", l = {87}, m = "invokeSuspend")
/* renamed from: X.6Rm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160466Rm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C160456Rl LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C160466Rm(C160456Rl c160456Rl, InterfaceC67352kd<? super C160466Rm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c160456Rl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C160466Rm(this.LJLILLLLZI, interfaceC67352kd);
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(3000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI.LJJIFFI().LJ(C160526Rs.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
