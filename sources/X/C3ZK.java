package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.data.dao.room.IMUserBaseInfoDaoBase", f = "IMUserBaseInfoDaoBase.kt", l = {C61447O9r.LJIIJ}, m = "handleInsertingUser")
/* renamed from: X.3ZK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3ZK extends C3CS {
    public IMUserBaseInfo LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C3ZI LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3ZK(C3ZI c3zi, InterfaceC67352kd<? super C3ZK> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c3zi;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZLLL(null, this);
    }
}
