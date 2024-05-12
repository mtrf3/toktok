package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.FamiliarRelation;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.FamiliarsRelationFetchManager", f = "FamiliarsRelationFetchManager.kt", l = {82, 100}, m = "fetchFriendsRelation")
/* renamed from: X.3YV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YV extends C3CS {
    public C3YT LJLIL;
    public Object LJLILLLLZI;
    public FamiliarRelation LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C3YT LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3YV(C3YT c3yt, InterfaceC67352kd<? super C3YV> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c3yt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZJ(this);
    }
}
