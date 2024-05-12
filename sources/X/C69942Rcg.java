package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import fjb.a;
import java.lang.ref.WeakReference;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel$favoriteProduct$1", f = "SkuPanelViewModel.kt", l = {1815, 1828, 1841, 1872}, m = "invokeSuspend")
/* renamed from: X.Rcg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69942Rcg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ SkuPanelViewModel LJLJI;
    public final /* synthetic */ WeakReference<View> LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69942Rcg(SkuPanelViewModel skuPanelViewModel, WeakReference<View> weakReference, boolean z, InterfaceC67352kd<? super C69942Rcg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = skuPanelViewModel;
        this.LJLJJI = weakReference;
        this.LJLJJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69942Rcg(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ad, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69942Rcg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
