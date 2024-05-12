package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.noticeflow.base.ChatNoticeFlowEngine$ChatNoticeScene", f = "ChatNoticeFlowEngine.kt", l = {272}, m = "invalidateTasks")
/* renamed from: X.45j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1037545j extends C3CS {
    public C1036845c LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C1036845c LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1037545j(C1036845c c1036845c, InterfaceC67352kd<? super C1037545j> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c1036845c;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZJ(this);
    }
}
