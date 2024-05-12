package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.noticeflow.base.ChatNoticeFlowEngine", f = "ChatNoticeFlowEngine.kt", l = {73}, m = "triggerAllScenesSuspend")
/* renamed from: X.45m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1037845m extends C3CS {
    public C1036745b LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C1036745b LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1037845m(C1036745b c1036745b, InterfaceC67352kd<? super C1037845m> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c1036745b;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJIILJJIL(this);
    }
}
