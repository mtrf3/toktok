package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.core.sendv2.postsend.PostSendGiftChecker", f = "PostSendGiftChecker.kt", l = {107}, m = "checkAndIntercept")
/* loaded from: classes14.dex */
public final class UVS extends C3CS {
    public UVR LJLIL;
    public C32816CuK LJLILLLLZI;
    public UVU LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ UVR LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UVS(UVR uvr, InterfaceC67352kd<? super UVS> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = uvr;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZ(null, null, null, this);
    }
}
