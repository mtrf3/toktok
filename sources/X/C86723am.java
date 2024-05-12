package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.data.dao.IMUserBaseInfoDaoPerformance", f = "IMUserBaseInfoDaoPerformance.kt", l = {C61447O9r.LJIIJ}, m = "updateIMUserBaseInfo")
/* renamed from: X.3am, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86723am extends C3CS {
    public C86703ak LJLIL;
    public Object LJLILLLLZI;
    public C15150id LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C86703ak LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86723am(C86703ak c86703ak, InterfaceC67352kd<? super C86723am> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c86703ak;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJI(null, this);
    }
}
