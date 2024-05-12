package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.utils.UseLiveEffectHelper", f = "UseLiveEffectHelper.kt", l = {101, 109, 149, 199}, m = "setEffect")
/* renamed from: X.S6v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71565S6v extends C3CS {
    public C71562S6s LJLIL;
    public InterfaceC07990Tb LJLILLLLZI;
    public LiveEffect LJLJI;
    public Object LJLJJI;
    public RootData LJLJJL;
    public Object LJLJJLL;
    public Object LJLJL;
    public Object LJLJLJ;
    public Object LJLJLLL;
    public Object LJLL;
    public Object LJLLI;
    public boolean LJLLILLLL;
    public long LJLLJ;
    public /* synthetic */ Object LJLLL;
    public final /* synthetic */ C71562S6s LJLLLL;
    public int LJLLLLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71565S6v(C71562S6s c71562S6s, InterfaceC67352kd<? super C71565S6v> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLLLL = c71562S6s;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLLL = obj;
        this.LJLLLLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLLLL.LIZIZ(null, null, null, null, false, null, null, null, null, null, this);
    }
}
