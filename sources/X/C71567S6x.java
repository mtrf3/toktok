package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.utils.UseLiveEffectHelper", f = "UseLiveEffectHelper.kt", l = {69}, m = "cancelEffect")
/* renamed from: X.S6x, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71567S6x extends C3CS {
    public InterfaceC07990Tb LJLIL;
    public LiveEffect LJLILLLLZI;
    public boolean LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C71562S6s LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71567S6x(C71562S6s c71562S6s, InterfaceC67352kd<? super C71567S6x> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c71562S6s;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZ(null, null, this);
    }
}
