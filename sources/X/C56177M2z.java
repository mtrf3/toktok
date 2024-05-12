package X;

import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.placediscovery2.model.DiscoverMapResponse;
import com.ss.android.ugc.aweme.placediscovery2.vm.DiscoveryLandingMapVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.placediscovery2.vm.DiscoveryLandingMapVM$handleCategoryChanged$2", f = "DiscoveryLandingMapVM.kt", l = {616, 622, 625, 630}, m = "invokeSuspend")
/* renamed from: X.M2z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56177M2z extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public DiscoverMapResponse LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ DiscoveryLandingMapVM LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ MapBounds LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56177M2z(DiscoveryLandingMapVM discoveryLandingMapVM, String str, MapBounds mapBounds, InterfaceC67352kd<? super C56177M2z> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = discoveryLandingMapVM;
        this.LJLJJL = str;
        this.LJLJJLL = mapBounds;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C56177M2z c56177M2z = new C56177M2z(this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c56177M2z.LJLJI = obj;
        return c56177M2z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56177M2z.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
