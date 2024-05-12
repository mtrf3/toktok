package X;

import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.analytics.IMChatListTroubleShoot$onInboxRefresh$1", f = "IMChatListTroubleShoot.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.35L, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C35L extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C35L(InterfaceC67352kd<? super C35L> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C35L(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        StringBuilder LIZLLL = C3K4.LIZ.LIZLLL();
        LIZLLL.append("_16");
        String sb = LIZLLL.toString();
        o.LJIIIIZZ(sb, "builder.toString()");
        C34B.LJI("IMEmptyChatList", sb);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C35L(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
