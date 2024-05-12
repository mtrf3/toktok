package X;

import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.tiktok.location_api.service.proxy.BDLocationProxy;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment$fetchLocation$1$onLocationDataChanged$2", f = "DistrictFragment.kt", l = {1980}, m = "invokeSuspend")
/* renamed from: X.Apd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27429Apd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ BDLocationProxy LJLJI;
    public final /* synthetic */ DistrictFragment LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27429Apd(BDLocationProxy bDLocationProxy, DistrictFragment districtFragment, InterfaceC67352kd<? super C27429Apd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = bDLocationProxy;
        this.LJLJJI = districtFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C27429Apd c27429Apd = new C27429Apd(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c27429Apd.LJLILLLLZI = obj;
        return c27429Apd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0161, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L36;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27429Apd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
