package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.relation.storage.model.LocalData;
import com.ss.android.ugc.aweme.relation.storage.model.LocalListResponse;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource", f = "StorageDataSource.kt", l = {168, 176}, m = "handleResponse")
/* renamed from: X.38F, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38F extends C3CS {
    public Object LJLIL;
    public LocalListResponse LJLILLLLZI;
    public AnonymousClass385 LJLJI;
    public C34K LJLJJI;
    public Object LJLJJL;
    public LocalData LJLJJLL;
    public Object LJLJL;
    public C34K LJLJLJ;
    public long LJLJLLL;
    public /* synthetic */ Object LJLL;
    public final /* synthetic */ C38C LJLLI;
    public int LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38F(C38C c38c, InterfaceC67352kd<? super C38F> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLLI = c38c;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLL = obj;
        this.LJLLILLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLLI.LIZLLL(null, null, 0L, this);
    }
}
