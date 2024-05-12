package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.read.TTSFetchEffectAbilityFactory$getTTSFetchEffectAbility$1", f = "TTSFetchEffectAbilityFactory.kt", l = {34}, m = "fetchEffectsOnlyCategory")
/* renamed from: X.5cl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138915cl extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C138905ck LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C138915cl(C138905ck c138905ck, InterfaceC67352kd<? super C138915cl> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c138905ck;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(null, this);
    }
}
