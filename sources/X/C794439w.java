package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.displayprofile.ProfileDisplayHelper$bindRelationBtn$2", f = "ProfileDisplayHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.39w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C794439w extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ RelationButton LJLIL;
    public final /* synthetic */ User LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C794439w(RelationButton relationButton, User user, InterfaceC67352kd<? super C794439w> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = relationButton;
        this.LJLILLLLZI = user;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C794439w(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.setVisibility(8);
        String uid = this.LJLILLLLZI.getUid();
        o.LJIIIIZZ(uid, "user.uid");
        C2U8.LIZ(new C794539x(uid));
        C3GF imUserService = IMService.createIIMServicebyMonsterPlugin(false).getImUserService();
        User user = this.LJLILLLLZI;
        user.isBlock = false;
        imUserService.LJIJJLI(IMUser.fromUser(user));
        return Boolean.FALSE;
    }
}
