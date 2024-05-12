package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.utils.CallbackActionLinkComponentExtKt", f = "CallbackActionLinkComponentExt.kt", l = {21}, m = "executeCallback")
/* renamed from: X.30h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C769530h extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;

    public C769530h(InterfaceC67352kd<? super C769530h> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C769430g.LIZ(0L, null, null, this);
    }
}
