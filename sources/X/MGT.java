package X;

import com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoSharedVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoSharedVM$manualListLoadMore$1", f = "FriendNewVideoSharedVM.kt", l = {282}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class MGT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ FriendNewVideoSharedVM LJLILLLLZI;
    public final /* synthetic */ C57716Mky LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MGT(FriendNewVideoSharedVM friendNewVideoSharedVM, C57716Mky c57716Mky, InterfaceC67352kd<? super MGT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = friendNewVideoSharedVM;
        this.LJLJI = c57716Mky;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new MGT(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            FriendNewVideoSharedVM friendNewVideoSharedVM = this.LJLILLLLZI;
            C57716Mky c57716Mky = this.LJLJI;
            this.LJLIL = 1;
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            AbstractC72278SYg<C57716Mky> config = friendNewVideoSharedVM.getConfig();
            if (c57716Mky == null) {
                c57716Mky = friendNewVideoSharedVM.LJLJI;
            }
            config.onLoadMore(xks, c57716Mky);
            if (xks.LJIIJJI() == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
