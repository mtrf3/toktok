package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.matchedfriends.ui.MatchedFriendsFollowBanner$tryShow$8", f = "MatchedFriendsFollowBanner.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3yO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101363yO extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ C101353yN LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C101363yO(C101353yN c101353yN, InterfaceC67352kd<? super C101363yO> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = c101353yN;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C101363yO(this.LJLIL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C101353yN c101353yN = this.LJLIL;
        c101353yN.getClass();
        c101353yN.LJLIL.LIZIZ(c101353yN);
        return Boolean.FALSE;
    }
}
