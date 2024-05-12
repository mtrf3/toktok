package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.noticeflow.base.ChatNoticeFlowEngine", f = "ChatNoticeFlowEngine.kt", l = {87, 88}, m = "addTaskAndTriggerSuspend")
/* renamed from: X.45l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1037745l extends C3CS {
    public C1036745b LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C1036745b LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1037745l(C1036745b c1036745b, InterfaceC67352kd<? super C1037745l> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c1036745b;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJ(null, this);
    }
}
