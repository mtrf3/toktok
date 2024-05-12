package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl", f = "BaAutoMessageServiceImpl.kt", l = {217}, m = "setWelcomeMessage")
/* renamed from: X.XRb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84831XRb extends C3CS {
    public BaAutoMessageServiceImpl LJLIL;
    public C9ZN LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ BaAutoMessageServiceImpl LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84831XRb(BaAutoMessageServiceImpl baAutoMessageServiceImpl, InterfaceC67352kd<? super C84831XRb> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = baAutoMessageServiceImpl;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZLLL(null, this);
    }
}
