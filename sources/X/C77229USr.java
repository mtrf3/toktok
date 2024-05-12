package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.mlbb.MlbbRequestAuthProcessor", f = "MlbbRequestAuthProcessor.kt", l = {34, 68}, m = "process")
/* renamed from: X.USr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77229USr extends C3CS {
    public Object LJLIL;
    public C77211URz LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C77223USl LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77229USr(C77223USl c77223USl, InterfaceC67352kd<? super C77229USr> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c77223USl;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(null, this);
    }
}
