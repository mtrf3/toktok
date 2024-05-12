package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.buytogether;

import X.C221108m2;
import X.C27739Aud;
import X.C61878OQg;
import X.C62822Ol8;
import X.C65330PkU;
import X.C65352Pkq;
import X.C65776Prg;
import X.C69924RcO;
import X.C69925RcP;
import X.C69926RcQ;
import X.C70120RfY;
import X.C70166RgI;
import X.C70167RgJ;
import X.C70207Rgx;
import X.C70858RrS;
import X.C72545SdZ;
import X.C78565UsT;
import X.C78613UtF;
import X.C78915Uy7;
import X.C78966Uyw;
import X.C79234V7u;
import X.ECT;
import X.InterfaceC36571c5;
import X.InterfaceC70119RfX;
import X.InterfaceC71003Rtn;
import X.OQY;
import X.RYM;
import X.SC5;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BuyTogetherVH extends AbsFullSpanVH implements InterfaceC71003Rtn, InterfaceC70119RfX {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public Set<String> LJLJI;
    public C70207Rgx LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final Map<Integer, View> LJLJJLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH
    public final boolean needDivider() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C70120RfY L() {
        return (C70120RfY) this.LJLILLLLZI.getValue();
    }

    public final PdpViewModel getVm() {
        return (PdpViewModel) this.LJLIL.getValue();
    }

    @Override // X.InterfaceC71003Rtn
    public final InterfaceC71003Rtn preTrackNode() {
        InterfaceC36571c5 LJIIIZ = C79234V7u.LJIIIZ(this.itemView);
        if (LJIIIZ instanceof InterfaceC71003Rtn) {
            return (InterfaceC71003Rtn) LJIIIZ;
        }
        return null;
    }

    public final void M() {
        if (((RecyclerView) _$_findCachedViewById(R.id.i69)).getAdapter() == null) {
            this.LJLJJI = new C70207Rgx(getVm(), this, L(), (ECT) this.LJLJJL.getValue(), this);
            ((RecyclerView) _$_findCachedViewById(R.id.i69)).setAdapter(this.LJLJJI);
            this.itemView.getContext();
            ((RecyclerView) _$_findCachedViewById(R.id.i69)).setLayoutManager(new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.buytogether.BuyTogetherVH$initRecyclerView$layoutManager$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
                public final boolean LJIJJLI() {
                    List<Feed> list = ((C69925RcP) BuyTogetherVH.this.getItem()).LJLJJL;
                    if (list == null || list.size() <= 2) {
                        return false;
                    }
                    return super.LJIJJLI();
                }

                {
                    super(0, false);
                }
            });
            ((RecyclerView) _$_findCachedViewById(R.id.i69)).LJIIJJI(new C70166RgI(new AqS162S0100000_12(this, 362)));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        M();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onPause() {
        super.onPause();
        onClearEvent();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        super.onResume();
        subscribeEvent("ec_sku_panel_close");
    }

    @Override // X.InterfaceC71003Rtn
    public final List<String> getRegisteredLane() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS c70858RrS) {
        C78915Uy7.LJJIL(c70858RrS, new AqS178S0100000_12(this, 123));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0143, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ea  */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBind(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.buytogether.BuyTogetherVH.onBind(java.lang.Object):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyTogetherVH(ViewGroup parent, ECBaseFragment fragment) {
        super(C72545SdZ.LIZJ(parent, "parent.context", R.layout.a24, parent, false));
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(fragment, "fragment");
        this.LJLJJLL = new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 49));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 363));
        this.LJLJI = OQY.INSTANCE;
        this.LJLJJL = C221108m2.LIZIZ(C70167RgJ.LJLIL);
    }

    @Override // X.InterfaceC70119RfX
    public final void LLLZL(FeedProduct feedProduct, boolean z) {
        String str;
        Map<String, RYM> map;
        Set<String> keySet;
        Map<String, RYM> map2;
        RYM rym;
        if (feedProduct == null || (str = feedProduct.id) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C69926RcQ c69926RcQ = ((C69925RcP) getItem()).LJLJJLL;
        if (c69926RcQ != null && (map = c69926RcQ.LIZ) != null && (keySet = map.keySet()) != null) {
            for (String str2 : keySet) {
                C69926RcQ c69926RcQ2 = ((C69925RcP) getItem()).LJLJJLL;
                if (c69926RcQ2 != null && (map2 = c69926RcQ2.LIZ) != null && (rym = map2.get(str2)) != null) {
                    if (o.LJ(str2, str)) {
                        linkedHashMap.put(str2, RYM.LIZ(rym, null, null, null, null, null, z, 31));
                    } else {
                        linkedHashMap.put(str2, rym);
                    }
                }
            }
        }
        N(((C69925RcP) getItem()).LJLJJLL, linkedHashMap);
    }

    public final void N(C69926RcQ c69926RcQ, Map<String, RYM> map) {
        PdpViewModel vm = getVm();
        C69926RcQ c69926RcQ2 = new C69926RcQ(map, true);
        vm.getClass();
        C78565UsT.LJJIJ(vm, C78613UtF.LIZJ, new C69924RcO(c69926RcQ2, vm, c69926RcQ, null));
        vm.LLILZLL = c69926RcQ2;
        vm.setState(new AqS178S0100000_12(vm, 56));
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, X.InterfaceC60061Nhh
    public final void onEvent(String str, String str2) {
        Feed feed;
        FeedProduct feedProduct;
        List<SkuItem> list;
        SkuItem skuItem;
        Map<String, RYM> map;
        Set<String> keySet;
        Map<String, RYM> map2;
        RYM rym;
        String str3;
        if (SC5.LIZIZ(str, "eventName", str2, "params", str, "ec_sku_panel_close")) {
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str2, C65330PkU.LIZJ(C65352Pkq.LJI(SkuPanelState.class)));
                if (!(fromJson instanceof SkuPanelState)) {
                    fromJson = null;
                }
                SkuPanelState skuPanelState = (SkuPanelState) fromJson;
                if (skuPanelState != null && this.LJLJI.contains(skuPanelState.getProductId()) && skuPanelState.getCloseFrom() == 3) {
                    String productId = skuPanelState.getProductId();
                    String skuId = skuPanelState.getSkuId();
                    Integer productQuantity = skuPanelState.getProductQuantity();
                    List<Feed> list2 = ((C69925RcP) getItem()).LJLJJL;
                    if (list2 != null) {
                        Iterator<Feed> it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                feed = it.next();
                                FeedProduct feedProduct2 = feed.product;
                                if (feedProduct2 != null) {
                                    str3 = feedProduct2.id;
                                } else {
                                    str3 = null;
                                }
                                if (o.LJ(str3, productId)) {
                                    break;
                                }
                            } else {
                                feed = null;
                                break;
                            }
                        }
                        Feed feed2 = feed;
                        if (feed2 == null || (feedProduct = feed2.product) == null || (list = feedProduct.skus) == null) {
                            return;
                        }
                        Iterator<SkuItem> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                skuItem = it2.next();
                                if (o.LJ(skuItem.skuId, skuId)) {
                                    break;
                                }
                            } else {
                                skuItem = null;
                                break;
                            }
                        }
                        SkuItem skuItem2 = skuItem;
                        if (skuItem2 == null) {
                            return;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C69926RcQ c69926RcQ = ((C69925RcP) getItem()).LJLJJLL;
                        if (c69926RcQ != null && (map = c69926RcQ.LIZ) != null && (keySet = map.keySet()) != null) {
                            for (String str4 : keySet) {
                                C69926RcQ c69926RcQ2 = ((C69925RcP) getItem()).LJLJJLL;
                                if (c69926RcQ2 != null && (map2 = c69926RcQ2.LIZ) != null && (rym = map2.get(str4)) != null) {
                                    if (o.LJ(str4, productId)) {
                                        linkedHashMap.put(str4, RYM.LIZ(rym, C78966Uyw.LJJ(skuItem2), C78966Uyw.LJJI(skuItem2, productQuantity), productQuantity, skuId, null, false, 48));
                                    } else {
                                        linkedHashMap.put(str4, rym);
                                    }
                                }
                            }
                        }
                        N(((C69925RcP) getItem()).LJLJJLL, linkedHashMap);
                    }
                }
            } catch (s unused) {
            }
        }
    }
}
