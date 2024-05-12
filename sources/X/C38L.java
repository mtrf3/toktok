package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource", f = "StorageDataSource.kt", l = {324}, m = "performFullUpdate")
/* renamed from: X.38L, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38L extends C3CS {
    public C34K LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C38C LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38L(C38C c38c, InterfaceC67352kd<? super C38L> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c38c;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJFF(null, null, 0, this);
    }
}
