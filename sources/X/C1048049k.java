package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.unreadindicator.UnreadIndicatorDelegate", f = "UnreadIndicatorDelegate.kt", l = {171}, m = "initParamAndCheckShow")
/* renamed from: X.49k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1048049k extends C3CS {
    public C1047549f LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C1047549f LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1048049k(C1047549f c1047549f, InterfaceC67352kd<? super C1048049k> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c1047549f;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZJ(this);
    }
}
