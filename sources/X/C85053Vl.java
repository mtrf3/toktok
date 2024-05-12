package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeDetailList;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.LongClickHandlerExtKt$openCreationFlowPage$2$1$1", f = "LongClickHandlerExt.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Vl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85053Vl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AwemeDetailList LJLIL;
    public final /* synthetic */ ActivityC45651qj LJLILLLLZI;
    public final /* synthetic */ DialogC25756A8y LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ C72242sW LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85053Vl(AwemeDetailList awemeDetailList, ActivityC45651qj activityC45651qj, DialogC25756A8y dialogC25756A8y, long j, C72242sW c72242sW, String str, InterfaceC67352kd<? super C85053Vl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = awemeDetailList;
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = dialogC25756A8y;
        this.LJLJJI = j;
        this.LJLJJL = c72242sW;
        this.LJLJJLL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C85053Vl(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L28;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85053Vl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
