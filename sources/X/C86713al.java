package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.data.dao.IMUserBaseInfoDaoPerformance", f = "IMUserBaseInfoDaoPerformance.kt", l = {37}, m = "insertOrReplace")
/* renamed from: X.3al, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86713al extends C3CS {
    public C86703ak LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public C15150id LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C86703ak LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86713al(C86703ak c86703ak, InterfaceC67352kd<? super C86713al> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c86703ak;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LJIIJ(null, this);
    }
}
