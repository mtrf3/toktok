package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.watermark.resourceloader.EffectWatermarkResourceLoader", f = "EffectWatermarkResourceLoader.kt", l = {44}, m = "load")
/* renamed from: X.H6w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43538H6w extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C43534H6s LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43538H6w(C43534H6s c43534H6s, InterfaceC67352kd<? super C43538H6w> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c43534H6s;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZIZ(this);
    }
}
