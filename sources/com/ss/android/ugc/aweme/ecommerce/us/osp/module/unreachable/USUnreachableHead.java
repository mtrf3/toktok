package com.ss.android.ugc.aweme.ecommerce.us.osp.module.unreachable;

import X.C16880lQ;
import X.C221108m2;
import X.C26571Abn;
import X.C27949Ay1;
import X.C43001GuD;
import X.C45804HyK;
import X.C62562cu;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70759Rpr;
import X.OUP;
import X.W5F;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class USUnreachableHead extends ECJediViewHolder {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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

    public USUnreachableHead(View view) {
        super(view);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        C62562cu thumbFirstImageUrlModel;
        C26571Abn item = (C26571Abn) obj;
        o.LJIIIZ(item, "item");
        if (item.LIZ) {
            Resources resources = this.itemView.getContext().getResources();
            TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.title);
            o.LJIIIIZZ(tuxTextView, "itemView.title");
            String str = item.LJI;
            String string = resources.getString(R.string.f8x);
            o.LJIIIIZZ(string, "resources.getString(R.st…t_ineligible_items_title)");
            OUP.LJJJJZI(tuxTextView, str, string);
            View findViewById = this.itemView.findViewById(R.id.title);
            o.LJIIIIZZ(findViewById, "itemView.title");
            OUP.LJJLIIIJ(findViewById);
        } else {
            C45804HyK.LJJIJIIJIL(this.itemView.findViewById(R.id.title));
        }
        if (item.LIZLLL) {
            View findViewById2 = this.itemView.findViewById(R.id.jy6);
            o.LJIIIIZZ(findViewById2, "itemView.shop_layout");
            OUP.LJJLIIIJ(findViewById2);
            Image image = item.LJ;
            if (image != null && (thumbFirstImageUrlModel = image.toThumbFirstImageUrlModel()) != null) {
                W5F LIZLLL = C70759Rpr.LIZLLL(thumbFirstImageUrlModel);
                LIZLLL.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.jy4);
                C16880lQ.LLJJJ(LIZLLL);
                ((ImageView) _$_findCachedViewById(R.id.jy4)).setColorFilter(134217728);
            }
            TextView textView = (TextView) this.itemView.findViewById(R.id.jy8);
            o.LJIIIIZZ(textView, "itemView.shop_name");
            OUP.LJJLIIIJILLIZJL(textView, item.LJFF);
        } else {
            C45804HyK.LJJIJIIJIL(this.itemView.findViewById(R.id.jy6));
        }
        if (item.LJIIIIZZ) {
            View findViewById3 = this.itemView.findViewById(R.id.cd4);
            o.LJIIIIZZ(findViewById3, "itemView.divide_line");
            OUP.LJJLIIIJ(findViewById3);
        } else {
            C45804HyK.LJJIJIIJIL(this.itemView.findViewById(R.id.cd4));
        }
        if (!item.LJII) {
            this.itemView.findViewById(R.id.desc).setVisibility(8);
        } else {
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.desc);
            o.LJIIIIZZ(textView2, "itemView.desc");
            OUP.LJJLIIIJILLIZJL(textView2, item.LIZIZ);
        }
        if (!C43001GuD.LJLJJI) {
            C43001GuD.LJLJJI = true;
            C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
            C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 175));
            C27949Ay1 c27949Ay1 = C27949Ay1.LIZ;
            HashMap<String, Object> fw0 = ((OrderSubmitViewModel) LIZIZ.getValue()).fw0(false);
            fw0.put("item_num", Integer.valueOf(item.LIZJ));
            C27949Ay1.LJJIFFI(c27949Ay1, "expired_items", fw0, null, null, null, null, null, 2044);
        }
    }
}
