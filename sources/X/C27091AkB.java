package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.address.repository.AddressRepository", f = "AddressRepository.kt", l = {221}, m = "preloadAddressInputItemData")
/* renamed from: X.AkB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27091AkB extends C3CS {
    public Region LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C27090AkA LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27091AkB(C27090AkA c27090AkA, InterfaceC67352kd<? super C27091AkB> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c27090AkA;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJI(this);
    }
}
