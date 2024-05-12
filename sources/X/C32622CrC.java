package X;

import com.bytedance.android.livesdk.hints.GiftHintsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.hints.GiftHintsManager", f = "GiftHintsManager.kt", l = {123}, m = "fetchHints")
/* renamed from: X.CrC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32622CrC extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ GiftHintsManager LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32622CrC(GiftHintsManager giftHintsManager, InterfaceC67352kd<? super C32622CrC> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = giftHintsManager;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, this);
    }
}
