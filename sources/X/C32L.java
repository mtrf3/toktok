package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.unreadindicator.UnreadMessageIndicatorFactoryKt", f = "UnreadMessageIndicatorFactory.kt", l = {28}, m = "getUnreadMessageIndicatorParameters")
/* renamed from: X.32L, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C32L extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public int LJLJJLL;

    public C32L(InterfaceC67352kd<? super C32L> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C32K.LIZ(null, this);
    }
}
