package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.send.sending.excutor.RetrofitSendGiftExecutor", f = "RetrofitSendGiftExecutor.kt", l = {167}, m = "doSend")
/* loaded from: classes14.dex */
public final class UVD extends C3CS {
    public UVC LJLIL;
    public C32816CuK LJLILLLLZI;
    public C68322mC LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ UVC LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UVD(UVC uvc, InterfaceC67352kd<? super UVD> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = uvc;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJFF(null, this);
    }
}
