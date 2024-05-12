package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemResult;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.BundleAddItemsToCartData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.bundledeal.PdpBundleDealVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS32S0301000_12;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.bundledeal.PdpBundleDealVH$addCart$1$1", f = "PdpBundleDealVH.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Rfa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70122Rfa extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ PdpBundleDealVH LJLIL;
    public final /* synthetic */ BundleInfo LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70122Rfa(PdpBundleDealVH pdpBundleDealVH, BundleInfo bundleInfo, Object obj, int i, View view, String str, InterfaceC67352kd<? super C70122Rfa> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = pdpBundleDealVH;
        this.LJLILLLLZI = bundleInfo;
        this.LJLJI = obj;
        this.LJLJJI = i;
        this.LJLJJL = view;
        this.LJLJJLL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70122Rfa(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        BundleAddItemsToCartData bundleAddItemsToCartData;
        List<AddItemResult> list;
        C141335gf.LIZJ(obj);
        C70123Rfb logger = this.LJLIL.getLogger();
        PdpBundleDealVH node = this.LJLIL;
        BundleInfo bundleInfo = this.LJLILLLLZI;
        Object obj2 = this.LJLJI;
        if (obj2 instanceof BundleAddItemsToCartData) {
            bundleAddItemsToCartData = (BundleAddItemsToCartData) obj2;
        } else {
            bundleAddItemsToCartData = null;
        }
        int i = this.LJLJJI;
        logger.getClass();
        o.LJIIIZ(node, "node");
        o.LJIIIZ(bundleInfo, "bundleInfo");
        if (bundleAddItemsToCartData != null && (list = bundleAddItemsToCartData.addItemResults) != null) {
            Iterator<AddItemResult> it = list.iterator();
            while (it.hasNext()) {
                C78946Uyc.LJJII(node, new C70927RsZ(), new AqS32S0301000_12(logger, bundleInfo, it.next(), i, 4));
            }
        }
        if (this.LJLJJI != 0) {
            C26049AKf.LIZ(this.LJLJJL, this.LJLJJLL);
            return C76800UCe.LIZ;
        }
        PdpViewModel vm = this.LJLIL.getVm();
        Context context = this.LJLIL.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        vm.Pv0(context, this.LJLJJL, this.LJLJJLL, this.LJLJI, LifecycleOwnerKt.getLifecycleScope(this.LJLIL));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
