package com.ss.android.ugc.aweme.ecommerce.ttf.osp.module.shop;

import X.AbstractC029409q;
import X.C16880lQ;
import X.C221108m2;
import X.C26508Aam;
import X.C26804AfY;
import X.C62562cu;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70759Rpr;
import X.C70920RsS;
import X.C73156SnQ;
import X.C78685UuP;
import X.C78946Uyc;
import X.EnumC72807Shn;
import X.OUP;
import X.TBT;
import X.W5F;
import X.W5U;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopBill;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopPromotionActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S10S0300000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS167S0200000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TtfShopInfoVH extends ECJediViewHolder {
    public final View LJLIL;
    public final Fragment LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final Map<Integer, View> LJLJJL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final OrderSubmitViewModel L() {
        return (OrderSubmitViewModel) this.LJLJI.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        C62562cu thumbFirstImageUrlModel;
        int i;
        C62562cu c62562cu;
        C26804AfY item = (C26804AfY) obj;
        o.LJIIIZ(item, "item");
        C26508Aam.LIZ(this.LJLIL, true);
        View view = this.LJLIL;
        if (((RecyclerView) view.findViewById(R.id.gcg)).getAdapter() == null) {
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.gcg);
            view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            ((RecyclerView) view.findViewById(R.id.gcg)).setAdapter((AbstractC029409q) this.LJLJJI.getValue());
        }
        View view2 = this.LJLIL;
        view2.findViewById(R.id.title).setVisibility(8);
        int i2 = 0;
        if (item.LJIIIZ) {
            View group_shop = view2.findViewById(R.id.dz6);
            o.LJIIIIZZ(group_shop, "group_shop");
            group_shop.setVisibility(8);
        } else {
            View group_shop2 = view2.findViewById(R.id.dz6);
            o.LJIIIIZZ(group_shop2, "group_shop");
            group_shop2.setVisibility(0);
            Image image = item.LIZIZ;
            if (image != null && (thumbFirstImageUrlModel = image.toThumbFirstImageUrlModel()) != null) {
                W5F LJIIIZ = W5U.LJIIIZ(thumbFirstImageUrlModel);
                LJIIIZ.LJJIIJ = (SmartImageView) view2.findViewById(R.id.jxv);
                C16880lQ.LLJJJ(LJIIIZ);
                ((ImageView) view2.findViewById(R.id.jxv)).setColorFilter(134217728);
            }
            ((TextView) view2.findViewById(R.id.jy8)).setText(item.LIZJ);
            StoreOfficialLabel storeOfficialLabel = item.LJIIIIZZ;
            if (storeOfficialLabel != null) {
                Context context = view2.getContext();
                o.LJIIIIZZ(context, "context");
                Image LIZ = storeOfficialLabel.LIZ(context);
                if (LIZ != null) {
                    Integer width = LIZ.getWidth(15.0f);
                    if (width != null) {
                        int intValue = width.intValue();
                        SmartImageView official_label = (SmartImageView) view2.findViewById(R.id.h9z);
                        o.LJIIIIZZ(official_label, "official_label");
                        OUP.LJJJIL(intValue, official_label);
                    }
                    TuxTextView shop_name = (TuxTextView) view2.findViewById(R.id.jy8);
                    o.LJIIIIZZ(shop_name, "shop_name");
                    SmartImageView official_label2 = (SmartImageView) view2.findViewById(R.id.h9z);
                    o.LJIIIIZZ(official_label2, "official_label");
                    OUP.LJIIZILJ(shop_name, official_label2);
                    ((SmartImageView) view2.findViewById(R.id.h9z)).setActualImageScaleType(EnumC72807Shn.FIT_CENTER);
                    SmartImageView official_label3 = (SmartImageView) view2.findViewById(R.id.h9z);
                    o.LJIIIIZZ(official_label3, "official_label");
                    OUP.LJJJI(official_label3, LIZ);
                }
            }
        }
        ShopPromotionActivity shopPromotionActivity = item.LJI;
        String str = null;
        if (shopPromotionActivity != null) {
            ((TextView) view2.findViewById(R.id.iby)).setText(shopPromotionActivity.desc);
            Image image2 = shopPromotionActivity.leftIcon;
            if (image2 != null) {
                c62562cu = image2.toThumbFirstImageUrlModel();
            } else {
                c62562cu = null;
            }
            W5F LIZLLL = C70759Rpr.LIZLLL(c62562cu);
            LIZLLL.LJJIIJ = (SmartImageView) view2.findViewById(R.id.ibw);
            C16880lQ.LLJJJ(LIZLLL);
        }
        View findViewById = view2.findViewById(R.id.ibx);
        if (findViewById != null) {
            if (item.LJI != null) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById.setVisibility(i);
        }
        if (item.LIZLLL.size() == 1) {
            View bottom_seller_discount = view2.findViewById(R.id.ar7);
            o.LJIIIIZZ(bottom_seller_discount, "bottom_seller_discount");
            bottom_seller_discount.setVisibility(8);
            View bottom_seller_discount_divider = view2.findViewById(R.id.ar8);
            o.LJIIIIZZ(bottom_seller_discount_divider, "bottom_seller_discount_divider");
            bottom_seller_discount_divider.setVisibility(8);
        } else if (item.LIZLLL.size() > 1 && C78685UuP.LJJJZ(item.LJFF)) {
            View bottom_seller_discount2 = view2.findViewById(R.id.ar7);
            o.LJIIIIZZ(bottom_seller_discount2, "bottom_seller_discount");
            bottom_seller_discount2.setVisibility(0);
            View bottom_seller_discount_divider2 = view2.findViewById(R.id.ar8);
            o.LJIIIIZZ(bottom_seller_discount_divider2, "bottom_seller_discount_divider");
            bottom_seller_discount_divider2.setVisibility(0);
            View bottom_seller_discount3 = view2.findViewById(R.id.ar7);
            o.LJIIIIZZ(bottom_seller_discount3, "bottom_seller_discount");
            OrderSubmitViewModel viewModel = L();
            o.LJIIIZ(viewModel, "viewModel");
            TextView total_seller_discount = (TextView) bottom_seller_discount3.findViewById(R.id.lio);
            o.LJIIIIZZ(total_seller_discount, "total_seller_discount");
            ShopBill shopBill = item.LJ;
            if (shopBill != null) {
                str = shopBill.getTotalDiscount();
            }
            OUP.LJJLIIIJILLIZJL(total_seller_discount, str);
            String str2 = item.LJFF;
            if (str2 == null || !C78685UuP.LJJJZ(str2)) {
                i2 = 8;
            }
            bottom_seller_discount3.setVisibility(i2);
            C16880lQ.LJIIJ(new Au2S10S0300000_4(viewModel, item, bottom_seller_discount3, 17), bottom_seller_discount3);
            C78946Uyc.LJJIIJZLJL(bottom_seller_discount3, new C70920RsS(), new AqS154S0100000_4(item, 324), new AqS135S0200000_4(item, viewModel, 61));
        }
        withState(L(), new AqS108S0300000_4(view2, item, this, 47));
        withState(L(), new AqS108S0300000_4(view2, item, this, 48));
        view2.findViewById(R.id.ghp).setVisibility(8);
        View message_layout = view2.findViewById(R.id.ghp);
        o.LJIIIIZZ(message_layout, "message_layout");
        C16880lQ.LJIIJ(new Au2S10S0300000_4(view2, this, item, 18), message_layout);
        C73156SnQ.LJIIIIZZ(this, L(), new TBT() { // from class: X.Afj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                return ((OrderSubmitState) obj2).getMessage();
            }
        }, new AqS167S0200000_4(item, view2, 33));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtfShopInfoVH(View view, Fragment fragment) {
        super(view);
        o.LJIIIZ(fragment, "fragment");
        this.LJLJJL = new LinkedHashMap();
        this.LJLIL = view;
        this.LJLILLLLZI = fragment;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLJI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 110));
        this.LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 323));
    }
}
