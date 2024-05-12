package X;

import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.addyours.RecordAddYoursStickerComponent$openInviteFriendsPanel$1$1", f = "RecordAddYoursStickerComponent.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6UP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6UP extends AbstractC65782Prm implements InterfaceC88473Ynt<List<? extends UserInvitee>, List<? extends UserInvitee>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C6UY LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6UP(C6UY c6uy, InterfaceC67352kd<? super C6UP> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLILLLLZI = c6uy;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C43045Guv.LIZLLL(new AqS149S0200000_2(this.LJLILLLLZI, (C6UY) this.LJLIL, (List<UserInvitee>) 7), 0L);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(List<? extends UserInvitee> list, List<? extends UserInvitee> list2, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C6UP c6up = new C6UP(this.LJLILLLLZI, interfaceC67352kd);
        c6up.LJLIL = list;
        return c6up.invokeSuspend(C76800UCe.LIZ);
    }
}
