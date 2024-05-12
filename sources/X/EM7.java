package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.ContactBookFilterByPsi", f = "ContactFilterByPsi.kt", l = {218}, m = "tryFilterBeforeUpload$expV1")
/* loaded from: classes7.dex */
public final class EM7 extends C3CS {
    public EM1 LJLIL;
    public EM2 LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public int LJLJJLL;

    public EM7(InterfaceC67352kd<? super EM7> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return EM1.LIZIZ(null, null, null, null, null, null, null, null, this);
    }
}
