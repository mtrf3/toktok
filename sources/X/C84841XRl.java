package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl", f = "BaAutoMessageServiceImpl.kt", l = {128, 130}, m = "getSuggestedQuestionEnable")
/* renamed from: X.XRl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84841XRl extends C3CS {
    public BaAutoMessageServiceImpl LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ BaAutoMessageServiceImpl LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84841XRl(BaAutoMessageServiceImpl baAutoMessageServiceImpl, InterfaceC67352kd<? super C84841XRl> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = baAutoMessageServiceImpl;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJIILL(this);
    }
}
