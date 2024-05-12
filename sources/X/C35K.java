package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.analytics.IMChatListTroubleShoot$getSessionAndUnread$1", f = "IMChatListTroubleShoot.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.35K, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C35K extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35K(int i, int i2, InterfaceC67352kd<? super C35K> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C35K(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        StringBuilder LIZLLL = C3K4.LIZ.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("_15(");
        LIZ.append(this.LJLIL);
        LIZ.append('_');
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        LIZLLL.append(X1D.LIZIZ(LIZ));
        String sb = LIZLLL.toString();
        o.LJIIIIZZ(sb, "builder.toString()");
        C34B.LJI("IMEmptyChatList", sb);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
