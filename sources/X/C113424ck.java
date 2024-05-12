package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.core.Loader", f = "Loader.kt", l = {C61447O9r.LJIIJ, C61447O9r.LJIIJ}, m = "loadMoreDirectly")
/* renamed from: X.4ck, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113424ck extends C3CS {
    public AbstractC113374cf LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ AbstractC113374cf<T, R> LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C113424ck(AbstractC113374cf<T, R> abstractC113374cf, InterfaceC67352kd<? super C113424ck> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = abstractC113374cf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJII(this);
    }
}
