package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.utils.report.SendMsgReportUtil", f = "SendMsgReportUtil.kt", l = {160}, m = "makeCommonSendResponseParams")
/* renamed from: X.4Gu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106724Gu extends C3CS {
    public C109544Rq LJLIL;
    public C63540Owi LJLILLLLZI;
    public Object LJLJI;
    public long LJLJJI;
    public int LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C106714Gt LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C106724Gu(C106714Gt c106714Gt, InterfaceC67352kd<? super C106724Gu> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c106714Gt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LIZIZ(null, 0L, null, this);
    }
}
