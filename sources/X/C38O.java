package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource", f = "StorageDataSource.kt", l = {186}, m = "onFullUpdateFinish")
/* renamed from: X.38O, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38O extends C3CS {
    public C790438i LJLIL;
    public long LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C38C LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38O(C38C c38c, InterfaceC67352kd<? super C38O> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c38c;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJ(this);
    }
}
