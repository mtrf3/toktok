package X;

import com.ss.android.ugc.aweme.relation.model.RecUser;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.feed.TTRecUserBigCardView$bindRelationButton$1$3", f = "TTRecUserBigCardView.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.39B, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39B extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ RecUser LJLIL;
    public final /* synthetic */ C57596Mj2 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39B(RecUser recUser, C57596Mj2 c57596Mj2, InterfaceC67352kd<? super C39B> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = recUser;
        this.LJLILLLLZI = c57596Mj2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C39B(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        if (this.LJLIL.getFollowStatus() != 0) {
            C221018lt.LIZ("TTRecUserBigCardView", "setFollowClickInterceptor  don't allow unfollow");
            return Boolean.TRUE;
        }
        if (this.LJLILLLLZI.LJLJL) {
            C221018lt.LJFF("TTRecUserBigCardView", "swapping cant click relation button");
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
