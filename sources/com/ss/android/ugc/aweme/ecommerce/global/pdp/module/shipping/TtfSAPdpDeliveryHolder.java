package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.shipping;

import X.C03090Af;
import X.C16880lQ;
import X.C1GE;
import X.C26338AVi;
import X.C26508Aam;
import X.C27124Aki;
import X.C27127Akl;
import X.C27142Al0;
import X.C32151Nz;
import X.C47261Igj;
import X.C76800UCe;
import X.O6R;
import X.ORS;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.PdpDeliveryHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingTOAddressInfo;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TtfSAPdpDeliveryHolder extends PdpDeliveryHolder {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final Map<Integer, View> LJLJJL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.PdpDeliveryHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.PdpDeliveryHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.PdpDeliveryHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.PdpDeliveryHolder
    /* renamed from: N */
    public final void onBind(C27127Akl item) {
        String str;
        List<LogisticLinkRichText> list;
        ShippingTOAddressInfo shippingTOAddressInfo;
        String str2;
        ShippingTOAddressInfo shippingTOAddressInfo2;
        List<LinkRichText> list2;
        PDPShippingModule pDPShippingModule;
        o.LJIIIZ(item, "item");
        PDPLogisticModule pDPLogisticModule = item.LJLJJI;
        int i = 8;
        if (pDPLogisticModule != null) {
            PDPShippingModule pDPShippingModule2 = pDPLogisticModule.pdpShippingModule;
            if (pDPShippingModule2 == null || (str2 = pDPShippingModule2.title) == null) {
                PdpShipping pdpShipping = item.LJLJI;
                if (pdpShipping != null && (shippingTOAddressInfo2 = pdpShipping.shippingToAddressInfo) != null) {
                    str2 = shippingTOAddressInfo2.shipToButtonText;
                } else {
                    str2 = null;
                }
            }
            TextView textView = (TextView) this.itemView.findViewById(R.id.lmo);
            if (textView != null) {
                textView.setText(str2);
            }
            PDPLogisticModule pDPLogisticModule2 = item.LJLJJI;
            if (pDPLogisticModule2 != null && (pDPShippingModule = pDPLogisticModule2.pdpShippingModule) != null) {
                list2 = pDPShippingModule.descriptionList;
            } else {
                list2 = null;
            }
            View findViewById = this.itemView.findViewById(R.id.lmn);
            o.LJIIIIZZ(findViewById, "itemView.ttf_pdp_ship_subtitle_list");
            if (C1GE.LJIILIIL(list2)) {
                i = 0;
            }
            findViewById.setVisibility(i);
            ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.lmn);
            o.LJIIIIZZ(viewGroup, "itemView.ttf_pdp_ship_subtitle_list");
            LinkedList<TuxTextView> linkedList = this.LJLJI;
            while (viewGroup.getChildCount() > 0) {
                C16880lQ.LLIFFJFJJ(0, viewGroup);
                C76800UCe c76800UCe = C76800UCe.LIZ;
                if (c76800UCe instanceof TuxTextView) {
                    linkedList.add(c76800UCe);
                }
            }
            if (list2 != null && !list2.isEmpty()) {
                int i2 = 0;
                for (LinkRichText linkRichText : list2) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        RichTextUtil richTextUtil = RichTextUtil.LIZ;
                        Context context = this.itemView.getContext();
                        o.LJIIIIZZ(context, "itemView.context");
                        SpannableStringBuilder LIZJ = RichTextUtil.LIZJ(richTextUtil, context, linkRichText, null, 0, false, null, null, 124);
                        if (LIZJ != null) {
                            TextView textView2 = (TextView) ORS.LJJLJLI(this.LJLJI);
                            if (textView2 == null) {
                                Context context2 = this.itemView.getContext();
                                o.LJIIIIZZ(context2, "itemView.context");
                                textView2 = new TuxTextView(context2, null, 6, 0);
                            }
                            ViewGroup viewGroup2 = (ViewGroup) this.itemView.findViewById(R.id.lmn);
                            textView2.setText(LIZJ);
                            if (i2 != list2.size() - 1) {
                                C26338AVi.LJIIIZ(textView2, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), 23);
                            }
                            viewGroup2.addView(textView2);
                        }
                        i2 = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        } else {
            PdpShipping pdpShipping2 = item.LJLJI;
            if (pdpShipping2 != null && (shippingTOAddressInfo = pdpShipping2.shippingToAddressInfo) != null) {
                str = shippingTOAddressInfo.shipToButtonText;
            } else {
                str = null;
            }
            ((TextView) this.itemView.findViewById(R.id.lmo)).setText(this.itemView.getContext().getString(R.string.fgj, str));
            C27124Aki c27124Aki = item.LJLIL;
            if (c27124Aki != null) {
                list = c27124Aki.LJIJJLI;
            } else {
                list = null;
            }
            View findViewById2 = this.itemView.findViewById(R.id.lmn);
            o.LJIIIIZZ(findViewById2, "itemView.ttf_pdp_ship_subtitle_list");
            if (C1GE.LJIILIIL(list)) {
                i = 0;
            }
            findViewById2.setVisibility(i);
            ViewGroup viewGroup3 = (ViewGroup) this.itemView.findViewById(R.id.lmn);
            o.LJIIIIZZ(viewGroup3, "itemView.ttf_pdp_ship_subtitle_list");
            LinkedList<TuxTextView> linkedList2 = this.LJLJI;
            while (viewGroup3.getChildCount() > 0) {
                C16880lQ.LLIFFJFJJ(0, viewGroup3);
                C76800UCe c76800UCe2 = C76800UCe.LIZ;
                if (c76800UCe2 instanceof TuxTextView) {
                    linkedList2.add(c76800UCe2);
                }
            }
            if (list != null && !list.isEmpty()) {
                int i4 = 0;
                for (LogisticLinkRichText logisticLinkRichText : list) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        RichTextUtil richTextUtil2 = RichTextUtil.LIZ;
                        View view = this.itemView;
                        C27142Al0 c27142Al0 = C27142Al0.LJLIL;
                        richTextUtil2.getClass();
                        SpannableStringBuilder LIZ = RichTextUtil.LIZ(logisticLinkRichText, view, c27142Al0);
                        if (LIZ != null) {
                            TextView textView3 = (TextView) ORS.LJJLJLI(this.LJLJI);
                            if (textView3 == null) {
                                Context context3 = this.itemView.getContext();
                                o.LJIIIIZZ(context3, "itemView.context");
                                textView3 = new TuxTextView(context3, null, 6, 0);
                            }
                            ViewGroup viewGroup4 = (ViewGroup) this.itemView.findViewById(R.id.lmn);
                            textView3.setText(LIZ);
                            if (i4 != list.size() - 1) {
                                C26338AVi.LJIIIZ(textView3, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), 23);
                            }
                            viewGroup4.addView(textView3);
                        }
                        i4 = i5;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 73, 42), itemView);
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C26508Aam.LIZ(itemView2, item.LJLILLLLZI);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.PdpDeliveryHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void onBind(Object obj) {
        onBind((C27127Akl) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtfSAPdpDeliveryHolder(View view, ECBaseFragment eCBaseFragment) {
        super(R.layout.a8i, view, eCBaseFragment);
        this.LJLJJL = C03090Af.LIZLLL(view, "view", eCBaseFragment, "fragment");
    }
}
