package X;

import com.bytedance.android.livesdk.hotword.KeywordsLibraryInfo;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.hotword.library.LocalHotWordLibrary", f = "LocalHotWordLibrary.kt", l = {23}, m = "storeData")
/* loaded from: classes14.dex */
public final class UXP extends C3CS {
    public UXO LJLIL;
    public KeywordsLibraryInfo LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ UXO LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UXP(UXO uxo, InterfaceC67352kd<? super UXP> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = uxo;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(null, this);
    }
}
