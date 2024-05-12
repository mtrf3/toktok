package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.dialogcenter.task.RequestEmailAuthPipelineTask", f = "RequestEmailAuthPipelineTask.kt", l = {118}, m = "execute")
/* loaded from: classes14.dex */
public final class US0 extends C3CS {
    public C77201URp LJLIL;
    public C77208URw LJLILLLLZI;
    public Object LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C77201URp LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public US0(C77201URp c77201URp, InterfaceC67352kd<? super US0> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c77201URp;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZ(null, this);
    }
}
