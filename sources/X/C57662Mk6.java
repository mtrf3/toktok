package X;

import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeButtonsAssem;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeButtonsAssem$initUnfollowButton$4$1$1", f = "RecSwipeButtonsAssem.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Mk6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57662Mk6 extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ RecUser LJLIL;
    public final /* synthetic */ RecSwipeButtonsAssem LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57662Mk6(RecUser recUser, RecSwipeButtonsAssem recSwipeButtonsAssem, InterfaceC67352kd<? super C57662Mk6> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = recUser;
        this.LJLILLLLZI = recSwipeButtonsAssem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57662Mk6(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL.getFollowStatus() == 1 || this.LJLIL.getFollowStatus() == 4 || this.LJLIL.getFollowStatus() == 2) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(this.LJLILLLLZI.LL);
    }
}
