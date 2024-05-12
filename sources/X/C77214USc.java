package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.fb.FBRequestAuthProcessor", f = "FBRequestAuthProcessor.kt", l = {35, 42, 56, 71}, m = "process")
/* renamed from: X.USc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77214USc extends C3CS {
    public Object LJLIL;
    public C77211URz LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C77212USa LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77214USc(C77212USa c77212USa, InterfaceC67352kd<? super C77214USc> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c77212USa;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(null, this);
    }
}
