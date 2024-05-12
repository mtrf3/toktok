package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.dialogcenter.task.RequestContactFBAuthPipelineTask", f = "RequestContactFBAuthPipelineTask.kt", l = {63}, m = "execute")
/* renamed from: X.URg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77192URg extends C3CS {
    public C77190URe LJLIL;
    public C77208URw LJLILLLLZI;
    public EnumC77147UPn LJLJI;
    public Object LJLJJI;
    public EnumC77147UPn LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public /* synthetic */ Object LJLJLJ;
    public final /* synthetic */ C77190URe LJLJLLL;
    public int LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77192URg(C77190URe c77190URe, InterfaceC67352kd<? super C77192URg> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLLL = c77190URe;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJLJ = obj;
        this.LJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLLL.LIZ(null, this);
    }
}
