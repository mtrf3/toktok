package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.sticker.core.StickerLayoutConnector$bindStickerFollow$3", f = "StickerLayoutConnector.kt", l = {38}, m = "invokeSuspend")
/* renamed from: X.6Pd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159856Pd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C160046Pw LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C159856Pd(C160046Pw c160046Pw, InterfaceC67352kd<? super C159856Pd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c160046Pw;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C159856Pd(this.LJLILLLLZI, interfaceC67352kd);
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
            C6QO c6qo = this.LJLILLLLZI.LJ;
            if (c6qo != null) {
                this.LJLIL = 1;
                if (c6qo.LJIJJLI(true, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        this.LJLILLLLZI.LJJIFFI();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
