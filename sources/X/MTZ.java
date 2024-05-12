package X;

import com.ss.android.ugc.aweme.notification.creator.CreatorNoticeResultFragment;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;
import fjb.a;
import kotlin.jvm.internal.AqS14S0010000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.notification.creator.CreatorNoticeResultFragment$onPageSelected$1", f = "CreatorNoticeResultFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class MTZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ CreatorNoticeResultFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTZ(CreatorNoticeResultFragment creatorNoticeResultFragment, InterfaceC67352kd<? super MTZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = creatorNoticeResultFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new MTZ(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL.vl().nv0());
        LIZ.append(": onPageSelected");
        C221018lt.LJFF("Creators_Inbox", X1D.LIZIZ(LIZ));
        CreatorNoticeResultVM vl = this.LJLIL.vl();
        vl.getClass();
        vl.setState(new AqS14S0010000_9(true, 12));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
