package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.FavoriteApi$Companion", f = "FavoriteApi.kt", l = {41}, m = "favoriteProduct")
/* renamed from: X.EjJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37229EjJ extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C37228EjI LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37229EjJ(C37228EjI c37228EjI, InterfaceC67352kd<? super C37229EjJ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c37228EjI;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, null, this);
    }
}
