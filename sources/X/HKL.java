package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.autocut.autocutanchor.AutoCutTemplateComponent", f = "AutoCutTemplateComponent.kt", l = {357, 357}, m = "compressVideos")
/* loaded from: classes8.dex */
public final class HKL extends C3CS {
    public HKJ LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public long LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ HKJ LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HKL(HKJ hkj, InterfaceC67352kd<? super HKL> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = hkj;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LJJLIIJ(null, null, null, this);
    }
}
