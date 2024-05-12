package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.watermark.resourceloader.EffectWatermarkResourceLoader", f = "EffectWatermarkResourceLoader.kt", l = {55, 59}, m = "prepareEffectPackage")
/* renamed from: X.H6u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43536H6u extends C3CS {
    public C43534H6s LJLIL;
    public Effect LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C43534H6s LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43536H6u(C43534H6s c43534H6s, InterfaceC67352kd<? super C43536H6u> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c43534H6s;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZLLL(this);
    }
}
