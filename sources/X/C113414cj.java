package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.core.Loader", f = "Loader.kt", l = {47, 47}, m = "loadDirectly")
/* renamed from: X.4cj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113414cj extends C3CS {
    public AbstractC113374cf LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ AbstractC113374cf<T, R> LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C113414cj(AbstractC113374cf<T, R> abstractC113374cf, InterfaceC67352kd<? super C113414cj> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = abstractC113374cf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJFF(this);
    }
}
