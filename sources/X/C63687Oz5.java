package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.client.SendMessageQueue", f = "SendMessageQueue.kt", l = {LiveAnchorEnableInnerBeautyMaxValue.DEFAULT, 90, 101, 105}, m = "runRequest")
/* renamed from: X.Oz5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63687Oz5 extends C3CS {
    public C63686Oz4 LJLIL;
    public OSZ LJLILLLLZI;
    public Object LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C63686Oz4<T> LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63687Oz5(C63686Oz4<T> c63686Oz4, InterfaceC67352kd<? super C63687Oz5> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c63686Oz4;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZLLL(null, this);
    }
}
