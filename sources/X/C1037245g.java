package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.noticeflow.base.ChatNoticeFlowEngine", f = "ChatNoticeFlowEngine.kt", l = {124}, m = "invalidateCurrentTaskSuspend")
/* renamed from: X.45g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1037245g extends C3CS {
    public boolean LJLIL;
    public InterfaceC88471Ynr LJLILLLLZI;
    public Object LJLJI;
    public C1036845c LJLJJI;
    public C1023940d LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C1036745b LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1037245g(C1036745b c1036745b, InterfaceC67352kd<? super C1037245g> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c1036745b;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LJIIIIZZ(false, null, this);
    }
}
