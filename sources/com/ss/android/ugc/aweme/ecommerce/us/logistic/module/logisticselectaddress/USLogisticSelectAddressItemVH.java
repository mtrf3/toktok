package com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectaddress;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C1FL;
import X.C221108m2;
import X.C44878HjO;
import X.C47261Igj;
import X.C62822Ol8;
import X.C63044Ooi;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73156SnQ;
import X.JBR;
import X.ORZ;
import X.OUP;
import X.TBT;
import X.X1D;
import Y.ARunnableS3S0310000_4;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S1S0310000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class USLogisticSelectAddressItemVH extends ECJediViewHolder {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USLogisticSelectAddressItemVH(ViewGroup viewGroup) {
        super(C1FL.LIZIZ(viewGroup, R.layout.a8p, viewGroup, false, "from(parent.context)\n   …view_item, parent, false)"));
        this.LJLILLLLZI = C44878HjO.LIZIZ(viewGroup, "parent");
        C65776Prg LIZ = C65352Pkq.LIZ(AddressSelectViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 126));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        boolean z;
        int i;
        int i2;
        List LLIILII;
        String LJFF;
        ReachableAddress item = (ReachableAddress) obj;
        o.LJIIIZ(item, "item");
        Drawable background = this.itemView.findViewById(R.id.c5j).getBackground();
        if (background != null) {
            background.setAlpha(255);
        }
        Address address = item.address;
        if (address != null) {
            Boolean bool = item.reachable;
            boolean z2 = false;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            this.itemView.setClickable(z);
            View findViewById = this.itemView.findViewById(R.id.a7n);
            o.LJIIIIZZ(findViewById, "itemView.arrow");
            OUP.LJIJJLI(findViewById);
            View findViewById2 = this.itemView.findViewById(R.id.co3);
            o.LJIIIIZZ(findViewById2, "itemView.edit_btn");
            OUP.LJIJJLI(findViewById2);
            View findViewById3 = this.itemView.findViewById(R.id.iln);
            o.LJIIIIZZ(findViewById3, "itemView.radio");
            OUP.LJJLIIIJ(findViewById3);
            ((C63044Ooi) this.itemView.findViewById(R.id.iln)).setChecked(item.isSelect);
            View findViewById4 = this.itemView.findViewById(R.id.c5j);
            o.LJIIIIZZ(findViewById4, "itemView.default_label");
            if (address.LJ()) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById4.setVisibility(i);
            ((TextView) this.itemView.findViewById(R.id.gvs)).setText(address.LIZLLL("name"));
            TextView textView = (TextView) this.itemView.findViewById(R.id.c8u);
            o.LJIIIIZZ(textView, "itemView.detail_adress");
            OUP.LJJLIIIJILLIZJL(textView, address.LIZ());
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.kdx);
            o.LJIIIIZZ(textView2, "itemView.state");
            List<Region> list = address.districts;
            String str = "";
            if (list != null && (LLIILII = ORZ.LLIILII(list)) != null) {
                int i3 = 0;
                for (Object obj2 : LLIILII) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        Region region = (Region) obj2;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(str);
                        if (i3 == address.districts.size() - 1) {
                            LJFF = region.code;
                            if (LJFF == null) {
                                LJFF = region.name;
                            }
                        } else {
                            StringBuilder LIZ2 = X1D.LIZ();
                            String str2 = region.code;
                            if (str2 == null) {
                                str2 = region.name;
                            }
                            LJFF = JBR.LJFF(LIZ2, str2, ", ", LIZ2);
                        }
                        LIZ.append(LJFF);
                        str = X1D.LIZIZ(LIZ);
                        i3 = i4;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            OUP.LJJLIIIJILLIZJL(textView2, str);
            TextView textView3 = (TextView) this.itemView.findViewById(R.id.nkt);
            o.LJIIIIZZ(textView3, "itemView.zipcode");
            OUP.LJJLIIIJILLIZJL(textView3, address.LIZLLL("zipcode"));
            TextView textView4 = (TextView) this.itemView.findViewById(R.id.e5v);
            o.LJIIIIZZ(textView4, "itemView.hint_text");
            OUP.LJJLIIIJILLIZJL(textView4, item.invalidHintMessage);
            View hint_text = _$_findCachedViewById(R.id.e5v);
            o.LJIIIIZZ(hint_text, "hint_text");
            if (hint_text.getVisibility() == 0) {
                z2 = true;
            }
            if (z2) {
                View findViewById5 = this.itemView.findViewById(R.id.e5q);
                o.LJIIIIZZ(findViewById5, "itemView.hint_icon");
                OUP.LJJLIIIJ(findViewById5);
            } else {
                View findViewById6 = this.itemView.findViewById(R.id.e5q);
                o.LJIIIIZZ(findViewById6, "itemView.hint_icon");
                OUP.LJIJJLI(findViewById6);
            }
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            if (z) {
                i2 = R.attr.go;
            } else {
                i2 = R.attr.gv;
            }
            int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(i2, context);
            ((TextView) this.itemView.findViewById(R.id.gvs)).setTextColor(LJIIIIZZ);
            ((TextView) this.itemView.findViewById(R.id.c8u)).setTextColor(LJIIIIZZ);
            ((TextView) this.itemView.findViewById(R.id.kdx)).setTextColor(LJIIIIZZ);
            ((TextView) this.itemView.findViewById(R.id.nkt)).setTextColor(LJIIIIZZ);
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C16880lQ.LJIIJ(new Au2S1S0310000_4(this, item, address, z, 5), itemView);
            C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.AeW
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj3) {
                    return ((AddressSelectState) obj3).getSelectedAddress();
                }
            }, new AqS186S0100000_4(address, 343));
            this.itemView.post(new ARunnableS3S0310000_4(address, item, this, z, 1));
        }
    }

    public final void L(LaneParams laneParams, boolean z, boolean z2, int i, boolean z3, boolean z4) {
        laneParams.plusAssign("module_name", "address");
        laneParams.plusAssign("is_default", String.valueOf(z2 ? 1 : 0));
        laneParams.plusAssign("is_valid", String.valueOf(z ? 1 : 0));
        laneParams.plusAssign("rank", Integer.valueOf(i));
        laneParams.plusAssign("is_address_deliverable", String.valueOf(z4 ? 1 : 0));
        laneParams.plusAssign("is_selected", String.valueOf(z3 ? 1 : 0));
    }
}
