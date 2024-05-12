package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.core.sendv2.presend.PreSendGiftChecker", f = "PreSendGiftChecker.kt", l = {77, LiveAnchorEnableInnerBeautyMaxValue.DEFAULT}, m = "doCheckAndNotify")
/* renamed from: X.UVa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77290UVa extends C3CS {
    public UVV LJLIL;
    public C32816CuK LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ UVV LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77290UVa(UVV uvv, InterfaceC67352kd<? super C77290UVa> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = uvv;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZIZ(null, this);
    }
}
