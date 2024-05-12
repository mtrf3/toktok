package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.watermark.composer.EffectWatermarkComposer", f = "EffectWatermarkComposer.kt", l = {160}, m = "loadViralEffectInfo")
/* renamed from: X.GzP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43323GzP extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ H4P LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43323GzP(H4P h4p, InterfaceC67352kd<? super C43323GzP> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = h4p;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJFF(this);
    }
}
