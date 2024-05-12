package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.data.manager.decorator.FamiliarsRelationDaoPerformance", f = "FamiliarsRelationDaoPerformance.kt", l = {45}, m = "insertOrReplaceFriendsRelation")
/* renamed from: X.3aN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86473aN extends C3CS {
    public C86463aM LJLIL;
    public Object LJLILLLLZI;
    public C15150id LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C86463aM LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86473aN(C86463aM c86463aM, InterfaceC67352kd<? super C86473aN> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c86463aM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LJ(null, this);
    }
}
