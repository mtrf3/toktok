package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.sticker.core.StickerNotice$onStickerClick$2", f = "StickerNotice.kt", l = {31}, m = "invokeSuspend")
/* renamed from: X.6Qr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160256Qr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C160246Qq LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C160256Qr(C160246Qq c160246Qq, InterfaceC67352kd<? super C160256Qr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c160246Qq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C160256Qr(this.LJLILLLLZI, interfaceC67352kd);
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
        ((C1NS) this.LJLILLLLZI.LJ.getValue()).LJ(C160286Qu.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
