package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.AwemeCoverManager$bindAwemeCoverOldStyle$4$onFinalImageSet$2$1", f = "AwemeCoverManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2q5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70732q5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ C109544Rq LJLILLLLZI;
    public final /* synthetic */ ShareAwemeContent LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70732q5(View view, C109544Rq c109544Rq, ShareAwemeContent shareAwemeContent, InterfaceC67352kd interfaceC67352kd, boolean z) {
        super(2, interfaceC67352kd);
        this.LJLIL = view;
        this.LJLILLLLZI = c109544Rq;
        this.LJLJI = shareAwemeContent;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70732q5(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd, this.LJLJJI);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C84973Vd.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, null);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
