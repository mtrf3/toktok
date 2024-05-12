package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.group.member.GroupMemberLoader$fetchUserInfo$2$1", f = "GroupMemberLoader.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Gh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81113Gh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ List<C81243Gu> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81113Gh(String str, List<C81243Gu> list, InterfaceC67352kd<? super C81113Gh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C81113Gh(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C81143Gk c81143Gk = C81143Gk.LIZ;
        EnumC81123Gi enumC81123Gi = EnumC81123Gi.FetchUserInfo;
        String str = this.LJLIL;
        List<C81243Gu> list = this.LJLILLLLZI;
        c81143Gk.getClass();
        C81143Gk.LJ(enumC81123Gi, str, list);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
