package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl", f = "BaAutoMessageServiceImpl.kt", l = {331}, m = "setAutoReplyMessage")
/* renamed from: X.XRe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84834XRe extends C3CS {
    public BaAutoMessageServiceImpl LJLIL;
    public C9Z3 LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ BaAutoMessageServiceImpl LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84834XRe(BaAutoMessageServiceImpl baAutoMessageServiceImpl, InterfaceC67352kd<? super C84834XRe> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = baAutoMessageServiceImpl;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJIIJJI(null, this);
    }
}
