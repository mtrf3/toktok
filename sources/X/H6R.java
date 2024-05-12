package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.watermark.resourceloader.EndingWatermarkResourceLoader", f = "EndingWatermarkResourceLoader.kt", l = {200, 201, 210, 211}, m = "loadEffectResources")
/* loaded from: classes8.dex */
public final class H6R extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public InterfaceC84498XEg LJLJJL;
    public boolean LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ H6P LJLJLJ;
    public int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H6R(H6P h6p, InterfaceC67352kd<? super H6R> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLJ = h6p;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJL = obj;
        this.LJLJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLJ.LIZIZ(this);
    }
}
