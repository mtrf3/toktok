package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.ContactBookFilterByPsi", f = "ContactFilterByPsi.kt", l = {196, 260}, m = "tryFilterBeforeUpload")
/* loaded from: classes7.dex */
public final class EM5 extends C3CS {
    public EM1 LJLIL;
    public EM2 LJLILLLLZI;
    public Object LJLJI;
    public InterfaceC88471Ynr LJLJJI;
    public Object LJLJJL;
    public Object LJLJJLL;
    public Object LJLJL;
    public /* synthetic */ Object LJLJLJ;
    public final /* synthetic */ EM1 LJLJLLL;
    public int LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EM5(EM1 em1, InterfaceC67352kd<? super EM5> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLLL = em1;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJLJ = obj;
        this.LJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLLL.LIZ(null, null, null, null, this);
    }
}
