package X;

import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardVM$delayDisappearAssem$1", f = "VideoUserCardVM.kt", l = {203}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class AAD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ VideoUserCardVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AAD(VideoUserCardVM videoUserCardVM, InterfaceC67352kd<? super AAD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = videoUserCardVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new AAD(this.LJLILLLLZI, interfaceC67352kd);
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
            if (C1JD.LIZJ(1000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI.setStateImmediate(AAE.LJLIL);
        this.LJLILLLLZI.lv0(false, AA5.AUTO);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
