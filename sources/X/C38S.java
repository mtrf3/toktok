package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource$performFullUpdate$$inlined$collect$1", f = "StorageDataSource.kt", l = {141}, m = "emit")
/* renamed from: X.38S, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38S extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C38G LJLJI;
    public C38G LJLJJI;
    public C34K LJLJJL;
    public long LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38S(C38G c38g, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c38g;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
