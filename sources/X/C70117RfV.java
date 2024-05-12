package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemResult;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.BundleAddItemsToCartData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.buytogether.BuyTogetherVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS35S1000000_12;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.buytogether.BuyTogetherVH$addCart$1$1", f = "BuyTogetherVH.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.RfV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70117RfV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ BuyTogetherVH LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ View LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70117RfV(BuyTogetherVH buyTogetherVH, Object obj, int i, View view, String str, InterfaceC67352kd<? super C70117RfV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = buyTogetherVH;
        this.LJLILLLLZI = obj;
        this.LJLJI = i;
        this.LJLJJI = view;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70117RfV(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        BundleAddItemsToCartData bundleAddItemsToCartData;
        java.util.Map<String, RYM> map;
        java.util.Set<String> keySet;
        Feed feed;
        AddItemResult addItemResult;
        List<AddItemResult> list;
        AddItemResult addItemResult2;
        Feed feed2;
        C141335gf.LIZJ(obj);
        C70120RfY L = this.LJLIL.L();
        BuyTogetherVH buyTogetherVH = this.LJLIL;
        C69925RcP info = (C69925RcP) buyTogetherVH.getItem();
        Object obj2 = this.LJLILLLLZI;
        if (obj2 instanceof BundleAddItemsToCartData) {
            bundleAddItemsToCartData = (BundleAddItemsToCartData) obj2;
        } else {
            bundleAddItemsToCartData = null;
        }
        int i = this.LJLJI;
        L.getClass();
        o.LJIIIZ(info, "info");
        C69926RcQ c69926RcQ = info.LJLJJLL;
        if (c69926RcQ != null && (map = c69926RcQ.LIZ) != null && (keySet = map.keySet()) != null) {
            for (String str : keySet) {
                RYM rym = info.LJLJJLL.LIZ.get(str);
                int i2 = 0;
                if (rym != null && rym.LJFF) {
                    List<Feed> list2 = info.LJLJJL;
                    if (list2 != null) {
                        Iterator<Feed> it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                feed2 = it.next();
                                if (o.LJ(feed2.id, str)) {
                                    break;
                                }
                            } else {
                                feed2 = null;
                                break;
                            }
                        }
                        feed = feed2;
                    } else {
                        feed = null;
                    }
                    List<Feed> list3 = info.LJLJJL;
                    if (list3 != null) {
                        Iterator<Feed> it2 = list3.iterator();
                        while (it2.hasNext()) {
                            if (o.LJ(it2.next().id, str)) {
                                break;
                            }
                            i2++;
                        }
                    }
                    i2 = -1;
                    if (bundleAddItemsToCartData != null && (list = bundleAddItemsToCartData.addItemResults) != null) {
                        Iterator<AddItemResult> it3 = list.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                addItemResult2 = it3.next();
                                if (o.LJ(addItemResult2.skuId, rym.LIZLLL)) {
                                    break;
                                }
                            } else {
                                addItemResult2 = null;
                                break;
                            }
                        }
                        addItemResult = addItemResult2;
                    } else {
                        addItemResult = null;
                    }
                    C78946Uyc.LJJII(buyTogetherVH, new C70927RsZ(), new C70118RfW(L, feed, i2, str, rym, addItemResult, i));
                }
            }
        }
        if (this.LJLJI != 0) {
            C26049AKf.LIZ(this.LJLJJI, this.LJLJJL);
            return C76800UCe.LIZ;
        }
        PdpViewModel vm = this.LJLIL.getVm();
        Context context = this.LJLIL.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        vm.ix0(context, this.LJLJJL);
        this.LJLIL.getVm().nx0(this.LJLILLLLZI);
        C70120RfY L2 = this.LJLIL.L();
        BuyTogetherVH node = this.LJLIL;
        String toastName = this.LJLJJL;
        L2.getClass();
        o.LJIIIZ(node, "node");
        o.LJIIIZ(toastName, "toastName");
        C78946Uyc.LJJII(node, new C70947Rst(), new AqS35S1000000_12(toastName, 49));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
