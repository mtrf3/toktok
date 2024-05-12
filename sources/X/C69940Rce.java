package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$favoriteProduct$1", f = "PdpViewModel.kt", l = {4485, 4493, 4504}, m = "invokeSuspend")
/* renamed from: X.Rce, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69940Rce extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ PdpViewModel LJLJI;
    public final /* synthetic */ View LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69940Rce(PdpViewModel pdpViewModel, View view, boolean z, InterfaceC67352kd<? super C69940Rce> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = pdpViewModel;
        this.LJLJJI = view;
        this.LJLJJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69940Rce(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ac, code lost:
    
        if (r7 != null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dd  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69940Rce.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
