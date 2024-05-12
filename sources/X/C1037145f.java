package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.noticeflow.base.ChatNoticeFlowEngine", f = "ChatNoticeFlowEngine.kt", l = {173, 191}, m = "triggerSceneSuspend")
/* renamed from: X.45f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1037145f extends C3CS {
    public C1036745b LJLIL;
    public C45Q LJLILLLLZI;
    public C1036845c LJLJI;
    public C1023940d LJLJJI;
    public AbstractC1036945d LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C1036745b LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1037145f(C1036745b c1036745b, InterfaceC67352kd<? super C1037145f> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c1036745b;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LJIILL(null, this);
    }
}
