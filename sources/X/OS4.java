package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.util.ShopEventKt", f = "ShopEvent.kt", l = {20}, m = "requestShop")
/* loaded from: classes11.dex */
public final class OS4<T> extends C3CS {
    public Object LJLIL;
    public long LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public int LJLJJI;

    public OS4(InterfaceC67352kd<? super OS4> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return OS2.LIZ(null, null, null, null, this);
    }
}
