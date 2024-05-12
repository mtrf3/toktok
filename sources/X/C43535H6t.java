package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.watermark.resourceloader.EffectWatermarkResourceLoader", f = "EffectWatermarkResourceLoader.kt", l = {137}, m = "prepareEffectIcon")
/* renamed from: X.H6t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43535H6t extends C3CS {
    public C43534H6s LJLIL;
    public Effect LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C43534H6s LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43535H6t(C43534H6s c43534H6s, InterfaceC67352kd<? super C43535H6t> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c43534H6s;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZJ(null, this);
    }
}
