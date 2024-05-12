package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.shipping;

import X.C113554cx;
import X.C16880lQ;
import X.C26338AVi;
import X.C26706Ady;
import X.C27127Akl;
import X.C27129Akn;
import X.C27135Akt;
import X.C27136Aku;
import X.C27137Akv;
import X.C32151Nz;
import X.C47261Igj;
import X.C70414RkI;
import X.C79234V7u;
import X.FT5;
import X.O6R;
import X.ORZ;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticAddressInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingServiceModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShipFromInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingTOAddressInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public class GlobalShippingVH extends GlobalPdpSelectVH implements c {
    public Map<Integer, View> _$_findViewCache;
    public boolean hasShippingText;

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH
    public int getStartIconRes(C27129Akn item) {
        o.LJIIIZ(item, "item");
        return R.raw.icon_truck_moving_ltr;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH
    public boolean needDivider() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logModuleShow() {
        C70414RkI c70414RkI = getVm().LLFII;
        if (c70414RkI != null) {
            C70414RkI.LJJJJI(c70414RkI, "logistics", getVm().LJLJL, false, new C27127Akl(((C27129Akn) getItem()).LJLIL, ((C27129Akn) getItem()).LJLILLLLZI, 8), null, 48);
        }
    }

    public final boolean getHasShippingText() {
        return this.hasShippingText;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH
    public LinearLayout onCreateMiddleCustomView(C27129Akn item) {
        o.LJIIIZ(item, "item");
        LinearLayout linearLayout = new LinearLayout(this.itemView.getContext());
        if (linearLayout.getLayoutParams() != null) {
            linearLayout.getLayoutParams().height = -2;
            linearLayout.getLayoutParams().width = -1;
        } else {
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    public final void setHasShippingText(boolean z) {
        this.hasShippingText = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalShippingVH(ViewGroup view, ECBaseFragment fragment) {
        super(view, fragment);
        o.LJIIIZ(view, "view");
        o.LJIIIZ(fragment, "fragment");
        this._$_findViewCache = new LinkedHashMap();
    }

    private final void handleNewDataLayout(C27129Akn c27129Akn, LinearLayout linearLayout) {
        String str;
        float LJIIZILJ;
        PDPShippingServiceModule pDPShippingServiceModule;
        List<LinkRichText> list;
        LinkRichText linkRichText;
        float LJIIZILJ2;
        PDPShippingModule pDPShippingModule;
        int i;
        float LJIIZILJ3;
        float LJIIZILJ4;
        float LJIIZILJ5;
        int i2 = 0;
        this.hasShippingText = false;
        PDPLogisticModule pDPLogisticModule = c27129Akn.LJLJJI;
        boolean z = true;
        int i3 = 6;
        AttributeSet attributeSet = null;
        if (pDPLogisticModule != null && (pDPShippingModule = pDPLogisticModule.pdpShippingModule) != null) {
            List<LinkRichText> list2 = pDPShippingModule.descriptionList;
            if (list2 != null) {
                int i4 = 0;
                for (LinkRichText linkRichText2 : list2) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        RichTextUtil richTextUtil = RichTextUtil.LIZ;
                        Context context = linearLayout.getContext();
                        o.LJIIIIZZ(context, "customView.context");
                        SpannableStringBuilder LIZJ = RichTextUtil.LIZJ(richTextUtil, context, linkRichText2, null, 0, false, null, C27135Akt.LJLIL, 60);
                        if (LIZJ != null) {
                            this.hasShippingText = z;
                            Context context2 = this.itemView.getContext();
                            o.LJIIIIZZ(context2, "itemView.context");
                            TuxTextView tuxTextView = new TuxTextView(context2, attributeSet, i3, i2);
                            tuxTextView.setTextColorRes(R.attr.go);
                            tuxTextView.setTuxFont(51);
                            tuxTextView.setText(LIZJ);
                            if (i4 == 0) {
                                LJIIZILJ5 = C32151Nz.LJIIZILJ(0);
                            } else {
                                LJIIZILJ5 = C32151Nz.LJIIZILJ(8);
                            }
                            C26338AVi.LJIIIZ(tuxTextView, null, Integer.valueOf(O6R.LJJIIZ(LJIIZILJ5)), null, null, 29);
                            linearLayout.addView(tuxTextView);
                        }
                        i4 = i5;
                        z = true;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            List<PDPAppendix> list3 = pDPShippingModule.appendixList;
            if (list3 != null) {
                int i6 = 0;
                for (PDPAppendix pDPAppendix : list3) {
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        LinkRichText linkRichText3 = pDPAppendix.richText;
                        if (linkRichText3 != null) {
                            RichTextUtil richTextUtil2 = RichTextUtil.LIZ;
                            Context context3 = linearLayout.getContext();
                            o.LJIIIIZZ(context3, "customView.context");
                            SpannableStringBuilder LIZJ2 = RichTextUtil.LIZJ(richTextUtil2, context3, linkRichText3, null, 0, false, null, C27136Aku.LJLIL, 60);
                            if (LIZJ2 != null) {
                                Context context4 = this.itemView.getContext();
                                o.LJIIIIZZ(context4, "itemView.context");
                                TuxTextView tuxTextView2 = new TuxTextView(context4, attributeSet, i3, i2);
                                tuxTextView2.setText(LIZJ2);
                                tuxTextView2.setTuxFont(51);
                                if (this.hasShippingText) {
                                    LJIIZILJ4 = C32151Nz.LJIIZILJ(8);
                                } else {
                                    LJIIZILJ4 = C32151Nz.LJIIZILJ(0);
                                }
                                C26338AVi.LJIIIZ(tuxTextView2, null, Integer.valueOf(O6R.LJJIIZ(LJIIZILJ4)), null, null, 29);
                                tuxTextView2.setTextColorRes(R.attr.gv);
                                linearLayout.addView(tuxTextView2);
                            }
                        }
                        i6 = i7;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            PDPLogisticAddressInfo pDPLogisticAddressInfo = pDPShippingModule.logisticAddressInfo;
            if (pDPLogisticAddressInfo != null) {
                Context context5 = this.itemView.getContext();
                o.LJIIIIZZ(context5, "itemView.context");
                TuxTextView tuxTextView3 = new TuxTextView(context5, attributeSet, i3, i2);
                tuxTextView3.setText(pDPLogisticAddressInfo.fromAddress);
                tuxTextView3.setTuxFont(51);
                if (this.hasShippingText) {
                    LJIIZILJ3 = C32151Nz.LJIIZILJ(8);
                } else {
                    LJIIZILJ3 = C32151Nz.LJIIZILJ(0);
                }
                C26338AVi.LJIIIZ(tuxTextView3, null, Integer.valueOf(O6R.LJJIIZ(LJIIZILJ3)), null, null, 29);
                tuxTextView3.setTextColorRes(R.attr.gv);
                linearLayout.addView(tuxTextView3);
            }
            ImageView right_arrow_view = (ImageView) _$_findCachedViewById(R.id.j22);
            o.LJIIIIZZ(right_arrow_view, "right_arrow_view");
            if (this.hasShippingText) {
                i = 0;
            } else {
                i = 8;
            }
            right_arrow_view.setVisibility(i);
        }
        PDPLogisticModule pDPLogisticModule2 = c27129Akn.LJLJJI;
        if (pDPLogisticModule2 != null && (pDPShippingServiceModule = pDPLogisticModule2.pdpShippingServiceModule) != null && (list = pDPShippingServiceModule.descriptionList) != null && (linkRichText = (LinkRichText) ORZ.LJLLLL(list)) != null) {
            Context context6 = this.itemView.getContext();
            o.LJIIIIZZ(context6, "itemView.context");
            TuxTextView tuxTextView4 = new TuxTextView(context6, attributeSet, i3, i2);
            RichTextUtil richTextUtil3 = RichTextUtil.LIZ;
            Context context7 = this.itemView.getContext();
            o.LJIIIIZZ(context7, "itemView.context");
            tuxTextView4.setText(RichTextUtil.LIZJ(richTextUtil3, context7, linkRichText, null, 0, false, null, null, 124));
            tuxTextView4.setTuxFont(51);
            if (this.hasShippingText) {
                LJIIZILJ2 = C32151Nz.LJIIZILJ(8);
            } else {
                LJIIZILJ2 = C32151Nz.LJIIZILJ(0);
            }
            C26338AVi.LJIIIZ(tuxTextView4, null, Integer.valueOf(O6R.LJJIIZ(LJIIZILJ2)), null, null, 29);
            tuxTextView4.setTextColorRes(R.attr.gv);
            linearLayout.addView(tuxTextView4);
        }
        PreOrderInfo preOrderInfo = c27129Akn.LJLJI;
        if (preOrderInfo == null || (str = preOrderInfo.shippingText) == null || ujb.o.LJJJJJL(str)) {
            return;
        }
        Context context8 = this.itemView.getContext();
        o.LJIIIIZZ(context8, "itemView.context");
        TuxTextView tuxTextView5 = new TuxTextView(context8, attributeSet, i3, i2);
        tuxTextView5.setText(preOrderInfo.shippingText);
        tuxTextView5.setTuxFont(71);
        if (this.hasShippingText) {
            LJIIZILJ = C32151Nz.LJIIZILJ(8);
        } else {
            LJIIZILJ = C32151Nz.LJIIZILJ(0);
        }
        C26338AVi.LJIIIZ(tuxTextView5, null, Integer.valueOf(O6R.LJJIIZ(LJIIZILJ)), null, null, 29);
        tuxTextView5.setTextColorRes(R.attr.iu);
        linearLayout.addView(tuxTextView5);
    }

    private final void handleOldDataLayout(C27129Akn c27129Akn, LinearLayout linearLayout) {
        String str;
        float LJIIZILJ;
        int i;
        String str2;
        float LJIIZILJ2;
        String str3;
        float LJIIZILJ3;
        String str4;
        String str5;
        float LJIIZILJ4;
        float LJIIZILJ5;
        this.hasShippingText = false;
        PdpShipping pdpShipping = c27129Akn.LJLILLLLZI;
        int i2 = 6;
        AttributeSet attributeSet = null;
        boolean z = true;
        if (pdpShipping != null) {
            List<LogisticDTO> list = pdpShipping.logistics;
            if (list != null) {
                int i3 = 0;
                for (LogisticDTO logisticDTO : list) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        List<LogisticLinkRichText> list2 = logisticDTO.logisticRichTextList;
                        if (list2 != null) {
                            int i5 = 0;
                            for (LogisticLinkRichText logisticLinkRichText : list2) {
                                int i6 = i5 + 1;
                                if (i5 >= 0) {
                                    RichTextUtil richTextUtil = RichTextUtil.LIZ;
                                    View view = this.itemView;
                                    C27137Akv c27137Akv = C27137Akv.LJLIL;
                                    richTextUtil.getClass();
                                    SpannableStringBuilder LIZ = RichTextUtil.LIZ(logisticLinkRichText, view, c27137Akv);
                                    if (LIZ != null) {
                                        this.hasShippingText = z;
                                        Context context = this.itemView.getContext();
                                        o.LJIIIIZZ(context, "itemView.context");
                                        TuxTextView tuxTextView = new TuxTextView(context, attributeSet, i2, 0);
                                        tuxTextView.setTextColorRes(R.attr.go);
                                        tuxTextView.setTuxFont(51);
                                        tuxTextView.setText(LIZ);
                                        if (i3 == 0 && i5 == 0) {
                                            LJIIZILJ5 = C32151Nz.LJIIZILJ(0);
                                        } else {
                                            LJIIZILJ5 = C32151Nz.LJIIZILJ(8);
                                        }
                                        C26338AVi.LJIIIZ(tuxTextView, null, Integer.valueOf(O6R.LJJIIZ(LJIIZILJ5)), null, null, 29);
                                        linearLayout.addView(tuxTextView);
                                    }
                                    i5 = i6;
                                    z = true;
                                } else {
                                    C47261Igj.LJJJJJ();
                                    throw null;
                                }
                            }
                        }
                        i3 = i4;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            ShippingTOAddressInfo shippingTOAddressInfo = pdpShipping.shippingToAddressInfo;
            if (shippingTOAddressInfo != null && (str5 = shippingTOAddressInfo.shipToAddressBrief) != null) {
                Context context2 = this.itemView.getContext();
                o.LJIIIIZZ(context2, "itemView.context");
                TuxTextView tuxTextView2 = new TuxTextView(context2, attributeSet, i2, 0);
                tuxTextView2.setText(str5);
                tuxTextView2.setTuxFont(51);
                if (this.hasShippingText) {
                    LJIIZILJ4 = C32151Nz.LJIIZILJ(8);
                } else {
                    LJIIZILJ4 = C32151Nz.LJIIZILJ(0);
                }
                C26338AVi.LJIIIZ(tuxTextView2, null, Integer.valueOf(O6R.LJJIIZ(LJIIZILJ4)), null, null, 29);
                tuxTextView2.setTextColorRes(R.attr.gv);
                linearLayout.addView(tuxTextView2);
            }
            ShippingTextInfo shippingTextInfo = pdpShipping.shippingTimeNotice;
            if (shippingTextInfo != null && (str4 = shippingTextInfo.shippingDisplayText) != null && !ujb.o.LJJJJJL(str4)) {
                View LLLZIIL = C16880lQ.LLLZIIL(R.layout.a0o, C16880lQ.LLZIL(this.itemView.getContext()), null);
                ((TextView) LLLZIIL.findViewById(R.id.h2m)).setText(shippingTextInfo.shippingDisplayText);
                View findViewById = LLLZIIL.findViewById(R.id.h2k);
                o.LJIIIIZZ(findViewById, "noticeView.no_shipping_time_icon");
                C16880lQ.LJIIJ(new Au2S14S0200000_4(this, shippingTextInfo, 14), findViewById);
                C26338AVi.LJIIIZ(LLLZIIL, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, null, 29);
                linearLayout.addView(LLLZIIL);
            }
            ShipFromInfo shipFromInfo = pdpShipping.shipFromInfo;
            if (shipFromInfo != null && (str3 = shipFromInfo.fromOverseas) != null) {
                Context context3 = this.itemView.getContext();
                o.LJIIIIZZ(context3, "itemView.context");
                TuxTextView tuxTextView3 = new TuxTextView(context3, attributeSet, 6, 0);
                tuxTextView3.setText(str3);
                tuxTextView3.setTuxFont(51);
                if (this.hasShippingText) {
                    LJIIZILJ3 = C32151Nz.LJIIZILJ(8);
                } else {
                    LJIIZILJ3 = C32151Nz.LJIIZILJ(0);
                }
                C26338AVi.LJIIIZ(tuxTextView3, null, Integer.valueOf(O6R.LJJIIZ(LJIIZILJ3)), null, null, 29);
                tuxTextView3.setTextColorRes(R.attr.gv);
                linearLayout.addView(tuxTextView3);
            }
            ShippingService shippingService = pdpShipping.shippingService;
            if (shippingService != null && (str2 = shippingService.shippingRightsContent) != null) {
                Context context4 = this.itemView.getContext();
                o.LJIIIIZZ(context4, "itemView.context");
                TuxTextView tuxTextView4 = new TuxTextView(context4, attributeSet, 6, 0);
                tuxTextView4.setText(str2);
                tuxTextView4.setTuxFont(51);
                if (this.hasShippingText) {
                    LJIIZILJ2 = C32151Nz.LJIIZILJ(8);
                } else {
                    LJIIZILJ2 = C32151Nz.LJIIZILJ(0);
                }
                C26338AVi.LJIIIZ(tuxTextView4, null, Integer.valueOf(O6R.LJJIIZ(LJIIZILJ2)), null, null, 29);
                tuxTextView4.setTextColorRes(R.attr.gv);
                linearLayout.addView(tuxTextView4);
            }
            ImageView right_arrow_view = (ImageView) _$_findCachedViewById(R.id.j22);
            o.LJIIIIZZ(right_arrow_view, "right_arrow_view");
            if (this.hasShippingText) {
                i = 0;
            } else {
                i = 8;
            }
            right_arrow_view.setVisibility(i);
        }
        PreOrderInfo preOrderInfo = c27129Akn.LJLJI;
        if (preOrderInfo == null || (str = preOrderInfo.shippingText) == null || ujb.o.LJJJJJL(str)) {
            return;
        }
        Context context5 = this.itemView.getContext();
        o.LJIIIIZZ(context5, "itemView.context");
        TuxTextView tuxTextView5 = new TuxTextView(context5, attributeSet, 6, 0);
        tuxTextView5.setText(preOrderInfo.shippingText);
        tuxTextView5.setTuxFont(71);
        if (this.hasShippingText) {
            LJIIZILJ = C32151Nz.LJIIZILJ(8);
        } else {
            LJIIZILJ = C32151Nz.LJIIZILJ(0);
        }
        C26338AVi.LJIIIZ(tuxTextView5, null, Integer.valueOf(O6R.LJJIIZ(LJIIZILJ)), null, null, 29);
        tuxTextView5.setTextColorRes(R.attr.iu);
        linearLayout.addView(tuxTextView5);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH
    public void bindCustomView(C27129Akn item, LinearLayout customView) {
        o.LJIIIZ(item, "item");
        o.LJIIIZ(customView, "customView");
        customView.removeAllViews();
        if (item.LJLJJI != null) {
            handleNewDataLayout(item, customView);
        } else {
            handleOldDataLayout(item, customView);
        }
        logModuleShow();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH
    public void onClick(C27129Akn item, View view) {
        Map<String, Object> LJJJLIIL;
        o.LJIIIZ(item, "item");
        o.LJIIIZ(view, "view");
        if (!this.hasShippingText) {
            return;
        }
        getVm().Pw0(FT5.LIZ(this.itemView, "itemView.context"), C79234V7u.LJJIJ(view));
        PdpShipping pdpShipping = item.LJLILLLLZI;
        if (pdpShipping != null) {
            LJJJLIIL = pdpShipping.LIZIZ();
        } else {
            LJJJLIIL = C113554cx.LJJJLIIL();
        }
        C70414RkI c70414RkI = getVm().LLFII;
        if (c70414RkI != null) {
            C70414RkI.LJJJIL(c70414RkI, "logistics", new C27127Akl(item.LJLIL, item.LJLILLLLZI, 8), "shipping_info", LJJJLIIL, 16);
        }
    }
}
