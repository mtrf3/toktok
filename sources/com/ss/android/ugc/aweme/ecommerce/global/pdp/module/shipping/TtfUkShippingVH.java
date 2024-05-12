package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.shipping;

import X.C16880lQ;
import X.C26338AVi;
import X.C27129Akn;
import X.C27138Akw;
import X.C27139Akx;
import X.C27140Aky;
import X.C27141Akz;
import X.C32151Nz;
import X.C47261Igj;
import X.InterfaceC26837Ag5;
import X.O6R;
import X.ORZ;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ShippingTextInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPAppendix;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingServiceModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShipFromInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingTOAddressInfo;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TtfUkShippingVH extends GlobalShippingVH {
    public Map<Integer, View> _$_findViewCache;

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.shipping.GlobalShippingVH, com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.shipping.GlobalShippingVH, com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.shipping.GlobalShippingVH, com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtfUkShippingVH(ViewGroup view, ECBaseFragment fragment) {
        super(view, fragment);
        o.LJIIIZ(view, "view");
        o.LJIIIZ(fragment, "fragment");
        this._$_findViewCache = new LinkedHashMap();
    }

    private final void handleNewDataTtfUkLayout(C27129Akn c27129Akn, LinearLayout linearLayout) {
        PDPShippingModule pDPShippingModule;
        ShippingTextInfo shippingTextInfo;
        int i;
        PDPShippingServiceModule pDPShippingServiceModule;
        List<LinkRichText> list;
        LinkRichText linkRichText;
        int i2;
        PDPLogisticModule pDPLogisticModule = c27129Akn.LJLJJI;
        if (pDPLogisticModule != null && (pDPShippingModule = pDPLogisticModule.pdpShippingModule) != null) {
            List<LinkRichText> list2 = pDPShippingModule.descriptionList;
            int i3 = 6;
            boolean z = true;
            int i4 = 0;
            AttributeSet attributeSet = null;
            if (list2 != null) {
                int i5 = 0;
                for (LinkRichText linkRichText2 : list2) {
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        RichTextUtil richTextUtil = RichTextUtil.LIZ;
                        Context context = linearLayout.getContext();
                        o.LJIIIIZZ(context, "customView.context");
                        SpannableStringBuilder LIZJ = RichTextUtil.LIZJ(richTextUtil, context, linkRichText2, null, 0, false, null, C27138Akw.LJLIL, 60);
                        if (LIZJ != null) {
                            setHasShippingText(z);
                            Context context2 = this.itemView.getContext();
                            o.LJIIIIZZ(context2, "itemView.context");
                            TuxTextView tuxTextView = new TuxTextView(context2, attributeSet, i3, i4);
                            tuxTextView.setTextColorRes(R.attr.go);
                            tuxTextView.setTuxFont(51);
                            tuxTextView.setText(LIZJ);
                            if (i5 == 0) {
                                i2 = 0;
                            } else {
                                i2 = 8;
                            }
                            C26338AVi.LJIIIZ(tuxTextView, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(i2))), null, null, 29);
                            linearLayout.addView(tuxTextView);
                        }
                        z = true;
                        i5 = i6;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            if (getHasShippingText() && (pDPShippingServiceModule = c27129Akn.LJLJJI.pdpShippingServiceModule) != null && (list = pDPShippingServiceModule.descriptionList) != null && (linkRichText = (LinkRichText) ORZ.LJLLLL(list)) != null) {
                RichTextUtil richTextUtil2 = RichTextUtil.LIZ;
                Context context3 = linearLayout.getContext();
                o.LJIIIIZZ(context3, "customView.context");
                SpannableStringBuilder LIZJ2 = RichTextUtil.LIZJ(richTextUtil2, context3, linkRichText, null, 0, false, null, null, 124);
                if (LIZJ2 != null) {
                    Context context4 = this.itemView.getContext();
                    o.LJIIIIZZ(context4, "itemView.context");
                    TuxTextView tuxTextView2 = new TuxTextView(context4, attributeSet, i3, i4);
                    tuxTextView2.setText(LIZJ2);
                    C26338AVi.LJIIIZ(tuxTextView2, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, null, 29);
                    linearLayout.addView(tuxTextView2);
                }
            }
            List<PDPAppendix> list3 = pDPShippingModule.appendixList;
            if (list3 != null) {
                int i7 = 0;
                for (PDPAppendix pDPAppendix : list3) {
                    int i8 = i7 + 1;
                    if (i7 >= 0) {
                        LinkRichText linkRichText3 = pDPAppendix.richText;
                        if (linkRichText3 != null) {
                            RichTextUtil richTextUtil3 = RichTextUtil.LIZ;
                            Context context5 = linearLayout.getContext();
                            o.LJIIIIZZ(context5, "customView.context");
                            SpannableStringBuilder LIZJ3 = RichTextUtil.LIZJ(richTextUtil3, context5, linkRichText3, null, 0, false, null, C27139Akx.LJLIL, 60);
                            if (LIZJ3 != null) {
                                Context context6 = this.itemView.getContext();
                                o.LJIIIIZZ(context6, "itemView.context");
                                TuxTextView tuxTextView3 = new TuxTextView(context6, attributeSet, i3, i4);
                                tuxTextView3.setText(LIZJ3);
                                tuxTextView3.setTuxFont(51);
                                if (getHasShippingText()) {
                                    i = 8;
                                } else {
                                    i = 0;
                                }
                                C26338AVi.LJIIIZ(tuxTextView3, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(i))), null, null, 29);
                                tuxTextView3.setTextColorRes(R.attr.gv);
                                linearLayout.addView(tuxTextView3);
                                setHasShippingText(true);
                            }
                        }
                        i7 = i8;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            PdpShipping pdpShipping = c27129Akn.LJLILLLLZI;
            if (pdpShipping != null && (shippingTextInfo = pdpShipping.shippingTimeNotice) != null) {
                View LLLZIIL = C16880lQ.LLLZIIL(R.layout.a0o, C16880lQ.LLZIL(this.itemView.getContext()), null);
                ((TextView) LLLZIIL.findViewById(R.id.h2m)).setText(shippingTextInfo.shippingDisplayText);
                View findViewById = LLLZIIL.findViewById(R.id.h2k);
                o.LJIIIIZZ(findViewById, "noticeView.no_shipping_time_icon");
                C16880lQ.LJIIJ(new Au2S14S0200000_4(this, shippingTextInfo, 15), findViewById);
                C26338AVi.LJIIIZ(LLLZIIL, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, null, 29);
                linearLayout.addView(LLLZIIL);
            }
        }
    }

    private final void handleOldDataTtfUkLayout(C27129Akn c27129Akn, LinearLayout linearLayout) {
        String str;
        int i;
        String str2;
        int i2;
        ShippingService shippingService;
        List<LogisticLinkRichText> list;
        LogisticLinkRichText logisticLinkRichText;
        int i3;
        PdpShipping pdpShipping = c27129Akn.LJLILLLLZI;
        if (pdpShipping != null) {
            List<LogisticDTO> list2 = pdpShipping.logistics;
            int i4 = 6;
            AttributeSet attributeSet = null;
            int i5 = 0;
            if (list2 != null) {
                int i6 = 0;
                for (LogisticDTO logisticDTO : list2) {
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        List<LogisticLinkRichText> list3 = logisticDTO.logisticRichTextList;
                        if (list3 != null) {
                            int i8 = 0;
                            for (LogisticLinkRichText logisticLinkRichText2 : list3) {
                                int i9 = i8 + 1;
                                if (i8 >= 0) {
                                    RichTextUtil richTextUtil = RichTextUtil.LIZ;
                                    C27140Aky c27140Aky = C27140Aky.LJLIL;
                                    richTextUtil.getClass();
                                    SpannableStringBuilder LIZ = RichTextUtil.LIZ(logisticLinkRichText2, linearLayout, c27140Aky);
                                    if (LIZ != null) {
                                        setHasShippingText(true);
                                        Context context = this.itemView.getContext();
                                        o.LJIIIIZZ(context, "itemView.context");
                                        TuxTextView tuxTextView = new TuxTextView(context, attributeSet, i4, i5);
                                        tuxTextView.setText(LIZ);
                                        tuxTextView.setLineSpacing(0.0f, 1.2f);
                                        if (i6 == 0 && i8 == 0) {
                                            i3 = 0;
                                        } else {
                                            i3 = 8;
                                        }
                                        C26338AVi.LJIIIZ(tuxTextView, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(i3))), null, null, 29);
                                        linearLayout.addView(tuxTextView);
                                    }
                                    i8 = i9;
                                } else {
                                    C47261Igj.LJJJJJ();
                                    throw null;
                                }
                            }
                        }
                        i6 = i7;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            if (getHasShippingText() && (shippingService = pdpShipping.shippingService) != null && (list = shippingService.shippingRightsList) != null && (logisticLinkRichText = (LogisticLinkRichText) ORZ.LJLLLLLL(0, list)) != null) {
                RichTextUtil richTextUtil2 = RichTextUtil.LIZ;
                C27141Akz c27141Akz = C27141Akz.LJLIL;
                richTextUtil2.getClass();
                SpannableStringBuilder LIZ2 = RichTextUtil.LIZ(logisticLinkRichText, linearLayout, c27141Akz);
                if (LIZ2 != null) {
                    Context context2 = this.itemView.getContext();
                    o.LJIIIIZZ(context2, "itemView.context");
                    TuxTextView tuxTextView2 = new TuxTextView(context2, attributeSet, i4, i5);
                    tuxTextView2.setText(LIZ2);
                    C26338AVi.LJIIIZ(tuxTextView2, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, null, 29);
                    linearLayout.addView(tuxTextView2);
                }
            }
            ShippingTOAddressInfo shippingTOAddressInfo = pdpShipping.shippingToAddressInfo;
            if (shippingTOAddressInfo != null && (str2 = shippingTOAddressInfo.shipToAddressBrief) != null) {
                Context context3 = this.itemView.getContext();
                o.LJIIIIZZ(context3, "itemView.context");
                TuxTextView tuxTextView3 = new TuxTextView(context3, attributeSet, i4, i5);
                tuxTextView3.setText(str2);
                tuxTextView3.setTuxFont(51);
                if (getHasShippingText()) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                C26338AVi.LJIIIZ(tuxTextView3, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(i2))), null, null, 29);
                tuxTextView3.setTextColorRes(R.attr.gx);
                linearLayout.addView(tuxTextView3);
            }
            ShippingTextInfo shippingTextInfo = pdpShipping.shippingTimeNotice;
            if (shippingTextInfo != null) {
                View LLLZIIL = C16880lQ.LLLZIIL(R.layout.a0o, C16880lQ.LLZIL(this.itemView.getContext()), null);
                ((TextView) LLLZIIL.findViewById(R.id.h2m)).setText(shippingTextInfo.shippingDisplayText);
                View findViewById = LLLZIIL.findViewById(R.id.h2k);
                o.LJIIIIZZ(findViewById, "noticeView.no_shipping_time_icon");
                C16880lQ.LJIIJ(new Au2S14S0200000_4(this, shippingTextInfo, 16), findViewById);
                C26338AVi.LJIIIZ(LLLZIIL, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, null, 29);
                linearLayout.addView(LLLZIIL);
            }
            ShipFromInfo shipFromInfo = pdpShipping.shipFromInfo;
            if (shipFromInfo != null && (str = shipFromInfo.fromOverseas) != null) {
                Context context4 = this.itemView.getContext();
                o.LJIIIIZZ(context4, "itemView.context");
                TuxTextView tuxTextView4 = new TuxTextView(context4, attributeSet, i4, i5);
                tuxTextView4.setText(str);
                tuxTextView4.setTuxFont(51);
                if (getHasShippingText()) {
                    i = 8;
                } else {
                    i = 0;
                }
                C26338AVi.LJIIIZ(tuxTextView4, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(i))), null, null, 29);
                tuxTextView4.setTextColorRes(R.attr.gv);
                linearLayout.addView(tuxTextView4);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.shipping.GlobalShippingVH
    public void bindCustomView(C27129Akn item, LinearLayout customView) {
        o.LJIIIZ(item, "item");
        o.LJIIIZ(customView, "customView");
        customView.removeAllViews();
        setHasShippingText(false);
        if (item.LJLJJI != null) {
            handleNewDataTtfUkLayout(item, customView);
        } else {
            handleOldDataTtfUkLayout(item, customView);
        }
        logModuleShow();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.shipping.GlobalShippingVH, com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH
    public /* bridge */ /* synthetic */ void bindCustomView(InterfaceC26837Ag5 interfaceC26837Ag5, View view) {
        bindCustomView((C27129Akn) interfaceC26837Ag5, (LinearLayout) view);
    }
}
