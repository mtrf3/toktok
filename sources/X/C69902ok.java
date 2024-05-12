package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeStatusBean;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.AwemeCoverManager$queryAweme$2$2$1", f = "AwemeCoverManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2ok, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69902ok extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C109544Rq>, Object> {
    public final /* synthetic */ C109544Rq LJLIL;
    public final /* synthetic */ AwemeStatusBean LJLILLLLZI;
    public final /* synthetic */ Aweme LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69902ok(C109544Rq c109544Rq, AwemeStatusBean awemeStatusBean, Aweme aweme, InterfaceC67352kd<? super C69902ok> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c109544Rq;
        this.LJLILLLLZI = awemeStatusBean;
        this.LJLJI = aweme;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69902ok(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return C84973Vd.LJIIL(this.LJLIL, this.LJLILLLLZI, this.LJLJI, true);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C109544Rq> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
