package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.relation.model.RecUser;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.source.UserCardDataSource", f = "UserCardDataSource.kt", l = {171}, m = "getAndInsertRelatedUserList")
/* renamed from: X.MpB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57977MpB extends C3CS {
    public C57962Mow LJLIL;
    public RecUser LJLILLLLZI;
    public boolean LJLJI;
    public long LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C57962Mow LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57977MpB(C57962Mow c57962Mow, InterfaceC67352kd<? super C57977MpB> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c57962Mow;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LJIILJJIL(null, false, this);
    }
}
