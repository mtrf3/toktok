package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.ui.ReplyMessageLayout$setVideoCoverInHint$1", f = "ReplyMessageLayout.kt", l = {541}, m = "invokeSuspend")
/* renamed from: X.2oz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70052oz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AnonymousClass488 LJLILLLLZI;
    public final /* synthetic */ C109544Rq LJLJI;
    public final /* synthetic */ ShareAwemeContent LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70052oz(AnonymousClass488 anonymousClass488, C109544Rq c109544Rq, ShareAwemeContent shareAwemeContent, boolean z, InterfaceC67352kd<? super C70052oz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = anonymousClass488;
        this.LJLJI = c109544Rq;
        this.LJLJJI = shareAwemeContent;
        this.LJLJJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70052oz(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C84973Vd c84973Vd = C84973Vd.LIZ;
            C62846OlW videoCover = this.LJLILLLLZI.getVideoCover();
            C109544Rq c109544Rq = this.LJLJI;
            ShareAwemeContent shareAwemeContent = this.LJLJJI;
            boolean z = this.LJLJJL;
            this.LJLIL = 1;
            if (c84973Vd.LIZJ(c109544Rq, videoCover, shareAwemeContent, this, z) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
