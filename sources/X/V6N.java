package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "tiktok.compose.paging.PagingLazyExtensionKt", f = "PagingLazyExtension.kt", l = {93, 100}, m = "LaunchPagingEffect$checkLoad")
/* loaded from: classes14.dex */
public final class V6N<T> extends C3CS {
    public V6O LJLIL;
    public V7O LJLILLLLZI;
    public InterfaceC88471Ynr LJLJI;
    public InterfaceC24760y8 LJLJJI;
    public InterfaceC24760y8 LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public int LJLJL;

    public V6N(InterfaceC67352kd<? super V6N> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return V6M.LIZIZ(null, null, null, null, null, this);
    }
}
