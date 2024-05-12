package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.RecommendApi$Companion", f = "RecommendApi.kt", l = {68}, m = "writeImpression")
/* renamed from: X.ECo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36042ECo extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C36043ECp LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36042ECo(C36043ECp c36043ECp, InterfaceC67352kd<? super C36042ECo> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c36043ECp;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZIZ(null, this);
    }
}
