package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.noticeflow.base.ChatNoticeFlowEngine", f = "ChatNoticeFlowEngine.kt", l = {47, 51}, m = "addTask")
/* renamed from: X.45h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1037345h extends C3CS {
    public C1036745b LJLIL;
    public C1023940d LJLILLLLZI;
    public C1036845c LJLJI;
    public boolean LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C1036745b LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1037345h(C1036745b c1036745b, InterfaceC67352kd<? super C1037345h> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c1036745b;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZ(null, this);
    }
}
