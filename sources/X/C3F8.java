package X;

import Y.IDfS21S0200000_1;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedstickers.SuggestedStickersManager$getSuggestedStickersFlow$$inlined$map$2$2", f = "SuggestedStickersManager.kt", l = {136}, m = "emit")
/* renamed from: X.3F8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3F8 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS21S0200000_1 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3F8(IDfS21S0200000_1 iDfS21S0200000_1, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDfS21S0200000_1;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
