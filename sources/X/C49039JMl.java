package X;

import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchFollowAssem;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchFollowAssem$initFollow$3", f = "SearchFollowAssem.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.JMl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49039JMl extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ SearchFollowAssem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49039JMl(SearchFollowAssem searchFollowAssem, InterfaceC67352kd<? super C49039JMl> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = searchFollowAssem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C49039JMl(this.LJLIL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        SearchFollowAssem searchFollowAssem = this.LJLIL;
        if (searchFollowAssem.LLFII == null) {
            return Boolean.TRUE;
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((C49033JMf) searchFollowAssem.LLFF.getValue()).LJLIL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        return Boolean.FALSE;
    }
}
