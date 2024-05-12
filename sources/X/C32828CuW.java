package X;

import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.send.result.SendGiftSuccessHandler", f = "SendGiftSuccessHandler.kt", l = {418, 433}, m = "handleSendGiftResult")
/* renamed from: X.CuW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32828CuW extends C3CS {
    public C32800Cu4 LJLIL;
    public C32816CuK LJLILLLLZI;
    public SendGiftResult LJLJI;
    public C32804Cu8 LJLJJI;
    public Object LJLJJL;
    public int LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ C32800Cu4 LJLJLJ;
    public int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32828CuW(C32800Cu4 c32800Cu4, InterfaceC67352kd<? super C32828CuW> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLJ = c32800Cu4;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJL = obj;
        this.LJLJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLJ.LJIIJ(null, null, null, null, this);
    }
}
