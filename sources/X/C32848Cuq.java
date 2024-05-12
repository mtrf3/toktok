package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.send.result.SendGiftSuccessHandler", f = "SendGiftSuccessHandler.kt", l = {521, 533}, m = "saveThisGiftIdForDialog")
/* renamed from: X.Cuq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32848Cuq extends C3CS {
    public C32800Cu4 LJLIL;
    public C32804Cu8 LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C32800Cu4 LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32848Cuq(C32800Cu4 c32800Cu4, InterfaceC67352kd<? super C32848Cuq> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c32800Cu4;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJIIJJI(null, null, false, this);
    }
}
