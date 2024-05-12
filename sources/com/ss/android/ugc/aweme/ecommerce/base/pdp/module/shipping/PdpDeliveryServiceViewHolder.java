package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping;

import X.C03090Af;
import X.C16880lQ;
import X.C221108m2;
import X.C26508Aam;
import X.C26786AfG;
import X.C47261Igj;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.ORZ;
import X.X1D;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingServiceModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PdpDeliveryServiceViewHolder extends PdpHolder {
    public final Fragment LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final Map<Integer, View> LJLJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        ShippingService shippingService;
        List<LinkRichText> list;
        LinkRichText linkRichText;
        C26786AfG item = (C26786AfG) obj;
        o.LJIIIZ(item, "item");
        String str = null;
        if (item.LJLJI != null) {
            TextView textView = (TextView) this.itemView.findViewById(R.id.title);
            PDPShippingServiceModule pDPShippingServiceModule = item.LJLJI;
            if (pDPShippingServiceModule != null) {
                str = pDPShippingServiceModule.title;
            }
            textView.setText(str);
            PDPShippingServiceModule pDPShippingServiceModule2 = item.LJLJI;
            if (pDPShippingServiceModule2 != null && (list = pDPShippingServiceModule2.descriptionList) != null && (linkRichText = (LinkRichText) ORZ.LJLLLL(list)) != null) {
                TextView textView2 = (TextView) this.itemView.findViewById(R.id.dpp);
                RichTextUtil richTextUtil = RichTextUtil.LIZ;
                Context context = this.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                textView2.setText(RichTextUtil.LIZJ(richTextUtil, context, linkRichText, null, 0, false, null, new AqS135S0200000_4(this, item, 181), 60));
            }
        } else {
            PdpShipping pdpShipping = item.LJLILLLLZI;
            if (pdpShipping != null && (shippingService = pdpShipping.shippingService) != null) {
                List<String> list2 = shippingService.serviceNames;
                String str2 = "";
                if (list2 != null) {
                    int i = 0;
                    String str3 = "";
                    for (String str4 : list2) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            String str5 = str4;
                            if (!ujb.o.LJJJJJL(str5)) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append(str3);
                                if (i != 0 && !o.LJ(str3, "")) {
                                    str5 = i0.LJFF(" · ", str5);
                                }
                                LIZ.append(str5);
                                str3 = X1D.LIZIZ(LIZ);
                            }
                            i = i2;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                    str2 = str3;
                }
                ((TextView) _$_findCachedViewById(R.id.dpp)).setText(str2);
            }
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S14S0200000_4(this, item, 28), itemView);
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C26508Aam.LIZ(itemView2, item.LJLIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpDeliveryServiceViewHolder(View view, ECBaseFragment eCBaseFragment) {
        super(view, R.layout.a2a);
        this.LJLJI = C03090Af.LIZLLL(view, "view", eCBaseFragment, "fragment");
        this.LJLIL = eCBaseFragment;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 173));
    }
}
