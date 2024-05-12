package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.repair.completeness.MessageCompletenessCheckerImpl", f = "MessageCompletenessChecker.kt", l = {91, 125}, m = "checkAndReport")
/* renamed from: X.OuM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63394OuM extends C3CS {
    public C63389OuH LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public long LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ C63389OuH LJLJLJ;
    public int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63394OuM(C63389OuH c63389OuH, InterfaceC67352kd<? super C63394OuM> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLJ = c63389OuH;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJL = obj;
        this.LJLJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLJ.LIZ(0, null, null, this);
    }
}
