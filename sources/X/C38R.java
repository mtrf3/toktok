package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource", f = "StorageDataSource.kt", l = {209, 215, 226, 233}, m = "consumption")
/* renamed from: X.38R, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38R extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C38C LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38R(C38C c38c, InterfaceC67352kd<? super C38R> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c38c;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZIZ(null, this);
    }
}
