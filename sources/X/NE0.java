package X;

import Y.IDfS25S0200000_10;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListViewHolder$bindUiState$1$1", f = "CommerceMusicSubstituteMusicListViewHolder.kt", l = {153}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NE0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC65462ha<NFK> LJLILLLLZI;
    public final /* synthetic */ C58878N8w LJLJI;
    public final /* synthetic */ CommerceMusicSubstituteMusicListViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NE0(InterfaceC65462ha<NFK> interfaceC65462ha, C58878N8w c58878N8w, CommerceMusicSubstituteMusicListViewModel commerceMusicSubstituteMusicListViewModel, InterfaceC67352kd<? super NE0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC65462ha;
        this.LJLJI = c58878N8w;
        this.LJLJJI = commerceMusicSubstituteMusicListViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new NE0(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            InterfaceC65462ha<NFK> interfaceC65462ha = this.LJLILLLLZI;
            IDfS25S0200000_10 iDfS25S0200000_10 = new IDfS25S0200000_10(this.LJLJI, this.LJLJJI, 3);
            this.LJLIL = 1;
            if (interfaceC65462ha.collect(iDfS25S0200000_10, this) == enumC58928NAu) {
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
