package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource", f = "StorageDataSource.kt", l = {329, 198}, m = "receivePushEvents")
/* renamed from: X.38I, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38I extends C3CS {
    public C38C LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public AbstractC74232vj LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C38C LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38I(C38C c38c, InterfaceC67352kd<? super C38I> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c38c;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LJI(null, this);
    }
}
