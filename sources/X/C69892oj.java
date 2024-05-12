package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.AwemeCoverManager$queryReplyAweme$2", f = "AwemeCoverManager.kt", l = {800, 819}, m = "invokeSuspend")
/* renamed from: X.2oj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69892oj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ShareAwemeContent LJLJI;
    public final /* synthetic */ C109544Rq LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69892oj(ShareAwemeContent shareAwemeContent, C109544Rq c109544Rq, InterfaceC67352kd<? super C69892oj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = shareAwemeContent;
        this.LJLJJI = c109544Rq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C69892oj c69892oj = new C69892oj(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c69892oj.LJLILLLLZI = obj;
        return c69892oj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:31:0x008a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:275)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:68)
        */
    @Override // fjb.a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69892oj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
