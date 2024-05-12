package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.address.repository.AddressRepository", f = "AddressRepository.kt", l = {199, 205}, m = "fetchBuyerHasAddressIfNeed")
/* renamed from: X.AkC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27092AkC extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C27090AkA LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27092AkC(C27090AkA c27090AkA, InterfaceC67352kd<? super C27092AkC> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c27090AkA;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(this);
    }
}
