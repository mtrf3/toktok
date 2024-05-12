package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.hotword.matcher.AhoCorasickMatcher", f = "AhoCorasickMatcher.kt", l = {15}, m = "prepare")
/* loaded from: classes14.dex */
public final class UXL extends C3CS {
    public UXJ LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ UXJ LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UXL(UXJ uxj, InterfaceC67352kd<? super UXL> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = uxj;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(this);
    }
}
