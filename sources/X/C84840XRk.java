package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl", f = "BaAutoMessageServiceImpl.kt", l = {378, 380}, m = "getSuggestedQuestionCount")
/* renamed from: X.XRk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84840XRk extends C3CS {
    public BaAutoMessageServiceImpl LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ BaAutoMessageServiceImpl LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84840XRk(BaAutoMessageServiceImpl baAutoMessageServiceImpl, InterfaceC67352kd<? super C84840XRk> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = baAutoMessageServiceImpl;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZJ(this);
    }
}