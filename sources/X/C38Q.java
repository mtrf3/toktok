package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource", f = "StorageDataSource.kt", l = {247}, m = "getUserList")
/* renamed from: X.38Q, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38Q extends C3CS {
    public C38T LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C38C LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38Q(C38C c38c, InterfaceC67352kd<? super C38Q> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c38c;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZJ(null, this);
    }
}
