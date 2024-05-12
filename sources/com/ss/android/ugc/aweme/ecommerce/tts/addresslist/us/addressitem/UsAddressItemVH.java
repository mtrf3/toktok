package com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.addressitem;

import X.AnonymousClass636;
import X.C018905p;
import X.C16880lQ;
import X.C1FL;
import X.C221108m2;
import X.C26635Acp;
import X.C34K;
import X.C44878HjO;
import X.C47261Igj;
import X.C62822Ol8;
import X.C63044Ooi;
import X.C65352Pkq;
import X.C65776Prg;
import X.JBR;
import X.ORZ;
import X.OUP;
import X.X1D;
import Y.ARunnableS8S0400000_4;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S3S0400000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UsAddressItemVH extends ECJediViewHolder {
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
    public UsAddressItemVH(ViewGroup viewGroup) {
        super(C1FL.LIZIZ(viewGroup, R.layout.a8p, viewGroup, false, "from(parent.context)\n   …view_item, parent, false)"));
        this.LJLILLLLZI = C44878HjO.LIZIZ(viewGroup, "parent");
        C65776Prg LIZ = C65352Pkq.LIZ(AddressListViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 115));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        boolean z;
        Boolean bool;
        boolean booleanValue;
        int i;
        boolean z2;
        int i2;
        C018905p c018905p;
        C018905p c018905p2;
        List LLIILII;
        String LJFF;
        C26635Acp item = (C26635Acp) obj;
        o.LJIIIZ(item, "item");
        Drawable background = this.itemView.findViewById(R.id.c5j).getBackground();
        if (background != null) {
            background.setAlpha(255);
        }
        Address address = item.LIZ;
        if (address != null) {
            C34K c34k = new C34K();
            if (!item.LIZJ && L().LJLL != null) {
                z = false;
            } else {
                z = true;
            }
            c34k.element = z;
            Integer num = L().LJZ;
            if (num != null && num.intValue() == 4 && (bool = item.LJFF) != null && !(booleanValue = bool.booleanValue())) {
                c34k.element = booleanValue;
            }
            View findViewById = this.itemView.findViewById(R.id.c5j);
            o.LJIIIIZZ(findViewById, "itemView.default_label");
            if (address.LJ()) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById.setVisibility(i);
            ((TextView) this.itemView.findViewById(R.id.gvs)).setText(address.LIZLLL("name"));
            TextView textView = (TextView) this.itemView.findViewById(R.id.c8u);
            o.LJIIIIZZ(textView, "itemView.detail_adress");
            OUP.LJJLIIIJILLIZJL(textView, address.LIZ());
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.kdx);
            o.LJIIIIZZ(textView2, "itemView.state");
            List<Region> list = address.districts;
            C018905p c018905p3 = null;
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
            OUP.LJJLIIIJILLIZJL(textView4, item.LJ);
            View hint_text = _$_findCachedViewById(R.id.e5v);
            o.LJIIIIZZ(hint_text, "hint_text");
            if (hint_text.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                View findViewById2 = this.itemView.findViewById(R.id.e5q);
                o.LJIIIIZZ(findViewById2, "itemView.hint_icon");
                OUP.LJJLIIIJ(findViewById2);
            } else {
                View findViewById3 = this.itemView.findViewById(R.id.e5q);
                o.LJIIIIZZ(findViewById3, "itemView.hint_icon");
                OUP.LJIJJLI(findViewById3);
            }
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            if (c34k.element) {
                i2 = R.attr.go;
            } else {
                i2 = R.attr.gv;
            }
            int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(i2, context);
            ((TextView) this.itemView.findViewById(R.id.gvs)).setTextColor(LJIIIIZZ);
            ((TextView) this.itemView.findViewById(R.id.c8u)).setTextColor(LJIIIIZZ);
            ((TextView) this.itemView.findViewById(R.id.kdx)).setTextColor(LJIIIIZZ);
            ((TextView) this.itemView.findViewById(R.id.nkt)).setTextColor(LJIIIIZZ);
            ((TuxIconView) this.itemView.findViewById(R.id.co3)).setTintColor(LJIIIIZZ);
            if (L().Ov0()) {
                Integer num2 = L().LJZ;
                if (num2 == null || num2.intValue() != 4) {
                    ViewGroup.LayoutParams layoutParams = this.itemView.findViewById(R.id.gvs).getLayoutParams();
                    if (layoutParams instanceof C018905p) {
                        c018905p = (C018905p) layoutParams;
                    } else {
                        c018905p = null;
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.itemView.findViewById(R.id.c5j).getLayoutParams();
                    if (layoutParams2 instanceof C018905p) {
                        c018905p3 = (C018905p) layoutParams2;
                    }
                    ViewGroup.LayoutParams layoutParams3 = this.itemView.findViewById(R.id.co3).getLayoutParams();
                    if (layoutParams3 instanceof C018905p) {
                        c018905p2 = (C018905p) layoutParams3;
                    } else {
                        c018905p2 = null;
                    }
                    if (address.LJ()) {
                        if (c018905p3 != null) {
                            c018905p3.endToStart = -1;
                            c018905p3.endToStart = R.id.co3;
                            c018905p3.endToEnd = -1;
                        }
                        if (c018905p2 != null) {
                            c018905p2.startToEnd = -1;
                            c018905p2.startToEnd = R.id.c5j;
                        }
                    } else {
                        if (c018905p != null) {
                            c018905p.endToStart = -1;
                            c018905p.endToStart = R.id.co3;
                        }
                        if (c018905p2 != null) {
                            c018905p2.startToEnd = -1;
                            c018905p2.startToEnd = R.id.gvs;
                        }
                    }
                    if (c018905p != null) {
                        this.itemView.findViewById(R.id.gvs).setLayoutParams(c018905p);
                    }
                    if (c018905p3 != null) {
                        this.itemView.findViewById(R.id.c5j).setLayoutParams(c018905p3);
                    }
                    if (c018905p2 != null) {
                        this.itemView.findViewById(R.id.co3).setLayoutParams(c018905p2);
                    }
                    View findViewById4 = this.itemView.findViewById(R.id.co3);
                    o.LJIIIIZZ(findViewById4, "itemView.edit_btn");
                    OUP.LJJLIIIJ(findViewById4);
                } else {
                    View findViewById5 = this.itemView.findViewById(R.id.co3);
                    o.LJIIIIZZ(findViewById5, "itemView.edit_btn");
                    OUP.LJIJJLI(findViewById5);
                }
                View findViewById6 = this.itemView.findViewById(R.id.a7n);
                o.LJIIIIZZ(findViewById6, "itemView.arrow");
                OUP.LJIJJLI(findViewById6);
                View findViewById7 = this.itemView.findViewById(R.id.iln);
                o.LJIIIIZZ(findViewById7, "itemView.radio");
                OUP.LJJLIIIJ(findViewById7);
                ((C63044Ooi) this.itemView.findViewById(R.id.iln)).setChecked(item.LIZIZ);
            } else {
                View findViewById8 = this.itemView.findViewById(R.id.co3);
                o.LJIIIIZZ(findViewById8, "itemView.edit_btn");
                OUP.LJIJJLI(findViewById8);
                View findViewById9 = this.itemView.findViewById(R.id.a7n);
                o.LJIIIIZZ(findViewById9, "itemView.arrow");
                OUP.LJJLIIIJ(findViewById9);
                View findViewById10 = this.itemView.findViewById(R.id.iln);
                o.LJIIIIZZ(findViewById10, "itemView.radio");
                OUP.LJIJJLI(findViewById10);
            }
            View findViewById11 = this.itemView.findViewById(R.id.co3);
            o.LJIIIIZZ(findViewById11, "itemView.edit_btn");
            C16880lQ.LJIIJ(new Au2S3S0400000_4(address, this, item, c34k, 0), findViewById11);
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C16880lQ.LJIIJ(new Au2S3S0400000_4(address, this, item, c34k, 1), itemView);
            this.itemView.post(new ARunnableS8S0400000_4(this, address, c34k, item, 0));
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
