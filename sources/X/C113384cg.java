package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.core.Loader", f = "Loader.kt", l = {113}, m = "applyFilter")
/* renamed from: X.4cg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113384cg<D> extends C3CS {
    public InterfaceC88471Ynr LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ AbstractC113374cf<Object, Object> LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C113384cg(AbstractC113374cf<Object, Object> abstractC113374cf, InterfaceC67352kd<? super C113384cg> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = abstractC113374cf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZLLL(null, this, null);
    }
}
