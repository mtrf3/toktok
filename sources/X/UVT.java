package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.core.sendv2.postsend.PostSendGiftChecker", f = "PostSendGiftChecker.kt", l = {LiveAnchorEnableInnerBeautyMaxValue.DEFAULT, 93}, m = "doCheck")
/* loaded from: classes14.dex */
public final class UVT extends C3CS {
    public UVR LJLIL;
    public C32816CuK LJLILLLLZI;
    public UV9 LJLJI;
    public Object LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ UVR LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UVT(UVR uvr, InterfaceC67352kd<? super UVT> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = uvr;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZIZ(null, null, this);
    }
}
