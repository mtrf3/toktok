package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.core.Loader", f = "Loader.kt", l = {103, 104, 106, 107}, m = "process")
/* renamed from: X.4ch, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113394ch extends C3CS {
    public AbstractC113374cf LJLIL;
    public AbstractC113374cf LJLILLLLZI;
    public AbstractC113374cf LJLJI;
    public AbstractC113374cf LJLJJI;
    public AbstractC113374cf LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ AbstractC113374cf<T, R> LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C113394ch(AbstractC113374cf<T, R> abstractC113374cf, InterfaceC67352kd<? super C113394ch> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = abstractC113374cf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LJIIIZ(null, this);
    }
}
