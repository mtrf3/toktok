package com.ss.android.ugc.aweme.ecommerce.global.address.list.module.addressitem;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C1FL;
import X.C221108m2;
import X.C26508Aam;
import X.C26633Acn;
import X.C26634Aco;
import X.C44878HjO;
import X.C47261Igj;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.ORZ;
import X.OUP;
import Y.ARunnableS3S0310000_4;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S1S0310000_4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GlobalAddressItemViewHolder extends ECJediViewHolder {
    public final C62822Ol8 LJLIL;
    public final Map<Integer, View> LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    public final AddressListViewModel L() {
        return (AddressListViewModel) this.LJLIL.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalAddressItemViewHolder(ViewGroup viewGroup) {
        super(C1FL.LIZIZ(viewGroup, R.layout.z3, viewGroup, false, "from(parent.context).inf…view_item, parent, false)"));
        this.LJLILLLLZI = C44878HjO.LIZIZ(viewGroup, "parent");
        C65776Prg LIZ = C65352Pkq.LIZ(AddressListViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 86));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        String str;
        int i3;
        String str2;
        C26634Aco item = (C26634Aco) obj;
        o.LJIIIZ(item, "item");
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        if (this.latestItemPositionInternal != ((ArrayList) L().LJLLI).size()) {
            z = true;
        } else {
            z = false;
        }
        C26508Aam.LIZ(itemView, z);
        Drawable background = this.itemView.findViewById(R.id.c5j).getBackground();
        if (background != null) {
            background.setAlpha(10);
        }
        Address address = item.LIZ;
        if (address != null) {
            if (!item.LIZJ && L().LJLL != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            View findViewById = this.itemView.findViewById(R.id.c5j);
            o.LJIIIIZZ(findViewById, "itemView.default_label");
            int i4 = 8;
            if (address.LJ()) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById.setVisibility(i);
            View findViewById2 = this.itemView.findViewById(R.id.jqh);
            o.LJIIIIZZ(findViewById2, "itemView.set_as_default");
            if (!address.LJ() && z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            findViewById2.setVisibility(i2);
            View findViewById3 = this.itemView.findViewById(R.id.jln);
            o.LJIIIIZZ(findViewById3, "itemView.select_label");
            if (item.LIZIZ) {
                i4 = 0;
            }
            findViewById3.setVisibility(i4);
            TextView textView = (TextView) this.itemView.findViewById(R.id.gvs);
            o.LJIIIIZZ(textView, "itemView.name");
            OUP.LJJLIIIJILLIZJL(textView, address.LIZLLL("name"));
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.l27);
            o.LJIIIIZZ(textView2, "itemView.telephone");
            OUP.LJJLIIIJILLIZJL(textView2, address.LIZLLL("phone"));
            TextView textView3 = (TextView) this.itemView.findViewById(R.id.ct5);
            o.LJIIIIZZ(textView3, "itemView.email");
            OUP.LJJLIIIJILLIZJL(textView3, address.LIZLLL("email"));
            TextView textView4 = (TextView) this.itemView.findViewById(R.id.c8u);
            o.LJIIIIZZ(textView4, "itemView.detail_adress");
            OUP.LJJLIIIJILLIZJL(textView4, address.LIZ());
            TextView textView5 = (TextView) this.itemView.findViewById(R.id.kdx);
            o.LJIIIIZZ(textView5, "itemView.state");
            List<Region> list = address.districts;
            String str3 = null;
            if (list != null) {
                String[] strArr = new String[1];
                Region region = address.region;
                if (region != null) {
                    str2 = region.name;
                } else {
                    str2 = null;
                }
                strArr[0] = str2;
                List LJJIJIL = C47261Igj.LJJIJIL(strArr);
                for (Region region2 : list) {
                    String str4 = region2.code;
                    if (str4 == null) {
                        str4 = region2.name;
                    }
                    LJJIJIL.add(str4);
                }
                List LLIILII = ORZ.LLIILII(LJJIJIL);
                if (LLIILII != null) {
                    str3 = ORZ.LLD(LLIILII, null, null, null, null, 63);
                }
            }
            OUP.LJJLIIIJILLIZJL(textView5, str3);
            TextView textView6 = (TextView) this.itemView.findViewById(R.id.nkt);
            o.LJIIIIZZ(textView6, "itemView.zipcode");
            OUP.LJJLIIIJILLIZJL(textView6, address.LIZLLL("zipcode"));
            TextView textView7 = (TextView) this.itemView.findViewById(R.id.e5v);
            o.LJIIIIZZ(textView7, "itemView.hint_text");
            OUP.LJJLIIIJILLIZJL(textView7, item.LJ);
            if (item.LIZLLL) {
                str = "";
            } else {
                str = item.LJ;
            }
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            if (z2) {
                i3 = R.attr.go;
            } else {
                i3 = R.attr.gv;
            }
            int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(i3, context);
            ((TextView) this.itemView.findViewById(R.id.gvs)).setTextColor(LJIIIIZZ);
            ((TextView) this.itemView.findViewById(R.id.l27)).setTextColor(LJIIIIZZ);
            ((TextView) this.itemView.findViewById(R.id.ct5)).setTextColor(LJIIIIZZ);
            ((TextView) this.itemView.findViewById(R.id.c8u)).setTextColor(LJIIIIZZ);
            ((TextView) this.itemView.findViewById(R.id.kdx)).setTextColor(LJIIIIZZ);
            ((TextView) this.itemView.findViewById(R.id.nkt)).setTextColor(LJIIIIZZ);
            View findViewById4 = this.itemView.findViewById(R.id.ivi);
            o.LJIIIIZZ(findViewById4, "itemView.remove_btn");
            C16880lQ.LJIIJ(new Au2S1S0310000_4(address, item, this, z2, 0), findViewById4);
            View findViewById5 = this.itemView.findViewById(R.id.co3);
            o.LJIIIIZZ(findViewById5, "itemView.edit_btn");
            C16880lQ.LJIIJ(new Au2S1S0310000_4(address, item, this, z2, 1), findViewById5);
            View findViewById6 = this.itemView.findViewById(R.id.jqh);
            o.LJIIIIZZ(findViewById6, "itemView.set_as_default");
            C16880lQ.LJIIJ(new Au2S1S0310000_4(address, item, this, z2, 2), findViewById6);
            View itemView2 = this.itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            C16880lQ.LJIIJ(new C26633Acn(this, z2, str, address, item), itemView2);
            this.itemView.post(new ARunnableS3S0310000_4(address, item, this, z2, 0));
        }
    }

    public final void M(LaneParams laneParams, boolean z, boolean z2, int i, boolean z3, boolean z4) {
        laneParams.plusAssign("module_name", "address");
        laneParams.plusAssign("is_default", Integer.valueOf(z2 ? 1 : 0));
        laneParams.plusAssign("is_valid", Integer.valueOf(z ? 1 : 0));
        laneParams.plusAssign("rank", Integer.valueOf(i));
        laneParams.plusAssign("is_address_deliverable", Integer.valueOf(z4 ? 1 : 0));
        laneParams.plusAssign("is_selected", Integer.valueOf(z3 ? 1 : 0));
    }
}
