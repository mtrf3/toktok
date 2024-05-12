package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.hotword.library.LocalHotWordLibrary", f = "LocalHotWordLibrary.kt", l = {53}, m = "getKeywordsForAllGifts")
/* loaded from: classes14.dex */
public final class UXQ extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ UXO LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UXQ(UXO uxo, InterfaceC67352kd<? super UXQ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = uxo;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZJ(this);
    }
}
