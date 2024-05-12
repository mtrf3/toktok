package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.fb.FBUploadAuthProcessor", f = "FBUploadAuthProcessor.kt", l = {21}, m = "process")
/* renamed from: X.USq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77228USq extends C3CS {
    public C77225USn LJLIL;
    public C77211URz LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C77225USn LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77228USq(C77225USn c77225USn, InterfaceC67352kd<? super C77228USq> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c77225USn;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(null, this);
    }
}
