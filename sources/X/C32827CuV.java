package X;

import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.sdk.datachannel.DataChannel;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.send.result.SendGiftSuccessHandler", f = "SendGiftSuccessHandler.kt", l = {125, 131, 141, 145, 155, 174, 196, 241, 252, 316}, m = "handleSuccess")
/* renamed from: X.CuV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32827CuV extends C3CS {
    public C32800Cu4 LJLIL;
    public C32816CuK LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public SendGiftResult LJLJJL;
    public DataChannel LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ C32800Cu4 LJLJLJ;
    public int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32827CuV(C32800Cu4 c32800Cu4, InterfaceC67352kd<? super C32827CuV> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLJ = c32800Cu4;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJL = obj;
        this.LJLJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLJ.LIZLLL(null, null, this);
    }
}
