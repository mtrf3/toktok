package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.RelationFetchManager", f = "RelationFetchManager.kt", l = {177, 180, 194}, m = "checkByFetchSceneSync")
/* renamed from: X.3YK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YK extends C3CS {
    public C3YC LJLIL;
    public C3YM LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C3YC LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3YK(C3YC c3yc, InterfaceC67352kd<? super C3YK> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c3yc;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZJ(null, false, this);
    }
}
