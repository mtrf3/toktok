package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommendedchats.helper.RecommendedChatManager$reset$1", f = "RecommendedChatManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2zh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76692zh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C76692zh(InterfaceC67352kd<? super C76692zh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C76692zh(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C76662ze.LJLIL.getClass();
        if (!C76662ze.LJIIIZ().isEmpty()) {
            C76662ze.LJIIIZ().clear();
            C76662ze.LJIIIZ().putAll(C76662ze.LJIIIIZZ());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C76692zh(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
