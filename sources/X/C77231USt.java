package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.email.EmailRequestAuthProcessor", f = "EmailRequestAuthProcessor.kt", l = {32}, m = "process")
/* renamed from: X.USt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77231USt extends C3CS {
    public C77211URz LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C77224USm LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77231USt(C77224USm c77224USm, InterfaceC67352kd<? super C77231USt> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c77224USm;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(null, this);
    }
}
