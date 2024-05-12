package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.EcAnchorApi$Companion", f = "EcAnchorApi.kt", l = {67}, m = "preloadCreationData")
/* renamed from: X.2ww, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74982ww extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C74952wt LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74982ww(C74952wt c74952wt, InterfaceC67352kd<? super C74982ww> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c74952wt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZIZ(this);
    }
}
