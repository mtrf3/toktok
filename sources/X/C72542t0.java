package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource$Companion", f = "StorageDataSource.kt", l = {71}, m = "getInstance")
/* renamed from: X.2t0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72542t0 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C72552t1 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72542t0(C72552t1 c72552t1, InterfaceC67352kd<? super C72542t0> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c72552t1;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, this);
    }
}
