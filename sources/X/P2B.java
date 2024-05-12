package X;

import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import fjb.a;
import kotlin.jvm.internal.AqS179S0100000_13;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM$notifyAuthSync$1", f = "FindFriendsPageVM.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class P2B extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ FindFriendsPageVM LJLIL;
    public final /* synthetic */ EnumC58046MqI LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2B(FindFriendsPageVM findFriendsPageVM, EnumC58046MqI enumC58046MqI, InterfaceC67352kd<? super P2B> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = findFriendsPageVM;
        this.LJLILLLLZI = enumC58046MqI;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new P2B(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C57571Mid c57571Mid = this.LJLIL.getState().LJLJJL;
        int i = P2L.LIZ[this.LJLILLLLZI.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.LJLIL.LJLJJL.LIZJ(new AqS179S0100000_13(c57571Mid, 379));
            }
        } else {
            this.LJLIL.LJLJJI.LIZJ(new AqS179S0100000_13(c57571Mid, 378));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
