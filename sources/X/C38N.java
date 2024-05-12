package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.relation.storage.api.StorageApiService;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.api.StorageApiService", f = "StorageApi.kt", l = {60, 64, 65}, m = "getPagingResponse")
/* renamed from: X.38N, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38N extends C3CS {
    public StorageApiService LJLIL;
    public C38K LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ StorageApiService LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38N(StorageApiService storageApiService, InterfaceC67352kd<? super C38N> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = storageApiService;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZ(null, 0, 0, this);
    }
}
