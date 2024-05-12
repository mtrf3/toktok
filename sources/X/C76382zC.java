package X;

import com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper$collectSharerState$1$state$1", f = "SharedVideoDeepLinkHelper.kt", l = {125}, m = "invokeSuspend")
/* renamed from: X.2zC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76382zC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C33Y>, Object> {
    public int LJLIL;
    public final /* synthetic */ SharedVideoDeepLinkHelper LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76382zC(SharedVideoDeepLinkHelper sharedVideoDeepLinkHelper, InterfaceC67352kd<? super C76382zC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = sharedVideoDeepLinkHelper;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C76382zC(this.LJLILLLLZI, interfaceC67352kd);
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
            InterfaceC71762rk<C33Y> interfaceC71762rk = this.LJLILLLLZI.LJLJJI;
            C76392zD c76392zD = new C76392zD(null);
            this.LJLIL = 1;
            obj = V1M.LJIILL(interfaceC71762rk, c76392zD, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C33Y> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
