package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.adapter;

import X.AbstractC03160Am;
import X.AbstractC73230Soc;
import X.C16880lQ;
import X.C1FL;
import X.C221108m2;
import X.C26508Aam;
import X.C44878HjO;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73156SnQ;
import X.C73242Soo;
import X.C78897Uxp;
import X.TBT;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.RegionPicker;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerState;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS67S0000000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RegionAdapter extends AbstractC73230Soc<Object> {
    public final LifecycleOwner LJLJJI;

    /* loaded from: classes5.dex */
    public final class DistrictViewHolder extends ECJediViewHolder {
        public final C62822Ol8 LJLIL;
        public final Map<Integer, View> LJLILLLLZI;
        public final /* synthetic */ RegionAdapter LJLJI;

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

        public final DistrictPickerViewModel L() {
            return (DistrictPickerViewModel) this.LJLIL.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            super.onCreate();
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78897Uxp.LJJJJJL(itemView, 0.0f);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final void onBind(Object obj) {
            int i;
            District item = (District) obj;
            o.LJIIIZ(item, "item");
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            boolean z = true;
            int i2 = 0;
            if (this.latestItemPositionInternal == this.LJLJI.getItemCount() - 1) {
                z = false;
            }
            C26508Aam.LIZ(itemView, z);
            withState(L(), new AqS135S0200000_4(this, item, 53));
            View findViewById = this.itemView.findViewById(R.id.iln);
            if (L().Jv0()) {
                i = 8;
            } else {
                i = 0;
            }
            findViewById.setVisibility(i);
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.dlv);
            if (!L().Jv0()) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            ((TextView) this.itemView.findViewById(R.id.ff3)).setText(item.name);
            View itemView2 = this.itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            C16880lQ.LJIIJ(new Au2S14S0200000_4(this, item, 37), itemView2);
            C73156SnQ.LJIIIIZZ(this, L(), new TBT() { // from class: X.AaV
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj2) {
                    return ((DistrictPickerState) obj2).getSelectedDistrict();
                }
            }, new AqS186S0100000_4(item, 93));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DistrictViewHolder(RegionAdapter regionAdapter, ViewGroup parent) {
            super(C1FL.LIZIZ(parent, R.layout.yp, parent, false, "from(parent.context).inf…rict_item, parent, false)"));
            o.LJIIIZ(parent, "parent");
            this.LJLJI = regionAdapter;
            this.LJLILLLLZI = new LinkedHashMap();
            C65776Prg LIZ = C65352Pkq.LIZ(DistrictPickerViewModel.class);
            this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 82));
        }
    }

    /* loaded from: classes5.dex */
    public final class IndicatorViewHolder extends ECJediViewHolder {
        public final Map<Integer, View> LJLIL;

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

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            super.onCreate();
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C26508Aam.LIZ(itemView, false);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IndicatorViewHolder(ViewGroup viewGroup) {
            super(C1FL.LIZIZ(viewGroup, R.layout.yo, viewGroup, false, "from(parent.context).inf…ator_item, parent, false)"));
            this.LJLIL = C44878HjO.LIZIZ(viewGroup, "parent");
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final void onBind(Object obj) {
            String item = (String) obj;
            o.LJIIIZ(item, "item");
            View view = this.itemView;
            o.LJII(view, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) view).setText(item);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegionAdapter(RegionPicker parent) {
        super(parent, (AbstractC03160Am) null, 6);
        o.LJIIIZ(parent, "parent");
        this.LJLJJI = parent;
    }

    @Override // X.AbstractC73237Soj
    public final void LJZ(C73242Soo c73242Soo) {
        c73242Soo.LJFF(new AqS170S0100000_4(this, 1132), new AqS67S0000000_4(this, 0), null);
        c73242Soo.LJFF(new AqS170S0100000_4(this, 1133), new AqS170S0100000_4(this, 1134), null);
    }

    @Override // X.AbstractC73237Soj, X.C4II
    public final int getBasicItemViewType(int i) {
        return this.LJLILLLLZI.LIZIZ(i);
    }
}
