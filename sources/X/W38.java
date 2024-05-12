package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.image.progressbar.ViewPagerSwipeHintController", f = "ViewPagerSwipeHintController.kt", l = {71, 74, 77}, m = "performSwipeHint")
/* loaded from: classes15.dex */
public final class W38 extends C3CS {
    public W36 LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ W36 LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W38(W36 w36, InterfaceC67352kd<? super W38> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = w36;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(this);
    }
}
