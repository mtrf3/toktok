package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.email.EmailUploadAuthProcessor", f = "EmailUploadAuthProcessor.kt", l = {17}, m = "process")
/* loaded from: classes14.dex */
public final class UT8 extends C3CS {
    public C77211URz LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ UT6 LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UT8(UT6 ut6, InterfaceC67352kd<? super UT8> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = ut6;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(null, this);
    }
}
