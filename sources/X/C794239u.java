package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ShareUserMultiReceiveViewHolder$relationObserver$2$1$1$1", f = "ShareUserMultiReceiveViewHolder.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.39u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C794239u extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ RelationStatus LJLIL;
    public final /* synthetic */ RelationStatus LJLILLLLZI;
    public final /* synthetic */ C88373dR LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C794239u(RelationStatus relationStatus, RelationStatus relationStatus2, C88373dR c88373dR, InterfaceC67352kd<? super C794239u> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = relationStatus;
        this.LJLILLLLZI = relationStatus2;
        this.LJLJI = c88373dR;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C794239u(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        IMUser LJIIL = C80533Eb.LJIIL(this.LJLIL.getUid());
        if (LJIIL != null) {
            RelationStatus relationStatus = this.LJLILLLLZI;
            C88373dR c88373dR = this.LJLJI;
            int followStatus = LJIIL.getFollowStatus();
            Integer followerStatus = relationStatus.getFollowerStatus();
            if (followerStatus == null || followStatus != followerStatus.intValue()) {
                C3GF c3gf = (C3GF) c88373dR.LLILLL.getValue();
                LJIIL.setFollowStatus(relationStatus.getFollowStatus());
                c3gf.LJIIZILJ(LJIIL);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
