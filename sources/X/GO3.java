package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.helper.PostedDraftHelper", f = "PostedDraftHelper.kt", l = {56, 63}, m = "clearExpiredPostedDrafts")
/* loaded from: classes8.dex */
public final class GO3 extends C3CS {
    public GO2 LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ GO2 LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GO3(GO2 go2, InterfaceC67352kd<? super GO3> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = go2;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(this);
    }
}
