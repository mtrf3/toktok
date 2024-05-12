package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.core.sendv2.sending.executor.BaseSendGiftExecutor", f = "BaseSendGiftExecutor.kt", l = {149}, m = "checkAndIntercept")
/* renamed from: X.UVe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77294UVe extends C3CS {
    public AbstractC77292UVc LJLIL;
    public C32816CuK LJLILLLLZI;
    public InterfaceC77300UVk LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ AbstractC77292UVc LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77294UVe(AbstractC77292UVc abstractC77292UVc, InterfaceC67352kd<? super C77294UVe> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = abstractC77292UVc;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZIZ(null, null, this);
    }
}
