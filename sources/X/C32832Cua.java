package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.send.result.SendGiftFailureReqHandler", f = "SendGiftFailureReqHandler.kt", l = {496, 504, 512, 524, 527}, m = "doFailCallback")
/* renamed from: X.Cua, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32832Cua extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C32801Cu5 LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32832Cua(C32801Cu5 c32801Cu5, InterfaceC67352kd<? super C32832Cua> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c32801Cu5;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJIIIZ(null, null, this);
    }
}
