package com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic;

import X.AbstractC26779Af9;
import X.C1FL;
import X.C221108m2;
import X.C26744Aea;
import X.C26937Ahh;
import X.C38350F3i;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LogisticAdapter extends AbstractC26779Af9<Object> {
    public final Fragment LJLJJLL;
    public boolean LJLJL;

    /* loaded from: classes5.dex */
    public final class LogisticViewHolder extends ECJediViewHolder {
        public final C62822Ol8 LJLIL;
        public final Map<Integer, View> LJLILLLLZI;
        public final /* synthetic */ LogisticAdapter LJLJI;

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

        public final DeliveryPanelViewModel getViewModel() {
            return (DeliveryPanelViewModel) this.LJLIL.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void onCreate() {
            super.onCreate();
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0193  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0281  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x02b2  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x02bf  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x02e0  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x02e3  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x02e7  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x02ea  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x02ed  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02f3  */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onBind(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 787
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticAdapter.LogisticViewHolder.onBind(java.lang.Object):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LogisticViewHolder(LogisticAdapter logisticAdapter, ViewGroup parent) {
            super(C1FL.LIZIZ(parent, R.layout.yi, parent, false, "from(parent.context).inf…stic_item, parent, false)"));
            o.LJIIIZ(parent, "parent");
            this.LJLJI = logisticAdapter;
            this.LJLILLLLZI = new LinkedHashMap();
            C65776Prg LIZ = C65352Pkq.LIZ(DeliveryPanelViewModel.class);
            this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 17));
        }

        public static void M(TuxTextView tuxTextView, String str) {
            int i = 0;
            if (str == null || str.length() == 0) {
                i = 8;
            }
            tuxTextView.setVisibility(i);
            tuxTextView.setText(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void L(LogisticViewHolder logisticViewHolder, String str, DeliveryPanelState deliveryPanelState, String str2, Integer num, int i) {
            Float f;
            String str3;
            String priceVal;
            String str4;
            String str5 = str2;
            Integer num2 = num;
            String str6 = null;
            if ((i & 4) != 0) {
                str5 = null;
            }
            if ((i & 8) != 0) {
                num2 = null;
            }
            logisticViewHolder.getClass();
            List<Object> logisticList = deliveryPanelState.getLogisticList();
            int i2 = -1;
            if (logisticList != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : logisticList) {
                    if (obj instanceof LogisticDTO) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (o.LJ(((LogisticDTO) it.next()).logisticsServiceId, ((LogisticDTO) logisticViewHolder.getItem()).logisticsServiceId)) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
            } else {
                i2 = -1;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (num2 != null) {
                num2.intValue();
                linkedHashMap.put("is_default", num2);
            }
            LogisticTextDTO logisticTextDTO = ((LogisticDTO) logisticViewHolder.getItem()).logisticText;
            if (logisticTextDTO != null && (str4 = logisticTextDTO.serviceText) != null && !ujb.o.LJJJJJL(str4)) {
                linkedHashMap.put("track_status", str4);
            }
            Map<String, String> map = ((LogisticDTO) logisticViewHolder.getItem()).eventTrackInfo;
            if (map != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (o.LJ(entry.getKey(), "promotion_tag") || o.LJ(entry.getKey(), "spend_more_amount") || o.LJ(entry.getKey(), "spend_more_currency")) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap.putAll(linkedHashMap2);
            }
            String str7 = ((LogisticDTO) logisticViewHolder.getItem()).deliveryName;
            Map<String, String> map2 = ((LogisticDTO) logisticViewHolder.getItem()).eventTrackInfo;
            if (map2 != null) {
                str7 = map2.get("shipping_type");
            }
            if (str5 != null) {
                linkedHashMap.put("entrance_zone", str5);
            }
            String str8 = str7;
            Price price = ((LogisticDTO) logisticViewHolder.getItem()).shippingFee;
            if (price != null && (priceVal = price.getPriceVal()) != null) {
                f = C38350F3i.LJJIJLIJ(priceVal);
            } else {
                f = null;
            }
            Price price2 = ((LogisticDTO) logisticViewHolder.getItem()).shippingFee;
            if (price2 != null) {
                str3 = price2.getCurrency();
            } else {
                str3 = null;
            }
            LogisticTextDTO logisticTextDTO2 = ((LogisticDTO) logisticViewHolder.getItem()).logisticText;
            if (logisticTextDTO2 != null) {
                str6 = logisticTextDTO2.thresholdTextEn;
            }
            C26937Ahh.LJFF(str, str8, i2, f, str3, str6, linkedHashMap, "shipping", null, null);
        }
    }

    @Override // X.AbstractC26779Af9
    public final IComponentStrategyService LLD() {
        return new DefaultLogisticStrategyService();
    }

    @Override // X.AbstractC73237Soj, X.C4II
    public final int getBasicItemViewType(int i) {
        return this.LJLJJL.LIZIZ(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogisticAdapter(LogisticSelectFragment fragment, Integer num) {
        super(fragment, null, "logistics", num, null, C26744Aea.LIZ().template, 82);
        o.LJIIIZ(fragment, "fragment");
        this.LJLJJLL = fragment;
    }
}
