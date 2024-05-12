package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.noticeflow.base.ChatNoticeFlowEngine$ChatNoticeScene", f = "ChatNoticeFlowEngine.kt", l = {263}, m = "addTask")
/* renamed from: X.45i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1037445i extends C3CS {
    public C1036845c LJLIL;
    public C1023940d LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C1036845c LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1037445i(C1036845c c1036845c, InterfaceC67352kd<? super C1037445i> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c1036845c;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(null, this);
    }
}
