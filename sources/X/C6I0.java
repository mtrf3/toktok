package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.editSticker.effectPlatform.EffectExtKt", f = "EffectExt.kt", l = {79, 82}, m = "unzipEffectRes")
/* renamed from: X.6I0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6I0 extends C3CS {
    public Effect LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public int LJLJI;

    public C6I0(InterfaceC67352kd<? super C6I0> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C157986Hy.LIZIZ(null, this);
    }
}
